package dao.impl.jpa;

import config.MetamodelProvider;
import dao.ElementDao;
import jpa.manager.JPAManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.omg.sysml.extension.Project;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.impl.MofObjectImpl;
import org.omg.sysml.metamodel.impl.MofObjectImpl_;
import org.omg.sysml.versioning.Commit;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.persistence.NoResultException;
import javax.persistence.criteria.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Singleton
public class JpaElementDao extends JpaDao<Element> implements ElementDao {
    @Inject
    private MetamodelProvider metamodelProvider;

    @Inject
    private JPAManager jpa;

    @Override
    protected JPAManager getJpaManager() {
        return jpa;
    }

    @Override
    public Optional<Element> findById(UUID id) {
        return jpa.transact(em -> {
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<MofObjectImpl> query = builder.createQuery(MofObjectImpl.class);
            Root<MofObjectImpl> root = query.from(MofObjectImpl.class);
            query.select(root).where(builder.and(
                    builder.equal(root.get(MofObjectImpl_.id), id),
                    getTypeExpression(builder, root)
            ));
            try {
                return Optional.of((Element) em.createQuery(query).getSingleResult());
            } catch (NoResultException e) {
                return Optional.empty();
            }
        });
    }

    @Override
    public List<Element> findAll() {
        return jpa.transact(em -> {
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<MofObjectImpl> query = builder.createQuery(MofObjectImpl.class);
            Root<MofObjectImpl> root = query.from(MofObjectImpl.class);
            query.select(root).where(getTypeExpression(builder, root));
            return em.createQuery(query).getResultStream().map(o -> (Element) o).collect(Collectors.toList());
        });
    }

    @Override
    public void deleteAll() {
        jpa.transact(em -> {
            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaDelete<MofObjectImpl> query = builder.createCriteriaDelete(MofObjectImpl.class);
            Root<MofObjectImpl> root = query.from(MofObjectImpl.class);
            query.where(getTypeExpression(builder, root));
            return ((Stream<?>) em.createQuery(query).getResultStream()).map(o -> (Element) o).collect(Collectors.toList());
        });
    }

    @Override
    public List<Element> findAllByProject(Project project) {
        try (Session session = jpa.getEntityManagerFactory().unwrap(SessionFactory.class).openSession()) {
            Query<Element> query = session.createQuery("FROM org.omg.sysml.metamodel.Element WHERE containingProject = :project", Element.class);
            query.setParameter("project", project);
            return query.getResultList();
        }
    }

    @Override
    public Set<Element> findAllByCommit(Commit commit) {
        return jpa.transact(em -> {
            Map<UUID, Element> map = new LinkedHashMap<>();
            // TODO Commit is detached at this point. This ternary mitigates by requerying for the Commit in this transaction. A better solution would be moving transaction handling up to service layer (supported by general wisdom) and optionally migrating to using Play's @Transactional/JPAApi. Pros would include removal of repetitive transaction handling at the DAO layer and ability to interface with multiple DAOs in the same transaction (consistent view). Cons include increased temptation to keep transaction open for longer than needed, e.g. during JSON serialization due to the convenience of @Transactional (deprecated in >= 2.8.x), and the service, a higher level of abstraction, becoming aware of transactions. An alternative would be DAO-to-DAO calls (generally discouraged) and delegating to non-transactional versions of methods.
            queryCommitTree(em.contains(commit) ? commit : em.find(metamodelProvider.getImplementationClass(Commit.class), commit.getId()), c -> {
                c.getChanges().stream().filter(record -> record.getIdentity() != null && record.getIdentity().getId() != null && record.getData() instanceof Element).forEach(record -> map.put(record.getIdentity().getId(), map.computeIfAbsent(record.getIdentity().getId(), uuid -> (Element) record.getData())));
                return null;
            });
            return new LinkedHashSet<>(map.values());
        });
    }

    @Override
    public Optional<Element> findByProjectAndId(Project project, UUID id) {
        try (Session session = jpa.getEntityManagerFactory().unwrap(SessionFactory.class).openSession()) {
            Query<Element> query = session.createQuery("FROM org.omg.sysml.metamodel.Element WHERE identifier = :identifier AND containingProject = :project", Element.class);
            query.setParameter("identifier", id);
            query.setParameter("project", project);
            try {
                return Optional.of(query.getSingleResult());
            } catch (NoResultException e) {
                return Optional.empty();
            }
        }
    }

    /*@Override
    public Optional<Element> findByCommitAndId(Commit commit, UUID id) {
        return jpa.transact(em -> {
            Element element = null;
            Commit currentCommit = commit;
            Set<Commit> visitedCommits = new HashSet<>();
            while (element == null && currentCommit != null && !visitedCommits.contains(currentCommit)) {
                element = currentCommit.getChanges().stream().filter(record -> record.getIdentity() != null && record.getIdentity().getId() != null && record.getData() instanceof Element).filter(record -> id.equals(record.getIdentity().getId())).map(record -> (Element) record.getData()).findAny().orElse(null);
                visitedCommits.add(currentCommit);
                currentCommit = currentCommit.getPreviousCommit();
            }
            return Optional.ofNullable(element);
        });
    }*/

    @Override
    public Optional<Element> findByCommitAndId(Commit commit, UUID id) {
        return jpa.transact(em -> {
            return queryCommitTree(em.contains(commit) ? commit : em.find(metamodelProvider.getImplementationClass(Commit.class), commit.getId()), c ->
                    c.getChanges().stream().filter(record -> record.getIdentity() != null && record.getIdentity().getId() != null && record.getData() instanceof Element).filter(record -> id.equals(record.getIdentity().getId())).map(record -> (Element) record.getData()).findAny(),
                    Optional::isPresent)
                .values().stream().filter(Optional::isPresent).map(Optional::get).findAny();
        });
    }

    protected <T> Map<Commit, T> queryCommitTree(Commit commit, Function<Commit, T> query) {
        return queryCommitTree(commit, query, t -> false);
    }

    protected <T> Map<Commit, T> queryCommitTree(Commit commit, Function<Commit, T> query, java.util.function.Predicate<T> terminationCondition) {
        Map<Commit, T> results = new LinkedHashMap<>();
        Commit currentCommit = commit;
        Set<Commit> visitedCommits = new HashSet<>();
        while (currentCommit != null && !visitedCommits.contains(currentCommit)) {
            T t = query.apply(currentCommit);
            results.put(currentCommit, t);
            if (terminationCondition.test(t)) {
                break;
            }
            visitedCommits.add(currentCommit);
            currentCommit = currentCommit.getPreviousCommit();
        }
        return results;
    }

    private Expression<Boolean> getTypeExpression(CriteriaBuilder builder, Root<?> root) {
        return builder.or(metamodelProvider.getAllImplementationClasses().stream().filter(Element.class::isAssignableFrom).map(c -> builder.equal(root.type(), c)).toArray(Predicate[]::new));
    }
}

package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InteractionImpl.class)
public abstract class InteractionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<InteractionImpl, Type> disjointType;
	public static volatile SingularAttribute<InteractionImpl, Boolean> isConjugated;
	public static volatile ListAttribute<InteractionImpl, Membership> membership;
	public static volatile ListAttribute<InteractionImpl, Element> ownedRelatedElement;
	public static volatile ListAttribute<InteractionImpl, Element> source;
	public static volatile ListAttribute<InteractionImpl, Feature> output;
	public static volatile ListAttribute<InteractionImpl, Type> relatedType;
	public static volatile ListAttribute<InteractionImpl, Feature> feature;
	public static volatile ListAttribute<InteractionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<InteractionImpl, Feature> parameter;
	public static volatile CollectionAttribute<InteractionImpl, Disjoining> disjoiningTypeDisjoining;
	public static volatile ListAttribute<InteractionImpl, Element> member;
	public static volatile ListAttribute<InteractionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<InteractionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<InteractionImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<InteractionImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<InteractionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<InteractionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<InteractionImpl, String> effectiveName;
	public static volatile SingularAttribute<InteractionImpl, UUID> identifier;
	public static volatile ListAttribute<InteractionImpl, Membership> importedMembership;
	public static volatile ListAttribute<InteractionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<InteractionImpl, Element> ownedElement;
	public static volatile ListAttribute<InteractionImpl, Feature> ownedFeature;
	public static volatile ListAttribute<InteractionImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<InteractionImpl, String> qualifiedName;
	public static volatile ListAttribute<InteractionImpl, Documentation> documentation;
	public static volatile ListAttribute<InteractionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<InteractionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<InteractionImpl, Type> targetType;
	public static volatile ListAttribute<InteractionImpl, Feature> directedFeature;
	public static volatile ListAttribute<InteractionImpl, Import> ownedImport;
	public static volatile SingularAttribute<InteractionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<InteractionImpl, Feature> associationEnd;
	public static volatile ListAttribute<InteractionImpl, Element> target;
	public static volatile ListAttribute<InteractionImpl, Feature> input;
	public static volatile CollectionAttribute<InteractionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<InteractionImpl, String> humanId;
	public static volatile ListAttribute<InteractionImpl, String> aliasId;
	public static volatile ListAttribute<InteractionImpl, Element> relatedElement;
	public static volatile SingularAttribute<InteractionImpl, String> name;
	public static volatile ListAttribute<InteractionImpl, Specialization> ownedSpecialization;
	public static volatile CollectionAttribute<InteractionImpl, Step> step;
	public static volatile ListAttribute<InteractionImpl, Element> ownedMember;
	public static volatile ListAttribute<InteractionImpl, Membership> ownedMembership;

	public static final String DISJOINT_TYPE = "disjointType";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String SOURCE = "source";
	public static final String OUTPUT = "output";
	public static final String RELATED_TYPE = "relatedType";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String DISJOINING_TYPE_DISJOINING = "disjoiningTypeDisjoining";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String TARGET_TYPE = "targetType";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String ASSOCIATION_END = "associationEnd";
	public static final String TARGET = "target";
	public static final String INPUT = "input";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String STEP = "step";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}


package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Property;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DefinitionImpl.class)
public abstract class DefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<DefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<DefinitionImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<DefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile ListAttribute<DefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> feature;
	public static volatile ListAttribute<DefinitionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<DefinitionImpl, Property> property;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<DefinitionImpl, Element> member;
	public static volatile ListAttribute<DefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile SingularAttribute<DefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<DefinitionImpl, Property> ownedProperty;
	public static volatile ListAttribute<DefinitionImpl, Membership> importedMembership;
	public static volatile SingularAttribute<DefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<DefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<DefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<DefinitionImpl, Import> ownedImport;
	public static volatile SingularAttribute<DefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<DefinitionImpl, Property> flowProperty;
	public static volatile CollectionAttribute<DefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<DefinitionImpl, ActionUsage> ownedAction;
	public static volatile SingularAttribute<DefinitionImpl, String> name;
	public static volatile CollectionAttribute<DefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<DefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<DefinitionImpl, Membership> ownedMembership;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String MEMBERSHIP = "membership";
	public static final String OUTPUT = "output";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PROPERTY = "property";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_PROPERTY = "ownedProperty";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String FLOW_PROPERTY = "flowProperty";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String NAME = "name";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}


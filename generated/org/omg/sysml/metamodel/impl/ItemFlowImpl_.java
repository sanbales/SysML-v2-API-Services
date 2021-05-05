package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.ItemFeature;
import org.omg.sysml.metamodel.ItemFlowEnd;
import org.omg.sysml.metamodel.ItemFlowFeature;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemFlowImpl.class)
public abstract class ItemFlowImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ItemFlowImpl, Generalization> ownedGeneralization;
	public static volatile ListAttribute<ItemFlowImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ItemFlowImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ItemFlowImpl, Element> source;
	public static volatile ListAttribute<ItemFlowImpl, Type> type;
	public static volatile ListAttribute<ItemFlowImpl, Feature> output;
	public static volatile ListAttribute<ItemFlowImpl, Feature> sourceOutputFeature;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isSufficient;
	public static volatile ListAttribute<ItemFlowImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ItemFlowImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ItemFlowImpl, UUID> identifier;
	public static volatile ListAttribute<ItemFlowImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<ItemFlowImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<ItemFlowImpl, String> qualifiedName;
	public static volatile ListAttribute<ItemFlowImpl, Documentation> documentation;
	public static volatile ListAttribute<ItemFlowImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ItemFlowImpl, ItemFeature> itemFeature;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isEnd;
	public static volatile ListAttribute<ItemFlowImpl, Type> featuringType;
	public static volatile ListAttribute<ItemFlowImpl, Feature> input;
	public static volatile ListAttribute<ItemFlowImpl, Feature> targetInputFeature;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isComposite;
	public static volatile ListAttribute<ItemFlowImpl, Element> relatedElement;
	public static volatile SingularAttribute<ItemFlowImpl, String> name;
	public static volatile CollectionAttribute<ItemFlowImpl, Feature> connectorEnd;
	public static volatile CollectionAttribute<ItemFlowImpl, ItemFlowEnd> itemFlowEnd;
	public static volatile ListAttribute<ItemFlowImpl, Element> ownedMember;
	public static volatile ListAttribute<ItemFlowImpl, Membership> ownedMembership;
	public static volatile ListAttribute<ItemFlowImpl, Classifier> itemType;
	public static volatile CollectionAttribute<ItemFlowImpl, Association> association;
	public static volatile ListAttribute<ItemFlowImpl, Membership> membership;
	public static volatile ListAttribute<ItemFlowImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ItemFlowImpl, Feature> targetFeature;
	public static volatile ListAttribute<ItemFlowImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<ItemFlowImpl, Feature> feature;
	public static volatile ListAttribute<ItemFlowImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ItemFlowImpl, Feature> parameter;
	public static volatile ListAttribute<ItemFlowImpl, Element> member;
	public static volatile ListAttribute<ItemFlowImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ItemFlowImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<ItemFlowImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ItemFlowImpl, Behavior> behavior;
	public static volatile SingularAttribute<ItemFlowImpl, String> effectiveName;
	public static volatile CollectionAttribute<ItemFlowImpl, ItemFlowFeature> itemFlowFeature;
	public static volatile ListAttribute<ItemFlowImpl, Membership> importedMembership;
	public static volatile ListAttribute<ItemFlowImpl, Element> ownedElement;
	public static volatile ListAttribute<ItemFlowImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ItemFlowImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ItemFlowImpl, Import> ownedImport;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isAbstract;
	public static volatile ListAttribute<ItemFlowImpl, Feature> relatedFeature;
	public static volatile ListAttribute<ItemFlowImpl, Element> target;
	public static volatile CollectionAttribute<ItemFlowImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<ItemFlowImpl, Boolean> isDirected;
	public static volatile SingularAttribute<ItemFlowImpl, String> humanId;
	public static volatile ListAttribute<ItemFlowImpl, String> aliasId;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String SOURCE_OUTPUT_FEATURE = "sourceOutputFeature";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String ITEM_FEATURE = "itemFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String TARGET_INPUT_FEATURE = "targetInputFeature";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String ITEM_FLOW_END = "itemFlowEnd";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String ITEM_TYPE = "itemType";
	public static final String ASSOCIATION = "association";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String ITEM_FLOW_FEATURE = "itemFlowFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String IS_DIRECTED = "isDirected";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";

}


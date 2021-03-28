package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.AssociationStructure;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartDefinition;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Structure;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ConnectionUsageImpl.class)
public abstract class ConnectionUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ConnectionUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ConnectionUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<ConnectionUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> source;
	public static volatile ListAttribute<ConnectionUsageImpl, Type> type;
	public static volatile CollectionAttribute<ConnectionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> output;
	public static volatile CollectionAttribute<ConnectionUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ConnectionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ConnectionUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<ConnectionUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ConnectionUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<ConnectionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<ConnectionUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ConnectionUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Usage> flowFeature;
	public static volatile SingularAttribute<ConnectionUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<ConnectionUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ConnectionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ConnectionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<ConnectionUsageImpl, Type> featuringType;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> input;
	public static volatile CollectionAttribute<ConnectionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> relatedElement;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<ConnectionUsageImpl, String> name;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Feature> connectorEnd;
	public static volatile CollectionAttribute<ConnectionUsageImpl, AssociationStructure> connectionDefinition;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ConnectionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ConnectionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ConnectionUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Association> association;
	public static volatile CollectionAttribute<ConnectionUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<ConnectionUsageImpl, Membership> membership;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Feature> targetFeature;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<ConnectionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> feature;
	public static volatile ListAttribute<ConnectionUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> member;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ConnectionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ConnectionUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ConnectionUsageImpl, PartDefinition> partDefinition;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ConnectionUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ConnectionUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ConnectionUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<ConnectionUsageImpl, Feature> relatedFeature;
	public static volatile CollectionAttribute<ConnectionUsageImpl, Structure> itemDefinition;
	public static volatile ListAttribute<ConnectionUsageImpl, Element> target;
	public static volatile CollectionAttribute<ConnectionUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ConnectionUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<ConnectionUsageImpl, Boolean> isDirected;
	public static volatile CollectionAttribute<ConnectionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<ConnectionUsageImpl, String> humanId;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile ListAttribute<ConnectionUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<ConnectionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<ConnectionUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String CONNECTION_DEFINITION = "connectionDefinition";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String ASSOCIATION = "association";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String PART_DEFINITION = "partDefinition";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}


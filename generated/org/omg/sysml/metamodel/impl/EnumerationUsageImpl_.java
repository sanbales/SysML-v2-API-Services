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
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.DataType;
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
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
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
@StaticMetamodel(EnumerationUsageImpl.class)
public abstract class EnumerationUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<EnumerationUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<EnumerationUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<EnumerationUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<EnumerationUsageImpl, Usage> usage;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<EnumerationUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<EnumerationUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<EnumerationUsageImpl, Type> type;
	public static volatile CollectionAttribute<EnumerationUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> output;
	public static volatile CollectionAttribute<EnumerationUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<EnumerationUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<EnumerationUsageImpl, Usage> variant;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<EnumerationUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<EnumerationUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<EnumerationUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<EnumerationUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<EnumerationUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<EnumerationUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<EnumerationUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<EnumerationUsageImpl, Usage> flowFeature;
	public static volatile SingularAttribute<EnumerationUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<EnumerationUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<EnumerationUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<EnumerationUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<EnumerationUsageImpl, Type> featuringType;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> input;
	public static volatile CollectionAttribute<EnumerationUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<EnumerationUsageImpl, String> name;
	public static volatile ListAttribute<EnumerationUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<EnumerationUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<EnumerationUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<EnumerationUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile CollectionAttribute<EnumerationUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<EnumerationUsageImpl, Membership> membership;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<EnumerationUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> feature;
	public static volatile ListAttribute<EnumerationUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<EnumerationUsageImpl, Element> member;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<EnumerationUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<EnumerationUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<EnumerationUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<EnumerationUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<EnumerationUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<EnumerationUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<EnumerationUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<EnumerationUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<EnumerationUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<EnumerationUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<EnumerationUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<EnumerationUsageImpl, String> humanId;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile ListAttribute<EnumerationUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<EnumerationUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<EnumerationUsageImpl, DataType> attributeDefinition;
	public static volatile CollectionAttribute<EnumerationUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
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
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
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
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String ATTRIBUTE_DEFINITION = "attributeDefinition";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}


package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
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
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ItemUsageImpl.class)
public abstract class ItemUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ItemUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ItemUsageImpl, PartUsage> nestedPart;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ItemUsageImpl, Usage> usage;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ItemUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ItemUsageImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<ItemUsageImpl, Type> type;
	public static volatile CollectionAttribute<ItemUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> output;
	public static volatile CollectionAttribute<ItemUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ItemUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ItemUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ItemUsageImpl, Usage> variant;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ItemUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ItemUsageImpl, Redefinition> ownedRedefinition;
	public static volatile CollectionAttribute<ItemUsageImpl, Usage> flow;
	public static volatile SingularAttribute<ItemUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<ItemUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ItemUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ItemUsageImpl, Type> referencedType;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ItemUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> input;
	public static volatile CollectionAttribute<ItemUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ItemUsageImpl, Type> ownedType;
	public static volatile SingularAttribute<ItemUsageImpl, String> name;
	public static volatile CollectionAttribute<ItemUsageImpl, FeatureTyping> typing;
	public static volatile ListAttribute<ItemUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<ItemUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ItemUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ItemUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<ItemUsageImpl, Membership> membership;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ItemUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> feature;
	public static volatile ListAttribute<ItemUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ItemUsageImpl, Element> member;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ItemUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ItemUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<ItemUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ItemUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ItemUsageImpl, ActionUsage> nestedAction;
	public static volatile CollectionAttribute<ItemUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ItemUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ItemUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<ItemUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ItemUsageImpl, Class> itemDefinition;
	public static volatile CollectionAttribute<ItemUsageImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<ItemUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<ItemUsageImpl, InterfaceUsage> nestedInterface;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
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
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String FLOW = "flow";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String TYPING = "typing";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
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
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String NESTED_INTERFACE = "nestedInterface";

}


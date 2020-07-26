package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RequirementDefinitionImpl.class)
public abstract class RequirementDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<RequirementDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<RequirementDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<RequirementDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ConstraintUsage> requiredConstraint;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ItemUsage> ownedItem;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, String> text;
	public static volatile SingularAttribute<RequirementDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Comment> documentationComment;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Usage> flow;
	public static volatile SingularAttribute<RequirementDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile SingularAttribute<RequirementDefinitionImpl, String> reqId;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ConstraintUsage> assumedConstraint;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<RequirementDefinitionImpl, String> name;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<RequirementDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<RequirementDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<RequirementDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<RequirementDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<RequirementDefinitionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<RequirementDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<RequirementDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<RequirementDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Expression> expression;
	public static volatile ListAttribute<RequirementDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<RequirementDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<RequirementDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<RequirementDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<RequirementDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, Step> step;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<RequirementDefinitionImpl, PartUsage> ownedPart;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String REQUIRED_CONSTRAINT = "requiredConstraint";
	public static final String USAGE = "usage";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VARIANT = "variant";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String TEXT = "text";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String FLOW = "flow";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String REQ_ID = "reqId";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String ASSUMED_CONSTRAINT = "assumedConstraint";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_STATE = "ownedState";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}


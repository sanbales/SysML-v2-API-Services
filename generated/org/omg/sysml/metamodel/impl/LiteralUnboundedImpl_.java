package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(LiteralUnboundedImpl.class)
public abstract class LiteralUnboundedImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<LiteralUnboundedImpl, Generalization> ownedGeneralization;
	public static volatile ListAttribute<LiteralUnboundedImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<LiteralUnboundedImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<LiteralUnboundedImpl, Membership> membership;
	public static volatile ListAttribute<LiteralUnboundedImpl, Type> type;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isNonunique;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> output;
	public static volatile ListAttribute<LiteralUnboundedImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> feature;
	public static volatile ListAttribute<LiteralUnboundedImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> parameter;
	public static volatile ListAttribute<LiteralUnboundedImpl, Element> member;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<LiteralUnboundedImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<LiteralUnboundedImpl, Behavior> behavior;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isSufficient;
	public static volatile ListAttribute<LiteralUnboundedImpl, Comment> documentationComment;
	public static volatile SingularAttribute<LiteralUnboundedImpl, String> effectiveName;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<LiteralUnboundedImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<LiteralUnboundedImpl, UUID> identifier;
	public static volatile ListAttribute<LiteralUnboundedImpl, Membership> importedMembership;
	public static volatile ListAttribute<LiteralUnboundedImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<LiteralUnboundedImpl, Element> ownedElement;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> ownedFeature;
	public static volatile ListAttribute<LiteralUnboundedImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<LiteralUnboundedImpl, String> qualifiedName;
	public static volatile ListAttribute<LiteralUnboundedImpl, Documentation> documentation;
	public static volatile ListAttribute<LiteralUnboundedImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> endFeature;
	public static volatile ListAttribute<LiteralUnboundedImpl, Import> ownedImport;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isAbstract;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isEnd;
	public static volatile ListAttribute<LiteralUnboundedImpl, Type> featuringType;
	public static volatile ListAttribute<LiteralUnboundedImpl, Feature> input;
	public static volatile CollectionAttribute<LiteralUnboundedImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<LiteralUnboundedImpl, Boolean> isComposite;
	public static volatile SingularAttribute<LiteralUnboundedImpl, String> humanId;
	public static volatile ListAttribute<LiteralUnboundedImpl, String> aliasId;
	public static volatile SingularAttribute<LiteralUnboundedImpl, String> name;
	public static volatile ListAttribute<LiteralUnboundedImpl, Element> ownedMember;
	public static volatile ListAttribute<LiteralUnboundedImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}


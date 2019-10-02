package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Relationship;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(GeneralizationImpl.class)
public abstract class GeneralizationImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile SingularAttribute<GeneralizationImpl, UUID> identifier;
	public static volatile CollectionAttribute<GeneralizationImpl, Element> ownedElement;
	public static volatile CollectionAttribute<GeneralizationImpl, Element> relatedElement;
	public static volatile CollectionAttribute<GeneralizationImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<GeneralizationImpl, String> name;
	public static volatile CollectionAttribute<GeneralizationImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<GeneralizationImpl, Element> source;
	public static volatile CollectionAttribute<GeneralizationImpl, Element> target;

	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String NAME = "name";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String SOURCE = "source";
	public static final String TARGET = "target";

}


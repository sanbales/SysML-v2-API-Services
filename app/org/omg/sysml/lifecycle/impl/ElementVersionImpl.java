package org.omg.sysml.lifecycle.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.hibernate.annotations.Any;
import org.omg.sysml.lifecycle.ElementVersion;
import org.omg.sysml.metamodel.MofObject;
import org.omg.sysml.metamodel.impl.MofObjectImpl;
import org.omg.sysml.lifecycle.ElementIdentity;

import javax.persistence.*;

@Entity(name = "ElementVersion")
@JsonTypeName(value = "ElementVersion")
public class ElementVersionImpl extends RecordImpl implements ElementVersion {
    private MofObject data;
    private ElementIdentity identity;

    @Any(metaDef = "MofObjectMetaDef", metaColumn = @javax.persistence.Column(name = "dataType"), fetch = FetchType.EAGER)
    @JoinColumn(name = "dataId")
    @org.hibernate.annotations.Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    @JsonDeserialize(as = MofObjectImpl.class)
    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
    public MofObject getData() {
        return data;
    }

    public void setData(MofObject data) {
        this.data = data;
    }

    @ManyToOne(targetEntity = ElementIdentityImpl.class, cascade = javax.persistence.CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonDeserialize(as = ElementIdentityImpl.class)
    public ElementIdentity getIdentity() {
        return identity;
    }

    public void setIdentity(ElementIdentity identity) {
        this.identity = identity;
    }

    @Transient
    @JsonProperty("@type")
    public static String getType() {
        return ElementVersion.class.getSimpleName();
    }
}
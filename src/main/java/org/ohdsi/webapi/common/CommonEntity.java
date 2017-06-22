package org.ohdsi.webapi.common;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Access(AccessType.PROPERTY)
public abstract class CommonEntity {
    private String guid;
    protected Integer id;
    private String name;
    private String description;
    private String organization;
    @Column(name = "model_version")
    @Access(AccessType.FIELD)
    private String modelVersion;
    @Column(name = "model_type")
    @Enumerated(EnumType.STRING)
    @Access(AccessType.FIELD)
    private ModelType modelType;

    public String getGuid() {

        return guid;
    }

    public void setGuid(String guid) {

        this.guid = guid;
    }

    @Id
    @GeneratedValue
    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public String getOrganization() {

        return organization;
    }

    public void setOrganization(String organization) {

        this.organization = organization;
    }

    public String getModelVersion() {

        return modelVersion;
    }

    public void setModelVersion(String modelVersion) {

        this.modelVersion = modelVersion;
    }

    public ModelType getModelType() {

        return modelType;
    }

    public void setModelType(ModelType modelType) {

        this.modelType = modelType;
    }
}

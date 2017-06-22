package org.ohdsi.webapi.dto;

import org.ohdsi.webapi.common.CommonEntity;
import org.ohdsi.webapi.common.ModelType;

public abstract class CommonEntityDTO {
    private String guid;
    private String name;
    private String description;
    private String organization;
    private String modelVersion;
    private ModelType modelType;

    public CommonEntityDTO() {

    }

    public CommonEntityDTO(CommonEntity commonEntity) {

        this.guid = commonEntity.getGuid();
        this.name = commonEntity.getName();
        this.description = commonEntity.getDescription();
        this.organization = commonEntity.getOrganization();
        this.modelVersion = commonEntity.getModelVersion();
        this.modelType = commonEntity.getModelType();
    }

    public String getGuid() {

        return guid;
    }

    public void setGuid(String guid) {

        this.guid = guid;
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

package org.ohdsi.webapi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.ohdsi.webapi.cohortdefinition.CohortDefinition;
import org.ohdsi.webapi.cohortdefinition.ExpressionType;

public class CommonCohortDefinitionDTO extends ExecutableDTO {

    private ExpressionType expressionType;
    private String createdBy;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd, HH:mm")
    private Date createdDate;
    private String modifiedBy;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd, HH:mm")
    private Date modifiedDate;
    private String expression;

    public CommonCohortDefinitionDTO(){

    }

    public CommonCohortDefinitionDTO(CohortDefinition cohortDefinition){
        super(cohortDefinition);
        this.expressionType = cohortDefinition.getExpressionType();
        this.createdBy = cohortDefinition.getCreatedBy();
        this.createdDate = cohortDefinition.getCreatedDate();
        this.modifiedBy = cohortDefinition.getModifiedBy();
        this.modifiedDate = cohortDefinition.getModifiedDate();
        if (cohortDefinition.getDetails() != null){
            this.expression = cohortDefinition.getDetails().getExpression();
        }
    }

    public ExpressionType getExpressionType() {

        return expressionType;
    }

    public void setExpressionType(ExpressionType expressionType) {

        this.expressionType = expressionType;
    }

    public String getCreatedBy() {

        return createdBy;
    }

    public void setCreatedBy(String createdBy) {

        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {

        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {

        this.createdDate = createdDate;
    }

    public String getModifiedBy() {

        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {

        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedDate() {

        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {

        this.modifiedDate = modifiedDate;
    }
}

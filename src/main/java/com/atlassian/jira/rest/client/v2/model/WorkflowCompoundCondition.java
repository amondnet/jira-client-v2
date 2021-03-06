/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.jira.rest.client.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.atlassian.jira.rest.client.v2.model.WorkflowConditionBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A workflow transition compound condition rule.
 */
@ApiModel(description = "A workflow transition compound condition rule.")
@JsonPropertyOrder({
  WorkflowCompoundCondition.JSON_PROPERTY_OPERATOR,
  WorkflowCompoundCondition.JSON_PROPERTY_CONDITIONS,
  WorkflowCompoundCondition.JSON_PROPERTY_NODE_TYPE
})
@JsonTypeName("WorkflowCompoundCondition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class WorkflowCompoundCondition {
  /**
   * The conditions operator.
   */
  public enum OperatorEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private OperatorEnum operator;

  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<WorkflowConditionBean> conditions = new ArrayList<>();

  public static final String JSON_PROPERTY_NODE_TYPE = "nodeType";
  private String nodeType;


  public WorkflowCompoundCondition operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The conditions operator.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "The conditions operator.")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public WorkflowCompoundCondition conditions(List<WorkflowConditionBean> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public WorkflowCompoundCondition addConditionsItem(WorkflowConditionBean conditionsItem) {
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The list of workflow conditions.
   * @return conditions
  **/
  @ApiModelProperty(required = true, value = "The list of workflow conditions.")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<WorkflowConditionBean> getConditions() {
    return conditions;
  }


  public void setConditions(List<WorkflowConditionBean> conditions) {
    this.conditions = conditions;
  }


  public WorkflowCompoundCondition nodeType(String nodeType) {
    
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NODE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNodeType() {
    return nodeType;
  }


  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowCompoundCondition workflowCompoundCondition = (WorkflowCompoundCondition) o;
    return Objects.equals(this.operator, workflowCompoundCondition.operator) &&
        Objects.equals(this.conditions, workflowCompoundCondition.conditions) &&
        Objects.equals(this.nodeType, workflowCompoundCondition.nodeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, conditions, nodeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCompoundCondition {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


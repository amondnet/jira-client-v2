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
import com.atlassian.jira.rest.client.v2.model.JiraExpressionsComplexityValueBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * JiraExpressionsComplexityBean
 */
@JsonPropertyOrder({
  JiraExpressionsComplexityBean.JSON_PROPERTY_STEPS,
  JiraExpressionsComplexityBean.JSON_PROPERTY_EXPENSIVE_OPERATIONS,
  JiraExpressionsComplexityBean.JSON_PROPERTY_BEANS,
  JiraExpressionsComplexityBean.JSON_PROPERTY_PRIMITIVE_VALUES
})
@JsonTypeName("JiraExpressionsComplexityBean")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class JiraExpressionsComplexityBean {
  public static final String JSON_PROPERTY_STEPS = "steps";
  private JiraExpressionsComplexityValueBean steps = null;

  public static final String JSON_PROPERTY_EXPENSIVE_OPERATIONS = "expensiveOperations";
  private JiraExpressionsComplexityValueBean expensiveOperations = null;

  public static final String JSON_PROPERTY_BEANS = "beans";
  private JiraExpressionsComplexityValueBean beans = null;

  public static final String JSON_PROPERTY_PRIMITIVE_VALUES = "primitiveValues";
  private JiraExpressionsComplexityValueBean primitiveValues = null;


  public JiraExpressionsComplexityBean steps(JiraExpressionsComplexityValueBean steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * The number of steps it took to evaluate the expression, where a step is a high-level operation performed by the expression. A step is an operation such as arithmetic, accessing a property, accessing a context variable, or calling a function.
   * @return steps
  **/
  @ApiModelProperty(required = true, value = "The number of steps it took to evaluate the expression, where a step is a high-level operation performed by the expression. A step is an operation such as arithmetic, accessing a property, accessing a context variable, or calling a function.")
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JiraExpressionsComplexityValueBean getSteps() {
    return steps;
  }


  public void setSteps(JiraExpressionsComplexityValueBean steps) {
    this.steps = steps;
  }


  public JiraExpressionsComplexityBean expensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
    
    this.expensiveOperations = expensiveOperations;
    return this;
  }

   /**
   * The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields.
   * @return expensiveOperations
  **/
  @ApiModelProperty(required = true, value = "The number of expensive operations executed while evaluating the expression. Expensive operations are those that load additional data, such as entity properties, comments, or custom fields.")
  @JsonProperty(JSON_PROPERTY_EXPENSIVE_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JiraExpressionsComplexityValueBean getExpensiveOperations() {
    return expensiveOperations;
  }


  public void setExpensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
  }


  public JiraExpressionsComplexityBean beans(JiraExpressionsComplexityValueBean beans) {
    
    this.beans = beans;
    return this;
  }

   /**
   * The number of Jira REST API beans returned in the response.
   * @return beans
  **/
  @ApiModelProperty(required = true, value = "The number of Jira REST API beans returned in the response.")
  @JsonProperty(JSON_PROPERTY_BEANS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JiraExpressionsComplexityValueBean getBeans() {
    return beans;
  }


  public void setBeans(JiraExpressionsComplexityValueBean beans) {
    this.beans = beans;
  }


  public JiraExpressionsComplexityBean primitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
    
    this.primitiveValues = primitiveValues;
    return this;
  }

   /**
   * The number of primitive values returned in the response.
   * @return primitiveValues
  **/
  @ApiModelProperty(required = true, value = "The number of primitive values returned in the response.")
  @JsonProperty(JSON_PROPERTY_PRIMITIVE_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JiraExpressionsComplexityValueBean getPrimitiveValues() {
    return primitiveValues;
  }


  public void setPrimitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
    this.primitiveValues = primitiveValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsComplexityBean jiraExpressionsComplexityBean = (JiraExpressionsComplexityBean) o;
    return Objects.equals(this.steps, jiraExpressionsComplexityBean.steps) &&
        Objects.equals(this.expensiveOperations, jiraExpressionsComplexityBean.expensiveOperations) &&
        Objects.equals(this.beans, jiraExpressionsComplexityBean.beans) &&
        Objects.equals(this.primitiveValues, jiraExpressionsComplexityBean.primitiveValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(steps, expensiveOperations, beans, primitiveValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsComplexityBean {\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    expensiveOperations: ").append(toIndentedString(expensiveOperations)).append("\n");
    sb.append("    beans: ").append(toIndentedString(beans)).append("\n");
    sb.append("    primitiveValues: ").append(toIndentedString(primitiveValues)).append("\n");
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

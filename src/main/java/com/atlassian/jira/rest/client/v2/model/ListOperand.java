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
import com.atlassian.jira.rest.client.v2.model.JqlQueryUnitaryOperand;
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
 * An operand that is a list of values.
 */
@ApiModel(description = "An operand that is a list of values.")
@JsonPropertyOrder({
  ListOperand.JSON_PROPERTY_VALUES
})
@JsonTypeName("ListOperand")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ListOperand {
  public static final String JSON_PROPERTY_VALUES = "values";
  private List<JqlQueryUnitaryOperand> values = new ArrayList<>();


  public ListOperand values(List<JqlQueryUnitaryOperand> values) {
    
    this.values = values;
    return this;
  }

  public ListOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of operand values.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "The list of operand values.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<JqlQueryUnitaryOperand> getValues() {
    return values;
  }


  public void setValues(List<JqlQueryUnitaryOperand> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListOperand listOperand = (ListOperand) o;
    return Objects.equals(this.values, listOperand.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListOperand {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


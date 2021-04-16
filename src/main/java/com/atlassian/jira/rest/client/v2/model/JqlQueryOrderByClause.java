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
import com.atlassian.jira.rest.client.v2.model.JqlQueryOrderByClauseElement;
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
 * Details of the order-by JQL clause.
 */
@ApiModel(description = "Details of the order-by JQL clause.")
@JsonPropertyOrder({
  JqlQueryOrderByClause.JSON_PROPERTY_FIELDS
})
@JsonTypeName("JqlQueryOrderByClause")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class JqlQueryOrderByClause {
  public static final String JSON_PROPERTY_FIELDS = "fields";
  private List<JqlQueryOrderByClauseElement> fields = new ArrayList<>();


  public JqlQueryOrderByClause fields(List<JqlQueryOrderByClauseElement> fields) {
    
    this.fields = fields;
    return this;
  }

  public JqlQueryOrderByClause addFieldsItem(JqlQueryOrderByClauseElement fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * The list of order-by clause fields and their ordering directives.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "The list of order-by clause fields and their ordering directives.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<JqlQueryOrderByClauseElement> getFields() {
    return fields;
  }


  public void setFields(List<JqlQueryOrderByClauseElement> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryOrderByClause jqlQueryOrderByClause = (JqlQueryOrderByClause) o;
    return Objects.equals(this.fields, jqlQueryOrderByClause.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryOrderByClause {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

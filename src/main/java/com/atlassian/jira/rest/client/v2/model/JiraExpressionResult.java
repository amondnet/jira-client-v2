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
import com.atlassian.jira.rest.client.v2.model.JiraExpressionEvaluationMetaDataBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The result of evaluating a Jira expression.
 */
@ApiModel(description = "The result of evaluating a Jira expression.")
@JsonPropertyOrder({
  JiraExpressionResult.JSON_PROPERTY_VALUE,
  JiraExpressionResult.JSON_PROPERTY_META
})
@JsonTypeName("JiraExpressionResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class JiraExpressionResult {
  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value = null;

  public static final String JSON_PROPERTY_META = "meta";
  private JiraExpressionEvaluationMetaDataBean meta = null;


  public JiraExpressionResult value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that&#39;s the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public JiraExpressionResult meta(JiraExpressionEvaluationMetaDataBean meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Contains various characteristics of the performed expression evaluation.
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains various characteristics of the performed expression evaluation.")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JiraExpressionEvaluationMetaDataBean getMeta() {
    return meta;
  }


  public void setMeta(JiraExpressionEvaluationMetaDataBean meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionResult jiraExpressionResult = (JiraExpressionResult) o;
    return Objects.equals(this.value, jiraExpressionResult.value) &&
        Objects.equals(this.meta, jiraExpressionResult.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionResult {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

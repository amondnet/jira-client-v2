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
import com.atlassian.jira.rest.client.v2.model.SuggestedIssue;
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
 * A type of issue suggested for use in auto-completion.
 */
@ApiModel(description = "A type of issue suggested for use in auto-completion.")
@JsonPropertyOrder({
  IssuePickerSuggestionsIssueType.JSON_PROPERTY_LABEL,
  IssuePickerSuggestionsIssueType.JSON_PROPERTY_SUB,
  IssuePickerSuggestionsIssueType.JSON_PROPERTY_ID,
  IssuePickerSuggestionsIssueType.JSON_PROPERTY_MSG,
  IssuePickerSuggestionsIssueType.JSON_PROPERTY_ISSUES
})
@JsonTypeName("IssuePickerSuggestionsIssueType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssuePickerSuggestionsIssueType {
  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_SUB = "sub";
  private String sub;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_MSG = "msg";
  private String msg;

  public static final String JSON_PROPERTY_ISSUES = "issues";
  private List<SuggestedIssue> issues = null;


   /**
   * The label of the type of issues suggested for use in auto-completion.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label of the type of issues suggested for use in auto-completion.")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }




   /**
   * If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
   * @return sub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.")
  @JsonProperty(JSON_PROPERTY_SUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSub() {
    return sub;
  }




   /**
   * The ID of the type of issues suggested for use in auto-completion.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the type of issues suggested for use in auto-completion.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * If no issue suggestions are found, returns a message indicating no suggestions were found,
   * @return msg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If no issue suggestions are found, returns a message indicating no suggestions were found,")
  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMsg() {
    return msg;
  }




   /**
   * A list of issues suggested for use in auto-completion.
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of issues suggested for use in auto-completion.")
  @JsonProperty(JSON_PROPERTY_ISSUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SuggestedIssue> getIssues() {
    return issues;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePickerSuggestionsIssueType issuePickerSuggestionsIssueType = (IssuePickerSuggestionsIssueType) o;
    return Objects.equals(this.label, issuePickerSuggestionsIssueType.label) &&
        Objects.equals(this.sub, issuePickerSuggestionsIssueType.sub) &&
        Objects.equals(this.id, issuePickerSuggestionsIssueType.id) &&
        Objects.equals(this.msg, issuePickerSuggestionsIssueType.msg) &&
        Objects.equals(this.issues, issuePickerSuggestionsIssueType.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, sub, id, msg, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePickerSuggestionsIssueType {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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


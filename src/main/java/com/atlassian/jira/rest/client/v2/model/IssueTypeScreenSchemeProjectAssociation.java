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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Associated issue type screen scheme and project.
 */
@ApiModel(description = "Associated issue type screen scheme and project.")
@JsonPropertyOrder({
  IssueTypeScreenSchemeProjectAssociation.JSON_PROPERTY_ISSUE_TYPE_SCREEN_SCHEME_ID,
  IssueTypeScreenSchemeProjectAssociation.JSON_PROPERTY_PROJECT_ID
})
@JsonTypeName("IssueTypeScreenSchemeProjectAssociation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueTypeScreenSchemeProjectAssociation {
  public static final String JSON_PROPERTY_ISSUE_TYPE_SCREEN_SCHEME_ID = "issueTypeScreenSchemeId";
  private String issueTypeScreenSchemeId;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private String projectId;


  public IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

   /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type screen scheme.")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_SCREEN_SCHEME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }


  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }


  public IssueTypeScreenSchemeProjectAssociation projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation = (IssueTypeScreenSchemeProjectAssociation) o;
    return Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeProjectAssociation.issueTypeScreenSchemeId) &&
        Objects.equals(this.projectId, issueTypeScreenSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeProjectAssociation {\n");
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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


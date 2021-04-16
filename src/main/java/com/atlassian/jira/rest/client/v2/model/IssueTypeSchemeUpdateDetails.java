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
 * Details of the name, description, and default issue type for an issue type scheme.
 */
@ApiModel(description = "Details of the name, description, and default issue type for an issue type scheme.")
@JsonPropertyOrder({
  IssueTypeSchemeUpdateDetails.JSON_PROPERTY_NAME,
  IssueTypeSchemeUpdateDetails.JSON_PROPERTY_DESCRIPTION,
  IssueTypeSchemeUpdateDetails.JSON_PROPERTY_DEFAULT_ISSUE_TYPE_ID
})
@JsonTypeName("IssueTypeSchemeUpdateDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueTypeSchemeUpdateDetails {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DEFAULT_ISSUE_TYPE_ID = "defaultIssueTypeId";
  private String defaultIssueTypeId;


  public IssueTypeSchemeUpdateDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the issue type scheme. The name must be unique. The maximum length is 255 characters.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IssueTypeSchemeUpdateDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type scheme. The maximum length is 4000 characters.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue type scheme. The maximum length is 4000 characters.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public IssueTypeSchemeUpdateDetails defaultIssueTypeId(String defaultIssueTypeId) {
    
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

   /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the default issue type of the issue type scheme.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_ISSUE_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }


  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails = (IssueTypeSchemeUpdateDetails) o;
    return Objects.equals(this.name, issueTypeSchemeUpdateDetails.name) &&
        Objects.equals(this.description, issueTypeSchemeUpdateDetails.description) &&
        Objects.equals(this.defaultIssueTypeId, issueTypeSchemeUpdateDetails.defaultIssueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, defaultIssueTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeUpdateDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
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


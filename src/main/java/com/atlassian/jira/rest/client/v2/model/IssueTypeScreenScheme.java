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
 * Details of an issue type screen scheme.
 */
@ApiModel(description = "Details of an issue type screen scheme.")
@JsonPropertyOrder({
  IssueTypeScreenScheme.JSON_PROPERTY_ID,
  IssueTypeScreenScheme.JSON_PROPERTY_NAME,
  IssueTypeScreenScheme.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("IssueTypeScreenScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueTypeScreenScheme {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;


  public IssueTypeScreenScheme id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue type screen scheme.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the issue type screen scheme.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IssueTypeScreenScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type screen scheme.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the issue type screen scheme.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public IssueTypeScreenScheme description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type screen scheme.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue type screen scheme.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScreenScheme issueTypeScreenScheme = (IssueTypeScreenScheme) o;
    return Objects.equals(this.id, issueTypeScreenScheme.id) &&
        Objects.equals(this.name, issueTypeScreenScheme.name) &&
        Objects.equals(this.description, issueTypeScreenScheme.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenScheme {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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


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
 * Associated field configuration scheme and project.
 */
@ApiModel(description = "Associated field configuration scheme and project.")
@JsonPropertyOrder({
  FieldConfigurationSchemeProjectAssociation.JSON_PROPERTY_FIELD_CONFIGURATION_SCHEME_ID,
  FieldConfigurationSchemeProjectAssociation.JSON_PROPERTY_PROJECT_ID
})
@JsonTypeName("FieldConfigurationSchemeProjectAssociation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class FieldConfigurationSchemeProjectAssociation {
  public static final String JSON_PROPERTY_FIELD_CONFIGURATION_SCHEME_ID = "fieldConfigurationSchemeId";
  private String fieldConfigurationSchemeId;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private String projectId;


  public FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
    return this;
  }

   /**
   * The ID of the field configuration scheme. If the field configuration scheme ID is &#x60;null&#x60;, the operation assigns the default field configuration scheme.
   * @return fieldConfigurationSchemeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the field configuration scheme. If the field configuration scheme ID is `null`, the operation assigns the default field configuration scheme.")
  @JsonProperty(JSON_PROPERTY_FIELD_CONFIGURATION_SCHEME_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldConfigurationSchemeId() {
    return fieldConfigurationSchemeId;
  }


  public void setFieldConfigurationSchemeId(String fieldConfigurationSchemeId) {
    this.fieldConfigurationSchemeId = fieldConfigurationSchemeId;
  }


  public FieldConfigurationSchemeProjectAssociation projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @ApiModelProperty(required = true, value = "The ID of the project.")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

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
    FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation = (FieldConfigurationSchemeProjectAssociation) o;
    return Objects.equals(this.fieldConfigurationSchemeId, fieldConfigurationSchemeProjectAssociation.fieldConfigurationSchemeId) &&
        Objects.equals(this.projectId, fieldConfigurationSchemeProjectAssociation.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationSchemeId, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationSchemeProjectAssociation {\n");
    sb.append("    fieldConfigurationSchemeId: ").append(toIndentedString(fieldConfigurationSchemeId)).append("\n");
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


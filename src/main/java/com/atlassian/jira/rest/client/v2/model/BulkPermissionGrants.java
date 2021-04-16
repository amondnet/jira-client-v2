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
import com.atlassian.jira.rest.client.v2.model.BulkProjectPermissionGrants;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of global and project permissions granted to the user.
 */
@ApiModel(description = "Details of global and project permissions granted to the user.")
@JsonPropertyOrder({
  BulkPermissionGrants.JSON_PROPERTY_PROJECT_PERMISSIONS,
  BulkPermissionGrants.JSON_PROPERTY_GLOBAL_PERMISSIONS
})
@JsonTypeName("BulkPermissionGrants")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class BulkPermissionGrants {
  public static final String JSON_PROPERTY_PROJECT_PERMISSIONS = "projectPermissions";
  private Set<BulkProjectPermissionGrants> projectPermissions = new LinkedHashSet<>();

  public static final String JSON_PROPERTY_GLOBAL_PERMISSIONS = "globalPermissions";
  private Set<String> globalPermissions = new LinkedHashSet<>();


  public BulkPermissionGrants projectPermissions(Set<BulkProjectPermissionGrants> projectPermissions) {
    
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionGrants addProjectPermissionsItem(BulkProjectPermissionGrants projectPermissionsItem) {
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * List of project permissions and the projects and issues those permissions provide access to.
   * @return projectPermissions
  **/
  @ApiModelProperty(required = true, value = "List of project permissions and the projects and issues those permissions provide access to.")
  @JsonProperty(JSON_PROPERTY_PROJECT_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<BulkProjectPermissionGrants> getProjectPermissions() {
    return projectPermissions;
  }


  public void setProjectPermissions(Set<BulkProjectPermissionGrants> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }


  public BulkPermissionGrants globalPermissions(Set<String> globalPermissions) {
    
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionGrants addGlobalPermissionsItem(String globalPermissionsItem) {
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * List of permissions granted to the user.
   * @return globalPermissions
  **/
  @ApiModelProperty(required = true, value = "List of permissions granted to the user.")
  @JsonProperty(JSON_PROPERTY_GLOBAL_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Set<String> getGlobalPermissions() {
    return globalPermissions;
  }


  public void setGlobalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionGrants bulkPermissionGrants = (BulkPermissionGrants) o;
    return Objects.equals(this.projectPermissions, bulkPermissionGrants.projectPermissions) &&
        Objects.equals(this.globalPermissions, bulkPermissionGrants.globalPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPermissions, globalPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionGrants {\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
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


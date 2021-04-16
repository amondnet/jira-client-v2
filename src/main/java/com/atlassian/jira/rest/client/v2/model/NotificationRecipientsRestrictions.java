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
import com.atlassian.jira.rest.client.v2.model.GroupName;
import com.atlassian.jira.rest.client.v2.model.RestrictedPermission;
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
 * Details of the group membership or permissions needed to receive the notification.
 */
@ApiModel(description = "Details of the group membership or permissions needed to receive the notification.")
@JsonPropertyOrder({
  NotificationRecipientsRestrictions.JSON_PROPERTY_GROUPS,
  NotificationRecipientsRestrictions.JSON_PROPERTY_PERMISSIONS
})
@JsonTypeName("NotificationRecipientsRestrictions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class NotificationRecipientsRestrictions {
  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<GroupName> groups = null;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<RestrictedPermission> permissions = null;


  public NotificationRecipientsRestrictions groups(List<GroupName> groups) {
    
    this.groups = groups;
    return this;
  }

  public NotificationRecipientsRestrictions addGroupsItem(GroupName groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of group memberships required to receive the notification.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of group memberships required to receive the notification.")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GroupName> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupName> groups) {
    this.groups = groups;
  }


  public NotificationRecipientsRestrictions permissions(List<RestrictedPermission> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public NotificationRecipientsRestrictions addPermissionsItem(RestrictedPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * List of permissions required to receive the notification.
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of permissions required to receive the notification.")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RestrictedPermission> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<RestrictedPermission> permissions) {
    this.permissions = permissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRecipientsRestrictions notificationRecipientsRestrictions = (NotificationRecipientsRestrictions) o;
    return Objects.equals(this.groups, notificationRecipientsRestrictions.groups) &&
        Objects.equals(this.permissions, notificationRecipientsRestrictions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipientsRestrictions {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

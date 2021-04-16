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
import com.atlassian.jira.rest.client.v2.model.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of a user or group subscribing to a filter.
 */
@ApiModel(description = "Details of a user or group subscribing to a filter.")
@JsonPropertyOrder({
  FilterSubscription.JSON_PROPERTY_ID,
  FilterSubscription.JSON_PROPERTY_USER,
  FilterSubscription.JSON_PROPERTY_GROUP
})
@JsonTypeName("FilterSubscription")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class FilterSubscription {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_USER = "user";
  private User user = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private GroupName group = null;


   /**
   * The ID of the filter subscription.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the filter subscription.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }




   /**
   * The user subscribing to filter.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user subscribing to filter.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public User getUser() {
    return user;
  }




   /**
   * The group subscribing to filter.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The group subscribing to filter.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GroupName getGroup() {
    return group;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterSubscription filterSubscription = (FilterSubscription) o;
    return Objects.equals(this.id, filterSubscription.id) &&
        Objects.equals(this.user, filterSubscription.user) &&
        Objects.equals(this.group, filterSubscription.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterSubscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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


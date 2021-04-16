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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ActorInputBean
 */
@JsonPropertyOrder({
  ActorInputBean.JSON_PROPERTY_USER,
  ActorInputBean.JSON_PROPERTY_GROUP
})
@JsonTypeName("ActorInputBean")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ActorInputBean {
  public static final String JSON_PROPERTY_USER = "user";
  private List<String> user = null;

  public static final String JSON_PROPERTY_GROUP = "group";
  private List<String> group = null;


  public ActorInputBean user(List<String> user) {
    
    this.user = user;
    return this;
  }

  public ActorInputBean addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

   /**
   * The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, &#x60;\&quot;user\&quot;:[\&quot;5b10a2844c20165700ede21g\&quot;, \&quot;5b109f2e9729b51b54dc274d\&quot;]&#x60;.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `\"user\":[\"5b10a2844c20165700ede21g\", \"5b109f2e9729b51b54dc274d\"]`.")
  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUser() {
    return user;
  }


  public void setUser(List<String> user) {
    this.user = user;
  }


  public ActorInputBean group(List<String> group) {
    
    this.group = group;
    return this;
  }

  public ActorInputBean addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

   /**
   * The name of the group to add as a default actor. This parameter accepts a comma-separated list. For example, &#x60;\&quot;group\&quot;:[\&quot;project-admin\&quot;, \&quot;jira-developers\&quot;]&#x60;.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group to add as a default actor. This parameter accepts a comma-separated list. For example, `\"group\":[\"project-admin\", \"jira-developers\"]`.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroup() {
    return group;
  }


  public void setGroup(List<String> group) {
    this.group = group;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorInputBean actorInputBean = (ActorInputBean) o;
    return Objects.equals(this.user, actorInputBean.user) &&
        Objects.equals(this.group, actorInputBean.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorInputBean {\n");
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


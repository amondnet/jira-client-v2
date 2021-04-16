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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details of an application role.
 */
@ApiModel(description = "Details of an application role.")
@JsonPropertyOrder({
  ApplicationRole.JSON_PROPERTY_KEY,
  ApplicationRole.JSON_PROPERTY_GROUPS,
  ApplicationRole.JSON_PROPERTY_NAME,
  ApplicationRole.JSON_PROPERTY_DEFAULT_GROUPS,
  ApplicationRole.JSON_PROPERTY_SELECTED_BY_DEFAULT,
  ApplicationRole.JSON_PROPERTY_DEFINED,
  ApplicationRole.JSON_PROPERTY_NUMBER_OF_SEATS,
  ApplicationRole.JSON_PROPERTY_REMAINING_SEATS,
  ApplicationRole.JSON_PROPERTY_USER_COUNT,
  ApplicationRole.JSON_PROPERTY_USER_COUNT_DESCRIPTION,
  ApplicationRole.JSON_PROPERTY_HAS_UNLIMITED_SEATS,
  ApplicationRole.JSON_PROPERTY_PLATFORM
})
@JsonTypeName("ApplicationRole")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ApplicationRole {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private Set<String> groups = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DEFAULT_GROUPS = "defaultGroups";
  private Set<String> defaultGroups = null;

  public static final String JSON_PROPERTY_SELECTED_BY_DEFAULT = "selectedByDefault";
  private Boolean selectedByDefault;

  public static final String JSON_PROPERTY_DEFINED = "defined";
  private Boolean defined;

  public static final String JSON_PROPERTY_NUMBER_OF_SEATS = "numberOfSeats";
  private Integer numberOfSeats;

  public static final String JSON_PROPERTY_REMAINING_SEATS = "remainingSeats";
  private Integer remainingSeats;

  public static final String JSON_PROPERTY_USER_COUNT = "userCount";
  private Integer userCount;

  public static final String JSON_PROPERTY_USER_COUNT_DESCRIPTION = "userCountDescription";
  private String userCountDescription;

  public static final String JSON_PROPERTY_HAS_UNLIMITED_SEATS = "hasUnlimitedSeats";
  private Boolean hasUnlimitedSeats;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private Boolean platform;


  public ApplicationRole key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the application role.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the application role.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ApplicationRole groups(Set<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public ApplicationRole addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * The groups associated with the application role.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups associated with the application role.")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getGroups() {
    return groups;
  }


  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }


  public ApplicationRole name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The display name of the application role.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the application role.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationRole defaultGroups(Set<String> defaultGroups) {
    
    this.defaultGroups = defaultGroups;
    return this;
  }

  public ApplicationRole addDefaultGroupsItem(String defaultGroupsItem) {
    if (this.defaultGroups == null) {
      this.defaultGroups = new LinkedHashSet<>();
    }
    this.defaultGroups.add(defaultGroupsItem);
    return this;
  }

   /**
   * The groups that are granted default access for this application role.
   * @return defaultGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups that are granted default access for this application role.")
  @JsonProperty(JSON_PROPERTY_DEFAULT_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<String> getDefaultGroups() {
    return defaultGroups;
  }


  public void setDefaultGroups(Set<String> defaultGroups) {
    this.defaultGroups = defaultGroups;
  }


  public ApplicationRole selectedByDefault(Boolean selectedByDefault) {
    
    this.selectedByDefault = selectedByDefault;
    return this;
  }

   /**
   * Determines whether this application role should be selected by default on user creation.
   * @return selectedByDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines whether this application role should be selected by default on user creation.")
  @JsonProperty(JSON_PROPERTY_SELECTED_BY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSelectedByDefault() {
    return selectedByDefault;
  }


  public void setSelectedByDefault(Boolean selectedByDefault) {
    this.selectedByDefault = selectedByDefault;
  }


  public ApplicationRole defined(Boolean defined) {
    
    this.defined = defined;
    return this;
  }

   /**
   * Deprecated.
   * @return defined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated.")
  @JsonProperty(JSON_PROPERTY_DEFINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefined() {
    return defined;
  }


  public void setDefined(Boolean defined) {
    this.defined = defined;
  }


  public ApplicationRole numberOfSeats(Integer numberOfSeats) {
    
    this.numberOfSeats = numberOfSeats;
    return this;
  }

   /**
   * The maximum count of users on your license.
   * @return numberOfSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum count of users on your license.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberOfSeats() {
    return numberOfSeats;
  }


  public void setNumberOfSeats(Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }


  public ApplicationRole remainingSeats(Integer remainingSeats) {
    
    this.remainingSeats = remainingSeats;
    return this;
  }

   /**
   * The count of users remaining on your license.
   * @return remainingSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The count of users remaining on your license.")
  @JsonProperty(JSON_PROPERTY_REMAINING_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRemainingSeats() {
    return remainingSeats;
  }


  public void setRemainingSeats(Integer remainingSeats) {
    this.remainingSeats = remainingSeats;
  }


  public ApplicationRole userCount(Integer userCount) {
    
    this.userCount = userCount;
    return this;
  }

   /**
   * The number of users counting against your license.
   * @return userCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of users counting against your license.")
  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUserCount() {
    return userCount;
  }


  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }


  public ApplicationRole userCountDescription(String userCountDescription) {
    
    this.userCountDescription = userCountDescription;
    return this;
  }

   /**
   * The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.
   * @return userCountDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.")
  @JsonProperty(JSON_PROPERTY_USER_COUNT_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserCountDescription() {
    return userCountDescription;
  }


  public void setUserCountDescription(String userCountDescription) {
    this.userCountDescription = userCountDescription;
  }


  public ApplicationRole hasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    
    this.hasUnlimitedSeats = hasUnlimitedSeats;
    return this;
  }

   /**
   * Get hasUnlimitedSeats
   * @return hasUnlimitedSeats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HAS_UNLIMITED_SEATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasUnlimitedSeats() {
    return hasUnlimitedSeats;
  }


  public void setHasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    this.hasUnlimitedSeats = hasUnlimitedSeats;
  }


  public ApplicationRole platform(Boolean platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Indicates if the application role belongs to Jira platform (&#x60;jira-core&#x60;).
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates if the application role belongs to Jira platform (`jira-core`).")
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPlatform() {
    return platform;
  }


  public void setPlatform(Boolean platform) {
    this.platform = platform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRole applicationRole = (ApplicationRole) o;
    return Objects.equals(this.key, applicationRole.key) &&
        Objects.equals(this.groups, applicationRole.groups) &&
        Objects.equals(this.name, applicationRole.name) &&
        Objects.equals(this.defaultGroups, applicationRole.defaultGroups) &&
        Objects.equals(this.selectedByDefault, applicationRole.selectedByDefault) &&
        Objects.equals(this.defined, applicationRole.defined) &&
        Objects.equals(this.numberOfSeats, applicationRole.numberOfSeats) &&
        Objects.equals(this.remainingSeats, applicationRole.remainingSeats) &&
        Objects.equals(this.userCount, applicationRole.userCount) &&
        Objects.equals(this.userCountDescription, applicationRole.userCountDescription) &&
        Objects.equals(this.hasUnlimitedSeats, applicationRole.hasUnlimitedSeats) &&
        Objects.equals(this.platform, applicationRole.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, groups, name, defaultGroups, selectedByDefault, defined, numberOfSeats, remainingSeats, userCount, userCountDescription, hasUnlimitedSeats, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRole {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
    sb.append("    selectedByDefault: ").append(toIndentedString(selectedByDefault)).append("\n");
    sb.append("    defined: ").append(toIndentedString(defined)).append("\n");
    sb.append("    numberOfSeats: ").append(toIndentedString(numberOfSeats)).append("\n");
    sb.append("    remainingSeats: ").append(toIndentedString(remainingSeats)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    userCountDescription: ").append(toIndentedString(userCountDescription)).append("\n");
    sb.append("    hasUnlimitedSeats: ").append(toIndentedString(hasUnlimitedSeats)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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


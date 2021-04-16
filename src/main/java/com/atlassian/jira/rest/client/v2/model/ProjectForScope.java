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
import com.atlassian.jira.rest.client.v2.model.AvatarUrlsBean;
import com.atlassian.jira.rest.client.v2.model.UpdatedProjectCategory;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Details about a next-gen project.
 */
@ApiModel(description = "Details about a next-gen project.")
@JsonPropertyOrder({
  ProjectForScope.JSON_PROPERTY_SELF,
  ProjectForScope.JSON_PROPERTY_ID,
  ProjectForScope.JSON_PROPERTY_KEY,
  ProjectForScope.JSON_PROPERTY_NAME,
  ProjectForScope.JSON_PROPERTY_PROJECT_TYPE_KEY,
  ProjectForScope.JSON_PROPERTY_SIMPLIFIED,
  ProjectForScope.JSON_PROPERTY_AVATAR_URLS,
  ProjectForScope.JSON_PROPERTY_PROJECT_CATEGORY
})
@JsonTypeName("ProjectForScope")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ProjectForScope {
  public static final String JSON_PROPERTY_SELF = "self";
  private String self;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PROJECT_TYPE_KEY = "projectTypeKey";
  private ProjectTypeKeyEnum projectTypeKey;

  public static final String JSON_PROPERTY_SIMPLIFIED = "simplified";
  private Boolean simplified;

  public static final String JSON_PROPERTY_AVATAR_URLS = "avatarUrls";
  private AvatarUrlsBean avatarUrls = null;

  public static final String JSON_PROPERTY_PROJECT_CATEGORY = "projectCategory";
  private UpdatedProjectCategory projectCategory = null;


   /**
   * The URL of the project details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the project details.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSelf() {
    return self;
  }




  public ProjectForScope id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


   /**
   * The key of the project.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }




   /**
   * The name of the project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }




   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.")
  @JsonProperty(JSON_PROPERTY_PROJECT_TYPE_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }




   /**
   * Whether or not the project is simplified.
   * @return simplified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the project is simplified.")
  @JsonProperty(JSON_PROPERTY_SIMPLIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSimplified() {
    return simplified;
  }




   /**
   * The URLs of the project&#39;s avatars.
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URLs of the project's avatars.")
  @JsonProperty(JSON_PROPERTY_AVATAR_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }




   /**
   * The category the project belongs to.
   * @return projectCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category the project belongs to.")
  @JsonProperty(JSON_PROPERTY_PROJECT_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdatedProjectCategory getProjectCategory() {
    return projectCategory;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectForScope projectForScope = (ProjectForScope) o;
    return Objects.equals(this.self, projectForScope.self) &&
        Objects.equals(this.id, projectForScope.id) &&
        Objects.equals(this.key, projectForScope.key) &&
        Objects.equals(this.name, projectForScope.name) &&
        Objects.equals(this.projectTypeKey, projectForScope.projectTypeKey) &&
        Objects.equals(this.simplified, projectForScope.simplified) &&
        Objects.equals(this.avatarUrls, projectForScope.avatarUrls) &&
        Objects.equals(this.projectCategory, projectForScope.projectCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key, name, projectTypeKey, simplified, avatarUrls, projectCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectForScope {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
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

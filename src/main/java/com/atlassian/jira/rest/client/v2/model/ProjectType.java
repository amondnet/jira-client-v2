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
 * Details about a project type.
 */
@ApiModel(description = "Details about a project type.")
@JsonPropertyOrder({
  ProjectType.JSON_PROPERTY_KEY,
  ProjectType.JSON_PROPERTY_FORMATTED_KEY,
  ProjectType.JSON_PROPERTY_DESCRIPTION_I18N_KEY,
  ProjectType.JSON_PROPERTY_ICON,
  ProjectType.JSON_PROPERTY_COLOR
})
@JsonTypeName("ProjectType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ProjectType {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_FORMATTED_KEY = "formattedKey";
  private String formattedKey;

  public static final String JSON_PROPERTY_DESCRIPTION_I18N_KEY = "descriptionI18nKey";
  private String descriptionI18nKey;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;


   /**
   * The key of the project type.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project type.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }




   /**
   * The formatted key of the project type.
   * @return formattedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The formatted key of the project type.")
  @JsonProperty(JSON_PROPERTY_FORMATTED_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormattedKey() {
    return formattedKey;
  }




   /**
   * The key of the project type&#39;s description.
   * @return descriptionI18nKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project type's description.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION_I18N_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescriptionI18nKey() {
    return descriptionI18nKey;
  }




   /**
   * The icon of the project type.
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The icon of the project type.")
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }




   /**
   * The color of the project type.
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The color of the project type.")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectType projectType = (ProjectType) o;
    return Objects.equals(this.key, projectType.key) &&
        Objects.equals(this.formattedKey, projectType.formattedKey) &&
        Objects.equals(this.descriptionI18nKey, projectType.descriptionI18nKey) &&
        Objects.equals(this.icon, projectType.icon) &&
        Objects.equals(this.color, projectType.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, formattedKey, descriptionI18nKey, icon, color);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectType {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    formattedKey: ").append(toIndentedString(formattedKey)).append("\n");
    sb.append("    descriptionI18nKey: ").append(toIndentedString(descriptionI18nKey)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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


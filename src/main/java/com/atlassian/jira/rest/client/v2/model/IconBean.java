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
 * An icon.
 */
@ApiModel(description = "An icon.")
@JsonPropertyOrder({
  IconBean.JSON_PROPERTY_URL16X16,
  IconBean.JSON_PROPERTY_TITLE,
  IconBean.JSON_PROPERTY_LINK
})
@JsonTypeName("IconBean")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IconBean {
  public static final String JSON_PROPERTY_URL16X16 = "url16x16";
  private String url16x16;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link;


  public IconBean url16x16(String url16x16) {
    
    this.url16x16 = url16x16;
    return this;
  }

   /**
   * The URL of a 16x16 pixel icon.
   * @return url16x16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of a 16x16 pixel icon.")
  @JsonProperty(JSON_PROPERTY_URL16X16)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl16x16() {
    return url16x16;
  }


  public void setUrl16x16(String url16x16) {
    this.url16x16 = url16x16;
  }


  public IconBean title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the icon, for use as a tooltip on the icon.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the icon, for use as a tooltip on the icon.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public IconBean link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The URL of the tooltip, used only for a status icon.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the tooltip, used only for a status icon.")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IconBean iconBean = (IconBean) o;
    return Objects.equals(this.url16x16, iconBean.url16x16) &&
        Objects.equals(this.title, iconBean.title) &&
        Objects.equals(this.link, iconBean.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url16x16, title, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IconBean {\n");
    sb.append("    url16x16: ").append(toIndentedString(url16x16)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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


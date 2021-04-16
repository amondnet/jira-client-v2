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
import com.atlassian.jira.rest.client.v2.model.GroupLabel;
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
 * A group found in a search.
 */
@ApiModel(description = "A group found in a search.")
@JsonPropertyOrder({
  FoundGroup.JSON_PROPERTY_NAME,
  FoundGroup.JSON_PROPERTY_HTML,
  FoundGroup.JSON_PROPERTY_LABELS,
  FoundGroup.JSON_PROPERTY_GROUP_ID
})
@JsonTypeName("FoundGroup")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class FoundGroup {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HTML = "html";
  private String html;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<GroupLabel> labels = null;

  public static final String JSON_PROPERTY_GROUP_ID = "groupId";
  private String groupId;


  public FoundGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FoundGroup html(String html) {
    
    this.html = html;
    return this;
  }

   /**
   * The group name with the matched query string highlighted with the HTML bold tag.
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The group name with the matched query string highlighted with the HTML bold tag.")
  @JsonProperty(JSON_PROPERTY_HTML)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHtml() {
    return html;
  }


  public void setHtml(String html) {
    this.html = html;
  }


  public FoundGroup labels(List<GroupLabel> labels) {
    
    this.labels = labels;
    return this;
  }

  public FoundGroup addLabelsItem(GroupLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<GroupLabel> getLabels() {
    return labels;
  }


  public void setLabels(List<GroupLabel> labels) {
    this.labels = labels;
  }


  public FoundGroup groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the group, if available, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the group, if available, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundGroup foundGroup = (FoundGroup) o;
    return Objects.equals(this.name, foundGroup.name) &&
        Objects.equals(this.html, foundGroup.html) &&
        Objects.equals(this.labels, foundGroup.labels) &&
        Objects.equals(this.groupId, foundGroup.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, html, labels, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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


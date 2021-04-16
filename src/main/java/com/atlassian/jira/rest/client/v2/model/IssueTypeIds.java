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
 * The list of issue type IDs.
 */
@ApiModel(description = "The list of issue type IDs.")
@JsonPropertyOrder({
  IssueTypeIds.JSON_PROPERTY_ISSUE_TYPE_IDS
})
@JsonTypeName("IssueTypeIds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueTypeIds {
  public static final String JSON_PROPERTY_ISSUE_TYPE_IDS = "issueTypeIds";
  private List<String> issueTypeIds = new ArrayList<>();


  public IssueTypeIds issueTypeIds(List<String> issueTypeIds) {
    
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public IssueTypeIds addIssueTypeIdsItem(String issueTypeIdsItem) {
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

   /**
   * The list of issue type IDs.
   * @return issueTypeIds
  **/
  @ApiModelProperty(required = true, value = "The list of issue type IDs.")
  @JsonProperty(JSON_PROPERTY_ISSUE_TYPE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }


  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeIds issueTypeIds = (IssueTypeIds) o;
    return Objects.equals(this.issueTypeIds, issueTypeIds.issueTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeIds {\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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


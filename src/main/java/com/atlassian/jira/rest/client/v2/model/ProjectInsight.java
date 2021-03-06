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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Additional details about a project.
 */
@ApiModel(description = "Additional details about a project.")
@JsonPropertyOrder({
  ProjectInsight.JSON_PROPERTY_TOTAL_ISSUE_COUNT,
  ProjectInsight.JSON_PROPERTY_LAST_ISSUE_UPDATE_TIME
})
@JsonTypeName("ProjectInsight")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ProjectInsight {
  public static final String JSON_PROPERTY_TOTAL_ISSUE_COUNT = "totalIssueCount";
  private Long totalIssueCount;

  public static final String JSON_PROPERTY_LAST_ISSUE_UPDATE_TIME = "lastIssueUpdateTime";
  private OffsetDateTime lastIssueUpdateTime;


   /**
   * Total issue count.
   * @return totalIssueCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total issue count.")
  @JsonProperty(JSON_PROPERTY_TOTAL_ISSUE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalIssueCount() {
    return totalIssueCount;
  }




   /**
   * The last issue update time.
   * @return lastIssueUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last issue update time.")
  @JsonProperty(JSON_PROPERTY_LAST_ISSUE_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getLastIssueUpdateTime() {
    return lastIssueUpdateTime;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectInsight projectInsight = (ProjectInsight) o;
    return Objects.equals(this.totalIssueCount, projectInsight.totalIssueCount) &&
        Objects.equals(this.lastIssueUpdateTime, projectInsight.lastIssueUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalIssueCount, lastIssueUpdateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectInsight {\n");
    sb.append("    totalIssueCount: ").append(toIndentedString(totalIssueCount)).append("\n");
    sb.append("    lastIssueUpdateTime: ").append(toIndentedString(lastIssueUpdateTime)).append("\n");
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


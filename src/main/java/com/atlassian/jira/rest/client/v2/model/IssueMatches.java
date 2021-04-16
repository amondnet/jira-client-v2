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
import com.atlassian.jira.rest.client.v2.model.IssueMatchesForJQL;
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
 * A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.
 */
@ApiModel(description = "A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.")
@JsonPropertyOrder({
  IssueMatches.JSON_PROPERTY_MATCHES
})
@JsonTypeName("IssueMatches")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueMatches {
  public static final String JSON_PROPERTY_MATCHES = "matches";
  private List<IssueMatchesForJQL> matches = new ArrayList<>();


  public IssueMatches matches(List<IssueMatchesForJQL> matches) {
    
    this.matches = matches;
    return this;
  }

  public IssueMatches addMatchesItem(IssueMatchesForJQL matchesItem) {
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MATCHES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<IssueMatchesForJQL> getMatches() {
    return matches;
  }


  public void setMatches(List<IssueMatchesForJQL> matches) {
    this.matches = matches;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatches issueMatches = (IssueMatches) o;
    return Objects.equals(this.matches, issueMatches.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatches {\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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


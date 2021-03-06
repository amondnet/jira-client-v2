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
import com.atlassian.jira.rest.client.v2.model.AutoCompleteSuggestion;
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
 * The results from a JQL query.
 */
@ApiModel(description = "The results from a JQL query.")
@JsonPropertyOrder({
  AutoCompleteSuggestions.JSON_PROPERTY_RESULTS
})
@JsonTypeName("AutoCompleteSuggestions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class AutoCompleteSuggestions {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<AutoCompleteSuggestion> results = null;


  public AutoCompleteSuggestions results(List<AutoCompleteSuggestion> results) {
    
    this.results = results;
    return this;
  }

  public AutoCompleteSuggestions addResultsItem(AutoCompleteSuggestion resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The list of suggested item.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of suggested item.")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AutoCompleteSuggestion> getResults() {
    return results;
  }


  public void setResults(List<AutoCompleteSuggestion> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoCompleteSuggestions autoCompleteSuggestions = (AutoCompleteSuggestions) o;
    return Objects.equals(this.results, autoCompleteSuggestions.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCompleteSuggestions {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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


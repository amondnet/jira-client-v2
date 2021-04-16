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
import com.atlassian.jira.rest.client.v2.model.JQLQueryWithUnknownUsers;
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
 * The converted JQL queries.
 */
@ApiModel(description = "The converted JQL queries.")
@JsonPropertyOrder({
  ConvertedJQLQueries.JSON_PROPERTY_QUERY_STRINGS,
  ConvertedJQLQueries.JSON_PROPERTY_QUERIES_WITH_UNKNOWN_USERS
})
@JsonTypeName("ConvertedJQLQueries")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ConvertedJQLQueries {
  public static final String JSON_PROPERTY_QUERY_STRINGS = "queryStrings";
  private List<String> queryStrings = null;

  public static final String JSON_PROPERTY_QUERIES_WITH_UNKNOWN_USERS = "queriesWithUnknownUsers";
  private List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers = null;


  public ConvertedJQLQueries queryStrings(List<String> queryStrings) {
    
    this.queryStrings = queryStrings;
    return this;
  }

  public ConvertedJQLQueries addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

   /**
   * The list of converted query strings with account IDs in place of user identifiers.
   * @return queryStrings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of converted query strings with account IDs in place of user identifiers.")
  @JsonProperty(JSON_PROPERTY_QUERY_STRINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getQueryStrings() {
    return queryStrings;
  }


  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }


  public ConvertedJQLQueries queriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
    return this;
  }

  public ConvertedJQLQueries addQueriesWithUnknownUsersItem(JQLQueryWithUnknownUsers queriesWithUnknownUsersItem) {
    if (this.queriesWithUnknownUsers == null) {
      this.queriesWithUnknownUsers = new ArrayList<>();
    }
    this.queriesWithUnknownUsers.add(queriesWithUnknownUsersItem);
    return this;
  }

   /**
   * List of queries containing user information that could not be mapped to an existing user
   * @return queriesWithUnknownUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of queries containing user information that could not be mapped to an existing user")
  @JsonProperty(JSON_PROPERTY_QUERIES_WITH_UNKNOWN_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<JQLQueryWithUnknownUsers> getQueriesWithUnknownUsers() {
    return queriesWithUnknownUsers;
  }


  public void setQueriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedJQLQueries convertedJQLQueries = (ConvertedJQLQueries) o;
    return Objects.equals(this.queryStrings, convertedJQLQueries.queryStrings) &&
        Objects.equals(this.queriesWithUnknownUsers, convertedJQLQueries.queriesWithUnknownUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStrings, queriesWithUnknownUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedJQLQueries {\n");
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
    sb.append("    queriesWithUnknownUsers: ").append(toIndentedString(queriesWithUnknownUsers)).append("\n");
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

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
import com.atlassian.jira.rest.client.v2.model.Screen;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A page of items.
 */
@ApiModel(description = "A page of items.")
@JsonPropertyOrder({
  PageBeanScreen.JSON_PROPERTY_SELF,
  PageBeanScreen.JSON_PROPERTY_NEXT_PAGE,
  PageBeanScreen.JSON_PROPERTY_MAX_RESULTS,
  PageBeanScreen.JSON_PROPERTY_START_AT,
  PageBeanScreen.JSON_PROPERTY_TOTAL,
  PageBeanScreen.JSON_PROPERTY_IS_LAST,
  PageBeanScreen.JSON_PROPERTY_VALUES
})
@JsonTypeName("PageBeanScreen")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class PageBeanScreen {
  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_NEXT_PAGE = "nextPage";
  private URI nextPage;

  public static final String JSON_PROPERTY_MAX_RESULTS = "maxResults";
  private Integer maxResults;

  public static final String JSON_PROPERTY_START_AT = "startAt";
  private Long startAt;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_IS_LAST = "isLast";
  private Boolean isLast;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<Screen> values = null;


   /**
   * The URL of the page.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the page.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }




   /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If there is another page of results, the URL of the next page.")
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getNextPage() {
    return nextPage;
  }




   /**
   * The maximum number of items that could be returned.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of items that could be returned.")
  @JsonProperty(JSON_PROPERTY_MAX_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxResults() {
    return maxResults;
  }




   /**
   * The index of the first item returned.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned.")
  @JsonProperty(JSON_PROPERTY_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStartAt() {
    return startAt;
  }




   /**
   * The number of items returned.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items returned.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotal() {
    return total;
  }




   /**
   * Whether this is the last page.
   * @return isLast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this is the last page.")
  @JsonProperty(JSON_PROPERTY_IS_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLast() {
    return isLast;
  }




   /**
   * The list of items.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of items.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Screen> getValues() {
    return values;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBeanScreen pageBeanScreen = (PageBeanScreen) o;
    return Objects.equals(this.self, pageBeanScreen.self) &&
        Objects.equals(this.nextPage, pageBeanScreen.nextPage) &&
        Objects.equals(this.maxResults, pageBeanScreen.maxResults) &&
        Objects.equals(this.startAt, pageBeanScreen.startAt) &&
        Objects.equals(this.total, pageBeanScreen.total) &&
        Objects.equals(this.isLast, pageBeanScreen.isLast) &&
        Objects.equals(this.values, pageBeanScreen.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, nextPage, maxResults, startAt, total, isLast, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanScreen {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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


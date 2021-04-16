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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Bulk operation filter details.
 */
@ApiModel(description = "Bulk operation filter details.")
@JsonPropertyOrder({
  IssueFilterForBulkPropertyDelete.JSON_PROPERTY_ENTITY_IDS,
  IssueFilterForBulkPropertyDelete.JSON_PROPERTY_CURRENT_VALUE
})
@JsonTypeName("IssueFilterForBulkPropertyDelete")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueFilterForBulkPropertyDelete {
  public static final String JSON_PROPERTY_ENTITY_IDS = "entityIds";
  private Set<Long> entityIds = null;

  public static final String JSON_PROPERTY_CURRENT_VALUE = "currentValue";
  private JsonNullable<Object> currentValue = JsonNullable.<Object>of(null);


  public IssueFilterForBulkPropertyDelete entityIds(Set<Long> entityIds) {
    
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertyDelete addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * List of issues to perform the bulk delete operation on.
   * @return entityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of issues to perform the bulk delete operation on.")
  @JsonProperty(JSON_PROPERTY_ENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Long> getEntityIds() {
    return entityIds;
  }


  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }


  public IssueFilterForBulkPropertyDelete currentValue(Object currentValue) {
    this.currentValue = JsonNullable.<Object>of(currentValue);
    
    return this;
  }

   /**
   * The value of properties to perform the bulk operation on.
   * @return currentValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of properties to perform the bulk operation on.")
  @JsonIgnore

  public Object getCurrentValue() {
        return currentValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getCurrentValue_JsonNullable() {
    return currentValue;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENT_VALUE)
  public void setCurrentValue_JsonNullable(JsonNullable<Object> currentValue) {
    this.currentValue = currentValue;
  }

  public void setCurrentValue(Object currentValue) {
    this.currentValue = JsonNullable.<Object>of(currentValue);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete = (IssueFilterForBulkPropertyDelete) o;
    return Objects.equals(this.entityIds, issueFilterForBulkPropertyDelete.entityIds) &&
        Objects.equals(this.currentValue, issueFilterForBulkPropertyDelete.currentValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds, currentValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFilterForBulkPropertyDelete {\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
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


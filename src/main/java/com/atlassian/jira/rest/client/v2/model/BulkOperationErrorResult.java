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
import com.atlassian.jira.rest.client.v2.model.ErrorCollection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * BulkOperationErrorResult
 */
@JsonPropertyOrder({
  BulkOperationErrorResult.JSON_PROPERTY_STATUS,
  BulkOperationErrorResult.JSON_PROPERTY_ELEMENT_ERRORS,
  BulkOperationErrorResult.JSON_PROPERTY_FAILED_ELEMENT_NUMBER
})
@JsonTypeName("BulkOperationErrorResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class BulkOperationErrorResult {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_ELEMENT_ERRORS = "elementErrors";
  private ErrorCollection elementErrors;

  public static final String JSON_PROPERTY_FAILED_ELEMENT_NUMBER = "failedElementNumber";
  private Integer failedElementNumber;


  public BulkOperationErrorResult status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public BulkOperationErrorResult elementErrors(ErrorCollection elementErrors) {
    
    this.elementErrors = elementErrors;
    return this;
  }

   /**
   * Get elementErrors
   * @return elementErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELEMENT_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorCollection getElementErrors() {
    return elementErrors;
  }


  public void setElementErrors(ErrorCollection elementErrors) {
    this.elementErrors = elementErrors;
  }


  public BulkOperationErrorResult failedElementNumber(Integer failedElementNumber) {
    
    this.failedElementNumber = failedElementNumber;
    return this;
  }

   /**
   * Get failedElementNumber
   * @return failedElementNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILED_ELEMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedElementNumber() {
    return failedElementNumber;
  }


  public void setFailedElementNumber(Integer failedElementNumber) {
    this.failedElementNumber = failedElementNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationErrorResult bulkOperationErrorResult = (BulkOperationErrorResult) o;
    return Objects.equals(this.status, bulkOperationErrorResult.status) &&
        Objects.equals(this.elementErrors, bulkOperationErrorResult.elementErrors) &&
        Objects.equals(this.failedElementNumber, bulkOperationErrorResult.failedElementNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, elementErrors, failedElementNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationErrorResult {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    elementErrors: ").append(toIndentedString(elementErrors)).append("\n");
    sb.append("    failedElementNumber: ").append(toIndentedString(failedElementNumber)).append("\n");
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


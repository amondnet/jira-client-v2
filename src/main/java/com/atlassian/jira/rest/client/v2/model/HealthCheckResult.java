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
 * Jira instance health check results. Deprecated and no longer returned.
 */
@ApiModel(description = "Jira instance health check results. Deprecated and no longer returned.")
@JsonPropertyOrder({
  HealthCheckResult.JSON_PROPERTY_NAME,
  HealthCheckResult.JSON_PROPERTY_DESCRIPTION,
  HealthCheckResult.JSON_PROPERTY_PASSED
})
@JsonTypeName("HealthCheckResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class HealthCheckResult {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PASSED = "passed";
  private Boolean passed;


  public HealthCheckResult name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the Jira health check item.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the Jira health check item.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public HealthCheckResult description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the Jira health check item.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the Jira health check item.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public HealthCheckResult passed(Boolean passed) {
    
    this.passed = passed;
    return this;
  }

   /**
   * Whether the Jira health check item passed or failed.
   * @return passed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the Jira health check item passed or failed.")
  @JsonProperty(JSON_PROPERTY_PASSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPassed() {
    return passed;
  }


  public void setPassed(Boolean passed) {
    this.passed = passed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return Objects.equals(this.name, healthCheckResult.name) &&
        Objects.equals(this.description, healthCheckResult.description) &&
        Objects.equals(this.passed, healthCheckResult.passed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, passed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
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


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
import com.atlassian.jira.rest.client.v2.model.RegisteredWebhook;
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
 * Container for a list of registered webhooks. Webhook details are returned in the same order as the request.
 */
@ApiModel(description = "Container for a list of registered webhooks. Webhook details are returned in the same order as the request.")
@JsonPropertyOrder({
  ContainerForRegisteredWebhooks.JSON_PROPERTY_WEBHOOK_REGISTRATION_RESULT
})
@JsonTypeName("ContainerForRegisteredWebhooks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class ContainerForRegisteredWebhooks {
  public static final String JSON_PROPERTY_WEBHOOK_REGISTRATION_RESULT = "webhookRegistrationResult";
  private List<RegisteredWebhook> webhookRegistrationResult = null;


  public ContainerForRegisteredWebhooks webhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
    
    this.webhookRegistrationResult = webhookRegistrationResult;
    return this;
  }

  public ContainerForRegisteredWebhooks addWebhookRegistrationResultItem(RegisteredWebhook webhookRegistrationResultItem) {
    if (this.webhookRegistrationResult == null) {
      this.webhookRegistrationResult = new ArrayList<>();
    }
    this.webhookRegistrationResult.add(webhookRegistrationResultItem);
    return this;
  }

   /**
   * A list of registered webhooks.
   * @return webhookRegistrationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of registered webhooks.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_REGISTRATION_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RegisteredWebhook> getWebhookRegistrationResult() {
    return webhookRegistrationResult;
  }


  public void setWebhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
    this.webhookRegistrationResult = webhookRegistrationResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForRegisteredWebhooks containerForRegisteredWebhooks = (ContainerForRegisteredWebhooks) o;
    return Objects.equals(this.webhookRegistrationResult, containerForRegisteredWebhooks.webhookRegistrationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookRegistrationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForRegisteredWebhooks {\n");
    sb.append("    webhookRegistrationResult: ").append(toIndentedString(webhookRegistrationResult)).append("\n");
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


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
 * Details about a notification event.
 */
@ApiModel(description = "Details about a notification event.")
@JsonPropertyOrder({
  NotificationEvent.JSON_PROPERTY_ID,
  NotificationEvent.JSON_PROPERTY_NAME,
  NotificationEvent.JSON_PROPERTY_DESCRIPTION,
  NotificationEvent.JSON_PROPERTY_TEMPLATE_EVENT
})
@JsonTypeName("NotificationEvent")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class NotificationEvent {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TEMPLATE_EVENT = "templateEvent";
  private NotificationEvent templateEvent = null;


  public NotificationEvent id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public NotificationEvent name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the event.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the event.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NotificationEvent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the event.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the event.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public NotificationEvent templateEvent(NotificationEvent templateEvent) {
    
    this.templateEvent = templateEvent;
    return this;
  }

   /**
   * The template of the event. Only custom events configured by Jira administrators have template.
   * @return templateEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The template of the event. Only custom events configured by Jira administrators have template.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotificationEvent getTemplateEvent() {
    return templateEvent;
  }


  public void setTemplateEvent(NotificationEvent templateEvent) {
    this.templateEvent = templateEvent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEvent notificationEvent = (NotificationEvent) o;
    return Objects.equals(this.id, notificationEvent.id) &&
        Objects.equals(this.name, notificationEvent.name) &&
        Objects.equals(this.description, notificationEvent.description) &&
        Objects.equals(this.templateEvent, notificationEvent.templateEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, templateEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEvent {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    templateEvent: ").append(toIndentedString(templateEvent)).append("\n");
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

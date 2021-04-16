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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An ordered list of custom field option IDs and information on where to move them.
 */
@ApiModel(description = "An ordered list of custom field option IDs and information on where to move them.")
@JsonPropertyOrder({
  OrderOfCustomFieldOptions.JSON_PROPERTY_CUSTOM_FIELD_OPTION_IDS,
  OrderOfCustomFieldOptions.JSON_PROPERTY_AFTER,
  OrderOfCustomFieldOptions.JSON_PROPERTY_POSITION
})
@JsonTypeName("OrderOfCustomFieldOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class OrderOfCustomFieldOptions {
  public static final String JSON_PROPERTY_CUSTOM_FIELD_OPTION_IDS = "customFieldOptionIds";
  private List<String> customFieldOptionIds = new ArrayList<>();

  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#39;t provided.
   */
  public enum PositionEnum {
    FIRST("First"),
    
    LAST("Last");

    private String value;

    PositionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PositionEnum fromValue(String value) {
      for (PositionEnum b : PositionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_POSITION = "position";
  private PositionEnum position;


  public OrderOfCustomFieldOptions customFieldOptionIds(List<String> customFieldOptionIds) {
    
    this.customFieldOptionIds = customFieldOptionIds;
    return this;
  }

  public OrderOfCustomFieldOptions addCustomFieldOptionIdsItem(String customFieldOptionIdsItem) {
    this.customFieldOptionIds.add(customFieldOptionIdsItem);
    return this;
  }

   /**
   * A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.
   * @return customFieldOptionIds
  **/
  @ApiModelProperty(required = true, value = "A list of IDs of custom field options to move. The order of the custom field option IDs in the list is the order they are given after the move. The list must contain custom field options or cascading options, but not both.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELD_OPTION_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getCustomFieldOptionIds() {
    return customFieldOptionIds;
  }


  public void setCustomFieldOptionIds(List<String> customFieldOptionIds) {
    this.customFieldOptionIds = customFieldOptionIds;
  }


  public OrderOfCustomFieldOptions after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * The ID of the custom field option or cascading option to place the moved options after. Required if &#x60;position&#x60; isn&#39;t provided.
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the custom field option or cascading option to place the moved options after. Required if `position` isn't provided.")
  @JsonProperty(JSON_PROPERTY_AFTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public OrderOfCustomFieldOptions position(PositionEnum position) {
    
    this.position = position;
    return this;
  }

   /**
   * The position the custom field options should be moved to. Required if &#x60;after&#x60; isn&#39;t provided.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The position the custom field options should be moved to. Required if `after` isn't provided.")
  @JsonProperty(JSON_PROPERTY_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PositionEnum getPosition() {
    return position;
  }


  public void setPosition(PositionEnum position) {
    this.position = position;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderOfCustomFieldOptions orderOfCustomFieldOptions = (OrderOfCustomFieldOptions) o;
    return Objects.equals(this.customFieldOptionIds, orderOfCustomFieldOptions.customFieldOptionIds) &&
        Objects.equals(this.after, orderOfCustomFieldOptions.after) &&
        Objects.equals(this.position, orderOfCustomFieldOptions.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldOptionIds, after, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderOfCustomFieldOptions {\n");
    sb.append("    customFieldOptionIds: ").append(toIndentedString(customFieldOptionIds)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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


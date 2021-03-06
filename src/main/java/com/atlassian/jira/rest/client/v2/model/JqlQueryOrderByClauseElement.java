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
import com.atlassian.jira.rest.client.v2.model.JqlQueryField;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * An element of the order-by JQL clause.
 */
@ApiModel(description = "An element of the order-by JQL clause.")
@JsonPropertyOrder({
  JqlQueryOrderByClauseElement.JSON_PROPERTY_FIELD,
  JqlQueryOrderByClauseElement.JSON_PROPERTY_DIRECTION
})
@JsonTypeName("JqlQueryOrderByClauseElement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class JqlQueryOrderByClauseElement {
  public static final String JSON_PROPERTY_FIELD = "field";
  private JqlQueryField field;

  /**
   * The direction in which to order the results.
   */
  public enum DirectionEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DirectionEnum(String value) {
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
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;


  public JqlQueryOrderByClauseElement field(JqlQueryField field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JqlQueryField getField() {
    return field;
  }


  public void setField(JqlQueryField field) {
    this.field = field;
  }


  public JqlQueryOrderByClauseElement direction(DirectionEnum direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * The direction in which to order the results.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The direction in which to order the results.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryOrderByClauseElement jqlQueryOrderByClauseElement = (JqlQueryOrderByClauseElement) o;
    return Objects.equals(this.field, jqlQueryOrderByClauseElement.field) &&
        Objects.equals(this.direction, jqlQueryOrderByClauseElement.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryOrderByClauseElement {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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


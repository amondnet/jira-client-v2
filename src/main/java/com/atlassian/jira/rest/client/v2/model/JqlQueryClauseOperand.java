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
import com.atlassian.jira.rest.client.v2.model.FunctionOperand;
import com.atlassian.jira.rest.client.v2.model.JqlQueryUnitaryOperand;
import com.atlassian.jira.rest.client.v2.model.KeywordOperand;
import com.atlassian.jira.rest.client.v2.model.ListOperand;
import com.atlassian.jira.rest.client.v2.model.ValueOperand;
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
 * Details of an operand in a JQL clause.
 */
@ApiModel(description = "Details of an operand in a JQL clause.")
@JsonPropertyOrder({
  JqlQueryClauseOperand.JSON_PROPERTY_VALUES,
  JqlQueryClauseOperand.JSON_PROPERTY_VALUE,
  JqlQueryClauseOperand.JSON_PROPERTY_FUNCTION,
  JqlQueryClauseOperand.JSON_PROPERTY_ARGUMENTS,
  JqlQueryClauseOperand.JSON_PROPERTY_KEYWORD
})
@JsonTypeName("JqlQueryClauseOperand")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class JqlQueryClauseOperand {
  public static final String JSON_PROPERTY_VALUES = "values";
  private List<JqlQueryUnitaryOperand> values = new ArrayList<>();

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_FUNCTION = "function";
  private String function;

  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private List<String> arguments = new ArrayList<>();

  /**
   * The keyword that is the operand value.
   */
  public enum KeywordEnum {
    EMPTY("empty");

    private String value;

    KeywordEnum(String value) {
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
    public static KeywordEnum fromValue(String value) {
      for (KeywordEnum b : KeywordEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KEYWORD = "keyword";
  private KeywordEnum keyword;


  public JqlQueryClauseOperand values(List<JqlQueryUnitaryOperand> values) {
    
    this.values = values;
    return this;
  }

  public JqlQueryClauseOperand addValuesItem(JqlQueryUnitaryOperand valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of operand values.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "The list of operand values.")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<JqlQueryUnitaryOperand> getValues() {
    return values;
  }


  public void setValues(List<JqlQueryUnitaryOperand> values) {
    this.values = values;
  }


  public JqlQueryClauseOperand value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The operand value.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The operand value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public JqlQueryClauseOperand function(String function) {
    
    this.function = function;
    return this;
  }

   /**
   * The name of the function.
   * @return function
  **/
  @ApiModelProperty(required = true, value = "The name of the function.")
  @JsonProperty(JSON_PROPERTY_FUNCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFunction() {
    return function;
  }


  public void setFunction(String function) {
    this.function = function;
  }


  public JqlQueryClauseOperand arguments(List<String> arguments) {
    
    this.arguments = arguments;
    return this;
  }

  public JqlQueryClauseOperand addArgumentsItem(String argumentsItem) {
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * The list of function arguments.
   * @return arguments
  **/
  @ApiModelProperty(required = true, value = "The list of function arguments.")
  @JsonProperty(JSON_PROPERTY_ARGUMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getArguments() {
    return arguments;
  }


  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }


  public JqlQueryClauseOperand keyword(KeywordEnum keyword) {
    
    this.keyword = keyword;
    return this;
  }

   /**
   * The keyword that is the operand value.
   * @return keyword
  **/
  @ApiModelProperty(required = true, value = "The keyword that is the operand value.")
  @JsonProperty(JSON_PROPERTY_KEYWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeywordEnum getKeyword() {
    return keyword;
  }


  public void setKeyword(KeywordEnum keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryClauseOperand jqlQueryClauseOperand = (JqlQueryClauseOperand) o;
    return Objects.equals(this.values, jqlQueryClauseOperand.values) &&
        Objects.equals(this.value, jqlQueryClauseOperand.value) &&
        Objects.equals(this.function, jqlQueryClauseOperand.function) &&
        Objects.equals(this.arguments, jqlQueryClauseOperand.arguments) &&
        Objects.equals(this.keyword, jqlQueryClauseOperand.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, value, function, arguments, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryClauseOperand {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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


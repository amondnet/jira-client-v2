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
 * UnrestrictedUserEmail
 */
@JsonPropertyOrder({
  UnrestrictedUserEmail.JSON_PROPERTY_ACCOUNT_ID,
  UnrestrictedUserEmail.JSON_PROPERTY_EMAIL
})
@JsonTypeName("UnrestrictedUserEmail")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class UnrestrictedUserEmail {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;


  public UnrestrictedUserEmail accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The accountId of the user
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The accountId of the user")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public UnrestrictedUserEmail email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The email of the user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email of the user")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnrestrictedUserEmail unrestrictedUserEmail = (UnrestrictedUserEmail) o;
    return Objects.equals(this.accountId, unrestrictedUserEmail.accountId) &&
        Objects.equals(this.email, unrestrictedUserEmail.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnrestrictedUserEmail {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


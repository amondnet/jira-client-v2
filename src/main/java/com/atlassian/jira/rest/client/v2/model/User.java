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
import com.atlassian.jira.rest.client.v2.model.AvatarUrlsBean;
import com.atlassian.jira.rest.client.v2.model.SimpleListWrapperApplicationRole;
import com.atlassian.jira.rest.client.v2.model.SimpleListWrapperGroupName;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A user with details as permitted by the user&#39;s Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, &#x60;displayName&#x60; provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, &#x60;accountId&#x60; returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.
 */
@ApiModel(description = "A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.")
@JsonPropertyOrder({
  User.JSON_PROPERTY_SELF,
  User.JSON_PROPERTY_KEY,
  User.JSON_PROPERTY_ACCOUNT_ID,
  User.JSON_PROPERTY_ACCOUNT_TYPE,
  User.JSON_PROPERTY_NAME,
  User.JSON_PROPERTY_EMAIL_ADDRESS,
  User.JSON_PROPERTY_AVATAR_URLS,
  User.JSON_PROPERTY_DISPLAY_NAME,
  User.JSON_PROPERTY_ACTIVE,
  User.JSON_PROPERTY_TIME_ZONE,
  User.JSON_PROPERTY_LOCALE,
  User.JSON_PROPERTY_GROUPS,
  User.JSON_PROPERTY_APPLICATION_ROLES,
  User.JSON_PROPERTY_EXPAND
})
@JsonTypeName("User")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class User {
  public static final String JSON_PROPERTY_SELF = "self";
  private URI self;

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   */
  public enum AccountTypeEnum {
    ATLASSIAN("atlassian"),
    
    APP("app"),
    
    CUSTOMER("customer"),
    
    UNKNOWN("unknown");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountTypeEnum accountType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private String emailAddress;

  public static final String JSON_PROPERTY_AVATAR_URLS = "avatarUrls";
  private AvatarUrlsBean avatarUrls = null;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_LOCALE = "locale";
  private String locale;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private SimpleListWrapperGroupName groups = null;

  public static final String JSON_PROPERTY_APPLICATION_ROLES = "applicationRoles";
  private SimpleListWrapperApplicationRole applicationRoles = null;

  public static final String JSON_PROPERTY_EXPAND = "expand";
  private String expand;


   /**
   * The URL of the user.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user.")
  @JsonProperty(JSON_PROPERTY_SELF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getSelf() {
    return self;
  }




  public User key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public User accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


   /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountTypeEnum getAccountType() {
    return accountType;
  }




  public User name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the user. Depending on the user’s privacy setting, this may be returned as null.")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }




   /**
   * The avatars of the user.
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The avatars of the user.")
  @JsonProperty(JSON_PROPERTY_AVATAR_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }




   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }




   /**
   * Whether the user is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user is active.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }




   /**
   * The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }




   /**
   * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locale of the user. Depending on the user’s privacy setting, this may be returned as null.")
  @JsonProperty(JSON_PROPERTY_LOCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocale() {
    return locale;
  }




   /**
   * The groups that the user belongs to.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups that the user belongs to.")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimpleListWrapperGroupName getGroups() {
    return groups;
  }




   /**
   * The application roles the user is assigned to.
   * @return applicationRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The application roles the user is assigned to.")
  @JsonProperty(JSON_PROPERTY_APPLICATION_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SimpleListWrapperApplicationRole getApplicationRoles() {
    return applicationRoles;
  }




   /**
   * Expand options that include additional user details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional user details in the response.")
  @JsonProperty(JSON_PROPERTY_EXPAND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpand() {
    return expand;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.self, user.self) &&
        Objects.equals(this.key, user.key) &&
        Objects.equals(this.accountId, user.accountId) &&
        Objects.equals(this.accountType, user.accountType) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.avatarUrls, user.avatarUrls) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.timeZone, user.timeZone) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.applicationRoles, user.applicationRoles) &&
        Objects.equals(this.expand, user.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, key, accountId, accountType, name, emailAddress, avatarUrls, displayName, active, timeZone, locale, groups, applicationRoles, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    applicationRoles: ").append(toIndentedString(applicationRoles)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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


package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.EntityProperty;
import com.atlassian.jira.rest.client.v2.model.PropertyKeys;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-16T21:45:04.339922+09:00[Asia/Seoul]")
public class IssueTypePropertiesApi {
    private ApiClient apiClient;

    public IssueTypePropertiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueTypePropertiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete issue type property
     * Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the issue type property is deleted.
     * <p><b>400</b> - Returned if the issue type ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the issue type or property is not found.
     * @param issueTypeId The ID of the issue type.
     * @param propertyKey The key of the property. Use [Get issue type property keys](#api-rest-api-2-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteIssueTypeProperty(String issueTypeId, String propertyKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeId' when calling deleteIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'propertyKey' when calling deleteIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeId", issueTypeId);
        pathParams.put("propertyKey", propertyKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetype/{issueTypeId}/properties/{propertyKey}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get issue type property
     * Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the issue type ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the issue type or property is not found or the user does not have the required permissions.
     * @param issueTypeId The ID of the issue type.
     * @param propertyKey The key of the property. Use [Get issue type property keys](#api-rest-api-2-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
     * @return EntityProperty
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EntityProperty> getIssueTypeProperty(String issueTypeId, String propertyKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeId' when calling getIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'propertyKey' when calling getIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeId", issueTypeId);
        pathParams.put("propertyKey", propertyKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<EntityProperty> localVarReturnType = new ParameterizedTypeReference<EntityProperty>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetype/{issueTypeId}/properties/{propertyKey}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get issue type property keys
     * Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the issue type ID is invalid.
     * <p><b>404</b> - Returned if:   *  the issue type is not found.  *  the user does not have the required permissions.
     * @param issueTypeId The ID of the issue type.
     * @return PropertyKeys
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PropertyKeys> getIssueTypePropertyKeys(String issueTypeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeId' when calling getIssueTypePropertyKeys", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeId", issueTypeId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PropertyKeys> localVarReturnType = new ParameterizedTypeReference<PropertyKeys>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetype/{issueTypeId}/properties", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Set issue type property
     * Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the issue type property is updated.
     * <p><b>201</b> - Returned if the issue type property is created.
     * <p><b>400</b> - Returned if:   *  the issue type ID is invalid.  *  a property value is not provided.  *  the property value JSON content is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to modify the issue type.
     * <p><b>404</b> - Returned if:   *  the issue type is not found.  *  the user does not have the permission view the issue type.
     * @param issueTypeId The ID of the issue type.
     * @param propertyKey The key of the issue type property. The maximum length is 255 characters.
     * @param body The body parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> setIssueTypeProperty(String issueTypeId, String propertyKey, Object body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeId' when calling setIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'propertyKey' when calling setIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling setIssueTypeProperty", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeId", issueTypeId);
        pathParams.put("propertyKey", propertyKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetype/{issueTypeId}/properties/{propertyKey}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

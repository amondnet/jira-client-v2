package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.BulkCreateCustomFieldOptionRequest;
import com.atlassian.jira.rest.client.v2.model.BulkCustomFieldOptionCreateRequest;
import com.atlassian.jira.rest.client.v2.model.BulkCustomFieldOptionUpdateRequest;
import com.atlassian.jira.rest.client.v2.model.CustomFieldCreatedContextOptionsList;
import com.atlassian.jira.rest.client.v2.model.CustomFieldOption;
import com.atlassian.jira.rest.client.v2.model.CustomFieldUpdatedContextOptionsList;
import com.atlassian.jira.rest.client.v2.model.ErrorCollection;
import com.atlassian.jira.rest.client.v2.model.OrderOfCustomFieldOptions;
import com.atlassian.jira.rest.client.v2.model.PageBeanCustomFieldContextOption;
import com.atlassian.jira.rest.client.v2.model.PageBeanCustomFieldOptionDetails;
import com.atlassian.jira.rest.client.v2.model.UpdateCustomFieldOption;

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
public class IssueCustomFieldOptionsApi {
    private ApiClient apiClient;

    public IssueCustomFieldOptionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueCustomFieldOptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create custom field options (context)
     * Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the custom field is not found or the context doesn&#39;t match the custom field.
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @param bulkCustomFieldOptionCreateRequest The bulkCustomFieldOptionCreateRequest parameter
     * @return CustomFieldCreatedContextOptionsList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomFieldCreatedContextOptionsList> createCustomFieldOption(String fieldId, Long contextId, BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest) throws WebClientResponseException {
        Object postBody = bulkCustomFieldOptionCreateRequest;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling createCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new WebClientResponseException("Missing the required parameter 'contextId' when calling createCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bulkCustomFieldOptionCreateRequest' is set
        if (bulkCustomFieldOptionCreateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'bulkCustomFieldOptionCreateRequest' when calling createCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);
        pathParams.put("contextId", contextId);

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

        ParameterizedTypeReference<CustomFieldCreatedContextOptionsList> localVarReturnType = new ParameterizedTypeReference<CustomFieldCreatedContextOptionsList>() {};
        return apiClient.invokeAPI("/rest/api/2/field/{fieldId}/context/{contextId}/option", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create custom field options
     * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Create custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-post) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Creates options and, where the custom select field is of the type *Select List (cascading)*, cascading options for a custom select field. The options are added to the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>201</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the field is not found.
     * @param fieldId The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
     * @param bulkCreateCustomFieldOptionRequest The bulkCreateCustomFieldOptionRequest parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> createCustomFieldOptions(Long fieldId, BulkCreateCustomFieldOptionRequest bulkCreateCustomFieldOptionRequest) throws WebClientResponseException {
        Object postBody = bulkCreateCustomFieldOptionRequest;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling createCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bulkCreateCustomFieldOptionRequest' is set
        if (bulkCreateCustomFieldOptionRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'bulkCreateCustomFieldOptionRequest' when calling createCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);

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
        return apiClient.invokeAPI("/rest/api/2/customField/{fieldId}/option", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete custom field options (context)
     * Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the option is deleted.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the field, the context, or the option is not found.
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context from which an option should be deleted.
     * @param optionId The ID of the option to delete.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteCustomFieldOption(String fieldId, Long contextId, Long optionId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling deleteCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new WebClientResponseException("Missing the required parameter 'contextId' when calling deleteCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'optionId' is set
        if (optionId == null) {
            throw new WebClientResponseException("Missing the required parameter 'optionId' when calling deleteCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);
        pathParams.put("contextId", contextId);
        pathParams.put("optionId", optionId);

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/rest/api/2/field/{fieldId}/context/{contextId}/option/{optionId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get custom field option
     * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Get custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-get) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if:   *  the custom field option is not found.  *  the user does not have permission to view the custom field.
     * @param id The ID of the custom field option.
     * @return CustomFieldOption
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomFieldOption> getCustomFieldOption(String id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<CustomFieldOption> localVarReturnType = new ParameterizedTypeReference<CustomFieldOption>() {};
        return apiClient.invokeAPI("/rest/api/2/customFieldOption/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get custom field options (context)
     * Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the custom field is not found or the context doesn&#39;t match the custom field.
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @param optionId The ID of the option.
     * @param onlyOptions Whether only options are returned.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanCustomFieldContextOption
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PageBeanCustomFieldContextOption> getOptionsForContext(String fieldId, Long contextId, Long optionId, Boolean onlyOptions, Long startAt, Integer maxResults) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling getOptionsForContext", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new WebClientResponseException("Missing the required parameter 'contextId' when calling getOptionsForContext", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);
        pathParams.put("contextId", contextId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "optionId", optionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "onlyOptions", onlyOptions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanCustomFieldContextOption> localVarReturnType = new ParameterizedTypeReference<PageBeanCustomFieldContextOption>() {};
        return apiClient.invokeAPI("/rest/api/2/field/{fieldId}/context/{contextId}/option", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get options for field
     * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Get custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-get) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Returns a [paginated](#pagination) list of options and, where the custom select field is of the type *Select List (cascading)*, cascading options for custom select fields. Cascading options are included in the item count when determining pagination. Only options from the global context are returned.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the field is not found.
     * @param fieldId The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanCustomFieldOptionDetails
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PageBeanCustomFieldOptionDetails> getOptionsForField(Long fieldId, Long startAt, Integer maxResults) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling getOptionsForField", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanCustomFieldOptionDetails> localVarReturnType = new ParameterizedTypeReference<PageBeanCustomFieldOptionDetails>() {};
        return apiClient.invokeAPI("/rest/api/2/customField/{fieldId}/option", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Reorder custom field options (context)
     * Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options--apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if options are reordered.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the field, the context, or one or more of the options is not found..
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @param orderOfCustomFieldOptions The orderOfCustomFieldOptions parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> reorderCustomFieldOptions(String fieldId, Long contextId, OrderOfCustomFieldOptions orderOfCustomFieldOptions) throws WebClientResponseException {
        Object postBody = orderOfCustomFieldOptions;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling reorderCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new WebClientResponseException("Missing the required parameter 'contextId' when calling reorderCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'orderOfCustomFieldOptions' is set
        if (orderOfCustomFieldOptions == null) {
            throw new WebClientResponseException("Missing the required parameter 'orderOfCustomFieldOptions' when calling reorderCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);
        pathParams.put("contextId", contextId);

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
        return apiClient.invokeAPI("/rest/api/2/field/{fieldId}/context/{contextId}/option/move", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update custom field options (context)
     * Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#39;t updated and aren&#39;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the field, context, or one or more options is not found.
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @param bulkCustomFieldOptionUpdateRequest The bulkCustomFieldOptionUpdateRequest parameter
     * @return CustomFieldUpdatedContextOptionsList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CustomFieldUpdatedContextOptionsList> updateCustomFieldOption(String fieldId, Long contextId, BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest) throws WebClientResponseException {
        Object postBody = bulkCustomFieldOptionUpdateRequest;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling updateCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new WebClientResponseException("Missing the required parameter 'contextId' when calling updateCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'bulkCustomFieldOptionUpdateRequest' is set
        if (bulkCustomFieldOptionUpdateRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'bulkCustomFieldOptionUpdateRequest' when calling updateCustomFieldOption", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);
        pathParams.put("contextId", contextId);

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

        ParameterizedTypeReference<CustomFieldUpdatedContextOptionsList> localVarReturnType = new ParameterizedTypeReference<CustomFieldUpdatedContextOptionsList>() {};
        return apiClient.invokeAPI("/rest/api/2/field/{fieldId}/context/{contextId}/option", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update custom field options
     * This operation is deprecated and becomes unavailable on 8 May 2021. Use [Update custom field options (context)](https://developer.atlassian.com/cloud/jira/platform/rest/v3/api-group-issue-custom-field-options/#api-rest-api-3-field-fieldid-context-contextid-option-put) instead. See [Deprecation of custom field options](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-removal-of-custom-field-options-operations/) for details.  Updates the options on a custom select field. Where an updated option is in use on an issue, the value on the issue is also updated. Options that are not found are ignored. A maximum of 1000 options, including sub-options of *Select List (cascading)* fields, can be updated per request. The options are updated on the global context of the field.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the field is not found.
     * @param fieldId The ID of the custom field. Note: This is the numeric part of the of the field ID. For example, for a field with the ID *customfield\\_10075* use *10075*.
     * @param updateCustomFieldOption The updateCustomFieldOption parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> updateCustomFieldOptions(Long fieldId, UpdateCustomFieldOption updateCustomFieldOption) throws WebClientResponseException {
        Object postBody = updateCustomFieldOption;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new WebClientResponseException("Missing the required parameter 'fieldId' when calling updateCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateCustomFieldOption' is set
        if (updateCustomFieldOption == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateCustomFieldOption' when calling updateCustomFieldOptions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("fieldId", fieldId);

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
        return apiClient.invokeAPI("/rest/api/2/customField/{fieldId}/option", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.EntityProperty;
import com.atlassian.jira.rest.client.v2.model.OperationMessage;
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
public class AppPropertiesApi {
    private ApiClient apiClient;

    public AppPropertiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppPropertiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete app property
     * Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the property key is longer than 127 characters.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the property is not found or doesn&#39;t belong to the app.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @param propertyKey The key of the property.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> addonPropertiesResourceDeleteAddonPropertyDelete(String addonKey, String propertyKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'addonKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'propertyKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addonKey", addonKey);
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get app properties
     * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @return PropertyKeys
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PropertyKeys> addonPropertiesResourceGetAddonPropertiesGet(String addonKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertiesGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addonKey", addonKey);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PropertyKeys> localVarReturnType = new ParameterizedTypeReference<PropertyKeys>() {};
        return apiClient.invokeAPI("/rest/atlassian-connect/1/addons/{addonKey}/properties", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get app property
     * Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the property key is longer than 127 characters.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the property is not found or doesn&#39;t belong to the app.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @param propertyKey The key of the property.
     * @return EntityProperty
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<EntityProperty> addonPropertiesResourceGetAddonPropertyGet(String addonKey, String propertyKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'propertyKey' when calling addonPropertiesResourceGetAddonPropertyGet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addonKey", addonKey);
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<EntityProperty> localVarReturnType = new ParameterizedTypeReference<EntityProperty>() {};
        return apiClient.invokeAPI("/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Set app property
     * Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>200</b> - Returned if the property is updated.
     * <p><b>201</b> - Returned is the property is created.
     * <p><b>400</b> - Returned if:   * the property key is longer than 127 characters.   * the value is not valid JSON.   * the value is longer than 32768 characters.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @param propertyKey The key of the property.
     * @param body The body parameter
     * @return OperationMessage
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OperationMessage> addonPropertiesResourcePutAddonPropertyPut(String addonKey, String propertyKey, Object body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'addonKey' when calling addonPropertiesResourcePutAddonPropertyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'propertyKey' when calling addonPropertiesResourcePutAddonPropertyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new WebClientResponseException("Missing the required parameter 'body' when calling addonPropertiesResourcePutAddonPropertyPut", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("addonKey", addonKey);
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<OperationMessage> localVarReturnType = new ParameterizedTypeReference<OperationMessage>() {};
        return apiClient.invokeAPI("/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

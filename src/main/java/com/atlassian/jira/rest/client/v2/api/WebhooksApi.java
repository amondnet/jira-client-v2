package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.ContainerForRegisteredWebhooks;
import com.atlassian.jira.rest.client.v2.model.ContainerForWebhookIDs;
import com.atlassian.jira.rest.client.v2.model.ErrorCollection;
import com.atlassian.jira.rest.client.v2.model.FailedWebhooks;
import com.atlassian.jira.rest.client.v2.model.PageBeanWebhook;
import com.atlassian.jira.rest.client.v2.model.WebhookRegistrationDetails;
import com.atlassian.jira.rest.client.v2.model.WebhooksExpirationDate;

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
public class WebhooksApi {
    private ApiClient apiClient;

    public WebhooksApi() {
        this(new ApiClient());
    }

    @Autowired
    public WebhooksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete webhooks by ID
     * Removes webhooks by ID. Only webhooks registered by the calling Connect app are removed. If webhooks created by other apps are specified, they are ignored.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.
     * <p><b>202</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the list of webhook IDs is missing.
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * @param containerForWebhookIDs The containerForWebhookIDs parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteWebhookById(ContainerForWebhookIDs containerForWebhookIDs) throws WebClientResponseException {
        Object postBody = containerForWebhookIDs;
        // verify the required parameter 'containerForWebhookIDs' is set
        if (containerForWebhookIDs == null) {
            throw new WebClientResponseException("Missing the required parameter 'containerForWebhookIDs' when calling deleteWebhookById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/rest/api/2/webhook", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get dynamic webhooks for app
     * Returns a [paginated](#pagination) list of the webhooks registered by the calling app.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanWebhook
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PageBeanWebhook> getDynamicWebhooksForApp(Long startAt, Integer maxResults) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<PageBeanWebhook> localVarReturnType = new ParameterizedTypeReference<PageBeanWebhook>() {};
        return apiClient.invokeAPI("/rest/api/2/webhook", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get failed webhooks
     * Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.  After 72 hours the failure may no longer be returned by this operation.  The oldest failure is returned first.  This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the &#x60;failedAfter&#x60; value or use the URL provided in &#x60;next&#x60;.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - 400 response
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * @param maxResults The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page.
     * @param after The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch.
     * @return FailedWebhooks
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<FailedWebhooks> getFailedWebhooks(Integer maxResults, Long after) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<FailedWebhooks> localVarReturnType = new ParameterizedTypeReference<FailedWebhooks>() {};
        return apiClient.invokeAPI("/rest/api/2/webhook/failed", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Extend webhook life
     * Webhooks registered through the REST API expire after 30 days. Call this resource periodically to keep them alive.  Unrecognized webhook IDs (nonexistent or belonging to other apps) are ignored.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * @param containerForWebhookIDs The containerForWebhookIDs parameter
     * @return WebhooksExpirationDate
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WebhooksExpirationDate> refreshWebhooks(ContainerForWebhookIDs containerForWebhookIDs) throws WebClientResponseException {
        Object postBody = containerForWebhookIDs;
        // verify the required parameter 'containerForWebhookIDs' is set
        if (containerForWebhookIDs == null) {
            throw new WebClientResponseException("Missing the required parameter 'containerForWebhookIDs' when calling refreshWebhooks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<WebhooksExpirationDate> localVarReturnType = new ParameterizedTypeReference<WebhooksExpirationDate>() {};
        return apiClient.invokeAPI("/rest/api/2/webhook/refresh", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Register dynamic webhooks
     * Registers webhooks.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/integrating-with-jira-cloud/#atlassian-connect) can use this operation.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * @param webhookRegistrationDetails The webhookRegistrationDetails parameter
     * @return ContainerForRegisteredWebhooks
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ContainerForRegisteredWebhooks> registerDynamicWebhooks(WebhookRegistrationDetails webhookRegistrationDetails) throws WebClientResponseException {
        Object postBody = webhookRegistrationDetails;
        // verify the required parameter 'webhookRegistrationDetails' is set
        if (webhookRegistrationDetails == null) {
            throw new WebClientResponseException("Missing the required parameter 'webhookRegistrationDetails' when calling registerDynamicWebhooks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

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

        ParameterizedTypeReference<ContainerForRegisteredWebhooks> localVarReturnType = new ParameterizedTypeReference<ContainerForRegisteredWebhooks>() {};
        return apiClient.invokeAPI("/rest/api/2/webhook", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

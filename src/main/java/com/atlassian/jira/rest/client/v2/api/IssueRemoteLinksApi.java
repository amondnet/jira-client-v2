package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.RemoteIssueLink;
import com.atlassian.jira.rest.client.v2.model.RemoteIssueLinkIdentifies;

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
public class IssueRemoteLinksApi {
    private ApiClient apiClient;

    public IssueRemoteLinksApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueRemoteLinksApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create or update remote issue link
     * Creates or updates a remote issue link for an issue.  If a &#x60;globalId&#x60; is provided and a remote issue link with that global ID is found it is updated. Any fields without values in the request are set to null. Otherwise, the remote issue link is created.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * <p><b>200</b> - Returned if the remote issue link is updated.
     * <p><b>201</b> - Returned if the remote issue link is created.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to link issues.
     * <p><b>404</b> - Returned if the issue is not found or the user does not have permission to view the issue.
     * @param issueIdOrKey The ID or key of the issue.
     * @param requestBody The requestBody parameter
     * @return RemoteIssueLinkIdentifies
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoteIssueLinkIdentifies> createOrUpdateRemoteIssueLink(String issueIdOrKey, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueIdOrKey' when calling createOrUpdateRemoteIssueLink", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling createOrUpdateRemoteIssueLink", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueIdOrKey", issueIdOrKey);

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

        ParameterizedTypeReference<RemoteIssueLinkIdentifies> localVarReturnType = new ParameterizedTypeReference<RemoteIssueLinkIdentifies>() {};
        return apiClient.invokeAPI("/rest/api/2/issue/{issueIdOrKey}/remotelink", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete remote issue link by global ID
     * Deletes the remote issue link from the issue using the link&#39;s global ID. Where the global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is implemented, issue-level security permission to view the issue.
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if a global ID isn&#39;t provided.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to link issues.
     * <p><b>404</b> - Returned if the issue or remote issue link is not found or the user does not have permission to view the issue.
     * @param issueIdOrKey The ID or key of the issue.
     * @param globalId The global ID of a remote issue link.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteRemoteIssueLinkByGlobalId(String issueIdOrKey, String globalId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueIdOrKey' when calling deleteRemoteIssueLinkByGlobalId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'globalId' is set
        if (globalId == null) {
            throw new WebClientResponseException("Missing the required parameter 'globalId' when calling deleteRemoteIssueLinkByGlobalId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueIdOrKey", issueIdOrKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "globalId", globalId));

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/rest/api/2/issue/{issueIdOrKey}/remotelink", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete remote issue link by ID
     * Deletes a remote issue link from an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects*, *Edit issues*, and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the link ID is invalid or the remote issue link does not belong to the issue.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to link issues.
     * <p><b>404</b> - Returned if the issue or remote issue link is not found or the user does not have permission to view the issue.
     * @param issueIdOrKey The ID or key of the issue.
     * @param linkId The ID of a remote issue link.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteRemoteIssueLinkById(String issueIdOrKey, String linkId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueIdOrKey' when calling deleteRemoteIssueLinkById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new WebClientResponseException("Missing the required parameter 'linkId' when calling deleteRemoteIssueLinkById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueIdOrKey", issueIdOrKey);
        pathParams.put("linkId", linkId);

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
        return apiClient.invokeAPI("/rest/api/2/issue/{issueIdOrKey}/remotelink/{linkId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get remote issue link by ID
     * Returns a remote issue link for an issue.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the link ID is invalid or the remote issue link does not belong to the issue.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if issue linking is disabled.
     * <p><b>404</b> - Returned if the issue or remote issue link is not found or the user does not have permission to view the issue.
     * @param issueIdOrKey The ID or key of the issue.
     * @param linkId The ID of the remote issue link.
     * @return RemoteIssueLink
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoteIssueLink> getRemoteIssueLinkById(String issueIdOrKey, String linkId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueIdOrKey' when calling getRemoteIssueLinkById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new WebClientResponseException("Missing the required parameter 'linkId' when calling getRemoteIssueLinkById", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueIdOrKey", issueIdOrKey);
        pathParams.put("linkId", linkId);

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

        ParameterizedTypeReference<RemoteIssueLink> localVarReturnType = new ParameterizedTypeReference<RemoteIssueLink>() {};
        return apiClient.invokeAPI("/rest/api/2/issue/{issueIdOrKey}/remotelink/{linkId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get remote issue links
     * Returns the remote issue links for an issue. When a remote issue link global ID is provided the record with that global ID is returned, otherwise all remote issue links are returned. Where a global ID includes reserved URL characters these must be escaped in the request. For example, pass &#x60;system&#x3D;http://www.mycompany.com/support&amp;id&#x3D;1&#x60; as &#x60;system%3Dhttp%3A%2F%2Fwww.mycompany.com%2Fsupport%26id%3D1&#x60;.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if issue linking is disabled.
     * <p><b>404</b> - Returned if the issue or remote issue link is not found or the user does not have permission to view the issue.
     * @param issueIdOrKey The ID or key of the issue.
     * @param globalId The global ID of the remote issue link.
     * @return RemoteIssueLink
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RemoteIssueLink> getRemoteIssueLinks(String issueIdOrKey, String globalId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueIdOrKey' when calling getRemoteIssueLinks", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueIdOrKey", issueIdOrKey);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "globalId", globalId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<RemoteIssueLink> localVarReturnType = new ParameterizedTypeReference<RemoteIssueLink>() {};
        return apiClient.invokeAPI("/rest/api/2/issue/{issueIdOrKey}/remotelink", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update remote issue link by ID
     * Updates a remote issue link for an issue.  Note: Fields without values in the request are set to null.  This operation requires [issue linking to be active](https://confluence.atlassian.com/x/yoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Link issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  the link ID is invalid.  *  the remote issue link does not belong to the issue.  *  the request body is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to link issues.
     * <p><b>404</b> - Returned if the issue or remote issue link is not found or the user does not have permission to view the issue.
     * @param issueIdOrKey The ID or key of the issue.
     * @param linkId The ID of the remote issue link.
     * @param requestBody The requestBody parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> updateRemoteIssueLink(String issueIdOrKey, String linkId, Map<String, Object> requestBody) throws WebClientResponseException {
        Object postBody = requestBody;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueIdOrKey' when calling updateRemoteIssueLink", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'linkId' is set
        if (linkId == null) {
            throw new WebClientResponseException("Missing the required parameter 'linkId' when calling updateRemoteIssueLink", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new WebClientResponseException("Missing the required parameter 'requestBody' when calling updateRemoteIssueLink", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueIdOrKey", issueIdOrKey);
        pathParams.put("linkId", linkId);

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
        return apiClient.invokeAPI("/rest/api/2/issue/{issueIdOrKey}/remotelink/{linkId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

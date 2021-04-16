package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.IssueTypeIds;
import com.atlassian.jira.rest.client.v2.model.IssueTypeScreenSchemeDetails;
import com.atlassian.jira.rest.client.v2.model.IssueTypeScreenSchemeId;
import com.atlassian.jira.rest.client.v2.model.IssueTypeScreenSchemeMappingDetails;
import com.atlassian.jira.rest.client.v2.model.IssueTypeScreenSchemeProjectAssociation;
import com.atlassian.jira.rest.client.v2.model.IssueTypeScreenSchemeUpdateDetails;
import com.atlassian.jira.rest.client.v2.model.PageBeanIssueTypeScreenScheme;
import com.atlassian.jira.rest.client.v2.model.PageBeanIssueTypeScreenSchemeItem;
import com.atlassian.jira.rest.client.v2.model.PageBeanIssueTypeScreenSchemesProjects;
import java.util.Set;
import com.atlassian.jira.rest.client.v2.model.UpdateDefaultScreenScheme;

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
public class IssueTypeScreenSchemesApi {
    private ApiClient apiClient;

    public IssueTypeScreenSchemesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueTypeScreenSchemesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Append mappings to issue type screen scheme
     * Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme, issue type, or screen scheme is not found.
     * <p><b>409</b> - Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param issueTypeScreenSchemeMappingDetails The issueTypeScreenSchemeMappingDetails parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> appendMappingsForIssueTypeScreenScheme(String issueTypeScreenSchemeId, IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails) throws WebClientResponseException {
        Object postBody = issueTypeScreenSchemeMappingDetails;
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeId' when calling appendMappingsForIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'issueTypeScreenSchemeMappingDetails' is set
        if (issueTypeScreenSchemeMappingDetails == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeMappingDetails' when calling appendMappingsForIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);

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
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Assign issue type screen scheme to project
     * Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  project is not found.  *  issue type screen scheme is not found.  *  the project is not a classic project.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme or the project are missing.
     * @param issueTypeScreenSchemeProjectAssociation The issueTypeScreenSchemeProjectAssociation parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> assignIssueTypeScreenSchemeToProject(IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation) throws WebClientResponseException {
        Object postBody = issueTypeScreenSchemeProjectAssociation;
        // verify the required parameter 'issueTypeScreenSchemeProjectAssociation' is set
        if (issueTypeScreenSchemeProjectAssociation == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeProjectAssociation' when calling assignIssueTypeScreenSchemeToProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/project", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Create issue type screen scheme
     * Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>201</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type or screen scheme is not found.
     * <p><b>409</b> - Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.
     * @param issueTypeScreenSchemeDetails An issue type screen scheme bean.
     * @return IssueTypeScreenSchemeId
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<IssueTypeScreenSchemeId> createIssueTypeScreenScheme(IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails) throws WebClientResponseException {
        Object postBody = issueTypeScreenSchemeDetails;
        // verify the required parameter 'issueTypeScreenSchemeDetails' is set
        if (issueTypeScreenSchemeDetails == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeDetails' when calling createIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<IssueTypeScreenSchemeId> localVarReturnType = new ParameterizedTypeReference<IssueTypeScreenSchemeId>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Delete issue type screen scheme
     * Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the issue type screen scheme is deleted.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme is not found.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> deleteIssueTypeScreenScheme(String issueTypeScreenSchemeId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeId' when calling deleteIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);

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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get issue type screen scheme items
     * Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param issueTypeScreenSchemeId The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;.
     * @return PageBeanIssueTypeScreenSchemeItem
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PageBeanIssueTypeScreenSchemeItem> getIssueTypeScreenSchemeMappings(Long startAt, Integer maxResults, Set<Long> issueTypeScreenSchemeId) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "issueTypeScreenSchemeId", issueTypeScreenSchemeId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeScreenSchemeItem> localVarReturnType = new ParameterizedTypeReference<PageBeanIssueTypeScreenSchemeItem>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/mapping", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get issue type screen schemes for projects
     * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param projectId The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanIssueTypeScreenSchemesProjects
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PageBeanIssueTypeScreenSchemesProjects> getIssueTypeScreenSchemeProjectAssociations(Set<Long> projectId, Long startAt, Integer maxResults) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new WebClientResponseException("Missing the required parameter 'projectId' when calling getIssueTypeScreenSchemeProjectAssociations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "projectId", projectId));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeScreenSchemesProjects> localVarReturnType = new ParameterizedTypeReference<PageBeanIssueTypeScreenSchemesProjects>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/project", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get issue type screen schemes
     * Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param id The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
     * @return PageBeanIssueTypeScreenScheme
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PageBeanIssueTypeScreenScheme> getIssueTypeScreenSchemes(Long startAt, Integer maxResults, Set<Long> id) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "id", id));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeScreenScheme> localVarReturnType = new ParameterizedTypeReference<PageBeanIssueTypeScreenScheme>() {};
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Remove mappings from issue type screen scheme
     * Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the screen scheme mappings are removed from the issue type screen scheme.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme or one or more issue type mappings are not found.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param issueTypeIds The issueTypeIds parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> removeMappingsFromIssueTypeScreenScheme(String issueTypeScreenSchemeId, IssueTypeIds issueTypeIds) throws WebClientResponseException {
        Object postBody = issueTypeIds;
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeId' when calling removeMappingsFromIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'issueTypeIds' is set
        if (issueTypeIds == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeIds' when calling removeMappingsFromIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);

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
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/remove", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update issue type screen scheme default screen scheme
     * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme or the screen screen is not found, or the screen scheme isn&#39;t used in classic projects.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param updateDefaultScreenScheme The updateDefaultScreenScheme parameter
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> updateDefaultScreenScheme(String issueTypeScreenSchemeId, UpdateDefaultScreenScheme updateDefaultScreenScheme) throws WebClientResponseException {
        Object postBody = updateDefaultScreenScheme;
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeId' when calling updateDefaultScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'updateDefaultScreenScheme' is set
        if (updateDefaultScreenScheme == null) {
            throw new WebClientResponseException("Missing the required parameter 'updateDefaultScreenScheme' when calling updateDefaultScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);

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
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/default", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Update issue type screen scheme
     * Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme is not found.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @param issueTypeScreenSchemeUpdateDetails The issue type screen scheme update details.
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> updateIssueTypeScreenScheme(String issueTypeScreenSchemeId, IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails) throws WebClientResponseException {
        Object postBody = issueTypeScreenSchemeUpdateDetails;
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeId' when calling updateIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'issueTypeScreenSchemeUpdateDetails' is set
        if (issueTypeScreenSchemeUpdateDetails == null) {
            throw new WebClientResponseException("Missing the required parameter 'issueTypeScreenSchemeUpdateDetails' when calling updateIssueTypeScreenScheme", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);

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
        return apiClient.invokeAPI("/rest/api/2/issuetypescreenscheme/{issueTypeScreenSchemeId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

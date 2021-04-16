package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.ProjectFeatureToggleRequest;
import com.atlassian.jira.rest.client.v2.model.ProjectFeaturesResponse;

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
public class ProjectFeaturesApi {
    private ApiClient apiClient;

    public ProjectFeaturesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectFeaturesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get features for project
     * Returns the list of features for a project. The project must be a [company-managed](https://support.atlassian.com/jira-service-management-cloud/docs/learn-the-differences-between-classic-and-next-gen-projects/) project.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the project is not found.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project.
     * @return ProjectFeaturesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProjectFeaturesResponse> getFeaturesForProject(String projectIdOrKey) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'projectIdOrKey' when calling getFeaturesForProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectIdOrKey", projectIdOrKey);

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

        ParameterizedTypeReference<ProjectFeaturesResponse> localVarReturnType = new ParameterizedTypeReference<ProjectFeaturesResponse>() {};
        return apiClient.invokeAPI("/rest/api/2/project/{projectIdOrKey}/features", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Toggle feature for project
     * Changes the state of a feature to ENABLED or DISABLED for the project. The project must be a [company-managed](https://support.atlassian.com/jira-service-management-cloud/docs/learn-the-differences-between-classic-and-next-gen-projects/) project.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the project is not found or if the feature within that project is not found.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project.
     * @param featureKey The key of the feature to change the state.
     * @param projectFeatureToggleRequest The request object describing whether we should enable or disable the feature.
     * @return ProjectFeaturesResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ProjectFeaturesResponse> toggleFeatureForProject(String projectIdOrKey, String featureKey, ProjectFeatureToggleRequest projectFeatureToggleRequest) throws WebClientResponseException {
        Object postBody = projectFeatureToggleRequest;
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'projectIdOrKey' when calling toggleFeatureForProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'featureKey' is set
        if (featureKey == null) {
            throw new WebClientResponseException("Missing the required parameter 'featureKey' when calling toggleFeatureForProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'projectFeatureToggleRequest' is set
        if (projectFeatureToggleRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'projectFeatureToggleRequest' when calling toggleFeatureForProject", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("projectIdOrKey", projectIdOrKey);
        pathParams.put("featureKey", featureKey);

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

        ParameterizedTypeReference<ProjectFeaturesResponse> localVarReturnType = new ParameterizedTypeReference<ProjectFeaturesResponse>() {};
        return apiClient.invokeAPI("/rest/api/2/project/{projectIdOrKey}/features/{featureKey}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

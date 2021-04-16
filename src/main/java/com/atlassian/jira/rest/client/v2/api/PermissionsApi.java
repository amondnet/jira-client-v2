package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.v2.client.ApiClient;

import com.atlassian.jira.rest.client.v2.model.BulkPermissionGrants;
import com.atlassian.jira.rest.client.v2.model.BulkPermissionsRequestBean;
import com.atlassian.jira.rest.client.v2.model.ErrorCollection;
import com.atlassian.jira.rest.client.v2.model.Permissions;
import com.atlassian.jira.rest.client.v2.model.PermissionsKeysBean;
import com.atlassian.jira.rest.client.v2.model.PermittedProjects;

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
public class PermissionsApi {
    private ApiClient apiClient;

    public PermissionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public PermissionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all permissions
     * Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * @return Permissions
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Permissions> getAllPermissions() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Permissions> localVarReturnType = new ParameterizedTypeReference<Permissions>() {};
        return apiClient.invokeAPI("/rest/api/2/permissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get bulk permissions
     * Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  Null values in &#x60;globalPermissions&#x60;, &#x60;projectPermissions&#x60;, &#x60;projectPermissions.projects&#x60;, and &#x60;projectPermissions.issues&#x60; are ignored.  *  Empty strings in &#x60;projectPermissions.permissions&#x60; are ignored.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn&#39;t apply to calls made using AP.request() in a browser.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  &#x60;projectPermissions&#x60; is provided without at least one project permission being provided.  *  an invalid global permission is provided in the global permissions list.  *  an invalid project permission is provided in the project permissions list.  *  more than 1000 valid project IDs or more than 1000 valid issue IDs are provided.  *  an invalid account ID is provided.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * @param bulkPermissionsRequestBean Details of the permissions to check.
     * @return BulkPermissionGrants
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BulkPermissionGrants> getBulkPermissions(BulkPermissionsRequestBean bulkPermissionsRequestBean) throws WebClientResponseException {
        Object postBody = bulkPermissionsRequestBean;
        // verify the required parameter 'bulkPermissionsRequestBean' is set
        if (bulkPermissionsRequestBean == null) {
            throw new WebClientResponseException("Missing the required parameter 'bulkPermissionsRequestBean' when calling getBulkPermissions", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<BulkPermissionGrants> localVarReturnType = new ParameterizedTypeReference<BulkPermissionGrants>() {};
        return apiClient.invokeAPI("/rest/api/2/permissions/check", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get my permissions
     * Returns a list of permissions indicating which permissions the user has. Details of the user&#39;s permissions can be obtained in a global, project, or issue context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#39;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if &#x60;permissions&#x60; is empty or the permission key it contains is not found or deprecated.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the project or issue is not found or the user does not have permission to view the project or issue.
     * @param projectKey The key of project. Ignored if &#x60;projectId&#x60; is provided.
     * @param projectId The ID of project.
     * @param issueKey The key of the issue. Ignored if &#x60;issueId&#x60; is provided.
     * @param issueId The ID of the issue.
     * @param permissions A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-2-permissions-get).
     * @param projectUuid The projectUuid parameter
     * @param projectConfigurationUuid The projectConfigurationUuid parameter
     * @return Permissions
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Permissions> getMyPermissions(String projectKey, String projectId, String issueKey, String issueId, String permissions, String projectUuid, String projectConfigurationUuid) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectKey", projectKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectId", projectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueKey", issueKey));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "issueId", issueId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "permissions", permissions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectUuid", projectUuid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectConfigurationUuid", projectConfigurationUuid));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Permissions> localVarReturnType = new ParameterizedTypeReference<Permissions>() {};
        return apiClient.invokeAPI("/rest/api/2/mypermissions", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
    /**
     * Get permitted projects
     * Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if a project permission is not found.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param permissionsKeysBean The permissionsKeysBean parameter
     * @return PermittedProjects
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PermittedProjects> getPermittedProjects(PermissionsKeysBean permissionsKeysBean) throws WebClientResponseException {
        Object postBody = permissionsKeysBean;
        // verify the required parameter 'permissionsKeysBean' is set
        if (permissionsKeysBean == null) {
            throw new WebClientResponseException("Missing the required parameter 'permissionsKeysBean' when calling getPermittedProjects", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PermittedProjects> localVarReturnType = new ParameterizedTypeReference<PermittedProjects>() {};
        return apiClient.invokeAPI("/rest/api/2/permissions/project", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}

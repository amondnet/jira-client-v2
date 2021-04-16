# WorkflowsApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkflowsApi.md#createWorkflow) | **POST** /rest/api/2/workflow | Create workflow
[**deleteInactiveWorkflow**](WorkflowsApi.md#deleteInactiveWorkflow) | **DELETE** /rest/api/2/workflow/{entityId} | Delete inactive workflow
[**getAllWorkflows**](WorkflowsApi.md#getAllWorkflows) | **GET** /rest/api/2/workflow | Get all workflows
[**getWorkflowsPaginated**](WorkflowsApi.md#getWorkflowsPaginated) | **GET** /rest/api/2/workflow/search | Get workflows paginated



## createWorkflow

> WorkflowID createWorkflow(createWorkflowDetails)

Create workflow

Creates a workflow. Workflow transitions are created with the default system transition rules.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.WorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://your-domain.atlassian.com");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
        CreateWorkflowDetails createWorkflowDetails = new CreateWorkflowDetails(); // CreateWorkflowDetails | The workflow details.
        try {
            WorkflowID result = apiInstance.createWorkflow(createWorkflowDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#createWorkflow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **createWorkflowDetails** | [**CreateWorkflowDetails**](CreateWorkflowDetails.md)| The workflow details. |

### Return type

[**WorkflowID**](WorkflowID.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Returned if the workflow is created. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if one or more statuses is not found. |  -  |


## deleteInactiveWorkflow

> deleteInactiveWorkflow(entityId)

Delete inactive workflow

Deletes a workflow.  The workflow cannot be deleted if it is:   *  an active workflow.  *  a system workflow.  *  associated with any workflow scheme.  *  associated with any draft workflow scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.WorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://your-domain.atlassian.com");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
        String entityId = "entityId_example"; // String | The entity ID of the workflow.
        try {
            apiInstance.deleteInactiveWorkflow(entityId);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#deleteInactiveWorkflow");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **String**| The entity ID of the workflow. |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Returned if the workflow is deleted. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the workflow is not found. |  -  |


## getAllWorkflows

> List&lt;DeprecatedWorkflow&gt; getAllWorkflows(workflowName)

Get all workflows

Returns all workflows in Jira or a workflow. Deprecated, use [Get workflows paginated](#api-rest-api-2-workflow-search-get).  If the &#x60;workflowName&#x60; parameter is specified, the workflow is returned as an object (not in an array). Otherwise, an array of workflow objects is returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.WorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://your-domain.atlassian.com");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
        String workflowName = "workflowName_example"; // String | The name of the workflow to be returned. Only one workflow can be specified.
        try {
            List<DeprecatedWorkflow> result = apiInstance.getAllWorkflows(workflowName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#getAllWorkflows");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **workflowName** | **String**| The name of the workflow to be returned. Only one workflow can be specified. | [optional]

### Return type

[**List&lt;DeprecatedWorkflow&gt;**](DeprecatedWorkflow.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the user does not have the necessary permission. |  -  |


## getWorkflowsPaginated

> PageBeanWorkflow getWorkflowsPaginated(startAt, maxResults, workflowName, expand)

Get workflows paginated

Returns a [paginated](#pagination) list of published classic workflows. When workflow names are specified, details of those workflows are returned. Otherwise, all published classic workflows are returned.  This operation does not return next-gen workflows.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.WorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://your-domain.atlassian.com");
        
        // Configure OAuth2 access token for authorization: OAuth2
        OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
        OAuth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
        Long startAt = 0L; // Long | The index of the first item to return in a page of results (page offset).
        Integer maxResults = 50; // Integer | The maximum number of items to return per page.
        Set<String> workflowName = Arrays.asList(); // Set<String> | The name of a workflow to return.
        String expand = "expand_example"; // String | Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  `transitions` For each workflow, returns information about the transitions inside the workflow.  *  `transitions.rules` For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  `statuses` For each workflow, returns information about the statuses inside the workflow.  *  `statuses.properties` For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested.  *  `default` For each workflow, returns information about whether this is the default workflow.
        try {
            PageBeanWorkflow result = apiInstance.getWorkflowsPaginated(startAt, maxResults, workflowName, expand);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WorkflowsApi#getWorkflowsPaginated");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startAt** | **Long**| The index of the first item to return in a page of results (page offset). | [optional] [default to 0]
 **maxResults** | **Integer**| The maximum number of items to return per page. | [optional] [default to 50]
 **workflowName** | [**Set&lt;String&gt;**](String.md)| The name of a workflow to return. | [optional]
 **expand** | **String**| Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;transitions&#x60; For each workflow, returns information about the transitions inside the workflow.  *  &#x60;transitions.rules&#x60; For each workflow transition, returns information about its rules. Transitions are included automatically if this expand is requested.  *  &#x60;statuses&#x60; For each workflow, returns information about the statuses inside the workflow.  *  &#x60;statuses.properties&#x60; For each workflow status, returns information about its properties. Statuses are included automatically if this expand is requested.  *  &#x60;default&#x60; For each workflow, returns information about whether this is the default workflow. | [optional]

### Return type

[**PageBeanWorkflow**](PageBeanWorkflow.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |


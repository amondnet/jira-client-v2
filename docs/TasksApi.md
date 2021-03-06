# TasksApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelTask**](TasksApi.md#cancelTask) | **POST** /rest/api/2/task/{taskId}/cancel | Cancel task
[**getTask**](TasksApi.md#getTask) | **GET** /rest/api/2/task/{taskId} | Get task



## cancelTask

> Object cancelTask(taskId)

Cancel task

Cancels a task.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | The ID of the task.
        try {
            Object result = apiInstance.cancelTask(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#cancelTask");
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
 **taskId** | **String**| The ID of the task. |

### Return type

**Object**

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Returned if the request is successful. |  -  |
| **400** | Returned if cancellation of the task is not possible. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the necessary permission. |  -  |
| **404** | Returned if the task is not found. |  -  |


## getTask

> TaskProgressBeanObject getTask(taskId)

Get task

Returns the status of a [long-running asynchronous task](#async).  When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.TasksApi;

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

        TasksApi apiInstance = new TasksApi(defaultClient);
        String taskId = "taskId_example"; // String | The ID of the task.
        try {
            TaskProgressBeanObject result = apiInstance.getTask(taskId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TasksApi#getTask");
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
 **taskId** | **String**| The ID of the task. |

### Return type

[**TaskProgressBeanObject**](TaskProgressBeanObject.md)

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
| **404** | Returned if the task is not found. |  -  |


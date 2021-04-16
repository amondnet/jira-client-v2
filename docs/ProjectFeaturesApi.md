# ProjectFeaturesApi

All URIs are relative to *https://your-domain.atlassian.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFeaturesForProject**](ProjectFeaturesApi.md#getFeaturesForProject) | **GET** /rest/api/2/project/{projectIdOrKey}/features | Get features for project
[**toggleFeatureForProject**](ProjectFeaturesApi.md#toggleFeatureForProject) | **PUT** /rest/api/2/project/{projectIdOrKey}/features/{featureKey} | Toggle feature for project



## getFeaturesForProject

> ProjectFeaturesResponse getFeaturesForProject(projectIdOrKey)

Get features for project

Returns the list of features for a project. The project must be a [company-managed](https://support.atlassian.com/jira-service-management-cloud/docs/learn-the-differences-between-classic-and-next-gen-projects/) project.

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.ProjectFeaturesApi;

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

        ProjectFeaturesApi apiInstance = new ProjectFeaturesApi(defaultClient);
        String projectIdOrKey = "projectIdOrKey_example"; // String | The ID or (case-sensitive) key of the project.
        try {
            ProjectFeaturesResponse result = apiInstance.getFeaturesForProject(projectIdOrKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFeaturesApi#getFeaturesForProject");
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
 **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. |

### Return type

[**ProjectFeaturesResponse**](ProjectFeaturesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the project is not found. |  -  |


## toggleFeatureForProject

> ProjectFeaturesResponse toggleFeatureForProject(projectIdOrKey, featureKey, projectFeatureToggleRequest)

Toggle feature for project

Changes the state of a feature to ENABLED or DISABLED for the project. The project must be a [company-managed](https://support.atlassian.com/jira-service-management-cloud/docs/learn-the-differences-between-classic-and-next-gen-projects/) project.

### Example

```java
// Import classes:
import com.atlassian.jira.rest.v2.client.ApiClient;
import com.atlassian.jira.rest.v2.client.ApiException;
import com.atlassian.jira.rest.v2.client.Configuration;
import com.atlassian.jira.rest.v2.client.auth.*;
import com.atlassian.jira.rest.v2.client.models.*;
import com.atlassian.jira.rest.client.v2.api.ProjectFeaturesApi;

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

        ProjectFeaturesApi apiInstance = new ProjectFeaturesApi(defaultClient);
        String projectIdOrKey = "projectIdOrKey_example"; // String | The ID or (case-sensitive) key of the project.
        String featureKey = "featureKey_example"; // String | The key of the feature to change the state.
        ProjectFeatureToggleRequest projectFeatureToggleRequest = new ProjectFeatureToggleRequest(); // ProjectFeatureToggleRequest | The request object describing whether we should enable or disable the feature.
        try {
            ProjectFeaturesResponse result = apiInstance.toggleFeatureForProject(projectIdOrKey, featureKey, projectFeatureToggleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProjectFeaturesApi#toggleFeatureForProject");
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
 **projectIdOrKey** | **String**| The ID or (case-sensitive) key of the project. |
 **featureKey** | **String**| The key of the feature to change the state. |
 **projectFeatureToggleRequest** | [**ProjectFeatureToggleRequest**](ProjectFeatureToggleRequest.md)| The request object describing whether we should enable or disable the feature. |

### Return type

[**ProjectFeaturesResponse**](ProjectFeaturesResponse.md)

### Authorization

[OAuth2](../README.md#OAuth2), [basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returned if the request is successful. |  -  |
| **400** | Returned if the request is not valid. |  -  |
| **401** | Returned if the authentication credentials are incorrect or missing. |  -  |
| **403** | Returned if the user does not have the required permissions. |  -  |
| **404** | Returned if the project is not found or if the feature within that project is not found. |  -  |


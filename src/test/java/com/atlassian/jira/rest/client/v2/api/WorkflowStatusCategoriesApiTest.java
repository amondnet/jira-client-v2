/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.atlassian.jira.rest.client.v2.api;

import com.atlassian.jira.rest.client.v2.model.StatusCategory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowStatusCategoriesApi
 */
@Ignore
public class WorkflowStatusCategoriesApiTest {

    private final WorkflowStatusCategoriesApi api = new WorkflowStatusCategoriesApi();

    
    /**
     * Get all status categories
     *
     * Returns a list of all status categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     */
    @Test
    public void getStatusCategoriesTest()  {
        List<StatusCategory> response = api.getStatusCategories().collectList().block();

        // TODO: test validations
    }
    
    /**
     * Get status category
     *
     * Returns a status category. Status categories provided a mechanism for categorizing [statuses](#api-rest-api-2-status-idOrName-get).  **[Permissions](#permissions) required:** Permission to access Jira.
     */
    @Test
    public void getStatusCategoryTest()  {
        String idOrKey = null;
        StatusCategory response = api.getStatusCategory(idOrKey).block();

        // TODO: test validations
    }
    
}

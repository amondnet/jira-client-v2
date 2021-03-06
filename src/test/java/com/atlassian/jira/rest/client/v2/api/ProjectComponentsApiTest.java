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

import com.atlassian.jira.rest.client.v2.model.Component;
import com.atlassian.jira.rest.client.v2.model.ComponentIssuesCount;
import com.atlassian.jira.rest.client.v2.model.PageBeanComponentWithIssueCount;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectComponentsApi
 */
@Ignore
public class ProjectComponentsApiTest {

    private final ProjectComponentsApi api = new ProjectComponentsApi();

    
    /**
     * Create component
     *
     * Creates a component. Use components to provide containers for issues within a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the component is created or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void createComponentTest()  {
        Component component = null;
        Component response = api.createComponent(component).block();

        // TODO: test validations
    }
    
    /**
     * Delete component
     *
     * Deletes a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void deleteComponentTest()  {
        String id = null;
        String moveIssuesTo = null;
        api.deleteComponent(id, moveIssuesTo).block();

        // TODO: test validations
    }
    
    /**
     * Get component
     *
     * Returns a component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for project containing the component.
     */
    @Test
    public void getComponentTest()  {
        String id = null;
        Component response = api.getComponent(id).block();

        // TODO: test validations
    }
    
    /**
     * Get component issues count
     *
     * Returns the counts of issues assigned to the component.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     */
    @Test
    public void getComponentRelatedIssuesTest()  {
        String id = null;
        ComponentIssuesCount response = api.getComponentRelatedIssues(id).block();

        // TODO: test validations
    }
    
    /**
     * Get project components
     *
     * Returns all components in a project. See the [Get project components paginated](#api-rest-api-2-project-projectIdOrKey-component-get) resource if you want to get a full list of components with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     */
    @Test
    public void getProjectComponentsTest()  {
        String projectIdOrKey = null;
        List<Component> response = api.getProjectComponents(projectIdOrKey).collectList().block();

        // TODO: test validations
    }
    
    /**
     * Get project components paginated
     *
     * Returns a [paginated](#pagination) list of all components in a project. See the [Get project components](#api-rest-api-2-project-projectIdOrKey-components-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     */
    @Test
    public void getProjectComponentsPaginatedTest()  {
        String projectIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String query = null;
        PageBeanComponentWithIssueCount response = api.getProjectComponentsPaginated(projectIdOrKey, startAt, maxResults, orderBy, query).block();

        // TODO: test validations
    }
    
    /**
     * Update component
     *
     * Updates a component. Any fields included in the request are overwritten. If &#x60;leadAccountId&#x60; is an empty string (\&quot;\&quot;) the component lead is removed.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the component or *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void updateComponentTest()  {
        String id = null;
        Component component = null;
        Component response = api.updateComponent(id, component).block();

        // TODO: test validations
    }
    
}

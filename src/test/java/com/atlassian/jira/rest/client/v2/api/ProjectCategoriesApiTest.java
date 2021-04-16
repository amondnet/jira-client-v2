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

import com.atlassian.jira.rest.client.v2.model.ProjectCategory;
import com.atlassian.jira.rest.client.v2.model.UpdatedProjectCategory;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectCategoriesApi
 */
@Ignore
public class ProjectCategoriesApiTest {

    private final ProjectCategoriesApi api = new ProjectCategoriesApi();

    
    /**
     * Create project category
     *
     * Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void createProjectCategoryTest()  {
        ProjectCategory projectCategory = null;
        ProjectCategory response = api.createProjectCategory(projectCategory).block();

        // TODO: test validations
    }
    
    /**
     * Get all project categories
     *
     * Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     */
    @Test
    public void getAllProjectCategoriesTest()  {
        List<ProjectCategory> response = api.getAllProjectCategories().collectList().block();

        // TODO: test validations
    }
    
    /**
     * Get project category by ID
     *
     * Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
     */
    @Test
    public void getProjectCategoryByIdTest()  {
        Long id = null;
        ProjectCategory response = api.getProjectCategoryById(id).block();

        // TODO: test validations
    }
    
    /**
     * Delete project category
     *
     * Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void removeProjectCategoryTest()  {
        Long id = null;
        api.removeProjectCategory(id).block();

        // TODO: test validations
    }
    
    /**
     * Update project category
     *
     * Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void updateProjectCategoryTest()  {
        Long id = null;
        ProjectCategory projectCategory = null;
        UpdatedProjectCategory response = api.updateProjectCategory(id, projectCategory).block();

        // TODO: test validations
    }
    
}

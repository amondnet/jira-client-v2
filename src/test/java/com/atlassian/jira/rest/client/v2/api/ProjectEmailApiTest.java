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

import com.atlassian.jira.rest.client.v2.model.ProjectEmailAddress;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectEmailApi
 */
@Ignore
public class ProjectEmailApiTest {

    private final ProjectEmailApi api = new ProjectEmailApi();

    
    /**
     * Get project&#39;s sender email
     *
     * Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     */
    @Test
    public void getProjectEmailTest()  {
        Long projectId = null;
        ProjectEmailAddress response = api.getProjectEmail(projectId).block();

        // TODO: test validations
    }
    
    /**
     * Set project&#39;s sender email
     *
     * Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     */
    @Test
    public void updateProjectEmailTest()  {
        Long projectId = null;
        ProjectEmailAddress projectEmailAddress = null;
        Object response = api.updateProjectEmail(projectId, projectEmailAddress).block();

        // TODO: test validations
    }
    
}
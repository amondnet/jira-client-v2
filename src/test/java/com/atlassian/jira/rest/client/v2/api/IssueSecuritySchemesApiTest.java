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

import com.atlassian.jira.rest.client.v2.model.SecurityScheme;
import com.atlassian.jira.rest.client.v2.model.SecuritySchemes;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueSecuritySchemesApi
 */
@Ignore
public class IssueSecuritySchemesApiTest {

    private final IssueSecuritySchemesApi api = new IssueSecuritySchemesApi();

    
    /**
     * Get issue security scheme
     *
     * Returns an issue security scheme along with its security levels.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for a project that uses the requested issue security scheme.
     */
    @Test
    public void getIssueSecuritySchemeTest()  {
        Long id = null;
        SecurityScheme response = api.getIssueSecurityScheme(id).block();

        // TODO: test validations
    }
    
    /**
     * Get issue security schemes
     *
     * Returns all [issue security schemes](https://confluence.atlassian.com/x/J4lKLg).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void getIssueSecuritySchemesTest()  {
        SecuritySchemes response = api.getIssueSecuritySchemes().block();

        // TODO: test validations
    }
    
}
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

import com.atlassian.jira.rest.client.v2.model.ScreenableTab;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScreenTabsApi
 */
@Ignore
public class ScreenTabsApiTest {

    private final ScreenTabsApi api = new ScreenTabsApi();

    
    /**
     * Create screen tab
     *
     * Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void addScreenTabTest()  {
        Long screenId = null;
        ScreenableTab screenableTab = null;
        ScreenableTab response = api.addScreenTab(screenId, screenableTab).block();

        // TODO: test validations
    }
    
    /**
     * Delete screen tab
     *
     * Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void deleteScreenTabTest()  {
        Long screenId = null;
        Long tabId = null;
        api.deleteScreenTab(screenId, tabId).block();

        // TODO: test validations
    }
    
    /**
     * Get all screen tabs
     *
     * Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     */
    @Test
    public void getAllScreenTabsTest()  {
        Long screenId = null;
        String projectKey = null;
        List<ScreenableTab> response = api.getAllScreenTabs(screenId, projectKey).collectList().block();

        // TODO: test validations
    }
    
    /**
     * Move screen tab
     *
     * Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void moveScreenTabTest()  {
        Long screenId = null;
        Long tabId = null;
        Integer pos = null;
        Object response = api.moveScreenTab(screenId, tabId, pos).block();

        // TODO: test validations
    }
    
    /**
     * Update screen tab
     *
     * Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     */
    @Test
    public void renameScreenTabTest()  {
        Long screenId = null;
        Long tabId = null;
        ScreenableTab screenableTab = null;
        ScreenableTab response = api.renameScreenTab(screenId, tabId, screenableTab).block();

        // TODO: test validations
    }
    
}



# HierarchyLevel


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | The ID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/). |  [optional]
**name** | **String** | The name of this hierarchy level. |  [optional]
**aboveLevelId** | **Long** | The ID of the level above this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/). |  [optional]
**belowLevelId** | **Long** | The ID of the level below this one in the hierarchy. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/). |  [optional]
**projectConfigurationId** | **Long** | The ID of the project configuration. This property is deprecated, see [Change oticen: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/). |  [optional]
**level** | **Integer** | The level of this item in the hierarchy. |  [optional]
**issueTypeIds** | **List&lt;Long&gt;** | The issue types available in this hierarchy level. |  [optional]
**externalUuid** | **UUID** | The external UUID of the hierarchy level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/). |  [optional]
**globalHierarchyLevel** | [**GlobalHierarchyLevelEnum**](#GlobalHierarchyLevelEnum) |  |  [optional]



## Enum: GlobalHierarchyLevelEnum

Name | Value
---- | -----
SUBTASK | &quot;SUBTASK&quot;
BASE | &quot;BASE&quot;
EPIC | &quot;EPIC&quot;




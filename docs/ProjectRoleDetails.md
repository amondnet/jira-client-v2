

# ProjectRoleDetails

Details about a project role.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**self** | **URI** | The URL the project role details. |  [optional] [readonly]
**name** | **String** | The name of the project role. |  [optional]
**id** | **Long** | The ID of the project role. |  [optional] [readonly]
**description** | **String** | The description of the project role. |  [optional] [readonly]
**admin** | **Boolean** | Whether this role is the admin role for the project. |  [optional] [readonly]
**scope** | [**Scope**](Scope.md) | The scope of the role. Indicated for roles associated with [next-gen projects](https://confluence.atlassian.com/x/loMyO). |  [optional] [readonly]
**roleConfigurable** | **Boolean** | Whether the roles are configurable for this project. |  [optional] [readonly]
**translatedName** | **String** | The translated name of the project role. |  [optional]
**_default** | **Boolean** | Whether this role is the default role for the project. |  [optional] [readonly]




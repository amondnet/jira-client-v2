

# ProjectFeature

Project feature.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**projectId** | **Long** | Project ID. |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the feature. |  [optional]
**toggleLocked** | **Boolean** | Determines whether a feature can be toggled or not. |  [optional]
**feature** | **String** | Feature&#39;s key. |  [optional]
**featureCategory** | **String** | Feature&#39;s category. |  [optional]
**prerequisites** | **List&lt;String&gt;** | List of the keys of features required as prerequisites to enable this feature. |  [optional]
**localisedName** | **String** | Name to display for this feature, localised. |  [optional]
**localisedDescription** | **String** | Description to display for this feature, localised. |  [optional]
**imageUri** | **String** | Uri to the image that should be used to display this feature. |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
COMING_SOON | &quot;COMING_SOON&quot;




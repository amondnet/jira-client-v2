

# WorkflowConditionBean

The workflow conditions tree.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | The type of the transition rule. | 
**_configuration** | **Object** | The configuration of the transition rule. This is currently returned only for some of the rule types. Availability of this property is subject to change. |  [optional]
**nodeType** | **String** |  | 
**operator** | [**OperatorEnum**](#OperatorEnum) | The conditions operator. | 
**conditions** | [**List&lt;WorkflowConditionBean&gt;**](WorkflowConditionBean.md) | The list of workflow conditions. | 



## Enum: OperatorEnum

Name | Value
---- | -----
AND | &quot;AND&quot;
OR | &quot;OR&quot;





# PaymentTokenizationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestStatus** | [**RequestStatusEnum**](#RequestStatusEnum) | The status of the request. |  [optional]
**requestTime** | **Long** | Time of the request. |  [optional]
**brand** | **String** | Card brand. |  [optional]
**country** | **String** | Country of the card issued. |  [optional]
**paymentToken** | [**PaymentTokenDetails**](PaymentTokenDetails.md) |  |  [optional]
**paymentCard** | [**PaymentCard**](PaymentCard.md) |  |  [optional]
**processor** | [**ProcessorData**](ProcessorData.md) |  |  [optional]
**orderId** | **String** | Client order ID if supplied by client, otherwise the order ID. |  [optional]


<a name="RequestStatusEnum"></a>
## Enum: RequestStatusEnum
Name | Value
---- | -----
DELETED | &quot;DELETED&quot;
FAILED | &quot;FAILED&quot;
SUCCESS | &quot;SUCCESS&quot;
APPROVED | &quot;APPROVED&quot;
WAITING | &quot;WAITING&quot;
VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot;
DECLINED | &quot;DECLINED&quot;




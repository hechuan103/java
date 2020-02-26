/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.9.1.20191223.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiCallback;
import com.github.GBSEcom.client.ApiClient;
import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.client.ApiResponse;
import com.github.GBSEcom.client.Configuration;
import com.github.GBSEcom.client.Pair;
import com.github.GBSEcom.client.ProgressRequestBody;
import com.github.GBSEcom.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.github.GBSEcom.model.ErrorResponse;
import com.github.GBSEcom.model.ExchangeRateRequest;
import com.github.GBSEcom.model.ExchangeRateResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConversionApi {
    private ApiClient apiClient;

    public CurrencyConversionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CurrencyConversionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getExchangeRate
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getExchangeRateCall(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = exchangeRateRequest;

        // create path and map variables
        String localVarPath = "/exchange-rates";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null) {
            localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
        }

        if (clientRequestId != null) {
            localVarHeaderParams.put("Client-Request-Id", apiClient.parameterToString(clientRequestId));
        }

        if (apiKey != null) {
            localVarHeaderParams.put("Api-Key", apiClient.parameterToString(apiKey));
        }

        if (timestamp != null) {
            localVarHeaderParams.put("Timestamp", apiClient.parameterToString(timestamp));
        }

        if (messageSignature != null) {
            localVarHeaderParams.put("Message-Signature", apiClient.parameterToString(messageSignature));
        }

        if (region != null) {
            localVarHeaderParams.put("Region", apiClient.parameterToString(region));
        }

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getExchangeRateValidateBeforeCall(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'clientRequestId' is set
        if (clientRequestId == null) {
            throw new ApiException("Missing the required parameter 'clientRequestId' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'apiKey' is set
        if (apiKey == null) {
            throw new ApiException("Missing the required parameter 'apiKey' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getExchangeRate(Async)");
        }
        
        // verify the required parameter 'exchangeRateRequest' is set
        if (exchangeRateRequest == null) {
            throw new ApiException("Missing the required parameter 'exchangeRateRequest' when calling getExchangeRate(Async)");
        }
        

        com.squareup.okhttp.Call call = getExchangeRateCall(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Generate dynamic currency conversion transactions.
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @return ExchangeRateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExchangeRateResponse getExchangeRate(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region) throws ApiException {
        ApiResponse<ExchangeRateResponse> resp = getExchangeRateWithHttpInfo(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region);
        return resp.getData();
    }

    /**
     * Generate dynamic currency conversion transactions.
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @return ApiResponse&lt;ExchangeRateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExchangeRateResponse> getExchangeRateWithHttpInfo(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region) throws ApiException {
        com.squareup.okhttp.Call call = getExchangeRateValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region, null, null);
        Type localVarReturnType = new TypeToken<ExchangeRateResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Generate dynamic currency conversion transactions. (asynchronously)
     * Sale, return and lookup exchange rate with dynamic currency conversion option.
     * @param contentType Content type. (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request.  This is also used for idempotency control. We recommend 128-bit UUID format. (required)
     * @param apiKey Key given to merchant after boarding associating their requests with the appropriate app in Apigee. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for Message Signature generation and time limit (5 mins). (required)
     * @param exchangeRateRequest Accepted request types: DCCExchangeRateRequest and DynamicPricingExchangeRateRequest. (required)
     * @param messageSignature Used to ensure the request has not been tampered with during transmission. The Message-Signature is the Base64 encoded HMAC hash (SHA256 algorithm with the API Secret as the key.) For more information, refer to the supporting documentation on the Developer Portal. (optional)
     * @param region Indicates the region where the client wants the transaction to be processed. This will override the default processing region identified for the client. Available options are argentina, brazil, germany, india and northamerica. Region specific store setup and APIGEE boarding is required in order to use an alternate region for processing. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getExchangeRateAsync(String contentType, String clientRequestId, String apiKey, Long timestamp, ExchangeRateRequest exchangeRateRequest, String messageSignature, String region, final ApiCallback<ExchangeRateResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getExchangeRateValidateBeforeCall(contentType, clientRequestId, apiKey, timestamp, exchangeRateRequest, messageSignature, region, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExchangeRateResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

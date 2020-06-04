/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.11.0.20200423.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.api;

import com.github.GBSEcom.client.ApiException;
import com.github.GBSEcom.model.AccountInfoLookupRequest;
import com.github.GBSEcom.model.CardInfoLookupRequest;
import com.github.GBSEcom.model.CardInfoLookupResponse;
import com.github.GBSEcom.model.ErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InformationLookupApi
 */
@Ignore
public class InformationLookupApiTest {

    private final InformationLookupApi api = new InformationLookupApi();

    
    /**
     * Card information lookup.
     *
     * Use this to look up card related information such as issuer country, card function and card brand.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cardInfoLookupTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        CardInfoLookupRequest cardInfoLookupRequest = null;
        String messageSignature = null;
        String region = null;
        CardInfoLookupResponse response = api.cardInfoLookup(contentType, clientRequestId, apiKey, timestamp, cardInfoLookupRequest, messageSignature, region);

        // TODO: test validations
    }
    
    /**
     * Account information lookup.
     *
     * Use this to look up card related information associated with a payment card or payment token.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lookupAccountTest() throws ApiException {
        String contentType = null;
        String clientRequestId = null;
        String apiKey = null;
        Long timestamp = null;
        AccountInfoLookupRequest accountInfoLookupRequest = null;
        String messageSignature = null;
        String region = null;
        CardInfoLookupResponse response = api.lookupAccount(contentType, clientRequestId, apiKey, timestamp, accountInfoLookupRequest, messageSignature, region);

        // TODO: test validations
    }
    
}
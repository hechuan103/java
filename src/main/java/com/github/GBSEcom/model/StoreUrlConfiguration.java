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


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StoreUrlConfiguration
 */

public class StoreUrlConfiguration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRANSACTION_NOTIFICATION_URL = "transactionNotificationUrl";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_NOTIFICATION_URL)
  private String transactionNotificationUrl;

  public static final String SERIALIZED_NAME_RECURRING_TRANSACTION_NOTIFICATION_URL = "recurringTransactionNotificationUrl";
  @SerializedName(SERIALIZED_NAME_RECURRING_TRANSACTION_NOTIFICATION_URL)
  private String recurringTransactionNotificationUrl;

  public static final String SERIALIZED_NAME_RESPONSE_SUCCESS_URL = "responseSuccessUrl";
  @SerializedName(SERIALIZED_NAME_RESPONSE_SUCCESS_URL)
  private String responseSuccessUrl;

  public static final String SERIALIZED_NAME_RESPONSE_FAILURE_URL = "responseFailureUrl";
  @SerializedName(SERIALIZED_NAME_RESPONSE_FAILURE_URL)
  private String responseFailureUrl;

  public static final String SERIALIZED_NAME_SKIP_RESULT_PAGE_FOR_SUCCESS = "skipResultPageForSuccess";
  @SerializedName(SERIALIZED_NAME_SKIP_RESULT_PAGE_FOR_SUCCESS)
  private Boolean skipResultPageForSuccess;

  public static final String SERIALIZED_NAME_SKIP_RESULT_PAGE_FOR_FAILURE = "skipResultPageForFailure";
  @SerializedName(SERIALIZED_NAME_SKIP_RESULT_PAGE_FOR_FAILURE)
  private Boolean skipResultPageForFailure;

  public static final String SERIALIZED_NAME_OVERWRITE_URL_ALLOWED = "overwriteUrlAllowed";
  @SerializedName(SERIALIZED_NAME_OVERWRITE_URL_ALLOWED)
  private Boolean overwriteUrlAllowed;

  public StoreUrlConfiguration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An optional outlet id for clients that support multiple stores in the same developer app.
   * @return id
  **/
  @ApiModelProperty(example = "12345500000", required = true, value = "An optional outlet id for clients that support multiple stores in the same developer app.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StoreUrlConfiguration transactionNotificationUrl(String transactionNotificationUrl) {
    this.transactionNotificationUrl = transactionNotificationUrl;
    return this;
  }

   /**
   * Transaction notification URL for Connect.
   * @return transactionNotificationUrl
  **/
  @ApiModelProperty(example = "https://ipg-dev-1.1dc.com/webshop/transactionNotification", value = "Transaction notification URL for Connect.")
  public String getTransactionNotificationUrl() {
    return transactionNotificationUrl;
  }

  public void setTransactionNotificationUrl(String transactionNotificationUrl) {
    this.transactionNotificationUrl = transactionNotificationUrl;
  }

  public StoreUrlConfiguration recurringTransactionNotificationUrl(String recurringTransactionNotificationUrl) {
    this.recurringTransactionNotificationUrl = recurringTransactionNotificationUrl;
    return this;
  }

   /**
   * Recurring transaction notification URL for recurring payments.
   * @return recurringTransactionNotificationUrl
  **/
  @ApiModelProperty(example = "https://ipg-dev-1.1dc.com/webshop/recurringTransactionNotification", value = "Recurring transaction notification URL for recurring payments.")
  public String getRecurringTransactionNotificationUrl() {
    return recurringTransactionNotificationUrl;
  }

  public void setRecurringTransactionNotificationUrl(String recurringTransactionNotificationUrl) {
    this.recurringTransactionNotificationUrl = recurringTransactionNotificationUrl;
  }

  public StoreUrlConfiguration responseSuccessUrl(String responseSuccessUrl) {
    this.responseSuccessUrl = responseSuccessUrl;
    return this;
  }

   /**
   * Response success URL for Connect.
   * @return responseSuccessUrl
  **/
  @ApiModelProperty(example = "https://www.firstdata.com/success", value = "Response success URL for Connect.")
  public String getResponseSuccessUrl() {
    return responseSuccessUrl;
  }

  public void setResponseSuccessUrl(String responseSuccessUrl) {
    this.responseSuccessUrl = responseSuccessUrl;
  }

  public StoreUrlConfiguration responseFailureUrl(String responseFailureUrl) {
    this.responseFailureUrl = responseFailureUrl;
    return this;
  }

   /**
   * Response failure URL for Connect.
   * @return responseFailureUrl
  **/
  @ApiModelProperty(example = "https://www.firstdata.com/failure", value = "Response failure URL for Connect.")
  public String getResponseFailureUrl() {
    return responseFailureUrl;
  }

  public void setResponseFailureUrl(String responseFailureUrl) {
    this.responseFailureUrl = responseFailureUrl;
  }

  public StoreUrlConfiguration skipResultPageForSuccess(Boolean skipResultPageForSuccess) {
    this.skipResultPageForSuccess = skipResultPageForSuccess;
    return this;
  }

   /**
   * Skip connect result page when transaction is approved.
   * @return skipResultPageForSuccess
  **/
  @ApiModelProperty(example = "true", value = "Skip connect result page when transaction is approved.")
  public Boolean getSkipResultPageForSuccess() {
    return skipResultPageForSuccess;
  }

  public void setSkipResultPageForSuccess(Boolean skipResultPageForSuccess) {
    this.skipResultPageForSuccess = skipResultPageForSuccess;
  }

  public StoreUrlConfiguration skipResultPageForFailure(Boolean skipResultPageForFailure) {
    this.skipResultPageForFailure = skipResultPageForFailure;
    return this;
  }

   /**
   * Skip connect result page when transaction is not approved.
   * @return skipResultPageForFailure
  **/
  @ApiModelProperty(example = "false", value = "Skip connect result page when transaction is not approved.")
  public Boolean getSkipResultPageForFailure() {
    return skipResultPageForFailure;
  }

  public void setSkipResultPageForFailure(Boolean skipResultPageForFailure) {
    this.skipResultPageForFailure = skipResultPageForFailure;
  }

  public StoreUrlConfiguration overwriteUrlAllowed(Boolean overwriteUrlAllowed) {
    this.overwriteUrlAllowed = overwriteUrlAllowed;
    return this;
  }

   /**
   * Overwrite URLs in database by those from request.
   * @return overwriteUrlAllowed
  **/
  @ApiModelProperty(example = "true", value = "Overwrite URLs in database by those from request.")
  public Boolean getOverwriteUrlAllowed() {
    return overwriteUrlAllowed;
  }

  public void setOverwriteUrlAllowed(Boolean overwriteUrlAllowed) {
    this.overwriteUrlAllowed = overwriteUrlAllowed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreUrlConfiguration storeUrlConfiguration = (StoreUrlConfiguration) o;
    return Objects.equals(this.id, storeUrlConfiguration.id) &&
        Objects.equals(this.transactionNotificationUrl, storeUrlConfiguration.transactionNotificationUrl) &&
        Objects.equals(this.recurringTransactionNotificationUrl, storeUrlConfiguration.recurringTransactionNotificationUrl) &&
        Objects.equals(this.responseSuccessUrl, storeUrlConfiguration.responseSuccessUrl) &&
        Objects.equals(this.responseFailureUrl, storeUrlConfiguration.responseFailureUrl) &&
        Objects.equals(this.skipResultPageForSuccess, storeUrlConfiguration.skipResultPageForSuccess) &&
        Objects.equals(this.skipResultPageForFailure, storeUrlConfiguration.skipResultPageForFailure) &&
        Objects.equals(this.overwriteUrlAllowed, storeUrlConfiguration.overwriteUrlAllowed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionNotificationUrl, recurringTransactionNotificationUrl, responseSuccessUrl, responseFailureUrl, skipResultPageForSuccess, skipResultPageForFailure, overwriteUrlAllowed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreUrlConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionNotificationUrl: ").append(toIndentedString(transactionNotificationUrl)).append("\n");
    sb.append("    recurringTransactionNotificationUrl: ").append(toIndentedString(recurringTransactionNotificationUrl)).append("\n");
    sb.append("    responseSuccessUrl: ").append(toIndentedString(responseSuccessUrl)).append("\n");
    sb.append("    responseFailureUrl: ").append(toIndentedString(responseFailureUrl)).append("\n");
    sb.append("    skipResultPageForSuccess: ").append(toIndentedString(skipResultPageForSuccess)).append("\n");
    sb.append("    skipResultPageForFailure: ").append(toIndentedString(skipResultPageForFailure)).append("\n");
    sb.append("    overwriteUrlAllowed: ").append(toIndentedString(overwriteUrlAllowed)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


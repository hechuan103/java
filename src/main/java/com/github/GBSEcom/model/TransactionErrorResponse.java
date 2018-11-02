/*
 * Payment Gateway API Specification
 * Payment Gateway API for payment processing. 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.Error;
import com.github.GBSEcom.model.ProcessorData;
import com.github.GBSEcom.model.ResponseType;
import com.github.GBSEcom.model.TransactionResponse;
import com.github.GBSEcom.model.TransactionResponseAuthenticationRedirect;
import com.github.GBSEcom.model.TransactionType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TransactionErrorResponse
 */

public class TransactionErrorResponse {
  @SerializedName("responseType")
  private ResponseType responseType = null;

  @SerializedName("clientRequestId")
  private String clientRequestId = null;

  @SerializedName("apiTraceId")
  private String apiTraceId = null;

  @SerializedName("ipgTransactionId")
  private String ipgTransactionId = null;

  @SerializedName("orderId")
  private String orderId = null;

  @SerializedName("transactionType")
  private TransactionType transactionType = null;

  @SerializedName("authorizationCode")
  private String authorizationCode = null;

  @SerializedName("avsResponse")
  private String avsResponse = null;

  @SerializedName("securityCodeResponse")
  private String securityCodeResponse = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("terminalId")
  private String terminalId = null;

  @SerializedName("clientTransactionId")
  private String clientTransactionId = null;

  @SerializedName("transactionTime")
  private Long transactionTime = null;

  @SerializedName("approvedAmount")
  private Amount approvedAmount = null;

  /**
   * The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details.
   */
  @JsonAdapter(TransactionStatusEnum.Adapter.class)
  public enum TransactionStatusEnum {
    APPROVED("APPROVED"),
    
    WAITING("WAITING"),
    
    VALIDATION_FAILED("VALIDATION_FAILED"),
    
    DECLINED("DECLINED");

    private String value;

    TransactionStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionStatusEnum fromValue(String text) {
      for (TransactionStatusEnum b : TransactionStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransactionStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transactionStatus")
  private TransactionStatusEnum transactionStatus = null;

  /**
   * The state of the transaction.
   */
  @JsonAdapter(TransactionStateEnum.Adapter.class)
  public enum TransactionStateEnum {
    AUTHORIZED("AUTHORIZED"),
    
    CAPTURED("CAPTURED"),
    
    COMPLETED_GET("COMPLETED_GET"),
    
    DECLINED("DECLINED"),
    
    CHECKED("CHECKED"),
    
    INITIALIZED("INITIALIZED"),
    
    PENDING_AUTHORIZATION("PENDING_AUTHORIZATION"),
    
    PENDING_AUTOVOID("PENDING_AUTOVOID"),
    
    PENDING_CAPTURE("PENDING_CAPTURE"),
    
    PENDING_CREDIT("PENDING_CREDIT"),
    
    PENDING_GIROPAY_INIT("PENDING_GIROPAY_INIT"),
    
    PENDING_IDEAL_INIT("PENDING_IDEAL_INIT"),
    
    PENDING_INIT("PENDING_INIT"),
    
    PENDING_READY("PENDING_READY"),
    
    PENDING_RETURN("PENDING_RETURN"),
    
    PENDING_SETTLEMENT("PENDING_SETTLEMENT"),
    
    PENDING_SOFORT_INIT("PENDING_SOFORT_INIT"),
    
    PENDING_VOID("PENDING_VOID"),
    
    READY("READY"),
    
    SETTLED("SETTLED"),
    
    VOIDED("VOIDED"),
    
    WAITING("WAITING"),
    
    WAITING_AUTHENTICATION("WAITING_AUTHENTICATION"),
    
    WAITING_3D_SECURE("WAITING_3D_SECURE"),
    
    WAITING_CLICK_AND_BUY("WAITING_CLICK_AND_BUY"),
    
    WAITING_GIROPAY("WAITING_GIROPAY"),
    
    WAITING_IDEAL("WAITING_IDEAL"),
    
    WAITING_KLARNA("WAITING_KLARNA"),
    
    WAITING_PAYPAL("WAITING_PAYPAL"),
    
    WAITING_PAYPAL_EVENT("WAITING_PAYPAL_EVENT"),
    
    WAITING_PPRO_LONG_WAITING("WAITING_PPRO_LONG_WAITING"),
    
    WAITING_SOFORT("WAITING_SOFORT"),
    
    WAITING_T_PAY("WAITING_T_PAY"),
    
    WAITING_ALIPAY_PAYSECURE("WAITING_ALIPAY_PAYSECURE");

    private String value;

    TransactionStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionStateEnum fromValue(String text) {
      for (TransactionStateEnum b : TransactionStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransactionStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionStateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transactionState")
  private TransactionStateEnum transactionState = null;

  @SerializedName("authenticationRedirect")
  private TransactionResponseAuthenticationRedirect authenticationRedirect = null;

  @SerializedName("schemeTransactionId")
  private String schemeTransactionId = null;

  @SerializedName("processor")
  private ProcessorData processor = null;

  @SerializedName("error")
  private Error error = null;

  public TransactionErrorResponse responseType(ResponseType responseType) {
    this.responseType = responseType;
    return this;
  }

   /**
   * The schema type returned in the response.
   * @return responseType
  **/
  @ApiModelProperty(value = "The schema type returned in the response.")
  public ResponseType getResponseType() {
    return responseType;
  }

  public void setResponseType(ResponseType responseType) {
    this.responseType = responseType;
  }

  public TransactionErrorResponse clientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
    return this;
  }

   /**
   * Echoes back the value in the Request header
   * @return clientRequestId
  **/
  @ApiModelProperty(example = "30dd879c-ee2f-11db-8314-0800200c9a66", value = "Echoes back the value in the Request header")
  public String getClientRequestId() {
    return clientRequestId;
  }

  public void setClientRequestId(String clientRequestId) {
    this.clientRequestId = clientRequestId;
  }

  public TransactionErrorResponse apiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
    return this;
  }

   /**
   * Echoes back the value in the Request header
   * @return apiTraceId
  **/
  @ApiModelProperty(example = "2132352352112454", value = "Echoes back the value in the Request header")
  public String getApiTraceId() {
    return apiTraceId;
  }

  public void setApiTraceId(String apiTraceId) {
    this.apiTraceId = apiTraceId;
  }

  public TransactionErrorResponse ipgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
    return this;
  }

   /**
   * The Response Transaction ID
   * @return ipgTransactionId
  **/
  @ApiModelProperty(example = "838916029301", value = "The Response Transaction ID")
  public String getIpgTransactionId() {
    return ipgTransactionId;
  }

  public void setIpgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
  }

  public TransactionErrorResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Client Order ID if supplied by client, otherwise the Order ID
   * @return orderId
  **/
  @ApiModelProperty(example = "123456", value = "Client Order ID if supplied by client, otherwise the Order ID")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public TransactionErrorResponse transactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @ApiModelProperty(value = "")
  public TransactionType getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionType transactionType) {
    this.transactionType = transactionType;
  }

  public TransactionErrorResponse authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * The processor approval code for compliance.
   * @return authorizationCode
  **/
  @ApiModelProperty(example = "A1B2C3", value = "The processor approval code for compliance.")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public TransactionErrorResponse avsResponse(String avsResponse) {
    this.avsResponse = avsResponse;
    return this;
  }

   /**
   * The processor address validation response for compliance.
   * @return avsResponse
  **/
  @ApiModelProperty(example = "PPX", value = "The processor address validation response for compliance.")
  public String getAvsResponse() {
    return avsResponse;
  }

  public void setAvsResponse(String avsResponse) {
    this.avsResponse = avsResponse;
  }

  public TransactionErrorResponse securityCodeResponse(String securityCodeResponse) {
    this.securityCodeResponse = securityCodeResponse;
    return this;
  }

   /**
   * The processor card verification validation response for compliance.
   * @return securityCodeResponse
  **/
  @ApiModelProperty(example = "X", value = "The processor card verification validation response for compliance.")
  public String getSecurityCodeResponse() {
    return securityCodeResponse;
  }

  public void setSecurityCodeResponse(String securityCodeResponse) {
    this.securityCodeResponse = securityCodeResponse;
  }

  public TransactionErrorResponse brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Card brand of the payment instrument
   * @return brand
  **/
  @ApiModelProperty(example = "VISA", value = "Card brand of the payment instrument")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public TransactionErrorResponse country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country of the card issuer
   * @return country
  **/
  @ApiModelProperty(example = "USA", value = "Country of the card issuer")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public TransactionErrorResponse terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The terminal that is processing the transaction
   * @return terminalId
  **/
  @ApiModelProperty(example = "123456", value = "The terminal that is processing the transaction")
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public TransactionErrorResponse clientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
    return this;
  }

   /**
   * The unique client Transaction ID from the Request header, if supplied
   * @return clientTransactionId
  **/
  @ApiModelProperty(example = "lsk23532djljff3", value = "The unique client Transaction ID from the Request header, if supplied")
  public String getClientTransactionId() {
    return clientTransactionId;
  }

  public void setClientTransactionId(String clientTransactionId) {
    this.clientTransactionId = clientTransactionId;
  }

  public TransactionErrorResponse transactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * The transaction time in seconds since Epoch
   * @return transactionTime
  **/
  @ApiModelProperty(example = "1518811817", value = "The transaction time in seconds since Epoch")
  public Long getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }

  public TransactionErrorResponse approvedAmount(Amount approvedAmount) {
    this.approvedAmount = approvedAmount;
    return this;
  }

   /**
   * Get approvedAmount
   * @return approvedAmount
  **/
  @ApiModelProperty(value = "")
  public Amount getApprovedAmount() {
    return approvedAmount;
  }

  public void setApprovedAmount(Amount approvedAmount) {
    this.approvedAmount = approvedAmount;
  }

  public TransactionErrorResponse transactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details.
   * @return transactionStatus
  **/
  @ApiModelProperty(example = "APPROVED", value = "The status of the transaction. APPROVED/WAITING are returned by the endpoints.  VALIDATION_FAILED/DECLINED are errors. See ErrorResponse object for details.")
  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public TransactionErrorResponse transactionState(TransactionStateEnum transactionState) {
    this.transactionState = transactionState;
    return this;
  }

   /**
   * The state of the transaction.
   * @return transactionState
  **/
  @ApiModelProperty(example = "AUTHORIZED", value = "The state of the transaction.")
  public TransactionStateEnum getTransactionState() {
    return transactionState;
  }

  public void setTransactionState(TransactionStateEnum transactionState) {
    this.transactionState = transactionState;
  }

  public TransactionErrorResponse authenticationRedirect(TransactionResponseAuthenticationRedirect authenticationRedirect) {
    this.authenticationRedirect = authenticationRedirect;
    return this;
  }

   /**
   * Get authenticationRedirect
   * @return authenticationRedirect
  **/
  @ApiModelProperty(value = "")
  public TransactionResponseAuthenticationRedirect getAuthenticationRedirect() {
    return authenticationRedirect;
  }

  public void setAuthenticationRedirect(TransactionResponseAuthenticationRedirect authenticationRedirect) {
    this.authenticationRedirect = authenticationRedirect;
  }

  public TransactionErrorResponse schemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
    return this;
  }

   /**
   * The transaction id received from schemes for the initial transaction, returned for the transactions marked as \&quot;FIRST\&quot;
   * @return schemeTransactionId
  **/
  @ApiModelProperty(value = "The transaction id received from schemes for the initial transaction, returned for the transactions marked as \"FIRST\"")
  public String getSchemeTransactionId() {
    return schemeTransactionId;
  }

  public void setSchemeTransactionId(String schemeTransactionId) {
    this.schemeTransactionId = schemeTransactionId;
  }

  public TransactionErrorResponse processor(ProcessorData processor) {
    this.processor = processor;
    return this;
  }

   /**
   * Get processor
   * @return processor
  **/
  @ApiModelProperty(value = "")
  public ProcessorData getProcessor() {
    return processor;
  }

  public void setProcessor(ProcessorData processor) {
    this.processor = processor;
  }

  public TransactionErrorResponse error(Error error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Error getError() {
    return error;
  }

  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionErrorResponse transactionErrorResponse = (TransactionErrorResponse) o;
    return Objects.equals(this.responseType, transactionErrorResponse.responseType) &&
        Objects.equals(this.clientRequestId, transactionErrorResponse.clientRequestId) &&
        Objects.equals(this.apiTraceId, transactionErrorResponse.apiTraceId) &&
        Objects.equals(this.ipgTransactionId, transactionErrorResponse.ipgTransactionId) &&
        Objects.equals(this.orderId, transactionErrorResponse.orderId) &&
        Objects.equals(this.transactionType, transactionErrorResponse.transactionType) &&
        Objects.equals(this.authorizationCode, transactionErrorResponse.authorizationCode) &&
        Objects.equals(this.avsResponse, transactionErrorResponse.avsResponse) &&
        Objects.equals(this.securityCodeResponse, transactionErrorResponse.securityCodeResponse) &&
        Objects.equals(this.brand, transactionErrorResponse.brand) &&
        Objects.equals(this.country, transactionErrorResponse.country) &&
        Objects.equals(this.terminalId, transactionErrorResponse.terminalId) &&
        Objects.equals(this.clientTransactionId, transactionErrorResponse.clientTransactionId) &&
        Objects.equals(this.transactionTime, transactionErrorResponse.transactionTime) &&
        Objects.equals(this.approvedAmount, transactionErrorResponse.approvedAmount) &&
        Objects.equals(this.transactionStatus, transactionErrorResponse.transactionStatus) &&
        Objects.equals(this.transactionState, transactionErrorResponse.transactionState) &&
        Objects.equals(this.authenticationRedirect, transactionErrorResponse.authenticationRedirect) &&
        Objects.equals(this.schemeTransactionId, transactionErrorResponse.schemeTransactionId) &&
        Objects.equals(this.processor, transactionErrorResponse.processor) &&
        Objects.equals(this.error, transactionErrorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseType, clientRequestId, apiTraceId, ipgTransactionId, orderId, transactionType, authorizationCode, avsResponse, securityCodeResponse, brand, country, terminalId, clientTransactionId, transactionTime, approvedAmount, transactionStatus, transactionState, authenticationRedirect, schemeTransactionId, processor, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionErrorResponse {\n");
    
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    clientRequestId: ").append(toIndentedString(clientRequestId)).append("\n");
    sb.append("    apiTraceId: ").append(toIndentedString(apiTraceId)).append("\n");
    sb.append("    ipgTransactionId: ").append(toIndentedString(ipgTransactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    avsResponse: ").append(toIndentedString(avsResponse)).append("\n");
    sb.append("    securityCodeResponse: ").append(toIndentedString(securityCodeResponse)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    clientTransactionId: ").append(toIndentedString(clientTransactionId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    approvedAmount: ").append(toIndentedString(approvedAmount)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    authenticationRedirect: ").append(toIndentedString(authenticationRedirect)).append("\n");
    sb.append("    schemeTransactionId: ").append(toIndentedString(schemeTransactionId)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

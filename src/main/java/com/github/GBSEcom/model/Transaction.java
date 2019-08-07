/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190507.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Amount;
import com.github.GBSEcom.model.PaymentMethodDetails;
import com.github.GBSEcom.model.ProcessorData;
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
 * Common object for transaction.
 */
@ApiModel(description = "Common object for transaction.")

public class Transaction {
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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
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

  public static final String SERIALIZED_NAME_TRANSACTION_STATE = "transactionState";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_STATE)
  private TransactionStateEnum transactionState;

  public static final String SERIALIZED_NAME_IPG_TRANSACTION_ID = "ipgTransactionId";
  @SerializedName(SERIALIZED_NAME_IPG_TRANSACTION_ID)
  private String ipgTransactionId;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private TransactionType transactionType = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_DETAILS = "paymentMethodDetails";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_DETAILS)
  private PaymentMethodDetails paymentMethodDetails = null;

  public static final String SERIALIZED_NAME_TRANSACTION_AMOUNT = "transactionAmount";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_AMOUNT)
  private Amount transactionAmount = null;

  /**
   * The submission component.
   */
  @JsonAdapter(SubmissionComponentEnum.Adapter.class)
  public enum SubmissionComponentEnum {
    API("API"),
    
    BUS("BUS"),
    
    CONNECT("CONNECT"),
    
    CORE("CORE"),
    
    EPAS("EPAS"),
    
    MCS("MCS"),
    
    RESTAPI("RESTAPI"),
    
    SWITCH("SWITCH"),
    
    VT("VT");

    private String value;

    SubmissionComponentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubmissionComponentEnum fromValue(String text) {
      for (SubmissionComponentEnum b : SubmissionComponentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<SubmissionComponentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubmissionComponentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubmissionComponentEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubmissionComponentEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_SUBMISSION_COMPONENT = "submissionComponent";
  @SerializedName(SERIALIZED_NAME_SUBMISSION_COMPONENT)
  private SubmissionComponentEnum submissionComponent;

  public static final String SERIALIZED_NAME_PAYER_SECURITY_LEVEL = "payerSecurityLevel";
  @SerializedName(SERIALIZED_NAME_PAYER_SECURITY_LEVEL)
  private String payerSecurityLevel;

  public static final String SERIALIZED_NAME_TRANSACTION_TIME = "transactionTime";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TIME)
  private Long transactionTime;

  public static final String SERIALIZED_NAME_STORE_ID = "storeId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_PROCESSOR = "processor";
  @SerializedName(SERIALIZED_NAME_PROCESSOR)
  private ProcessorData processor = null;

  public Transaction transactionState(TransactionStateEnum transactionState) {
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

  public Transaction ipgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
    return this;
  }

   /**
   * The transaction ID.
   * @return ipgTransactionId
  **/
  @ApiModelProperty(example = "838916029301", value = "The transaction ID.")
  public String getIpgTransactionId() {
    return ipgTransactionId;
  }

  public void setIpgTransactionId(String ipgTransactionId) {
    this.ipgTransactionId = ipgTransactionId;
  }

  public Transaction orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Client order ID if supplied by client.
   * @return orderId
  **/
  @ApiModelProperty(example = "123456", value = "Client order ID if supplied by client.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Transaction transactionType(TransactionType transactionType) {
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

  public Transaction paymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
    this.paymentMethodDetails = paymentMethodDetails;
    return this;
  }

   /**
   * Get paymentMethodDetails
   * @return paymentMethodDetails
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodDetails getPaymentMethodDetails() {
    return paymentMethodDetails;
  }

  public void setPaymentMethodDetails(PaymentMethodDetails paymentMethodDetails) {
    this.paymentMethodDetails = paymentMethodDetails;
  }

  public Transaction transactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
    return this;
  }

   /**
   * Get transactionAmount
   * @return transactionAmount
  **/
  @ApiModelProperty(value = "")
  public Amount getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(Amount transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public Transaction submissionComponent(SubmissionComponentEnum submissionComponent) {
    this.submissionComponent = submissionComponent;
    return this;
  }

   /**
   * The submission component.
   * @return submissionComponent
  **/
  @ApiModelProperty(example = "API", value = "The submission component.")
  public SubmissionComponentEnum getSubmissionComponent() {
    return submissionComponent;
  }

  public void setSubmissionComponent(SubmissionComponentEnum submissionComponent) {
    this.submissionComponent = submissionComponent;
  }

  public Transaction payerSecurityLevel(String payerSecurityLevel) {
    this.payerSecurityLevel = payerSecurityLevel;
    return this;
  }

   /**
   * The payer security level.
   * @return payerSecurityLevel
  **/
  @ApiModelProperty(example = "m", value = "The payer security level.")
  public String getPayerSecurityLevel() {
    return payerSecurityLevel;
  }

  public void setPayerSecurityLevel(String payerSecurityLevel) {
    this.payerSecurityLevel = payerSecurityLevel;
  }

  public Transaction transactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * The transaction time in seconds since epoch.
   * @return transactionTime
  **/
  @ApiModelProperty(example = "1518811817", value = "The transaction time in seconds since epoch.")
  public Long getTransactionTime() {
    return transactionTime;
  }

  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }

  public Transaction storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID number.
   * @return storeId
  **/
  @ApiModelProperty(example = "1109959991", value = "Store ID number.")
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public Transaction userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The user ID.
   * @return userId
  **/
  @ApiModelProperty(example = "1", value = "The user ID.")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Transaction processor(ProcessorData processor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionState, transaction.transactionState) &&
        Objects.equals(this.ipgTransactionId, transaction.ipgTransactionId) &&
        Objects.equals(this.orderId, transaction.orderId) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.paymentMethodDetails, transaction.paymentMethodDetails) &&
        Objects.equals(this.transactionAmount, transaction.transactionAmount) &&
        Objects.equals(this.submissionComponent, transaction.submissionComponent) &&
        Objects.equals(this.payerSecurityLevel, transaction.payerSecurityLevel) &&
        Objects.equals(this.transactionTime, transaction.transactionTime) &&
        Objects.equals(this.storeId, transaction.storeId) &&
        Objects.equals(this.userId, transaction.userId) &&
        Objects.equals(this.processor, transaction.processor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionState, ipgTransactionId, orderId, transactionType, paymentMethodDetails, transactionAmount, submissionComponent, payerSecurityLevel, transactionTime, storeId, userId, processor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionState: ").append(toIndentedString(transactionState)).append("\n");
    sb.append("    ipgTransactionId: ").append(toIndentedString(ipgTransactionId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    paymentMethodDetails: ").append(toIndentedString(paymentMethodDetails)).append("\n");
    sb.append("    transactionAmount: ").append(toIndentedString(transactionAmount)).append("\n");
    sb.append("    submissionComponent: ").append(toIndentedString(submissionComponent)).append("\n");
    sb.append("    payerSecurityLevel: ").append(toIndentedString(payerSecurityLevel)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
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


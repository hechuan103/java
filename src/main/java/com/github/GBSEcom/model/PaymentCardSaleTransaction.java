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
import com.github.GBSEcom.model.CreatePaymentToken;
import com.github.GBSEcom.model.CurrencyConversion;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentCardPaymentMethod;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.StoredCredential;
import com.github.GBSEcom.model.SubMerchantSplit;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Request to create sale transaction using payment card.
 */
@ApiModel(description = "Request to create sale transaction using payment card.")

public class PaymentCardSaleTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentCardPaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_SPLIT = "settlementSplit";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_SPLIT)
  private List<SubMerchantSplit> settlementSplit = null;

  public static final String SERIALIZED_NAME_CREATE_TOKEN = "createToken";
  @SerializedName(SERIALIZED_NAME_CREATE_TOKEN)
  private CreatePaymentToken createToken = null;

  public static final String SERIALIZED_NAME_CURRENCY_CONVERSION = "currencyConversion";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONVERSION)
  private CurrencyConversion currencyConversion = null;

  public PaymentCardSaleTransaction paymentMethod(PaymentCardPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentCardPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentCardPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentCardSaleTransaction storedCredentials(StoredCredential storedCredentials) {
    this.storedCredentials = storedCredentials;
    return this;
  }

   /**
   * Get storedCredentials
   * @return storedCredentials
  **/
  @ApiModelProperty(value = "")
  public StoredCredential getStoredCredentials() {
    return storedCredentials;
  }

  public void setStoredCredentials(StoredCredential storedCredentials) {
    this.storedCredentials = storedCredentials;
  }

  public PaymentCardSaleTransaction settlementSplit(List<SubMerchantSplit> settlementSplit) {
    this.settlementSplit = settlementSplit;
    return this;
  }

  public PaymentCardSaleTransaction addSettlementSplitItem(SubMerchantSplit settlementSplitItem) {
    if (this.settlementSplit == null) {
      this.settlementSplit = new ArrayList<>();
    }
    this.settlementSplit.add(settlementSplitItem);
    return this;
  }

   /**
   * Settle with multiple sub-merchants, sale and preAuth only.
   * @return settlementSplit
  **/
  @ApiModelProperty(example = "[{\"merchantID\":\"100000001\",\"amount\":25.06},{\"merchantID\":\"100000002\",\"amount\":15.07}]", value = "Settle with multiple sub-merchants, sale and preAuth only.")
  public List<SubMerchantSplit> getSettlementSplit() {
    return settlementSplit;
  }

  public void setSettlementSplit(List<SubMerchantSplit> settlementSplit) {
    this.settlementSplit = settlementSplit;
  }

  public PaymentCardSaleTransaction createToken(CreatePaymentToken createToken) {
    this.createToken = createToken;
    return this;
  }

   /**
   * Get createToken
   * @return createToken
  **/
  @ApiModelProperty(value = "")
  public CreatePaymentToken getCreateToken() {
    return createToken;
  }

  public void setCreateToken(CreatePaymentToken createToken) {
    this.createToken = createToken;
  }

  public PaymentCardSaleTransaction currencyConversion(CurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
    return this;
  }

   /**
   * Get currencyConversion
   * @return currencyConversion
  **/
  @ApiModelProperty(value = "")
  public CurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }

  public void setCurrencyConversion(CurrencyConversion currencyConversion) {
    this.currencyConversion = currencyConversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCardSaleTransaction paymentCardSaleTransaction = (PaymentCardSaleTransaction) o;
    return Objects.equals(this.paymentMethod, paymentCardSaleTransaction.paymentMethod) &&
        Objects.equals(this.storedCredentials, paymentCardSaleTransaction.storedCredentials) &&
        Objects.equals(this.settlementSplit, paymentCardSaleTransaction.settlementSplit) &&
        Objects.equals(this.createToken, paymentCardSaleTransaction.createToken) &&
        Objects.equals(this.currencyConversion, paymentCardSaleTransaction.currencyConversion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, storedCredentials, settlementSplit, createToken, currencyConversion, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCardSaleTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
    sb.append("    settlementSplit: ").append(toIndentedString(settlementSplit)).append("\n");
    sb.append("    createToken: ").append(toIndentedString(createToken)).append("\n");
    sb.append("    currencyConversion: ").append(toIndentedString(currencyConversion)).append("\n");
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


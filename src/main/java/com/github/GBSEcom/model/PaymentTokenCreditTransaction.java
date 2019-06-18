/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190329.001
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
import com.github.GBSEcom.model.CurrencyConversion;
import com.github.GBSEcom.model.Order;
import com.github.GBSEcom.model.PaymentTokenPaymentMethod;
import com.github.GBSEcom.model.PrimaryTransaction;
import com.github.GBSEcom.model.TransactionOrigin;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request to create credit transaction using payment token.
 */
@ApiModel(description = "Request to create credit transaction using payment token.")

public class PaymentTokenCreditTransaction extends PrimaryTransaction {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentTokenPaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_CURRENCY_CONVERSION = "currencyConversion";
  @SerializedName(SERIALIZED_NAME_CURRENCY_CONVERSION)
  private CurrencyConversion currencyConversion = null;

  public PaymentTokenCreditTransaction paymentMethod(PaymentTokenPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")
  public PaymentTokenPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(PaymentTokenPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public PaymentTokenCreditTransaction currencyConversion(CurrencyConversion currencyConversion) {
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
    PaymentTokenCreditTransaction paymentTokenCreditTransaction = (PaymentTokenCreditTransaction) o;
    return Objects.equals(this.paymentMethod, paymentTokenCreditTransaction.paymentMethod) &&
        Objects.equals(this.currencyConversion, paymentTokenCreditTransaction.currencyConversion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, currencyConversion, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTokenCreditTransaction {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
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

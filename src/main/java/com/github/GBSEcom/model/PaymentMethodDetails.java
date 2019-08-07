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
import com.github.GBSEcom.model.PaymentCard;
import com.github.GBSEcom.model.PaymentMethodType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Provides details of the payment method used.
 */
@ApiModel(description = "Provides details of the payment method used.")

public class PaymentMethodDetails {
  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard = null;

  public static final String SERIALIZED_NAME_PAYMENT_METHOD_TYPE = "paymentMethodType";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD_TYPE)
  private PaymentMethodType paymentMethodType = null;

  public PaymentMethodDetails paymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

   /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(value = "")
  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }

  public PaymentMethodDetails paymentMethodType(PaymentMethodType paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodType getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodType paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodDetails paymentMethodDetails = (PaymentMethodDetails) o;
    return Objects.equals(this.paymentCard, paymentMethodDetails.paymentCard) &&
        Objects.equals(this.paymentMethodType, paymentMethodDetails.paymentMethodType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCard, paymentMethodType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodDetails {\n");
    
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
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


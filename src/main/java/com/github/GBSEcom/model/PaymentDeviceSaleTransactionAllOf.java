/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.CreatePaymentToken;
import com.github.GBSEcom.model.PaymentDevicePaymentMethod;
import com.github.GBSEcom.model.StoredCredential;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentDeviceSaleTransactionAllOf
 */

public class PaymentDeviceSaleTransactionAllOf {
  public static final String SERIALIZED_NAME_PAYMENT_METHOD = "paymentMethod";
  @SerializedName(SERIALIZED_NAME_PAYMENT_METHOD)
  private PaymentDevicePaymentMethod paymentMethod = null;

  public static final String SERIALIZED_NAME_CREATE_TOKEN = "createToken";
  @SerializedName(SERIALIZED_NAME_CREATE_TOKEN)
  private CreatePaymentToken createToken;

  public static final String SERIALIZED_NAME_STORED_CREDENTIALS = "storedCredentials";
  @SerializedName(SERIALIZED_NAME_STORED_CREDENTIALS)
  private StoredCredential storedCredentials;


  public PaymentDeviceSaleTransactionAllOf paymentMethod(PaymentDevicePaymentMethod paymentMethod) {
    
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Get paymentMethod
   * @return paymentMethod
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentDevicePaymentMethod getPaymentMethod() {
    return paymentMethod;
  }



  public void setPaymentMethod(PaymentDevicePaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  public PaymentDeviceSaleTransactionAllOf createToken(CreatePaymentToken createToken) {
    
    this.createToken = createToken;
    return this;
  }

   /**
   * Get createToken
   * @return createToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatePaymentToken getCreateToken() {
    return createToken;
  }



  public void setCreateToken(CreatePaymentToken createToken) {
    this.createToken = createToken;
  }


  public PaymentDeviceSaleTransactionAllOf storedCredentials(StoredCredential storedCredentials) {
    
    this.storedCredentials = storedCredentials;
    return this;
  }

   /**
   * Get storedCredentials
   * @return storedCredentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StoredCredential getStoredCredentials() {
    return storedCredentials;
  }



  public void setStoredCredentials(StoredCredential storedCredentials) {
    this.storedCredentials = storedCredentials;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDeviceSaleTransactionAllOf paymentDeviceSaleTransactionAllOf = (PaymentDeviceSaleTransactionAllOf) o;
    return Objects.equals(this.paymentMethod, paymentDeviceSaleTransactionAllOf.paymentMethod) &&
        Objects.equals(this.createToken, paymentDeviceSaleTransactionAllOf.createToken) &&
        Objects.equals(this.storedCredentials, paymentDeviceSaleTransactionAllOf.storedCredentials);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentMethod, createToken, storedCredentials);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDeviceSaleTransactionAllOf {\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    createToken: ").append(toIndentedString(createToken)).append("\n");
    sb.append("    storedCredentials: ").append(toIndentedString(storedCredentials)).append("\n");
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

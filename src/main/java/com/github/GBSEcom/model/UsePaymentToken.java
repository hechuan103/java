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
import com.github.GBSEcom.model.CardFunction;
import com.github.GBSEcom.model.Expiration;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Payment token usage details.
 */
@ApiModel(description = "Payment token usage details.")

public class UsePaymentToken {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_TOKEN_ORIGIN_STORE_ID = "tokenOriginStoreId";
  @SerializedName(SERIALIZED_NAME_TOKEN_ORIGIN_STORE_ID)
  private String tokenOriginStoreId;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private CardFunction function = null;

  public static final String SERIALIZED_NAME_SECURITY_CODE = "securityCode";
  @SerializedName(SERIALIZED_NAME_SECURITY_CODE)
  private String securityCode;

  public static final String SERIALIZED_NAME_EXPIRY_DATE = "expiryDate";
  @SerializedName(SERIALIZED_NAME_EXPIRY_DATE)
  private Expiration expiryDate = null;

  public UsePaymentToken value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Client-supplied payment token value.
   * @return value
  **/
  @ApiModelProperty(example = "1235325235236", required = true, value = "Client-supplied payment token value.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public UsePaymentToken tokenOriginStoreId(String tokenOriginStoreId) {
    this.tokenOriginStoreId = tokenOriginStoreId;
    return this;
  }

   /**
   * The ID of a same store (or) sibling store in a hierarchy for which the token was originally created.
   * @return tokenOriginStoreId
  **/
  @ApiModelProperty(example = "12345500001", value = "The ID of a same store (or) sibling store in a hierarchy for which the token was originally created.")
  public String getTokenOriginStoreId() {
    return tokenOriginStoreId;
  }

  public void setTokenOriginStoreId(String tokenOriginStoreId) {
    this.tokenOriginStoreId = tokenOriginStoreId;
  }

  public UsePaymentToken function(CardFunction function) {
    this.function = function;
    return this;
  }

   /**
   * Get function
   * @return function
  **/
  @ApiModelProperty(value = "")
  public CardFunction getFunction() {
    return function;
  }

  public void setFunction(CardFunction function) {
    this.function = function;
  }

  public UsePaymentToken securityCode(String securityCode) {
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Card verification value/number.
   * @return securityCode
  **/
  @ApiModelProperty(example = "977", value = "Card verification value/number.")
  public String getSecurityCode() {
    return securityCode;
  }

  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }

  public UsePaymentToken expiryDate(Expiration expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  @ApiModelProperty(value = "")
  public Expiration getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Expiration expiryDate) {
    this.expiryDate = expiryDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsePaymentToken usePaymentToken = (UsePaymentToken) o;
    return Objects.equals(this.value, usePaymentToken.value) &&
        Objects.equals(this.tokenOriginStoreId, usePaymentToken.tokenOriginStoreId) &&
        Objects.equals(this.function, usePaymentToken.function) &&
        Objects.equals(this.securityCode, usePaymentToken.securityCode) &&
        Objects.equals(this.expiryDate, usePaymentToken.expiryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, tokenOriginStoreId, function, securityCode, expiryDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsePaymentToken {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    tokenOriginStoreId: ").append(toIndentedString(tokenOriginStoreId)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
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


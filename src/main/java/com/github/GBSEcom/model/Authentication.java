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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Request authentication of the payment card to verify the cardholder and be eligible for liability shift. Provides shared fields for all Authentication request types. Abstract class, do not use this class directly, use one of its children.
 */
@ApiModel(description = "Request authentication of the payment card to verify the cardholder and be eligible for liability shift. Provides shared fields for all Authentication request types. Abstract class, do not use this class directly, use one of its children.")


public class Authentication {
  public static final String SERIALIZED_NAME_REQUEST_TYPE = "requestType";
  @SerializedName(SERIALIZED_NAME_REQUEST_TYPE)
  private String requestType;

  public Authentication() {
    this.requestType = this.getClass().getSimpleName();
  }
  public Authentication requestType(String requestType) {
    this.requestType = requestType;
    return this;
  }

   /**
   * Indicates what kind of authentication scheme the merchant wants to use on the card.
   * @return requestType
  **/
  @ApiModelProperty(example = "UnionPayAuthenticationRequest", required = true, value = "Indicates what kind of authentication scheme the merchant wants to use on the card.")
  public String getRequestType() {
    return requestType;
  }

  public void setRequestType(String requestType) {
    this.requestType = requestType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Authentication authentication = (Authentication) o;
    return Objects.equals(this.requestType, authentication.requestType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Authentication {\n");
    
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
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


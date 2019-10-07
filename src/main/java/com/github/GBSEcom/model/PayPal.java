/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.8.0.20190731.002
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
 * The payment object for PayPal transactions.
 */
@ApiModel(description = "The payment object for PayPal transactions.")

public class PayPal {
  public static final String SERIALIZED_NAME_RECIPIENT_EMAIL = "recipientEmail";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_EMAIL)
  private String recipientEmail;

  public PayPal recipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
    return this;
  }

   /**
   * Email address of the recipient.
   * @return recipientEmail
  **/
  @ApiModelProperty(example = "john@tester.com", required = true, value = "Email address of the recipient.")
  public String getRecipientEmail() {
    return recipientEmail;
  }

  public void setRecipientEmail(String recipientEmail) {
    this.recipientEmail = recipientEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPal payPal = (PayPal) o;
    return Objects.equals(this.recipientEmail, payPal.recipientEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPal {\n");
    
    sb.append("    recipientEmail: ").append(toIndentedString(recipientEmail)).append("\n");
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


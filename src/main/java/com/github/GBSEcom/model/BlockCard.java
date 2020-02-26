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
 * Object that holds information about card that should be blocked.
 */
@ApiModel(description = "Object that holds information about card that should be blocked.")

public class BlockCard {
  public static final String SERIALIZED_NAME_CARD_NUMBER = "cardNumber";
  @SerializedName(SERIALIZED_NAME_CARD_NUMBER)
  private String cardNumber;

  public static final String SERIALIZED_NAME_ORDER_ID = "orderId";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private String orderId;

  public static final String SERIALIZED_NAME_MERCHANT_TRANSACTION_ID = "merchantTransactionId";
  @SerializedName(SERIALIZED_NAME_MERCHANT_TRANSACTION_ID)
  private String merchantTransactionId;

  public BlockCard cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

   /**
   * Use this field to send clear PAN or tokens other than TransArmor Token.
   * @return cardNumber
  **/
  @ApiModelProperty(example = "5424180279791732", value = "Use this field to send clear PAN or tokens other than TransArmor Token.")
  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public BlockCard orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Client order ID.
   * @return orderId
  **/
  @ApiModelProperty(example = "123456", value = "Client order ID.")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public BlockCard merchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
    return this;
  }

   /**
   * The unique merchant transaction ID.
   * @return merchantTransactionId
  **/
  @ApiModelProperty(example = "lsk23532djljff3", value = "The unique merchant transaction ID.")
  public String getMerchantTransactionId() {
    return merchantTransactionId;
  }

  public void setMerchantTransactionId(String merchantTransactionId) {
    this.merchantTransactionId = merchantTransactionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockCard blockCard = (BlockCard) o;
    return Objects.equals(this.cardNumber, blockCard.cardNumber) &&
        Objects.equals(this.orderId, blockCard.orderId) &&
        Objects.equals(this.merchantTransactionId, blockCard.merchantTransactionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardNumber, orderId, merchantTransactionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockCard {\n");
    
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    merchantTransactionId: ").append(toIndentedString(merchantTransactionId)).append("\n");
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


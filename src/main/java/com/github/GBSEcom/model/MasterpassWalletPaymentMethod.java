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
import com.github.GBSEcom.model.MasterpassWalletPaymentMethodAllOf;
import com.github.GBSEcom.model.PaymentCard;
import com.github.GBSEcom.model.WalletPaymentMethod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Masterpass Wallet payment method information.
 */
@ApiModel(description = "Masterpass Wallet payment method information.")

public class MasterpassWalletPaymentMethod extends WalletPaymentMethod {
  public static final String SERIALIZED_NAME_WALLET_ID = "walletId";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private String walletId;

  public static final String SERIALIZED_NAME_PAYMENT_CARD = "paymentCard";
  @SerializedName(SERIALIZED_NAME_PAYMENT_CARD)
  private PaymentCard paymentCard;


  public MasterpassWalletPaymentMethod walletId(String walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * Masterpass Wallet ID.
   * @return walletId
  **/
  @ApiModelProperty(example = "101", required = true, value = "Masterpass Wallet ID.")

  public String getWalletId() {
    return walletId;
  }



  public void setWalletId(String walletId) {
    this.walletId = walletId;
  }


  public MasterpassWalletPaymentMethod paymentCard(PaymentCard paymentCard) {
    
    this.paymentCard = paymentCard;
    return this;
  }

   /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentCard getPaymentCard() {
    return paymentCard;
  }



  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MasterpassWalletPaymentMethod masterpassWalletPaymentMethod = (MasterpassWalletPaymentMethod) o;
    return Objects.equals(this.walletId, masterpassWalletPaymentMethod.walletId) &&
        Objects.equals(this.paymentCard, masterpassWalletPaymentMethod.paymentCard) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, paymentCard, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MasterpassWalletPaymentMethod {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
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

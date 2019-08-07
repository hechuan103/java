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
 * Various wallet payment methods the gateway supports. Abstract class, do not use this class directly, use one of its children: EncryptedGooglePayWalletPaymentMethod, EncryptedApplePayWalletPaymentMethod.
 */
@ApiModel(description = "Various wallet payment methods the gateway supports. Abstract class, do not use this class directly, use one of its children: EncryptedGooglePayWalletPaymentMethod, EncryptedApplePayWalletPaymentMethod.")


public class WalletPaymentMethod {
  public static final String SERIALIZED_NAME_WALLET_TYPE = "walletType";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private String walletType;

  public WalletPaymentMethod() {
    this.walletType = this.getClass().getSimpleName();
  }
  public WalletPaymentMethod walletType(String walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * Type of wallet.
   * @return walletType
  **/
  @ApiModelProperty(example = "EncryptedApplePayWalletPaymentMethod", required = true, value = "Type of wallet.")
  public String getWalletType() {
    return walletType;
  }

  public void setWalletType(String walletType) {
    this.walletType = walletType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletPaymentMethod walletPaymentMethod = (WalletPaymentMethod) o;
    return Objects.equals(this.walletType, walletPaymentMethod.walletType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletPaymentMethod {\n");
    
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
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


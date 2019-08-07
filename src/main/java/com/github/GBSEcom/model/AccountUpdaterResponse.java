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
 * Details related to updated account information.
 */
@ApiModel(description = "Details related to updated account information.")

public class AccountUpdaterResponse {
  public static final String SERIALIZED_NAME_UPDATED_CARD = "updatedCard";
  @SerializedName(SERIALIZED_NAME_UPDATED_CARD)
  private String updatedCard;

  public static final String SERIALIZED_NAME_UPDATED_TOKEN = "updatedToken";
  @SerializedName(SERIALIZED_NAME_UPDATED_TOKEN)
  private String updatedToken;

  public static final String SERIALIZED_NAME_UPDATED_EXPIRATION_DATE = "updatedExpirationDate";
  @SerializedName(SERIALIZED_NAME_UPDATED_EXPIRATION_DATE)
  private String updatedExpirationDate;

  public static final String SERIALIZED_NAME_UPDATED_ACCOUNT_STATUS = "updatedAccountStatus";
  @SerializedName(SERIALIZED_NAME_UPDATED_ACCOUNT_STATUS)
  private String updatedAccountStatus;

  public static final String SERIALIZED_NAME_UPDATED_ACCOUNT_ERROR_CODE = "updatedAccountErrorCode";
  @SerializedName(SERIALIZED_NAME_UPDATED_ACCOUNT_ERROR_CODE)
  private String updatedAccountErrorCode;

  public AccountUpdaterResponse updatedCard(String updatedCard) {
    this.updatedCard = updatedCard;
    return this;
  }

   /**
   * Account updater replacement PAN or TransArmor token.
   * @return updatedCard
  **/
  @ApiModelProperty(example = "4012000066660018", value = "Account updater replacement PAN or TransArmor token.")
  public String getUpdatedCard() {
    return updatedCard;
  }

  public void setUpdatedCard(String updatedCard) {
    this.updatedCard = updatedCard;
  }

  public AccountUpdaterResponse updatedToken(String updatedToken) {
    this.updatedToken = updatedToken;
    return this;
  }

   /**
   * Updated value of token.
   * @return updatedToken
  **/
  @ApiModelProperty(example = "1235325235236", value = "Updated value of token.")
  public String getUpdatedToken() {
    return updatedToken;
  }

  public void setUpdatedToken(String updatedToken) {
    this.updatedToken = updatedToken;
  }

  public AccountUpdaterResponse updatedExpirationDate(String updatedExpirationDate) {
    this.updatedExpirationDate = updatedExpirationDate;
    return this;
  }

   /**
   * New account number expiration date in MMYY format.
   * @return updatedExpirationDate
  **/
  @ApiModelProperty(example = "1220", value = "New account number expiration date in MMYY format.")
  public String getUpdatedExpirationDate() {
    return updatedExpirationDate;
  }

  public void setUpdatedExpirationDate(String updatedExpirationDate) {
    this.updatedExpirationDate = updatedExpirationDate;
  }

  public AccountUpdaterResponse updatedAccountStatus(String updatedAccountStatus) {
    this.updatedAccountStatus = updatedAccountStatus;
    return this;
  }

   /**
   * Status of the updated account. An account may have closed (C), the expiry date may have changed (E), the account may have changed (A), or the cardholder should be contacted (Q).
   * @return updatedAccountStatus
  **/
  @ApiModelProperty(example = "A", value = "Status of the updated account. An account may have closed (C), the expiry date may have changed (E), the account may have changed (A), or the cardholder should be contacted (Q).")
  public String getUpdatedAccountStatus() {
    return updatedAccountStatus;
  }

  public void setUpdatedAccountStatus(String updatedAccountStatus) {
    this.updatedAccountStatus = updatedAccountStatus;
  }

  public AccountUpdaterResponse updatedAccountErrorCode(String updatedAccountErrorCode) {
    this.updatedAccountErrorCode = updatedAccountErrorCode;
    return this;
  }

   /**
   * Code for the error encountered when updating account.
   * @return updatedAccountErrorCode
  **/
  @ApiModelProperty(example = "VAU002", value = "Code for the error encountered when updating account.")
  public String getUpdatedAccountErrorCode() {
    return updatedAccountErrorCode;
  }

  public void setUpdatedAccountErrorCode(String updatedAccountErrorCode) {
    this.updatedAccountErrorCode = updatedAccountErrorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdaterResponse accountUpdaterResponse = (AccountUpdaterResponse) o;
    return Objects.equals(this.updatedCard, accountUpdaterResponse.updatedCard) &&
        Objects.equals(this.updatedToken, accountUpdaterResponse.updatedToken) &&
        Objects.equals(this.updatedExpirationDate, accountUpdaterResponse.updatedExpirationDate) &&
        Objects.equals(this.updatedAccountStatus, accountUpdaterResponse.updatedAccountStatus) &&
        Objects.equals(this.updatedAccountErrorCode, accountUpdaterResponse.updatedAccountErrorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updatedCard, updatedToken, updatedExpirationDate, updatedAccountStatus, updatedAccountErrorCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdaterResponse {\n");
    
    sb.append("    updatedCard: ").append(toIndentedString(updatedCard)).append("\n");
    sb.append("    updatedToken: ").append(toIndentedString(updatedToken)).append("\n");
    sb.append("    updatedExpirationDate: ").append(toIndentedString(updatedExpirationDate)).append("\n");
    sb.append("    updatedAccountStatus: ").append(toIndentedString(updatedAccountStatus)).append("\n");
    sb.append("    updatedAccountErrorCode: ").append(toIndentedString(updatedAccountErrorCode)).append("\n");
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


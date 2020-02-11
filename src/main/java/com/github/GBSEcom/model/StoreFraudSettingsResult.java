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
import com.github.GBSEcom.model.TokenIdentifier;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object that holds result from update fraud settings request.
 */
@ApiModel(description = "Object that holds result from update fraud settings request.")

public class StoreFraudSettingsResult {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_BLOCKED_CARD_IDENTIFIER = "blockedCardIdentifier";
  @SerializedName(SERIALIZED_NAME_BLOCKED_CARD_IDENTIFIER)
  private TokenIdentifier blockedCardIdentifier = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public StoreFraudSettingsResult id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An outlet identificator.
   * @return id
  **/
  @ApiModelProperty(example = "12345500000", value = "An outlet identificator.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public StoreFraudSettingsResult blockedCardIdentifier(TokenIdentifier blockedCardIdentifier) {
    this.blockedCardIdentifier = blockedCardIdentifier;
    return this;
  }

   /**
   * Get blockedCardIdentifier
   * @return blockedCardIdentifier
  **/
  @ApiModelProperty(value = "")
  public TokenIdentifier getBlockedCardIdentifier() {
    return blockedCardIdentifier;
  }

  public void setBlockedCardIdentifier(TokenIdentifier blockedCardIdentifier) {
    this.blockedCardIdentifier = blockedCardIdentifier;
  }

  public StoreFraudSettingsResult status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status from fraud settings.
   * @return status
  **/
  @ApiModelProperty(example = "SUCCESS", value = "Status from fraud settings.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreFraudSettingsResult storeFraudSettingsResult = (StoreFraudSettingsResult) o;
    return Objects.equals(this.id, storeFraudSettingsResult.id) &&
        Objects.equals(this.blockedCardIdentifier, storeFraudSettingsResult.blockedCardIdentifier) &&
        Objects.equals(this.status, storeFraudSettingsResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, blockedCardIdentifier, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreFraudSettingsResult {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    blockedCardIdentifier: ").append(toIndentedString(blockedCardIdentifier)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

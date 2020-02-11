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
import com.github.GBSEcom.model.BlockedItems;
import com.github.GBSEcom.model.CountryProfile;
import com.github.GBSEcom.model.LockoutTime;
import com.github.GBSEcom.model.MaximumPurchaseAmount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object that holds all fraud settings.
 */
@ApiModel(description = "Object that holds all fraud settings.")

public class FraudSettings {
  public static final String SERIALIZED_NAME_BLOCKED_ITEMS = "blockedItems";
  @SerializedName(SERIALIZED_NAME_BLOCKED_ITEMS)
  private BlockedItems blockedItems = null;

  public static final String SERIALIZED_NAME_MAXIMUM_PURCHASE_AMOUNT = "maximumPurchaseAmount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_PURCHASE_AMOUNT)
  private List<MaximumPurchaseAmount> maximumPurchaseAmount = null;

  public static final String SERIALIZED_NAME_LOCKOUT_TIME = "lockoutTime";
  @SerializedName(SERIALIZED_NAME_LOCKOUT_TIME)
  private LockoutTime lockoutTime = null;

  public static final String SERIALIZED_NAME_COUNTRY_PROFILE = "countryProfile";
  @SerializedName(SERIALIZED_NAME_COUNTRY_PROFILE)
  private CountryProfile countryProfile = null;

  public FraudSettings blockedItems(BlockedItems blockedItems) {
    this.blockedItems = blockedItems;
    return this;
  }

   /**
   * Get blockedItems
   * @return blockedItems
  **/
  @ApiModelProperty(value = "")
  public BlockedItems getBlockedItems() {
    return blockedItems;
  }

  public void setBlockedItems(BlockedItems blockedItems) {
    this.blockedItems = blockedItems;
  }

  public FraudSettings maximumPurchaseAmount(List<MaximumPurchaseAmount> maximumPurchaseAmount) {
    this.maximumPurchaseAmount = maximumPurchaseAmount;
    return this;
  }

  public FraudSettings addMaximumPurchaseAmountItem(MaximumPurchaseAmount maximumPurchaseAmountItem) {
    if (this.maximumPurchaseAmount == null) {
      this.maximumPurchaseAmount = new ArrayList<>();
    }
    this.maximumPurchaseAmount.add(maximumPurchaseAmountItem);
    return this;
  }

   /**
   * Get maximumPurchaseAmount
   * @return maximumPurchaseAmount
  **/
  @ApiModelProperty(example = "[{\"currency\":\"EUR\",\"maxAmount\":\"5555\"},{\"currency\":\"USD\",\"maxAmount\":\"7755\"}]", value = "")
  public List<MaximumPurchaseAmount> getMaximumPurchaseAmount() {
    return maximumPurchaseAmount;
  }

  public void setMaximumPurchaseAmount(List<MaximumPurchaseAmount> maximumPurchaseAmount) {
    this.maximumPurchaseAmount = maximumPurchaseAmount;
  }

  public FraudSettings lockoutTime(LockoutTime lockoutTime) {
    this.lockoutTime = lockoutTime;
    return this;
  }

   /**
   * Get lockoutTime
   * @return lockoutTime
  **/
  @ApiModelProperty(value = "")
  public LockoutTime getLockoutTime() {
    return lockoutTime;
  }

  public void setLockoutTime(LockoutTime lockoutTime) {
    this.lockoutTime = lockoutTime;
  }

  public FraudSettings countryProfile(CountryProfile countryProfile) {
    this.countryProfile = countryProfile;
    return this;
  }

   /**
   * Get countryProfile
   * @return countryProfile
  **/
  @ApiModelProperty(value = "")
  public CountryProfile getCountryProfile() {
    return countryProfile;
  }

  public void setCountryProfile(CountryProfile countryProfile) {
    this.countryProfile = countryProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudSettings fraudSettings = (FraudSettings) o;
    return Objects.equals(this.blockedItems, fraudSettings.blockedItems) &&
        Objects.equals(this.maximumPurchaseAmount, fraudSettings.maximumPurchaseAmount) &&
        Objects.equals(this.lockoutTime, fraudSettings.lockoutTime) &&
        Objects.equals(this.countryProfile, fraudSettings.countryProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockedItems, maximumPurchaseAmount, lockoutTime, countryProfile);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudSettings {\n");
    
    sb.append("    blockedItems: ").append(toIndentedString(blockedItems)).append("\n");
    sb.append("    maximumPurchaseAmount: ").append(toIndentedString(maximumPurchaseAmount)).append("\n");
    sb.append("    lockoutTime: ").append(toIndentedString(lockoutTime)).append("\n");
    sb.append("    countryProfile: ").append(toIndentedString(countryProfile)).append("\n");
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

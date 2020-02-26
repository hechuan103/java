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
import com.github.GBSEcom.model.FraudAddress;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The specific location (e.g. store or station) where the transaction takes place.
 */
@ApiModel(description = "The specific location (e.g. store or station) where the transaction takes place.")

public class Location {
  public static final String SERIALIZED_NAME_LOCATION_ID = "locationId";
  @SerializedName(SERIALIZED_NAME_LOCATION_ID)
  private String locationId;

  public static final String SERIALIZED_NAME_MERCHANT_ADDRESS = "merchantAddress";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ADDRESS)
  private FraudAddress merchantAddress = null;

  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private String hierarchy;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "timezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private String timezoneOffset;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined = null;

  public Location locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * The unique ID of this location.
   * @return locationId
  **/
  @ApiModelProperty(example = "3", value = "The unique ID of this location.")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public Location merchantAddress(FraudAddress merchantAddress) {
    this.merchantAddress = merchantAddress;
    return this;
  }

   /**
   * Get merchantAddress
   * @return merchantAddress
  **/
  @ApiModelProperty(value = "")
  public FraudAddress getMerchantAddress() {
    return merchantAddress;
  }

  public void setMerchantAddress(FraudAddress merchantAddress) {
    this.merchantAddress = merchantAddress;
  }

  public Location hierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Free-text field to describe a hierarchy the merchant would like to provide.
   * @return hierarchy
  **/
  @ApiModelProperty(example = "FDC", value = "Free-text field to describe a hierarchy the merchant would like to provide.")
  public String getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
  }

  public Location timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * The timezone offset from UTC to the merchants timezone configuration, specified in the format +hh:mm.
   * @return timezoneOffset
  **/
  @ApiModelProperty(example = "+02:00", value = "The timezone offset from UTC to the merchants timezone configuration, specified in the format +hh:mm.")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public Location userDefined(Object userDefined) {
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the location that might be helpful for fraud detection.
   * @return userDefined
  **/
  @ApiModelProperty(example = "{\"validAddress\":false}", value = "A JSON object that can carry any additional information about the location that might be helpful for fraud detection.")
  public Object getUserDefined() {
    return userDefined;
  }

  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.locationId, location.locationId) &&
        Objects.equals(this.merchantAddress, location.merchantAddress) &&
        Objects.equals(this.hierarchy, location.hierarchy) &&
        Objects.equals(this.timezoneOffset, location.timezoneOffset) &&
        Objects.equals(this.userDefined, location.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, merchantAddress, hierarchy, timezoneOffset, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    merchantAddress: ").append(toIndentedString(merchantAddress)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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


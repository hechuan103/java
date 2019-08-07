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
 * Sender information for a disbursement transaction.
 */
@ApiModel(description = "Sender information for a disbursement transaction.")

public class SenderInfo {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STREET_ADDRESS = "streetAddress";
  @SerializedName(SERIALIZED_NAME_STREET_ADDRESS)
  private String streetAddress;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_STATE_CODE = "stateCode";
  @SerializedName(SERIALIZED_NAME_STATE_CODE)
  private String stateCode;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "countryCode";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postalCode";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birthDate";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private String birthDate;

  public static final String SERIALIZED_NAME_REFERENCE_NUMBER = "referenceNumber";
  @SerializedName(SERIALIZED_NAME_REFERENCE_NUMBER)
  private String referenceNumber;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public SenderInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Sender name.
   * @return name
  **/
  @ApiModelProperty(example = "Franklin D. Roosevelt", required = true, value = "Sender name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SenderInfo streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

   /**
   * Sender street address.
   * @return streetAddress
  **/
  @ApiModelProperty(example = "5565 Glenridge Connector", required = true, value = "Sender street address.")
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public SenderInfo city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Sender city.
   * @return city
  **/
  @ApiModelProperty(example = "Atlanta", required = true, value = "Sender city.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SenderInfo stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

   /**
   * Sender state.
   * @return stateCode
  **/
  @ApiModelProperty(example = "GA", required = true, value = "Sender state.")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public SenderInfo countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

   /**
   * Sender country code.
   * @return countryCode
  **/
  @ApiModelProperty(example = "US", required = true, value = "Sender country code.")
  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public SenderInfo postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Sender postal code.
   * @return postalCode
  **/
  @ApiModelProperty(example = "30342", required = true, value = "Sender postal code.")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public SenderInfo phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Sender phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "4044040740", required = true, value = "Sender phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public SenderInfo birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Sender date of birth (YYYYMMDD).
   * @return birthDate
  **/
  @ApiModelProperty(example = "19560121", value = "Sender date of birth (YYYYMMDD).")
  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public SenderInfo referenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
    return this;
  }

   /**
   * Sender reference number.
   * @return referenceNumber
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Sender reference number.")
  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public SenderInfo accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Sender account number.
   * @return accountNumber
  **/
  @ApiModelProperty(example = "135246", required = true, value = "Sender account number.")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderInfo senderInfo = (SenderInfo) o;
    return Objects.equals(this.name, senderInfo.name) &&
        Objects.equals(this.streetAddress, senderInfo.streetAddress) &&
        Objects.equals(this.city, senderInfo.city) &&
        Objects.equals(this.stateCode, senderInfo.stateCode) &&
        Objects.equals(this.countryCode, senderInfo.countryCode) &&
        Objects.equals(this.postalCode, senderInfo.postalCode) &&
        Objects.equals(this.phoneNumber, senderInfo.phoneNumber) &&
        Objects.equals(this.birthDate, senderInfo.birthDate) &&
        Objects.equals(this.referenceNumber, senderInfo.referenceNumber) &&
        Objects.equals(this.accountNumber, senderInfo.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, streetAddress, city, stateCode, countryCode, postalCode, phoneNumber, birthDate, referenceNumber, accountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    referenceNumber: ").append(toIndentedString(referenceNumber)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190329.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.CustomerAddressPhone;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Customer address fields.
 */
@ApiModel(description = "Customer address fields.")

public class CustomerAddress {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_STREET2 = "street2";
  @SerializedName(SERIALIZED_NAME_STREET2)
  private String street2;

  public static final String SERIALIZED_NAME_STATE_PROVINCE = "stateProvince";
  @SerializedName(SERIALIZED_NAME_STATE_PROVINCE)
  private String stateProvince;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private CustomerAddressPhone phone = null;

  public static final String SERIALIZED_NAME_ZIP_POSTAL_CODE = "zipPostalCode";
  @SerializedName(SERIALIZED_NAME_ZIP_POSTAL_CODE)
  private String zipPostalCode;

  public CustomerAddress street(String street) {
    this.street = street;
    return this;
  }

   /**
   * First line of street address.
   * @return street
  **/
  @ApiModelProperty(example = "Apartment 123", required = true, value = "First line of street address.")
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public CustomerAddress street2(String street2) {
    this.street2 = street2;
    return this;
  }

   /**
   * Second line of street address.
   * @return street2
  **/
  @ApiModelProperty(example = "123 Main Street", value = "Second line of street address.")
  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public CustomerAddress stateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
    return this;
  }

   /**
   * State or province.
   * @return stateProvince
  **/
  @ApiModelProperty(example = "NY", value = "State or province.")
  public String getStateProvince() {
    return stateProvince;
  }

  public void setStateProvince(String stateProvince) {
    this.stateProvince = stateProvince;
  }

  public CustomerAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City.
   * @return city
  **/
  @ApiModelProperty(example = "New York", value = "City.")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public CustomerAddress country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country.
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "Country.")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public CustomerAddress phone(CustomerAddressPhone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")
  public CustomerAddressPhone getPhone() {
    return phone;
  }

  public void setPhone(CustomerAddressPhone phone) {
    this.phone = phone;
  }

  public CustomerAddress zipPostalCode(String zipPostalCode) {
    this.zipPostalCode = zipPostalCode;
    return this;
  }

   /**
   * Postal code.
   * @return zipPostalCode
  **/
  @ApiModelProperty(example = "11375", required = true, value = "Postal code.")
  public String getZipPostalCode() {
    return zipPostalCode;
  }

  public void setZipPostalCode(String zipPostalCode) {
    this.zipPostalCode = zipPostalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddress customerAddress = (CustomerAddress) o;
    return Objects.equals(this.street, customerAddress.street) &&
        Objects.equals(this.street2, customerAddress.street2) &&
        Objects.equals(this.stateProvince, customerAddress.stateProvince) &&
        Objects.equals(this.city, customerAddress.city) &&
        Objects.equals(this.country, customerAddress.country) &&
        Objects.equals(this.phone, customerAddress.phone) &&
        Objects.equals(this.zipPostalCode, customerAddress.zipPostalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, street2, stateProvince, city, country, phone, zipPostalCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddress {\n");
    
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    stateProvince: ").append(toIndentedString(stateProvince)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    zipPostalCode: ").append(toIndentedString(zipPostalCode)).append("\n");
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

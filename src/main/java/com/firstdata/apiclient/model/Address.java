/*
 * First Data REST Payment API Specification
 * First Data REST API for payment features for 6.2.0 release
 *
 * OpenAPI spec version: 0.0.1
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.firstdata.apiclient.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Address
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class Address {
    @SerializedName("company")
    private String company = null;

    @SerializedName("address1")
    private String address1 = null;

    @SerializedName("address2")
    private String address2 = null;

    @SerializedName("locality")
    private String locality = null;

    @SerializedName("region")
    private String region = null;

    @SerializedName("postalCode")
    private String postalCode = null;

    @SerializedName("country")
    private String country = null;

    public Address company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Get company
     *
     * @return company
     **/
    @ApiModelProperty(value = "")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Address address1(String address1) {
        this.address1 = address1;
        return this;
    }

    /**
     * Get address1
     *
     * @return address1
     **/
    @ApiModelProperty(value = "")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public Address address2(String address2) {
        this.address2 = address2;
        return this;
    }

    /**
     * Get address2
     *
     * @return address2
     **/
    @ApiModelProperty(value = "")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Address locality(String locality) {
        this.locality = locality;
        return this;
    }

    /**
     * City or locality
     *
     * @return locality
     **/
    @ApiModelProperty(value = "City or locality")
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Address region(String region) {
        this.region = region;
        return this;
    }

    /**
     * State or province
     *
     * @return region
     **/
    @ApiModelProperty(value = "State or province")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * ZIP Code or postal code
     *
     * @return postalCode
     **/
    @ApiModelProperty(value = "ZIP Code or postal code")
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address country(String country) {
        this.country = country;
        return this;
    }

    /**
     * ISO-3166-1  ALPHA-2, ALPHA-3 or numeric
     *
     * @return country
     **/
    @ApiModelProperty(value = "ISO-3166-1  ALPHA-2, ALPHA-3 or numeric")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.company, address.company) &&
                Objects.equals(this.address1, address.address1) &&
                Objects.equals(this.address2, address.address2) &&
                Objects.equals(this.locality, address.locality) &&
                Objects.equals(this.region, address.region) &&
                Objects.equals(this.postalCode, address.postalCode) &&
                Objects.equals(this.country, address.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, address1, address2, locality, region, postalCode, country);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
        sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
        sb.append("    locality: ").append(toIndentedString(locality)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

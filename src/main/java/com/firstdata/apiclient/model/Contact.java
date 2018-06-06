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
 * Contact
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class Contact {
    @SerializedName("phone")
    private String phone = null;

    @SerializedName("mobilePhone")
    private String mobilePhone = null;

    @SerializedName("fax")
    private String fax = null;

    @SerializedName("email")
    private String email = null;

    public Contact phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Get phone
     *
     * @return phone
     **/
    @ApiModelProperty(value = "")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * Get mobilePhone
     *
     * @return mobilePhone
     **/
    @ApiModelProperty(value = "")
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Contact fax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Get fax
     *
     * @return fax
     **/
    @ApiModelProperty(value = "")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Contact email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @ApiModelProperty(value = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(this.phone, contact.phone) &&
                Objects.equals(this.mobilePhone, contact.mobilePhone) &&
                Objects.equals(this.fax, contact.fax) &&
                Objects.equals(this.email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, mobilePhone, fax, email);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contact {\n");

        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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


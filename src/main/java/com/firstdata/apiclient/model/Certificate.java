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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Certificate Signing Request (CSR) object
 */
@ApiModel(description = "Certificate Signing Request (CSR) object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class Certificate {
    @SerializedName("value")
    private String value = null;

    @SerializedName("appLabel")
    private String appLabel = null;

    @SerializedName("walletProvider")
    private String walletProvider = null;

    @SerializedName("permissions")
    private Permissions permissions = null;

    @SerializedName("status")
    private String status = null;

    public Certificate value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The certificate that is registered in a Wallet Provider
     *
     * @return value
     **/
    @ApiModelProperty(example = "Rft3dqrs56Blirls56a", required = true, value = "The certificate that is registered in a Wallet Provider")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Certificate appLabel(String appLabel) {
        this.appLabel = appLabel;
        return this;
    }

    /**
     * The Application Label in the Wallet Provider setup
     *
     * @return appLabel
     **/
    @ApiModelProperty(example = "com.merchant.one", required = true, value = "The Application Label in the Wallet Provider setup")
    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    public Certificate walletProvider(String walletProvider) {
        this.walletProvider = walletProvider;
        return this;
    }

    /**
     * The wallet type of the CSR
     *
     * @return walletProvider
     **/
    @ApiModelProperty(example = "APPLE_PAY", required = true, value = "The wallet type of the CSR")
    public String getWalletProvider() {
        return walletProvider;
    }

    public void setWalletProvider(String walletProvider) {
        this.walletProvider = walletProvider;
    }

    public Certificate permissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @ApiModelProperty(required = true, value = "")
    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Certificate status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the CSR
     *
     * @return status
     **/
    @ApiModelProperty(example = "ACTIVE", value = "The status of the CSR")
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
        Certificate certificate = (Certificate) o;
        return Objects.equals(this.value, certificate.value) &&
                Objects.equals(this.appLabel, certificate.appLabel) &&
                Objects.equals(this.walletProvider, certificate.walletProvider) &&
                Objects.equals(this.permissions, certificate.permissions) &&
                Objects.equals(this.status, certificate.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, appLabel, walletProvider, permissions, status);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Certificate {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    appLabel: ").append(toIndentedString(appLabel)).append("\n");
        sb.append("    walletProvider: ").append(toIndentedString(walletProvider)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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


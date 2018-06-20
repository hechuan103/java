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
 * Additional version-dependent information used to decrypt and verify the payment
 */
@ApiModel(description = "Additional version-dependent information used to decrypt and verify the payment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class ApplePayHeader {
    @SerializedName("applicationDataHash")
    private String applicationDataHash = null;

    @SerializedName("ephemeralPublicKey")
    private String ephemeralPublicKey = null;

    @SerializedName("publicKeyHash")
    private String publicKeyHash = null;

    @SerializedName("transactionId")
    private String transactionId = null;

    public ApplePayHeader applicationDataHash(String applicationDataHash) {
        this.applicationDataHash = applicationDataHash;
        return this;
    }

    /**
     * The hash of the applicationData property. The actual applicationData is part of the encrypted &#39;data&#39; element.
     *
     * @return applicationDataHash
     **/
    @ApiModelProperty(value = "The hash of the applicationData property. The actual applicationData is part of the encrypted 'data' element.")
    public String getApplicationDataHash() {
        return applicationDataHash;
    }

    public void setApplicationDataHash(String applicationDataHash) {
        this.applicationDataHash = applicationDataHash;
    }

    public ApplePayHeader ephemeralPublicKey(String ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
        return this;
    }

    /**
     * Temporary key for generating shared secret from a device
     *
     * @return ephemeralPublicKey
     **/
    @ApiModelProperty(value = "Temporary key for generating shared secret from a device")
    public String getEphemeralPublicKey() {
        return ephemeralPublicKey;
    }

    public void setEphemeralPublicKey(String ephemeralPublicKey) {
        this.ephemeralPublicKey = ephemeralPublicKey;
    }

    public ApplePayHeader publicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
        return this;
    }

    /**
     * Hash of the X.509 encoded public key bytes of the merchant’s certificate
     *
     * @return publicKeyHash
     **/
    @ApiModelProperty(value = "Hash of the X.509 encoded public key bytes of the merchant’s certificate")
    public String getPublicKeyHash() {
        return publicKeyHash;
    }

    public void setPublicKeyHash(String publicKeyHash) {
        this.publicKeyHash = publicKeyHash;
    }

    public ApplePayHeader transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Transaction identifier, generated on the device
     *
     * @return transactionId
     **/
    @ApiModelProperty(value = "Transaction identifier, generated on the device")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplePayHeader applePayHeader = (ApplePayHeader) o;
        return Objects.equals(this.applicationDataHash, applePayHeader.applicationDataHash) &&
                Objects.equals(this.ephemeralPublicKey, applePayHeader.ephemeralPublicKey) &&
                Objects.equals(this.publicKeyHash, applePayHeader.publicKeyHash) &&
                Objects.equals(this.transactionId, applePayHeader.transactionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationDataHash, ephemeralPublicKey, publicKeyHash, transactionId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplePayHeader {\n");

        sb.append("    applicationDataHash: ").append(toIndentedString(applicationDataHash)).append("\n");
        sb.append("    ephemeralPublicKey: ").append(toIndentedString(ephemeralPublicKey)).append("\n");
        sb.append("    publicKeyHash: ").append(toIndentedString(publicKeyHash)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
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

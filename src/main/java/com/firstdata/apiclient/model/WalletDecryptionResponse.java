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
 * Wallet decryption response
 */
@ApiModel(description = "Wallet decryption response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class WalletDecryptionResponse {
    @SerializedName("decryptedData")
    private WalletDecryptionResponseDecryptedData decryptedData = null;

    @SerializedName("error")
    private Error error = null;

    public WalletDecryptionResponse decryptedData(WalletDecryptionResponseDecryptedData decryptedData) {
        this.decryptedData = decryptedData;
        return this;
    }

    /**
     * Get decryptedData
     *
     * @return decryptedData
     **/
    @ApiModelProperty(value = "")
    public WalletDecryptionResponseDecryptedData getDecryptedData() {
        return decryptedData;
    }

    public void setDecryptedData(WalletDecryptionResponseDecryptedData decryptedData) {
        this.decryptedData = decryptedData;
    }

    public WalletDecryptionResponse error(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     *
     * @return error
     **/
    @ApiModelProperty(value = "")
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WalletDecryptionResponse walletDecryptionResponse = (WalletDecryptionResponse) o;
        return Objects.equals(this.decryptedData, walletDecryptionResponse.decryptedData) &&
                Objects.equals(this.error, walletDecryptionResponse.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decryptedData, error);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WalletDecryptionResponse {\n");

        sb.append("    decryptedData: ").append(toIndentedString(decryptedData)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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


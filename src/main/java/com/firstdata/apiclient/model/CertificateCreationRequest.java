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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * For Certificate Signing Request (CSR) generation
 */
@ApiModel(description = "For Certificate Signing Request (CSR) generation")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class CertificateCreationRequest {
    @SerializedName("appLabel")
    private String appLabel = null;

    /**
     * Wallet Providers that a certificate registered with
     */
    @JsonAdapter(WalletProviderEnum.Adapter.class)
    public enum WalletProviderEnum {
        APPLE_PAY("APPLE_PAY");

        private final String value;

        WalletProviderEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static WalletProviderEnum fromValue(String text) {
            for (WalletProviderEnum b : WalletProviderEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<WalletProviderEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final WalletProviderEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public WalletProviderEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return WalletProviderEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("walletProvider")
    private WalletProviderEnum walletProvider = null;

    @SerializedName("permissions")
    private Permissions permissions = null;

    public CertificateCreationRequest appLabel(String appLabel) {
        this.appLabel = appLabel;
        return this;
    }

    /**
     * The Application Label to identify apps registered with Wallet Providers
     *
     * @return appLabel
     **/
    @ApiModelProperty(example = "gma.merchantone.com.us", value = "The Application Label to identify apps registered with Wallet Providers")
    public String getAppLabel() {
        return appLabel;
    }

    public void setAppLabel(String appLabel) {
        this.appLabel = appLabel;
    }

    public CertificateCreationRequest walletProvider(WalletProviderEnum walletProvider) {
        this.walletProvider = walletProvider;
        return this;
    }

    /**
     * Wallet Providers that a certificate registered with
     *
     * @return walletProvider
     **/
    @ApiModelProperty(example = "APPLE_PAY", value = "Wallet Providers that a certificate registered with")
    public WalletProviderEnum getWalletProvider() {
        return walletProvider;
    }

    public void setWalletProvider(WalletProviderEnum walletProvider) {
        this.walletProvider = walletProvider;
    }

    public CertificateCreationRequest permissions(Permissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @ApiModelProperty(value = "")
    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CertificateCreationRequest certificateCreationRequest = (CertificateCreationRequest) o;
        return Objects.equals(this.appLabel, certificateCreationRequest.appLabel) &&
                Objects.equals(this.walletProvider, certificateCreationRequest.walletProvider) &&
                Objects.equals(this.permissions, certificateCreationRequest.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appLabel, walletProvider, permissions);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateCreationRequest {\n");

        sb.append("    appLabel: ").append(toIndentedString(appLabel)).append("\n");
        sb.append("    walletProvider: ").append(toIndentedString(walletProvider)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

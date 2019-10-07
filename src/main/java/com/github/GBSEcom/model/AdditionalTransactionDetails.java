/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.8.0.20190731.002
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
 * Additional transaction details for transaction response.
 */
@ApiModel(description = "Additional transaction details for transaction response.")

public class AdditionalTransactionDetails {
  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public static final String SERIALIZED_NAME_INVOICE_NUMBER = "invoiceNumber";
  @SerializedName(SERIALIZED_NAME_INVOICE_NUMBER)
  private String invoiceNumber;

  public static final String SERIALIZED_NAME_PURCHASE_ORDER_NUMBER = "purchaseOrderNumber";
  @SerializedName(SERIALIZED_NAME_PURCHASE_ORDER_NUMBER)
  private String purchaseOrderNumber;

  /**
   * The type of debit disbursement transaction.
   */
  @JsonAdapter(DisbursementTransTypeEnum.Adapter.class)
  public enum DisbursementTransTypeEnum {
    FUNDING("FUNDING"),
    
    DISBURSEMENT("DISBURSEMENT");

    private String value;

    DisbursementTransTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DisbursementTransTypeEnum fromValue(String text) {
      for (DisbursementTransTypeEnum b : DisbursementTransTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<DisbursementTransTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DisbursementTransTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DisbursementTransTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DisbursementTransTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_DISBURSEMENT_TRANS_TYPE = "disbursementTransType";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_TRANS_TYPE)
  private DisbursementTransTypeEnum disbursementTransType;

  /**
   * The wallet provider type.
   */
  @JsonAdapter(WalletProviderEnum.Adapter.class)
  public enum WalletProviderEnum {
    GOOGLE_PAY("GOOGLE_PAY"),
    
    APPLE_PAY("APPLE_PAY"),
    
    SAMSUNG_PAY("SAMSUNG_PAY");

    private String value;

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
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

  public static final String SERIALIZED_NAME_WALLET_PROVIDER = "walletProvider";
  @SerializedName(SERIALIZED_NAME_WALLET_PROVIDER)
  private WalletProviderEnum walletProvider;

  public AdditionalTransactionDetails comments(String comments) {
    this.comments = comments;
    return this;
  }

   /**
   * Comment for the payment.
   * @return comments
  **/
  @ApiModelProperty(example = "This is a comment", value = "Comment for the payment.")
  public String getComments() {
    return comments;
  }

  public void setComments(String comments) {
    this.comments = comments;
  }

  public AdditionalTransactionDetails invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number.
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "551294633441", value = "Invoice number.")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public AdditionalTransactionDetails purchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
    return this;
  }

   /**
   * Purchase order number.
   * @return purchaseOrderNumber
  **/
  @ApiModelProperty(example = "1223456", value = "Purchase order number.")
  public String getPurchaseOrderNumber() {
    return purchaseOrderNumber;
  }

  public void setPurchaseOrderNumber(String purchaseOrderNumber) {
    this.purchaseOrderNumber = purchaseOrderNumber;
  }

  public AdditionalTransactionDetails disbursementTransType(DisbursementTransTypeEnum disbursementTransType) {
    this.disbursementTransType = disbursementTransType;
    return this;
  }

   /**
   * The type of debit disbursement transaction.
   * @return disbursementTransType
  **/
  @ApiModelProperty(example = "FUNDING", value = "The type of debit disbursement transaction.")
  public DisbursementTransTypeEnum getDisbursementTransType() {
    return disbursementTransType;
  }

  public void setDisbursementTransType(DisbursementTransTypeEnum disbursementTransType) {
    this.disbursementTransType = disbursementTransType;
  }

  public AdditionalTransactionDetails walletProvider(WalletProviderEnum walletProvider) {
    this.walletProvider = walletProvider;
    return this;
  }

   /**
   * The wallet provider type.
   * @return walletProvider
  **/
  @ApiModelProperty(example = "APPLE_PAY", value = "The wallet provider type.")
  public WalletProviderEnum getWalletProvider() {
    return walletProvider;
  }

  public void setWalletProvider(WalletProviderEnum walletProvider) {
    this.walletProvider = walletProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdditionalTransactionDetails additionalTransactionDetails = (AdditionalTransactionDetails) o;
    return Objects.equals(this.comments, additionalTransactionDetails.comments) &&
        Objects.equals(this.invoiceNumber, additionalTransactionDetails.invoiceNumber) &&
        Objects.equals(this.purchaseOrderNumber, additionalTransactionDetails.purchaseOrderNumber) &&
        Objects.equals(this.disbursementTransType, additionalTransactionDetails.disbursementTransType) &&
        Objects.equals(this.walletProvider, additionalTransactionDetails.walletProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comments, invoiceNumber, purchaseOrderNumber, disbursementTransType, walletProvider);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalTransactionDetails {\n");
    
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    purchaseOrderNumber: ").append(toIndentedString(purchaseOrderNumber)).append("\n");
    sb.append("    disbursementTransType: ").append(toIndentedString(disbursementTransType)).append("\n");
    sb.append("    walletProvider: ").append(toIndentedString(walletProvider)).append("\n");
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


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
import com.github.GBSEcom.model.CardFunction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Card information.
 */
@ApiModel(description = "Card information.")

public class CardInfo {
  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_BRAND_PRODUCT_ID = "brandProductId";
  @SerializedName(SERIALIZED_NAME_BRAND_PRODUCT_ID)
  private String brandProductId;

  public static final String SERIALIZED_NAME_CARD_FUNCTION = "cardFunction";
  @SerializedName(SERIALIZED_NAME_CARD_FUNCTION)
  private CardFunction cardFunction = null;

  /**
   * Indicates whether it is a corporate or non-corporate card.
   */
  @JsonAdapter(CommercialCardEnum.Adapter.class)
  public enum CommercialCardEnum {
    CORPORATE("CORPORATE"),
    
    NON_CORPORATE("NON_CORPORATE");

    private String value;

    CommercialCardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CommercialCardEnum fromValue(String text) {
      for (CommercialCardEnum b : CommercialCardEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<CommercialCardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CommercialCardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CommercialCardEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CommercialCardEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_COMMERCIAL_CARD = "commercialCard";
  @SerializedName(SERIALIZED_NAME_COMMERCIAL_CARD)
  private CommercialCardEnum commercialCard;

  public static final String SERIALIZED_NAME_ISSUER_COUNTRY = "issuerCountry";
  @SerializedName(SERIALIZED_NAME_ISSUER_COUNTRY)
  private String issuerCountry;

  public static final String SERIALIZED_NAME_ISSUER_NAME = "issuerName";
  @SerializedName(SERIALIZED_NAME_ISSUER_NAME)
  private String issuerName;

  public CardInfo brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * The card brand.
   * @return brand
  **/
  @ApiModelProperty(example = "VISA", value = "The card brand.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public CardInfo brandProductId(String brandProductId) {
    this.brandProductId = brandProductId;
    return this;
  }

   /**
   * The product ID of the brand.
   * @return brandProductId
  **/
  @ApiModelProperty(example = "VISA BUSINESS", value = "The product ID of the brand.")
  public String getBrandProductId() {
    return brandProductId;
  }

  public void setBrandProductId(String brandProductId) {
    this.brandProductId = brandProductId;
  }

  public CardInfo cardFunction(CardFunction cardFunction) {
    this.cardFunction = cardFunction;
    return this;
  }

   /**
   * Get cardFunction
   * @return cardFunction
  **/
  @ApiModelProperty(value = "")
  public CardFunction getCardFunction() {
    return cardFunction;
  }

  public void setCardFunction(CardFunction cardFunction) {
    this.cardFunction = cardFunction;
  }

  public CardInfo commercialCard(CommercialCardEnum commercialCard) {
    this.commercialCard = commercialCard;
    return this;
  }

   /**
   * Indicates whether it is a corporate or non-corporate card.
   * @return commercialCard
  **/
  @ApiModelProperty(example = "CORPORATE", value = "Indicates whether it is a corporate or non-corporate card.")
  public CommercialCardEnum getCommercialCard() {
    return commercialCard;
  }

  public void setCommercialCard(CommercialCardEnum commercialCard) {
    this.commercialCard = commercialCard;
  }

  public CardInfo issuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
    return this;
  }

   /**
   * The country of the issuer.
   * @return issuerCountry
  **/
  @ApiModelProperty(example = "DE", value = "The country of the issuer.")
  public String getIssuerCountry() {
    return issuerCountry;
  }

  public void setIssuerCountry(String issuerCountry) {
    this.issuerCountry = issuerCountry;
  }

  public CardInfo issuerName(String issuerName) {
    this.issuerName = issuerName;
    return this;
  }

   /**
   * The name of the issuer.
   * @return issuerName
  **/
  @ApiModelProperty(example = "First National Bank of Omaha", value = "The name of the issuer.")
  public String getIssuerName() {
    return issuerName;
  }

  public void setIssuerName(String issuerName) {
    this.issuerName = issuerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardInfo cardInfo = (CardInfo) o;
    return Objects.equals(this.brand, cardInfo.brand) &&
        Objects.equals(this.brandProductId, cardInfo.brandProductId) &&
        Objects.equals(this.cardFunction, cardInfo.cardFunction) &&
        Objects.equals(this.commercialCard, cardInfo.commercialCard) &&
        Objects.equals(this.issuerCountry, cardInfo.issuerCountry) &&
        Objects.equals(this.issuerName, cardInfo.issuerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, brandProductId, cardFunction, commercialCard, issuerCountry, issuerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardInfo {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    brandProductId: ").append(toIndentedString(brandProductId)).append("\n");
    sb.append("    cardFunction: ").append(toIndentedString(cardFunction)).append("\n");
    sb.append("    commercialCard: ").append(toIndentedString(commercialCard)).append("\n");
    sb.append("    issuerCountry: ").append(toIndentedString(issuerCountry)).append("\n");
    sb.append("    issuerName: ").append(toIndentedString(issuerName)).append("\n");
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


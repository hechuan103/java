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
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * PaymentCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class PaymentCard {
    @SerializedName("number")
    private String number = null;

    @SerializedName("expiryDate")
    private Expiration expiryDate = null;

    @SerializedName("cardCodeValue")
    private String cardCodeValue = null;

    /**
     * Gets or Sets cardFunction
     */
    @JsonAdapter(CardFunctionEnum.Adapter.class)
    public enum CardFunctionEnum {
        CREDIT("CREDIT"),

        DEBIT("DEBIT");

        private final String value;

        CardFunctionEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static CardFunctionEnum fromValue(String text) {
            for (CardFunctionEnum b : CardFunctionEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<CardFunctionEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final CardFunctionEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public CardFunctionEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return CardFunctionEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("cardFunction")
    private CardFunctionEnum cardFunction = CardFunctionEnum.CREDIT;

    @SerializedName("cardholderName")
    private String cardholderName = null;

    @SerializedName("authenticationRequest")
    private PaymentCardAuthenticationRequest authenticationRequest = null;

    @SerializedName("brand")
    private String brand = null;

    @SerializedName("authenticationResult")
    private AuthenticationResult authenticationResult = null;

    @SerializedName("enableTokenization")
    private Boolean enableTokenization = null;

    public PaymentCard number(String number) {
        this.number = number;
        return this;
    }

    /**
     * Payment card number, including credit/debit card number or digital PAN
     *
     * @return number
     **/
    @ApiModelProperty(example = "4035874000424977", required = true, value = "Payment card number, including credit/debit card number or digital PAN")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PaymentCard expiryDate(Expiration expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * Get expiryDate
     *
     * @return expiryDate
     **/
    @ApiModelProperty(value = "")
    public Expiration getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Expiration expiryDate) {
        this.expiryDate = expiryDate;
    }

    public PaymentCard cardCodeValue(String cardCodeValue) {
        this.cardCodeValue = cardCodeValue;
        return this;
    }

    /**
     * CVV or CCV value
     *
     * @return cardCodeValue
     **/
    @ApiModelProperty(example = "977", value = "CVV or CCV value")
    public String getCardCodeValue() {
        return cardCodeValue;
    }

    public void setCardCodeValue(String cardCodeValue) {
        this.cardCodeValue = cardCodeValue;
    }

    public PaymentCard cardFunction(CardFunctionEnum cardFunction) {
        this.cardFunction = cardFunction;
        return this;
    }

    /**
     * Get cardFunction
     *
     * @return cardFunction
     **/
    @ApiModelProperty(value = "")
    public CardFunctionEnum getCardFunction() {
        return cardFunction;
    }

    public void setCardFunction(CardFunctionEnum cardFunction) {
        this.cardFunction = cardFunction;
    }

    public PaymentCard cardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
        return this;
    }

    /**
     * Get cardholderName
     *
     * @return cardholderName
     **/
    @ApiModelProperty(example = "John Doe", value = "")
    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public PaymentCard authenticationRequest(PaymentCardAuthenticationRequest authenticationRequest) {
        this.authenticationRequest = authenticationRequest;
        return this;
    }

    /**
     * Get authenticationRequest
     *
     * @return authenticationRequest
     **/
    @ApiModelProperty(value = "")
    public PaymentCardAuthenticationRequest getAuthenticationRequest() {
        return authenticationRequest;
    }

    public void setAuthenticationRequest(PaymentCardAuthenticationRequest authenticationRequest) {
        this.authenticationRequest = authenticationRequest;
    }

    public PaymentCard brand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * Optional, required only if using dual-branded card
     *
     * @return brand
     **/
    @ApiModelProperty(example = "VISA", value = "Optional, required only if using dual-branded card")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public PaymentCard authenticationResult(AuthenticationResult authenticationResult) {
        this.authenticationResult = authenticationResult;
        return this;
    }

    /**
     * Get authenticationResult
     *
     * @return authenticationResult
     **/
    @ApiModelProperty(value = "")
    public AuthenticationResult getAuthenticationResult() {
        return authenticationResult;
    }

    public void setAuthenticationResult(AuthenticationResult authenticationResult) {
        this.authenticationResult = authenticationResult;
    }

    public PaymentCard enableTokenization(Boolean enableTokenization) {
        this.enableTokenization = enableTokenization;
        return this;
    }

    /**
     * Whether the Gateway shall tokenize the card while performing payment transaction
     *
     * @return enableTokenization
     **/
    @ApiModelProperty(value = "Whether the Gateway shall tokenize the card while performing payment transaction")
    public Boolean isEnableTokenization() {
        return enableTokenization;
    }

    public void setEnableTokenization(Boolean enableTokenization) {
        this.enableTokenization = enableTokenization;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PaymentCard paymentCard = (PaymentCard) o;
        return Objects.equals(this.number, paymentCard.number) &&
                Objects.equals(this.expiryDate, paymentCard.expiryDate) &&
                Objects.equals(this.cardCodeValue, paymentCard.cardCodeValue) &&
                Objects.equals(this.cardFunction, paymentCard.cardFunction) &&
                Objects.equals(this.cardholderName, paymentCard.cardholderName) &&
                Objects.equals(this.authenticationRequest, paymentCard.authenticationRequest) &&
                Objects.equals(this.brand, paymentCard.brand) &&
                Objects.equals(this.authenticationResult, paymentCard.authenticationResult) &&
                Objects.equals(this.enableTokenization, paymentCard.enableTokenization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, expiryDate, cardCodeValue, cardFunction, cardholderName, authenticationRequest, brand, authenticationResult, enableTokenization);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentCard {\n");

        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    cardCodeValue: ").append(toIndentedString(cardCodeValue)).append("\n");
        sb.append("    cardFunction: ").append(toIndentedString(cardFunction)).append("\n");
        sb.append("    cardholderName: ").append(toIndentedString(cardholderName)).append("\n");
        sb.append("    authenticationRequest: ").append(toIndentedString(authenticationRequest)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    authenticationResult: ").append(toIndentedString(authenticationResult)).append("\n");
        sb.append("    enableTokenization: ").append(toIndentedString(enableTokenization)).append("\n");
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


/*
 * Payment Gateway API Specification
 * Payment Gateway API for payment processing. 
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.firstdata.firstapi.model;

import java.util.Objects;
import com.firstdata.firstapi.model.PayPal;
import com.firstdata.firstapi.model.PaymentCard;
import com.firstdata.firstapi.model.Sepa;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PaymentMethod
 */

public class PaymentMethod {
  /**
   * The type of payment method. Note that PayPal can only process a &#39;Credit&#39;  primary transaction with Order.Billing.Contact.email being mandatory. PayPal secondary transactions (void/return/postauth) are processed the same as any other secondary transactions.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PAYMENT_CARD("PAYMENT_CARD"),
    
    SEPA("SEPA"),
    
    PAYPAL("PAYPAL");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("paymentCard")
  private PaymentCard paymentCard = null;

  @SerializedName("sepa")
  private Sepa sepa = null;

  @SerializedName("payPal")
  private PayPal payPal = null;

  public PaymentMethod type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of payment method. Note that PayPal can only process a &#39;Credit&#39;  primary transaction with Order.Billing.Contact.email being mandatory. PayPal secondary transactions (void/return/postauth) are processed the same as any other secondary transactions.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of payment method. Note that PayPal can only process a 'Credit'  primary transaction with Order.Billing.Contact.email being mandatory. PayPal secondary transactions (void/return/postauth) are processed the same as any other secondary transactions.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PaymentMethod paymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
    return this;
  }

   /**
   * Get paymentCard
   * @return paymentCard
  **/
  @ApiModelProperty(value = "")
  public PaymentCard getPaymentCard() {
    return paymentCard;
  }

  public void setPaymentCard(PaymentCard paymentCard) {
    this.paymentCard = paymentCard;
  }

  public PaymentMethod sepa(Sepa sepa) {
    this.sepa = sepa;
    return this;
  }

   /**
   * Get sepa
   * @return sepa
  **/
  @ApiModelProperty(value = "")
  public Sepa getSepa() {
    return sepa;
  }

  public void setSepa(Sepa sepa) {
    this.sepa = sepa;
  }

  public PaymentMethod payPal(PayPal payPal) {
    this.payPal = payPal;
    return this;
  }

   /**
   * Get payPal
   * @return payPal
  **/
  @ApiModelProperty(value = "")
  public PayPal getPayPal() {
    return payPal;
  }

  public void setPayPal(PayPal payPal) {
    this.payPal = payPal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethod paymentMethod = (PaymentMethod) o;
    return Objects.equals(this.type, paymentMethod.type) &&
        Objects.equals(this.paymentCard, paymentMethod.paymentCard) &&
        Objects.equals(this.sepa, paymentMethod.sepa) &&
        Objects.equals(this.payPal, paymentMethod.payPal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, paymentCard, sepa, payPal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethod {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentCard: ").append(toIndentedString(paymentCard)).append("\n");
    sb.append("    sepa: ").append(toIndentedString(sepa)).append("\n");
    sb.append("    payPal: ").append(toIndentedString(payPal)).append("\n");
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


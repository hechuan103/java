/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.6.0.20190329.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.Authentication;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Submit the result of the authentication managed outside of the gateway. For more convenient usage without implementing 3-D Secure yourself see \&quot;authenticationRequest\&quot; section.
 */
@ApiModel(description = "Submit the result of the authentication managed outside of the gateway. For more convenient usage without implementing 3-D Secure yourself see \"authenticationRequest\" section.")

public class Secure3dAuthenticationResult extends Authentication {
  /**
   * Card enrollment result from the Verification Response (VeRes).
   */
  @JsonAdapter(VerificationResponseEnum.Adapter.class)
  public enum VerificationResponseEnum {
    Y("Y"),
    
    N("N"),
    
    U("U");

    private String value;

    VerificationResponseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VerificationResponseEnum fromValue(String text) {
      for (VerificationResponseEnum b : VerificationResponseEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<VerificationResponseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VerificationResponseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VerificationResponseEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return VerificationResponseEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_VERIFICATION_RESPONSE = "verificationResponse";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_RESPONSE)
  private VerificationResponseEnum verificationResponse;

  /**
   * Result of authentication attempt from Payer Authentication Response (PaRes).
   */
  @JsonAdapter(AuthenticationAttemptResultEnum.Adapter.class)
  public enum AuthenticationAttemptResultEnum {
    Y("Y"),
    
    N("N"),
    
    U("U"),
    
    A("A");

    private String value;

    AuthenticationAttemptResultEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthenticationAttemptResultEnum fromValue(String text) {
      for (AuthenticationAttemptResultEnum b : AuthenticationAttemptResultEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<AuthenticationAttemptResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthenticationAttemptResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthenticationAttemptResultEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AuthenticationAttemptResultEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHENTICATION_ATTEMPT_RESULT = "authenticationAttemptResult";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_ATTEMPT_RESULT)
  private AuthenticationAttemptResultEnum authenticationAttemptResult;

  public static final String SERIALIZED_NAME_AUTHENTICATION_VALUE = "authenticationValue";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_VALUE)
  private String authenticationValue;

  public static final String SERIALIZED_NAME_XID = "xid";
  @SerializedName(SERIALIZED_NAME_XID)
  private String xid;

  public Secure3dAuthenticationResult verificationResponse(VerificationResponseEnum verificationResponse) {
    this.verificationResponse = verificationResponse;
    return this;
  }

   /**
   * Card enrollment result from the Verification Response (VeRes).
   * @return verificationResponse
  **/
  @ApiModelProperty(example = "N", value = "Card enrollment result from the Verification Response (VeRes).")
  public VerificationResponseEnum getVerificationResponse() {
    return verificationResponse;
  }

  public void setVerificationResponse(VerificationResponseEnum verificationResponse) {
    this.verificationResponse = verificationResponse;
  }

  public Secure3dAuthenticationResult authenticationAttemptResult(AuthenticationAttemptResultEnum authenticationAttemptResult) {
    this.authenticationAttemptResult = authenticationAttemptResult;
    return this;
  }

   /**
   * Result of authentication attempt from Payer Authentication Response (PaRes).
   * @return authenticationAttemptResult
  **/
  @ApiModelProperty(example = "Y", value = "Result of authentication attempt from Payer Authentication Response (PaRes).")
  public AuthenticationAttemptResultEnum getAuthenticationAttemptResult() {
    return authenticationAttemptResult;
  }

  public void setAuthenticationAttemptResult(AuthenticationAttemptResultEnum authenticationAttemptResult) {
    this.authenticationAttemptResult = authenticationAttemptResult;
  }

  public Secure3dAuthenticationResult authenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
    return this;
  }

   /**
   * The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase.
   * @return authenticationValue
  **/
  @ApiModelProperty(example = "343jkldjfal...3242", value = "The Cardholder Authentication Verification Value (CAVV) is a cryptographic value derived by the issuer during payment authentication that can provide evidence of the results of payment authentication during an online purchase.")
  public String getAuthenticationValue() {
    return authenticationValue;
  }

  public void setAuthenticationValue(String authenticationValue) {
    this.authenticationValue = authenticationValue;
  }

  public Secure3dAuthenticationResult xid(String xid) {
    this.xid = xid;
    return this;
  }

   /**
   * The transaction identifier (XID) is a unique tracking number set by the merchant.
   * @return xid
  **/
  @ApiModelProperty(example = "aDAzYXVBT2d...GV6RE5MbjA=", value = "The transaction identifier (XID) is a unique tracking number set by the merchant.")
  public String getXid() {
    return xid;
  }

  public void setXid(String xid) {
    this.xid = xid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Secure3dAuthenticationResult secure3dAuthenticationResult = (Secure3dAuthenticationResult) o;
    return Objects.equals(this.verificationResponse, secure3dAuthenticationResult.verificationResponse) &&
        Objects.equals(this.authenticationAttemptResult, secure3dAuthenticationResult.authenticationAttemptResult) &&
        Objects.equals(this.authenticationValue, secure3dAuthenticationResult.authenticationValue) &&
        Objects.equals(this.xid, secure3dAuthenticationResult.xid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationResponse, authenticationAttemptResult, authenticationValue, xid, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Secure3dAuthenticationResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    verificationResponse: ").append(toIndentedString(verificationResponse)).append("\n");
    sb.append("    authenticationAttemptResult: ").append(toIndentedString(authenticationAttemptResult)).append("\n");
    sb.append("    authenticationValue: ").append(toIndentedString(authenticationValue)).append("\n");
    sb.append("    xid: ").append(toIndentedString(xid)).append("\n");
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

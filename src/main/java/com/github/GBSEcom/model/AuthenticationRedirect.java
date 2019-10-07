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
import com.github.GBSEcom.model.AuthenticationRedirectParams;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Authentication redirect details.
 */
@ApiModel(description = "Authentication redirect details.")

public class AuthenticationRedirect {
  /**
   * The type of authentication.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SECURE_3D("SECURE_3D");

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
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
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

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_TARGET_URL = "targetUrl";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private AuthenticationRedirectParams params = null;

  public AuthenticationRedirect type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of authentication.
   * @return type
  **/
  @ApiModelProperty(example = "SECURE_3D", value = "The type of authentication.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AuthenticationRedirect targetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * The URL for the authentication redirect for the merchant.
   * @return targetUrl
  **/
  @ApiModelProperty(example = "https://3ds-acs.test.modirum.com/mdpayacs/pareq", value = "The URL for the authentication redirect for the merchant.")
  public String getTargetUrl() {
    return targetUrl;
  }

  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }

  public AuthenticationRedirect params(AuthenticationRedirectParams params) {
    this.params = params;
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(value = "")
  public AuthenticationRedirectParams getParams() {
    return params;
  }

  public void setParams(AuthenticationRedirectParams params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationRedirect authenticationRedirect = (AuthenticationRedirect) o;
    return Objects.equals(this.type, authenticationRedirect.type) &&
        Objects.equals(this.targetUrl, authenticationRedirect.targetUrl) &&
        Objects.equals(this.params, authenticationRedirect.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, targetUrl, params);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationRedirect {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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


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
 * AuthenticationResponseVerification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class AuthenticationResponseVerification {
    /**
     * Gets or Sets type
     */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        SECURE_3D("SECURE_3D");

        private final String value;

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

    @SerializedName("MD")
    private String MD = null;

    @SerializedName("PaRes")
    private String paRes = null;

    public AuthenticationResponseVerification type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @ApiModelProperty(value = "")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public AuthenticationResponseVerification MD(String MD) {
        this.MD = MD;
        return this;
    }

    /**
     * Get MD
     *
     * @return MD
     **/
    @ApiModelProperty(value = "")
    public String getMD() {
        return MD;
    }

    public void setMD(String MD) {
        this.MD = MD;
    }

    public AuthenticationResponseVerification paRes(String paRes) {
        this.paRes = paRes;
        return this;
    }

    /**
     * Get paRes
     *
     * @return paRes
     **/
    @ApiModelProperty(value = "")
    public String getPaRes() {
        return paRes;
    }

    public void setPaRes(String paRes) {
        this.paRes = paRes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticationResponseVerification authenticationResponseVerification = (AuthenticationResponseVerification) o;
        return Objects.equals(this.type, authenticationResponseVerification.type) &&
                Objects.equals(this.MD, authenticationResponseVerification.MD) &&
                Objects.equals(this.paRes, authenticationResponseVerification.paRes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, MD, paRes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticationResponseVerification {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    MD: ").append(toIndentedString(MD)).append("\n");
        sb.append("    paRes: ").append(toIndentedString(paRes)).append("\n");
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


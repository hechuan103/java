/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * OpenAPI spec version: 6.9.1.20191223.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Type of transaction to perform. Primary transaction types in requests include &#39;SALE&#39;, &#39;PREAUTH&#39;, &#39;CREDIT&#39; and &#39;FORCED_TICKET&#39;.
 */
@JsonAdapter(TransactionType.Adapter.class)
public enum TransactionType {
  
  SALE("SALE"),
  
  PREAUTH("PREAUTH"),
  
  CREDIT("CREDIT"),
  
  FORCED_TICKET("FORCED_TICKET"),
  
  VOID("VOID"),
  
  RETURN("RETURN"),
  
  POSTAUTH("POSTAUTH"),
  
  PAYER_AUTH("PAYER_AUTH"),
  
  DISBURSEMENT("DISBURSEMENT");

  private String value;

  TransactionType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionType fromValue(String text) {
    for (TransactionType b : TransactionType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionType> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionType.fromValue(String.valueOf(value));
    }
  }
}


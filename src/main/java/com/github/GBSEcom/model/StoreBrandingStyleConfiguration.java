/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.12.0.20200605.001
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.ClassicMode;
import com.github.GBSEcom.model.CombinedMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StoreBrandingStyleConfiguration
 */

public class StoreBrandingStyleConfiguration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_COMBINED = "combined";
  @SerializedName(SERIALIZED_NAME_COMBINED)
  private CombinedMode combined;

  public static final String SERIALIZED_NAME_CLASSIC = "classic";
  @SerializedName(SERIALIZED_NAME_CLASSIC)
  private ClassicMode classic;


  public StoreBrandingStyleConfiguration id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * An optional outlet id for clients that support multiple stores in the same developer app.
   * @return id
  **/
  @ApiModelProperty(example = "12345500000", required = true, value = "An optional outlet id for clients that support multiple stores in the same developer app.")

  public String getId() {
    return id;
  }



  public void setId(String id) {
    this.id = id;
  }


  public StoreBrandingStyleConfiguration combined(CombinedMode combined) {
    
    this.combined = combined;
    return this;
  }

   /**
   * Get combined
   * @return combined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CombinedMode getCombined() {
    return combined;
  }



  public void setCombined(CombinedMode combined) {
    this.combined = combined;
  }


  public StoreBrandingStyleConfiguration classic(ClassicMode classic) {
    
    this.classic = classic;
    return this;
  }

   /**
   * Get classic
   * @return classic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ClassicMode getClassic() {
    return classic;
  }



  public void setClassic(ClassicMode classic) {
    this.classic = classic;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreBrandingStyleConfiguration storeBrandingStyleConfiguration = (StoreBrandingStyleConfiguration) o;
    return Objects.equals(this.id, storeBrandingStyleConfiguration.id) &&
        Objects.equals(this.combined, storeBrandingStyleConfiguration.combined) &&
        Objects.equals(this.classic, storeBrandingStyleConfiguration.classic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, combined, classic);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreBrandingStyleConfiguration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    combined: ").append(toIndentedString(combined)).append("\n");
    sb.append("    classic: ").append(toIndentedString(classic)).append("\n");
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


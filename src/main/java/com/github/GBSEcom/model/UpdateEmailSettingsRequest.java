/*
 * Payment Gateway API Specification.
 * The documentation here is designed to provide all of the technical guidance required to consume and integrate with our APIs for payment processing. To learn more about our APIs please visit https://docs.firstdata.com/org/gateway.
 *
 * The version of the OpenAPI document: 6.8.0.20190731.002
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.GBSEcom.model;

import java.util.Objects;
import java.util.Arrays;
import com.github.GBSEcom.model.StoreEmailSettings;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Provide an information for email settings.
 */
@ApiModel(description = "Provide an information for email settings.")

public class UpdateEmailSettingsRequest {
  public static final String SERIALIZED_NAME_STORES = "stores";
  @SerializedName(SERIALIZED_NAME_STORES)
  private List<StoreEmailSettings> stores = new ArrayList<>();


  public UpdateEmailSettingsRequest stores(List<StoreEmailSettings> stores) {
    
    this.stores = stores;
    return this;
  }

  public UpdateEmailSettingsRequest addStoresItem(StoreEmailSettings storesItem) {
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Get stores
   * @return stores
  **/
  @ApiModelProperty(required = true, value = "")

  public List<StoreEmailSettings> getStores() {
    return stores;
  }



  public void setStores(List<StoreEmailSettings> stores) {
    this.stores = stores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateEmailSettingsRequest updateEmailSettingsRequest = (UpdateEmailSettingsRequest) o;
    return Objects.equals(this.stores, updateEmailSettingsRequest.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateEmailSettingsRequest {\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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

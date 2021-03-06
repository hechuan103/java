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
import com.github.GBSEcom.model.StoreUrlConfiguration;
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
 * Request to create or update notification and success/failure URLs for store.
 */
@ApiModel(description = "Request to create or update notification and success/failure URLs for store.")

public class StoreUrlConfigurationRequest {
  public static final String SERIALIZED_NAME_STORES = "stores";
  @SerializedName(SERIALIZED_NAME_STORES)
  private List<StoreUrlConfiguration> stores = null;


  public StoreUrlConfigurationRequest stores(List<StoreUrlConfiguration> stores) {
    
    this.stores = stores;
    return this;
  }

  public StoreUrlConfigurationRequest addStoresItem(StoreUrlConfiguration storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * Get stores
   * @return stores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"id\":\"12099500088\",\"responseFailureUrl\":\"https://www.firstdata.com/failure\",\"skipResultPageForSuccess\":\"true\",\"skipResultPageForFailure\":\"true\",\"overwriteUrlAllowed\":\"false\"},{\"id\":\"12099500044\",\"transactionNotificationUrl\":\"https://ipg-dev-1.1dc.com/webshop/transactionNotification\",\"recurringTransactionNotificationUrl\":\"https://ipg-dev-1.1dc.com/webshop/transactionNotification\",\"responseSuccessUrl\":\"https://www.firstdata.com/success\"}]", value = "")

  public List<StoreUrlConfiguration> getStores() {
    return stores;
  }



  public void setStores(List<StoreUrlConfiguration> stores) {
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
    StoreUrlConfigurationRequest storeUrlConfigurationRequest = (StoreUrlConfigurationRequest) o;
    return Objects.equals(this.stores, storeUrlConfigurationRequest.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stores);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreUrlConfigurationRequest {\n");
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


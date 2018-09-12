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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * AirlineTravelRoute
 */

public class AirlineTravelRoute {
  @SerializedName("departureDate")
  private LocalDate departureDate = null;

  @SerializedName("origin")
  private String origin = null;

  @SerializedName("destination")
  private String destination = null;

  @SerializedName("carrierCode")
  private String carrierCode = null;

  @SerializedName("serviceClass")
  private String serviceClass = null;

  /**
   * Gets or Sets stopoverType
   */
  @JsonAdapter(StopoverTypeEnum.Adapter.class)
  public enum StopoverTypeEnum {
    DIRECT("DIRECT"),
    
    STOPOVER("STOPOVER");

    private String value;

    StopoverTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StopoverTypeEnum fromValue(String text) {
      for (StopoverTypeEnum b : StopoverTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StopoverTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StopoverTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StopoverTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StopoverTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stopoverType")
  private StopoverTypeEnum stopoverType = null;

  @SerializedName("fareBasisCode")
  private String fareBasisCode = null;

  @SerializedName("departureTax")
  private BigDecimal departureTax = null;

  @SerializedName("flightNumber")
  private String flightNumber = null;

  public AirlineTravelRoute departureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
    return this;
  }

   /**
   * Date of departure
   * @return departureDate
  **/
  @ApiModelProperty(example = "2018-01-28", value = "Date of departure")
  public LocalDate getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(LocalDate departureDate) {
    this.departureDate = departureDate;
  }

  public AirlineTravelRoute origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @ApiModelProperty(value = "")
  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public AirlineTravelRoute destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Get destination
   * @return destination
  **/
  @ApiModelProperty(value = "")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public AirlineTravelRoute carrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
    return this;
  }

   /**
   * Get carrierCode
   * @return carrierCode
  **/
  @ApiModelProperty(value = "")
  public String getCarrierCode() {
    return carrierCode;
  }

  public void setCarrierCode(String carrierCode) {
    this.carrierCode = carrierCode;
  }

  public AirlineTravelRoute serviceClass(String serviceClass) {
    this.serviceClass = serviceClass;
    return this;
  }

   /**
   * Get serviceClass
   * @return serviceClass
  **/
  @ApiModelProperty(value = "")
  public String getServiceClass() {
    return serviceClass;
  }

  public void setServiceClass(String serviceClass) {
    this.serviceClass = serviceClass;
  }

  public AirlineTravelRoute stopoverType(StopoverTypeEnum stopoverType) {
    this.stopoverType = stopoverType;
    return this;
  }

   /**
   * Get stopoverType
   * @return stopoverType
  **/
  @ApiModelProperty(value = "")
  public StopoverTypeEnum getStopoverType() {
    return stopoverType;
  }

  public void setStopoverType(StopoverTypeEnum stopoverType) {
    this.stopoverType = stopoverType;
  }

  public AirlineTravelRoute fareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
    return this;
  }

   /**
   * Get fareBasisCode
   * @return fareBasisCode
  **/
  @ApiModelProperty(value = "")
  public String getFareBasisCode() {
    return fareBasisCode;
  }

  public void setFareBasisCode(String fareBasisCode) {
    this.fareBasisCode = fareBasisCode;
  }

  public AirlineTravelRoute departureTax(BigDecimal departureTax) {
    this.departureTax = departureTax;
    return this;
  }

   /**
   * Get departureTax
   * maximum: 999999999999
   * @return departureTax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDepartureTax() {
    return departureTax;
  }

  public void setDepartureTax(BigDecimal departureTax) {
    this.departureTax = departureTax;
  }

  public AirlineTravelRoute flightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
    return this;
  }

   /**
   * Get flightNumber
   * @return flightNumber
  **/
  @ApiModelProperty(value = "")
  public String getFlightNumber() {
    return flightNumber;
  }

  public void setFlightNumber(String flightNumber) {
    this.flightNumber = flightNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirlineTravelRoute airlineTravelRoute = (AirlineTravelRoute) o;
    return Objects.equals(this.departureDate, airlineTravelRoute.departureDate) &&
        Objects.equals(this.origin, airlineTravelRoute.origin) &&
        Objects.equals(this.destination, airlineTravelRoute.destination) &&
        Objects.equals(this.carrierCode, airlineTravelRoute.carrierCode) &&
        Objects.equals(this.serviceClass, airlineTravelRoute.serviceClass) &&
        Objects.equals(this.stopoverType, airlineTravelRoute.stopoverType) &&
        Objects.equals(this.fareBasisCode, airlineTravelRoute.fareBasisCode) &&
        Objects.equals(this.departureTax, airlineTravelRoute.departureTax) &&
        Objects.equals(this.flightNumber, airlineTravelRoute.flightNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departureDate, origin, destination, carrierCode, serviceClass, stopoverType, fareBasisCode, departureTax, flightNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirlineTravelRoute {\n");
    
    sb.append("    departureDate: ").append(toIndentedString(departureDate)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    carrierCode: ").append(toIndentedString(carrierCode)).append("\n");
    sb.append("    serviceClass: ").append(toIndentedString(serviceClass)).append("\n");
    sb.append("    stopoverType: ").append(toIndentedString(stopoverType)).append("\n");
    sb.append("    fareBasisCode: ").append(toIndentedString(fareBasisCode)).append("\n");
    sb.append("    departureTax: ").append(toIndentedString(departureTax)).append("\n");
    sb.append("    flightNumber: ").append(toIndentedString(flightNumber)).append("\n");
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


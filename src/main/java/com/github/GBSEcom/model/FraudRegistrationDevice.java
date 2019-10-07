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
import com.github.GBSEcom.model.FraudRegistrationDeviceItems;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * The device where this transaction originated.
 */
@ApiModel(description = "The device where this transaction originated.")

public class FraudRegistrationDevice {
  /**
   * Defines the type of this object.
   */
  @JsonAdapter(DeviceTypeEnum.Adapter.class)
  public enum DeviceTypeEnum {
    POS("device/pos"),
    
    MOBILE("device/mobile");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeviceTypeEnum fromValue(String text) {
      for (DeviceTypeEnum b : DeviceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }

    public static class Adapter extends TypeAdapter<DeviceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeviceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeviceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeviceTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "deviceType";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private DeviceTypeEnum deviceType;

  public static final String SERIALIZED_NAME_DEVICE_ID = "deviceId";
  @SerializedName(SERIALIZED_NAME_DEVICE_ID)
  private String deviceId;

  public static final String SERIALIZED_NAME_NETWORKS = "networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<FraudRegistrationDeviceItems> networks = null;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private BigDecimal latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private BigDecimal longitude;

  public static final String SERIALIZED_NAME_IMEI = "imei";
  @SerializedName(SERIALIZED_NAME_IMEI)
  private String imei;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_MANUFACTURER = "manufacturer";
  @SerializedName(SERIALIZED_NAME_MANUFACTURER)
  private String manufacturer;

  public static final String SERIALIZED_NAME_TIMEZONE_OFFSET = "timezoneOffset";
  @SerializedName(SERIALIZED_NAME_TIMEZONE_OFFSET)
  private String timezoneOffset;

  public static final String SERIALIZED_NAME_ROOTED = "rooted";
  @SerializedName(SERIALIZED_NAME_ROOTED)
  private Boolean rooted;

  public static final String SERIALIZED_NAME_MALWARE_DETECTED = "malwareDetected";
  @SerializedName(SERIALIZED_NAME_MALWARE_DETECTED)
  private Boolean malwareDetected;

  public static final String SERIALIZED_NAME_USER_DEFINED = "userDefined";
  @SerializedName(SERIALIZED_NAME_USER_DEFINED)
  private Object userDefined = null;

  public FraudRegistrationDevice deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Defines the type of this object.
   * @return deviceType
  **/
  @ApiModelProperty(example = "device/mobile", required = true, value = "Defines the type of this object.")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }

  public FraudRegistrationDevice deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * The unique ID of the device. Must be unique for the entire system (not just within a specific merchant or industry).
   * @return deviceId
  **/
  @ApiModelProperty(example = "BDE000:008945:58AC03:F02569", required = true, value = "The unique ID of the device. Must be unique for the entire system (not just within a specific merchant or industry).")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public FraudRegistrationDevice networks(List<FraudRegistrationDeviceItems> networks) {
    this.networks = networks;
    return this;
  }

  public FraudRegistrationDevice addNetworksItem(FraudRegistrationDeviceItems networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

   /**
   * Information about the networks associated with the device.
   * @return networks
  **/
  @ApiModelProperty(value = "Information about the networks associated with the device.")
  public List<FraudRegistrationDeviceItems> getNetworks() {
    return networks;
  }

  public void setNetworks(List<FraudRegistrationDeviceItems> networks) {
    this.networks = networks;
  }

  public FraudRegistrationDevice latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The GPS decimal latitude, ranging from (-90.0 to 90.0) where positive numbers indicate locations North of the equator.
   * @return latitude
  **/
  @ApiModelProperty(example = "41.14961", value = "The GPS decimal latitude, ranging from (-90.0 to 90.0) where positive numbers indicate locations North of the equator.")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public FraudRegistrationDevice longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The GPS decimal longitude, ranging from (-180.0 to 180.0) where positive numbers indicate locations East of the IERS Reference Meridian.
   * @return longitude
  **/
  @ApiModelProperty(example = "-8.61099", value = "The GPS decimal longitude, ranging from (-180.0 to 180.0) where positive numbers indicate locations East of the IERS Reference Meridian.")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public FraudRegistrationDevice imei(String imei) {
    this.imei = imei;
    return this;
  }

   /**
   * The device&#39;s International Mobile Equipment Identity (IMEI) as described in IETF RFC7254.
   * @return imei
  **/
  @ApiModelProperty(example = "49-015420-323751", value = "The device's International Mobile Equipment Identity (IMEI) as described in IETF RFC7254.")
  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public FraudRegistrationDevice model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The device&#39;s model name.
   * @return model
  **/
  @ApiModelProperty(example = "iPhone 10", value = "The device's model name.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public FraudRegistrationDevice manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * The device&#39;s manufacturer.
   * @return manufacturer
  **/
  @ApiModelProperty(example = "Apple", value = "The device's manufacturer.")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public FraudRegistrationDevice timezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
    return this;
  }

   /**
   * The timezone offset from UTC to the devices timezone configuration, specified in the format +hh:mm.
   * @return timezoneOffset
  **/
  @ApiModelProperty(example = "+02:00", value = "The timezone offset from UTC to the devices timezone configuration, specified in the format +hh:mm.")
  public String getTimezoneOffset() {
    return timezoneOffset;
  }

  public void setTimezoneOffset(String timezoneOffset) {
    this.timezoneOffset = timezoneOffset;
  }

  public FraudRegistrationDevice rooted(Boolean rooted) {
    this.rooted = rooted;
    return this;
  }

   /**
   * A flag indicating that the device has been altered to allow privileged access to users. This flag should only be set to false if a test was performed and the result was negative. Leave unset otherwise.
   * @return rooted
  **/
  @ApiModelProperty(value = "A flag indicating that the device has been altered to allow privileged access to users. This flag should only be set to false if a test was performed and the result was negative. Leave unset otherwise.")
  public Boolean getRooted() {
    return rooted;
  }

  public void setRooted(Boolean rooted) {
    this.rooted = rooted;
  }

  public FraudRegistrationDevice malwareDetected(Boolean malwareDetected) {
    this.malwareDetected = malwareDetected;
    return this;
  }

   /**
   * A flag indicating that malware was detected on the mobile phone. This flag should only be set to false if a test was performed and the result was negative. Leave unset otherwise.
   * @return malwareDetected
  **/
  @ApiModelProperty(value = "A flag indicating that malware was detected on the mobile phone. This flag should only be set to false if a test was performed and the result was negative. Leave unset otherwise.")
  public Boolean getMalwareDetected() {
    return malwareDetected;
  }

  public void setMalwareDetected(Boolean malwareDetected) {
    this.malwareDetected = malwareDetected;
  }

  public FraudRegistrationDevice userDefined(Object userDefined) {
    this.userDefined = userDefined;
    return this;
  }

   /**
   * A JSON object that can carry any additional information about the device that might be helpful for fraud detection.
   * @return userDefined
  **/
  @ApiModelProperty(example = "{\"battery\":\"95%\"}", value = "A JSON object that can carry any additional information about the device that might be helpful for fraud detection.")
  public Object getUserDefined() {
    return userDefined;
  }

  public void setUserDefined(Object userDefined) {
    this.userDefined = userDefined;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudRegistrationDevice fraudRegistrationDevice = (FraudRegistrationDevice) o;
    return Objects.equals(this.deviceType, fraudRegistrationDevice.deviceType) &&
        Objects.equals(this.deviceId, fraudRegistrationDevice.deviceId) &&
        Objects.equals(this.networks, fraudRegistrationDevice.networks) &&
        Objects.equals(this.latitude, fraudRegistrationDevice.latitude) &&
        Objects.equals(this.longitude, fraudRegistrationDevice.longitude) &&
        Objects.equals(this.imei, fraudRegistrationDevice.imei) &&
        Objects.equals(this.model, fraudRegistrationDevice.model) &&
        Objects.equals(this.manufacturer, fraudRegistrationDevice.manufacturer) &&
        Objects.equals(this.timezoneOffset, fraudRegistrationDevice.timezoneOffset) &&
        Objects.equals(this.rooted, fraudRegistrationDevice.rooted) &&
        Objects.equals(this.malwareDetected, fraudRegistrationDevice.malwareDetected) &&
        Objects.equals(this.userDefined, fraudRegistrationDevice.userDefined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, deviceId, networks, latitude, longitude, imei, model, manufacturer, timezoneOffset, rooted, malwareDetected, userDefined);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudRegistrationDevice {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    imei: ").append(toIndentedString(imei)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    timezoneOffset: ").append(toIndentedString(timezoneOffset)).append("\n");
    sb.append("    rooted: ").append(toIndentedString(rooted)).append("\n");
    sb.append("    malwareDetected: ").append(toIndentedString(malwareDetected)).append("\n");
    sb.append("    userDefined: ").append(toIndentedString(userDefined)).append("\n");
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


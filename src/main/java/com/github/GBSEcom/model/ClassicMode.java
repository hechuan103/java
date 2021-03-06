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
import com.github.GBSEcom.model.BackgroundColor;
import com.github.GBSEcom.model.FontProperties;
import com.github.GBSEcom.model.Mobile;
import com.github.GBSEcom.model.Properties;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Object contains classic mode branding style properties.
 */
@ApiModel(description = "Object contains classic mode branding style properties.")

public class ClassicMode {
  public static final String SERIALIZED_NAME_BACKGROUND_COLOR = "backgroundColor";
  @SerializedName(SERIALIZED_NAME_BACKGROUND_COLOR)
  private BackgroundColor backgroundColor;

  public static final String SERIALIZED_NAME_MOBILE = "mobile";
  @SerializedName(SERIALIZED_NAME_MOBILE)
  private Mobile mobile;

  public static final String SERIALIZED_NAME_AMOUNT_TITLE = "amountTitle";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TITLE)
  private FontProperties amountTitle;

  public static final String SERIALIZED_NAME_SUPERSCRIPTION = "superscription";
  @SerializedName(SERIALIZED_NAME_SUPERSCRIPTION)
  private FontProperties superscription;

  public static final String SERIALIZED_NAME_INDIVIDUAL_TEXT = "individualText";
  @SerializedName(SERIALIZED_NAME_INDIVIDUAL_TEXT)
  private FontProperties individualText;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private FontProperties label;

  public static final String SERIALIZED_NAME_NORMAL_TEXT = "normalText";
  @SerializedName(SERIALIZED_NAME_NORMAL_TEXT)
  private FontProperties normalText;

  public static final String SERIALIZED_NAME_BUTTONS = "buttons";
  @SerializedName(SERIALIZED_NAME_BUTTONS)
  private Properties buttons;

  public static final String SERIALIZED_NAME_ANCHOR = "anchor";
  @SerializedName(SERIALIZED_NAME_ANCHOR)
  private Properties anchor;

  public static final String SERIALIZED_NAME_SYSTEM_MESSAGES = "systemMessages";
  @SerializedName(SERIALIZED_NAME_SYSTEM_MESSAGES)
  private Properties systemMessages;


  public ClassicMode backgroundColor(BackgroundColor backgroundColor) {
    
    this.backgroundColor = backgroundColor;
    return this;
  }

   /**
   * Get backgroundColor
   * @return backgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BackgroundColor getBackgroundColor() {
    return backgroundColor;
  }



  public void setBackgroundColor(BackgroundColor backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  public ClassicMode mobile(Mobile mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Mobile getMobile() {
    return mobile;
  }



  public void setMobile(Mobile mobile) {
    this.mobile = mobile;
  }


  public ClassicMode amountTitle(FontProperties amountTitle) {
    
    this.amountTitle = amountTitle;
    return this;
  }

   /**
   * Get amountTitle
   * @return amountTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontProperties getAmountTitle() {
    return amountTitle;
  }



  public void setAmountTitle(FontProperties amountTitle) {
    this.amountTitle = amountTitle;
  }


  public ClassicMode superscription(FontProperties superscription) {
    
    this.superscription = superscription;
    return this;
  }

   /**
   * Get superscription
   * @return superscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontProperties getSuperscription() {
    return superscription;
  }



  public void setSuperscription(FontProperties superscription) {
    this.superscription = superscription;
  }


  public ClassicMode individualText(FontProperties individualText) {
    
    this.individualText = individualText;
    return this;
  }

   /**
   * Get individualText
   * @return individualText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontProperties getIndividualText() {
    return individualText;
  }



  public void setIndividualText(FontProperties individualText) {
    this.individualText = individualText;
  }


  public ClassicMode label(FontProperties label) {
    
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontProperties getLabel() {
    return label;
  }



  public void setLabel(FontProperties label) {
    this.label = label;
  }


  public ClassicMode normalText(FontProperties normalText) {
    
    this.normalText = normalText;
    return this;
  }

   /**
   * Get normalText
   * @return normalText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FontProperties getNormalText() {
    return normalText;
  }



  public void setNormalText(FontProperties normalText) {
    this.normalText = normalText;
  }


  public ClassicMode buttons(Properties buttons) {
    
    this.buttons = buttons;
    return this;
  }

   /**
   * Get buttons
   * @return buttons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties getButtons() {
    return buttons;
  }



  public void setButtons(Properties buttons) {
    this.buttons = buttons;
  }


  public ClassicMode anchor(Properties anchor) {
    
    this.anchor = anchor;
    return this;
  }

   /**
   * Get anchor
   * @return anchor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties getAnchor() {
    return anchor;
  }



  public void setAnchor(Properties anchor) {
    this.anchor = anchor;
  }


  public ClassicMode systemMessages(Properties systemMessages) {
    
    this.systemMessages = systemMessages;
    return this;
  }

   /**
   * Get systemMessages
   * @return systemMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Properties getSystemMessages() {
    return systemMessages;
  }



  public void setSystemMessages(Properties systemMessages) {
    this.systemMessages = systemMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassicMode classicMode = (ClassicMode) o;
    return Objects.equals(this.backgroundColor, classicMode.backgroundColor) &&
        Objects.equals(this.mobile, classicMode.mobile) &&
        Objects.equals(this.amountTitle, classicMode.amountTitle) &&
        Objects.equals(this.superscription, classicMode.superscription) &&
        Objects.equals(this.individualText, classicMode.individualText) &&
        Objects.equals(this.label, classicMode.label) &&
        Objects.equals(this.normalText, classicMode.normalText) &&
        Objects.equals(this.buttons, classicMode.buttons) &&
        Objects.equals(this.anchor, classicMode.anchor) &&
        Objects.equals(this.systemMessages, classicMode.systemMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, mobile, amountTitle, superscription, individualText, label, normalText, buttons, anchor, systemMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassicMode {\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    amountTitle: ").append(toIndentedString(amountTitle)).append("\n");
    sb.append("    superscription: ").append(toIndentedString(superscription)).append("\n");
    sb.append("    individualText: ").append(toIndentedString(individualText)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    normalText: ").append(toIndentedString(normalText)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    anchor: ").append(toIndentedString(anchor)).append("\n");
    sb.append("    systemMessages: ").append(toIndentedString(systemMessages)).append("\n");
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


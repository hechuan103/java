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
 * Fraud likelihood assessment consisting of a score, associated warning(s), and explanation(s) of score received.
 */
@ApiModel(description = "Fraud likelihood assessment consisting of a score, associated warning(s), and explanation(s) of score received.")

public class FraudScore {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private String score;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<String> warnings = null;

  public static final String SERIALIZED_NAME_EXPLANATIONS = "explanations";
  @SerializedName(SERIALIZED_NAME_EXPLANATIONS)
  private List<Object> explanations = null;

  public static final String SERIALIZED_NAME_RECOMMENDED_DECISION = "recommendedDecision";
  @SerializedName(SERIALIZED_NAME_RECOMMENDED_DECISION)
  private String recommendedDecision;

  public FraudScore score(String score) {
    this.score = score;
    return this;
  }

   /**
   * The score attributed to this request by our machine learning system, ranging from 0 (less likely to be fraud) to 1000 (more likely to be fraud).
   * @return score
  **/
  @ApiModelProperty(example = "1000", value = "The score attributed to this request by our machine learning system, ranging from 0 (less likely to be fraud) to 1000 (more likely to be fraud).")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public FraudScore warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public FraudScore addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of non-critical warnings raised while processing the request. Warnings included in this list will have integration and data-quality related messages.
   * @return warnings
  **/
  @ApiModelProperty(example = "[\"warning1\",\"warning2\"]", value = "A list of non-critical warnings raised while processing the request. Warnings included in this list will have integration and data-quality related messages.")
  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  public FraudScore explanations(List<Object> explanations) {
    this.explanations = explanations;
    return this;
  }

  public FraudScore addExplanationsItem(Object explanationsItem) {
    if (this.explanations == null) {
      this.explanations = new ArrayList<>();
    }
    this.explanations.add(explanationsItem);
    return this;
  }

   /**
   * Explanation of the fraud score applied consisting of a description, type of the explanation, and rule (if applicable).
   * @return explanations
  **/
  @ApiModelProperty(value = "Explanation of the fraud score applied consisting of a description, type of the explanation, and rule (if applicable).")
  public List<Object> getExplanations() {
    return explanations;
  }

  public void setExplanations(List<Object> explanations) {
    this.explanations = explanations;
  }

  public FraudScore recommendedDecision(String recommendedDecision) {
    this.recommendedDecision = recommendedDecision;
    return this;
  }

   /**
   * The score attributed to this request by our machine learning system, ranging from 0 (less likely to be fraud) to 1000 (more likely to be fraud).
   * @return recommendedDecision
  **/
  @ApiModelProperty(example = "approve", value = "The score attributed to this request by our machine learning system, ranging from 0 (less likely to be fraud) to 1000 (more likely to be fraud).")
  public String getRecommendedDecision() {
    return recommendedDecision;
  }

  public void setRecommendedDecision(String recommendedDecision) {
    this.recommendedDecision = recommendedDecision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FraudScore fraudScore = (FraudScore) o;
    return Objects.equals(this.score, fraudScore.score) &&
        Objects.equals(this.warnings, fraudScore.warnings) &&
        Objects.equals(this.explanations, fraudScore.explanations) &&
        Objects.equals(this.recommendedDecision, fraudScore.recommendedDecision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, warnings, explanations, recommendedDecision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FraudScore {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    explanations: ").append(toIndentedString(explanations)).append("\n");
    sb.append("    recommendedDecision: ").append(toIndentedString(recommendedDecision)).append("\n");
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


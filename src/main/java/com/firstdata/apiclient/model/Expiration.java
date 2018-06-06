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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Required for normal transactions except for payments with &#39;RECURRING&#39; flags
 */
@ApiModel(description = "Required for normal transactions except for payments with 'RECURRING' flags")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class Expiration {
    @SerializedName("month")
    private String month = null;

    @SerializedName("year")
    private String year = null;

    public Expiration month(String month) {
        this.month = month;
        return this;
    }

    /**
     * Get month
     *
     * @return month
     **/
    @ApiModelProperty(example = "03", required = true, value = "")
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Expiration year(String year) {
        this.year = year;
        return this;
    }

    /**
     * Get year
     *
     * @return year
     **/
    @ApiModelProperty(example = "21", required = true, value = "")
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Expiration expiration = (Expiration) o;
        return Objects.equals(this.month, expiration.month) &&
                Objects.equals(this.year, expiration.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, year);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Expiration {\n");

        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
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


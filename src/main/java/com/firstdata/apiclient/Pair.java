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


package com.firstdata.apiclient;

import lombok.Getter;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T17:00:16.359-05:00")
public class Pair {
    @Getter
    private String name = "";

    @Getter
    private String value = "";

    public Pair(String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (isNotValidString(name)) {
            return;
        }
        this.name = name;
    }

    private void setValue(String value) {
        if (isNotValidString(value)) {
            return;
        }
        this.value = value;
    }

    private boolean isNotValidString(String arg) {
        return (arg == null || arg.trim().isEmpty());
    }
}
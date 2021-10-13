package com.syscho.objectmapper.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"countryCode",
"name",
"state",
"postalCode",
"latitude",
"longitude"
})
@Generated("jsonschema2pojo")
public class AddressOrigin implements Serializable
{

@JsonProperty("countryCode")
private String countryCode;
@JsonProperty("name")
private String name;
@JsonProperty("state")
private String state;
@JsonProperty("postalCode")
private String postalCode;
@JsonProperty("latitude")
private String latitude;
@JsonProperty("longitude")
private String longitude;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 8840825555894680376L;

@JsonProperty("countryCode")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("countryCode")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

@JsonProperty("name")
public String getName() {
return name;
}

@JsonProperty("name")
public void setName(String name) {
this.name = name;
}

@JsonProperty("state")
public String getState() {
return state;
}

@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

@JsonProperty("postalCode")
public String getPostalCode() {
return postalCode;
}

@JsonProperty("postalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

@JsonProperty("latitude")
public String getLatitude() {
return latitude;
}

@JsonProperty("latitude")
public void setLatitude(String latitude) {
this.latitude = latitude;
}

@JsonProperty("longitude")
public String getLongitude() {
return longitude;
}

@JsonProperty("longitude")
public void setLongitude(String longitude) {
this.longitude = longitude;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
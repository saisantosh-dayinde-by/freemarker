package com.syscho.objectmapper.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"beginDate",
"endDate",
"beginTime",
"endTime"
})
@Generated("jsonschema2pojo")
public class DeliveryDetails implements Serializable
{

@JsonProperty("beginDate")
private String beginDate;
@JsonProperty("endDate")
private String endDate;
@JsonProperty("beginTime")
private String beginTime;
@JsonProperty("endTime")
private String endTime;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
private final static long serialVersionUID = 6286497742761423827L;

@JsonProperty("beginDate")
public String getBeginDate() {
return beginDate;
}

@JsonProperty("beginDate")
public void setBeginDate(String beginDate) {
this.beginDate = beginDate;
}

@JsonProperty("endDate")
public String getEndDate() {
return endDate;
}

@JsonProperty("endDate")
public void setEndDate(String endDate) {
this.endDate = endDate;
}

@JsonProperty("beginTime")
public String getBeginTime() {
return beginTime;
}

@JsonProperty("beginTime")
public void setBeginTime(String beginTime) {
this.beginTime = beginTime;
}

@JsonProperty("endTime")
public String getEndTime() {
return endTime;
}

@JsonProperty("endTime")
public void setEndTime(String endTime) {
this.endTime = endTime;
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
package com.syscho.objectmapper.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineNumber",
        "message",
        "isPrintable"
})
public class Note implements Serializable {

    @JsonProperty("lineNumber")
    private String lineNumber;
    @JsonProperty("message")
    private String message;
    @JsonProperty("isPrintable")
    private Boolean isPrintable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1916442972458735265L;

    @JsonProperty("lineNumber")
    public String getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("lineNumber")
    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("isPrintable")
    public Boolean getIsPrintable() {
        return isPrintable;
    }

    @JsonProperty("isPrintable")
    public void setIsPrintable(Boolean isPrintable) {
        this.isPrintable = isPrintable;
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
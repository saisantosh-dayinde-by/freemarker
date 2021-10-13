package com.syscho.objectmapper.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fromShipmentId",
        "addressOrigin"
})
public class ShipFrom implements Serializable {

    @JsonProperty("fromShipmentId")
    private String fromShipmentId;
    @JsonProperty("addressOrigin")
    private AddressOrigin addressOrigin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 6168855843526265489L;

    @JsonProperty("fromShipmentId")
    public String getFromShipmentId() {
        return fromShipmentId;
    }

    @JsonProperty("fromShipmentId")
    public void setFromShipmentId(String fromShipmentId) {
        this.fromShipmentId = fromShipmentId;
    }

    @JsonProperty("addressOrigin")
    public AddressOrigin getAddressOrigin() {
        return addressOrigin;
    }

    @JsonProperty("addressOrigin")
    public void setAddressOrigin(AddressOrigin addressOrigin) {
        this.addressOrigin = addressOrigin;
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
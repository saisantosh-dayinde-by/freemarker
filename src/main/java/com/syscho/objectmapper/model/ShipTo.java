package com.syscho.objectmapper.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "toShipmentId",
        "addressDestination",
        "contact"
})
public class ShipTo implements Serializable {

    @JsonProperty("toShipmentId")
    private String toShipmentId;
    @JsonProperty("addressDestination")
    private AddressDestination addressDestination;
    @JsonProperty("contact")
    private List<Contact> contact = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6395389753175734616L;

    @JsonProperty("toShipmentId")
    public String getToShipmentId() {
        return toShipmentId;
    }

    @JsonProperty("toShipmentId")
    public void setToShipmentId(String toShipmentId) {
        this.toShipmentId = toShipmentId;
    }

    @JsonProperty("addressDestination")
    public AddressDestination getAddressDestination() {
        return addressDestination;
    }

    @JsonProperty("addressDestination")
    public void setAddressDestination(AddressDestination addressDestination) {
        this.addressDestination = addressDestination;
    }

    @JsonProperty("contact")
    public List<Contact> getContact() {
        return contact;
    }

    @JsonProperty("contact")
    public void setContact(List<Contact> contact) {
        this.contact = contact;
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
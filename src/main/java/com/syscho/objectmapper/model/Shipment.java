package com.syscho.objectmapper.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "shipmentId",
        "customerNumber",
        "shipTo",
        "shipFrom",
        "planned",
        "note"
})
@Generated("jsonschema2pojo")
public class Shipment implements Serializable {

    @JsonProperty("shipmentId")
    private String shipmentId;
    @JsonProperty("customerNumber")
    private String customerNumber;
    @JsonProperty("shipTo")
    private ShipTo shipTo;
    @JsonProperty("shipFrom")
    private ShipFrom shipFrom;
    @JsonProperty("planned")
    private Planned planned;
    @JsonProperty("note")
    private List<Note> note = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3603683016268384074L;

    @JsonProperty("shipmentId")
    public String getShipmentId() {
        return shipmentId;
    }

    @JsonProperty("shipmentId")
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    @JsonProperty("customerNumber")
    public String getCustomerNumber() {
        return customerNumber;
    }

    @JsonProperty("customerNumber")
    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @JsonProperty("shipTo")
    public ShipTo getShipTo() {
        return shipTo;
    }

    @JsonProperty("shipTo")
    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    @JsonProperty("shipFrom")
    public ShipFrom getShipFrom() {
        return shipFrom;
    }

    @JsonProperty("shipFrom")
    public void setShipFrom(ShipFrom shipFrom) {
        this.shipFrom = shipFrom;
    }

    @JsonProperty("planned")
    public Planned getPlanned() {
        return planned;
    }

    @JsonProperty("planned")
    public void setPlanned(Planned planned) {
        this.planned = planned;
    }

    @JsonProperty("note")
    public List<Note> getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(List<Note> note) {
        this.note = note;
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
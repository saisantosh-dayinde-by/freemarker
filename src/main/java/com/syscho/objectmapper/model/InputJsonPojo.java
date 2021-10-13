package com.syscho.objectmapper.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "transportInstructionId",
        "billPrimaryId",
        "billName",
        "shipment"
})
public class InputJsonPojo implements Serializable {

    @JsonProperty("transportInstructionId")
    private String transportInstructionId;
    @JsonProperty("billPrimaryId")
    private String billPrimaryId;
    @JsonProperty("billName")
    private String billName;
    @JsonProperty("shipment")
    private List<Shipment> shipment = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8411177280583640003L;

    @JsonProperty("transportInstructionId")
    public String getTransportInstructionId() {
        return transportInstructionId;
    }

    @JsonProperty("transportInstructionId")
    public void setTransportInstructionId(String transportInstructionId) {
        this.transportInstructionId = transportInstructionId;
    }

    @JsonProperty("billPrimaryId")
    public String getBillPrimaryId() {
        return billPrimaryId;
    }

    @JsonProperty("billPrimaryId")
    public void setBillPrimaryId(String billPrimaryId) {
        this.billPrimaryId = billPrimaryId;
    }

    @JsonProperty("billName")
    public String getBillName() {
        return billName;
    }

    @JsonProperty("billName")
    public void setBillName(String billName) {
        this.billName = billName;
    }

    @JsonProperty("shipment")
    public List<Shipment> getShipment() {
        return shipment;
    }

    @JsonProperty("shipment")
    public void setShipment(List<Shipment> shipment) {
        this.shipment = shipment;
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
package com.syscho.objectmapper.model;

import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "deliveryDetails",
        "dispatchDetails"
})
public class Planned implements Serializable {

    @JsonProperty("deliveryDetails")
    private DeliveryDetails deliveryDetails;
    @JsonProperty("dispatchDetails")
    private DispatchDetails dispatchDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5369294398116618405L;

    @JsonProperty("deliveryDetails")
    public DeliveryDetails getDeliveryDetails() {
        return deliveryDetails;
    }

    @JsonProperty("deliveryDetails")
    public void setDeliveryDetails(DeliveryDetails deliveryDetails) {
        this.deliveryDetails = deliveryDetails;
    }

    @JsonProperty("dispatchDetails")
    public DispatchDetails getDispatchDetails() {
        return dispatchDetails;
    }

    @JsonProperty("dispatchDetails")
    public void setDispatchDetails(DispatchDetails dispatchDetails) {
        this.dispatchDetails = dispatchDetails;
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
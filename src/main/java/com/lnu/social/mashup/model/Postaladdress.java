
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "addresslocality"
})
public class Postaladdress {

    @JsonProperty("addresslocality")
    private String addresslocality;

    @JsonProperty("addresslocality")
    public String getAddresslocality() {
        return addresslocality;
    }

    @JsonProperty("addresslocality")
    public void setAddresslocality(String addresslocality) {
        this.addresslocality = addresslocality;
    }

}

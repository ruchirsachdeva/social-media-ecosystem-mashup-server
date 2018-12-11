
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "votes"
})
public class Hreviewaggregate {

    @JsonProperty("votes")
    private String votes;

    @JsonProperty("votes")
    public String getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(String votes) {
        this.votes = votes;
    }

}


package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "upvotecount",
    "text"
})
public class Answer {

    @JsonProperty("upvotecount")
    private String upvotecount;
    @JsonProperty("text")
    private String text;

    @JsonProperty("upvotecount")
    public String getUpvotecount() {
        return upvotecount;
    }

    @JsonProperty("upvotecount")
    public void setUpvotecount(String upvotecount) {
        this.upvotecount = upvotecount;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

}

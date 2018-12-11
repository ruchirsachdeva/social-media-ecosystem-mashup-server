
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "image",
    "upvotecount",
    "name",
    "text",
    "answercount"
})
public class Question {

    @JsonProperty("image")
    private String image;
    @JsonProperty("upvotecount")
    private String upvotecount;
    @JsonProperty("name")
    private String name;
    @JsonProperty("text")
    private String text;
    @JsonProperty("answercount")
    private String answercount;

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("upvotecount")
    public String getUpvotecount() {
        return upvotecount;
    }

    @JsonProperty("upvotecount")
    public void setUpvotecount(String upvotecount) {
        this.upvotecount = upvotecount;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("answercount")
    public String getAnswercount() {
        return answercount;
    }

    @JsonProperty("answercount")
    public void setAnswercount(String answercount) {
        this.answercount = answercount;
    }

}

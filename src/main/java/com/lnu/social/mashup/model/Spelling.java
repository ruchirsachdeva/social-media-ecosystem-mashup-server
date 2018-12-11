
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "correctedQuery",
    "htmlCorrectedQuery"
})
public class Spelling {

    @JsonProperty("correctedQuery")
    private String correctedQuery;
    @JsonProperty("htmlCorrectedQuery")
    private String htmlCorrectedQuery;

    @JsonProperty("correctedQuery")
    public String getCorrectedQuery() {
        return correctedQuery;
    }

    @JsonProperty("correctedQuery")
    public void setCorrectedQuery(String correctedQuery) {
        this.correctedQuery = correctedQuery;
    }

    @JsonProperty("htmlCorrectedQuery")
    public String getHtmlCorrectedQuery() {
        return htmlCorrectedQuery;
    }

    @JsonProperty("htmlCorrectedQuery")
    public void setHtmlCorrectedQuery(String htmlCorrectedQuery) {
        this.htmlCorrectedQuery = htmlCorrectedQuery;
    }

}

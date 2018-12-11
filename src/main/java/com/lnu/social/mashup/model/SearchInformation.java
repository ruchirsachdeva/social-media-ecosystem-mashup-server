
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "searchTime",
    "formattedSearchTime",
    "totalResults",
    "formattedTotalResults"
})
public class SearchInformation {

    @JsonProperty("searchTime")
    private Double searchTime;
    @JsonProperty("formattedSearchTime")
    private String formattedSearchTime;
    @JsonProperty("totalResults")
    private String totalResults;
    @JsonProperty("formattedTotalResults")
    private String formattedTotalResults;

    @JsonProperty("searchTime")
    public Double getSearchTime() {
        return searchTime;
    }

    @JsonProperty("searchTime")
    public void setSearchTime(Double searchTime) {
        this.searchTime = searchTime;
    }

    @JsonProperty("formattedSearchTime")
    public String getFormattedSearchTime() {
        return formattedSearchTime;
    }

    @JsonProperty("formattedSearchTime")
    public void setFormattedSearchTime(String formattedSearchTime) {
        this.formattedSearchTime = formattedSearchTime;
    }

    @JsonProperty("totalResults")
    public String getTotalResults() {
        return totalResults;
    }

    @JsonProperty("totalResults")
    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    @JsonProperty("formattedTotalResults")
    public String getFormattedTotalResults() {
        return formattedTotalResults;
    }

    @JsonProperty("formattedTotalResults")
    public void setFormattedTotalResults(String formattedTotalResults) {
        this.formattedTotalResults = formattedTotalResults;
    }

}


package com.lnu.social.mashup.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "kind",
    "url",
    "queries",
    "context",
    "searchInformation",
    "spelling",
    "items"
})
public class SearchResponse {

    @JsonProperty("kind")
    private String kind;
    @JsonProperty("url")
    private Url url;
    @JsonProperty("queries")
    private Queries queries;
    @JsonProperty("context")
    private Context context;
    @JsonProperty("searchInformation")
    private SearchInformation searchInformation;
    @JsonProperty("spelling")
    private Spelling spelling;
    @JsonProperty("items")
    private List<Item> items = null;

    @JsonProperty("kind")
    public String getKind() {
        return kind;
    }

    @JsonProperty("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    @JsonProperty("url")
    public Url getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Url url) {
        this.url = url;
    }

    @JsonProperty("queries")
    public Queries getQueries() {
        return queries;
    }

    @JsonProperty("queries")
    public void setQueries(Queries queries) {
        this.queries = queries;
    }

    @JsonProperty("context")
    public Context getContext() {
        return context;
    }

    @JsonProperty("context")
    public void setContext(Context context) {
        this.context = context;
    }

    @JsonProperty("searchInformation")
    public SearchInformation getSearchInformation() {
        return searchInformation;
    }

    @JsonProperty("searchInformation")
    public void setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
    }

    @JsonProperty("spelling")
    public Spelling getSpelling() {
        return spelling;
    }

    @JsonProperty("spelling")
    public void setSpelling(Spelling spelling) {
        this.spelling = spelling;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

}

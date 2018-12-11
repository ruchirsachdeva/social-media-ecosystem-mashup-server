
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "title",
    "url",
    "hiringorganization",
    "name",
    "description",
    "dateposted"
})
public class Jobposting {

    @JsonProperty("title")
    private String title;
    @JsonProperty("url")
    private String url;
    @JsonProperty("hiringorganization")
    private String hiringorganization;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("dateposted")
    private String dateposted;

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("hiringorganization")
    public String getHiringorganization() {
        return hiringorganization;
    }

    @JsonProperty("hiringorganization")
    public void setHiringorganization(String hiringorganization) {
        this.hiringorganization = hiringorganization;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("dateposted")
    public String getDateposted() {
        return dateposted;
    }

    @JsonProperty("dateposted")
    public void setDateposted(String dateposted) {
        this.dateposted = dateposted;
    }

}

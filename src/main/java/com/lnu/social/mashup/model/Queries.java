
package com.lnu.social.mashup.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "request",
    "nextPage"
})
public class Queries {

    @JsonProperty("request")
    private List<Request> request = null;
    @JsonProperty("nextPage")
    private List<NextPage> nextPage = null;

    @JsonProperty("request")
    public List<Request> getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(List<Request> request) {
        this.request = request;
    }

    @JsonProperty("nextPage")
    public List<NextPage> getNextPage() {
        return nextPage;
    }

    @JsonProperty("nextPage")
    public void setNextPage(List<NextPage> nextPage) {
        this.nextPage = nextPage;
    }

}

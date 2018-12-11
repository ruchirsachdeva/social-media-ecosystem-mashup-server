
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "thumbnailurl",
    "url",
    "datecreated",
    "keywords",
    "accessmode",
    "datepublished",
    "author",
    "datemodified",
    "mainentityofpage",
    "headline",
    "alternativeheadline",
    "commentcount",
    "text"
})
public class Blog {

    @JsonProperty("thumbnailurl")
    private String thumbnailurl;
    @JsonProperty("url")
    private String url;
    @JsonProperty("datecreated")
    private String datecreated;
    @JsonProperty("keywords")
    private String keywords;
    @JsonProperty("accessmode")
    private String accessmode;
    @JsonProperty("datepublished")
    private String datepublished;
    @JsonProperty("author")
    private String author;
    @JsonProperty("datemodified")
    private String datemodified;
    @JsonProperty("mainentityofpage")
    private String mainentityofpage;
    @JsonProperty("headline")
    private String headline;
    @JsonProperty("alternativeheadline")
    private String alternativeheadline;
    @JsonProperty("commentcount")
    private String commentcount;
    @JsonProperty("text")
    private String text;

    @JsonProperty("thumbnailurl")
    public String getThumbnailurl() {
        return thumbnailurl;
    }

    @JsonProperty("thumbnailurl")
    public void setThumbnailurl(String thumbnailurl) {
        this.thumbnailurl = thumbnailurl;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("datecreated")
    public String getDatecreated() {
        return datecreated;
    }

    @JsonProperty("datecreated")
    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    @JsonProperty("keywords")
    public String getKeywords() {
        return keywords;
    }

    @JsonProperty("keywords")
    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @JsonProperty("accessmode")
    public String getAccessmode() {
        return accessmode;
    }

    @JsonProperty("accessmode")
    public void setAccessmode(String accessmode) {
        this.accessmode = accessmode;
    }

    @JsonProperty("datepublished")
    public String getDatepublished() {
        return datepublished;
    }

    @JsonProperty("datepublished")
    public void setDatepublished(String datepublished) {
        this.datepublished = datepublished;
    }

    @JsonProperty("author")
    public String getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(String author) {
        this.author = author;
    }

    @JsonProperty("datemodified")
    public String getDatemodified() {
        return datemodified;
    }

    @JsonProperty("datemodified")
    public void setDatemodified(String datemodified) {
        this.datemodified = datemodified;
    }

    @JsonProperty("mainentityofpage")
    public String getMainentityofpage() {
        return mainentityofpage;
    }

    @JsonProperty("mainentityofpage")
    public void setMainentityofpage(String mainentityofpage) {
        this.mainentityofpage = mainentityofpage;
    }

    @JsonProperty("headline")
    public String getHeadline() {
        return headline;
    }

    @JsonProperty("headline")
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    @JsonProperty("alternativeheadline")
    public String getAlternativeheadline() {
        return alternativeheadline;
    }

    @JsonProperty("alternativeheadline")
    public void setAlternativeheadline(String alternativeheadline) {
        this.alternativeheadline = alternativeheadline;
    }

    @JsonProperty("commentcount")
    public String getCommentcount() {
        return commentcount;
    }

    @JsonProperty("commentcount")
    public void setCommentcount(String commentcount) {
        this.commentcount = commentcount;
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

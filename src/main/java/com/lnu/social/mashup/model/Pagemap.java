
package com.lnu.social.mashup.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cse_thumbnail",
    "metatags",
    "breadcrumb",
    "cse_image",
    "organization",
    "postaladdress",
    "jobposting",
    "listitem",
    "blog",
    "imageobject",
    "hreviewaggregate",
    "blogposting",
    "question",
    "answer"
})
public class Pagemap {

    @JsonProperty("cse_thumbnail")
    private List<CseThumbnail> cseThumbnail = null;
    @JsonProperty("metatags")
    private List<Metatag> metatags = null;
    @JsonProperty("breadcrumb")
    private List<Breadcrumb> breadcrumb = null;
    @JsonProperty("cse_image")
    private List<CseImage> cseImage = null;
    @JsonProperty("organization")
    private List<Organization> organization = null;
    @JsonProperty("postaladdress")
    private List<Postaladdress> postaladdress = null;
    @JsonProperty("jobposting")
    private List<Jobposting> jobposting = null;
    @JsonProperty("listitem")
    private List<Listitem> listitem = null;
    @JsonProperty("blog")
    private List<Blog> blog = null;
    @JsonProperty("imageobject")
    private List<Imageobject> imageobject = null;
    @JsonProperty("hreviewaggregate")
    private List<Hreviewaggregate> hreviewaggregate = null;
    @JsonProperty("blogposting")
    private List<Blogposting> blogposting = null;
    @JsonProperty("question")
    private List<Question> question = null;
    @JsonProperty("answer")
    private List<Answer> answer = null;

    @JsonProperty("cse_thumbnail")
    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    @JsonProperty("cse_thumbnail")
    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    @JsonProperty("metatags")
    public List<Metatag> getMetatags() {
        return metatags;
    }

    @JsonProperty("metatags")
    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    @JsonProperty("breadcrumb")
    public List<Breadcrumb> getBreadcrumb() {
        return breadcrumb;
    }

    @JsonProperty("breadcrumb")
    public void setBreadcrumb(List<Breadcrumb> breadcrumb) {
        this.breadcrumb = breadcrumb;
    }

    @JsonProperty("cse_image")
    public List<CseImage> getCseImage() {
        return cseImage;
    }

    @JsonProperty("cse_image")
    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    @JsonProperty("organization")
    public List<Organization> getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(List<Organization> organization) {
        this.organization = organization;
    }

    @JsonProperty("postaladdress")
    public List<Postaladdress> getPostaladdress() {
        return postaladdress;
    }

    @JsonProperty("postaladdress")
    public void setPostaladdress(List<Postaladdress> postaladdress) {
        this.postaladdress = postaladdress;
    }

    @JsonProperty("jobposting")
    public List<Jobposting> getJobposting() {
        return jobposting;
    }

    @JsonProperty("jobposting")
    public void setJobposting(List<Jobposting> jobposting) {
        this.jobposting = jobposting;
    }

    @JsonProperty("listitem")
    public List<Listitem> getListitem() {
        return listitem;
    }

    @JsonProperty("listitem")
    public void setListitem(List<Listitem> listitem) {
        this.listitem = listitem;
    }

    @JsonProperty("blog")
    public List<Blog> getBlog() {
        return blog;
    }

    @JsonProperty("blog")
    public void setBlog(List<Blog> blog) {
        this.blog = blog;
    }

    @JsonProperty("imageobject")
    public List<Imageobject> getImageobject() {
        return imageobject;
    }

    @JsonProperty("imageobject")
    public void setImageobject(List<Imageobject> imageobject) {
        this.imageobject = imageobject;
    }

    @JsonProperty("hreviewaggregate")
    public List<Hreviewaggregate> getHreviewaggregate() {
        return hreviewaggregate;
    }

    @JsonProperty("hreviewaggregate")
    public void setHreviewaggregate(List<Hreviewaggregate> hreviewaggregate) {
        this.hreviewaggregate = hreviewaggregate;
    }

    @JsonProperty("blogposting")
    public List<Blogposting> getBlogposting() {
        return blogposting;
    }

    @JsonProperty("blogposting")
    public void setBlogposting(List<Blogposting> blogposting) {
        this.blogposting = blogposting;
    }

    @JsonProperty("question")
    public List<Question> getQuestion() {
        return question;
    }

    @JsonProperty("question")
    public void setQuestion(List<Question> question) {
        this.question = question;
    }

    @JsonProperty("answer")
    public List<Answer> getAnswer() {
        return answer;
    }

    @JsonProperty("answer")
    public void setAnswer(List<Answer> answer) {
        this.answer = answer;
    }

}

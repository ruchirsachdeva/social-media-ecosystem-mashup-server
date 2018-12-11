
package com.lnu.social.mashup.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "viewport",
    "theme-color",
    "msapplication-navbutton-color",
    "apple-mobile-web-app-capable",
    "apple-mobile-web-app-status-bar-style",
    "referrer",
    "al:ios:app_store_id",
    "al:ios:app_name",
    "og:title",
    "og:type",
    "og:site_name",
    "fb:app_id",
    "og:url",
    "og:image",
    "og:description",
    "apple-itunes-app",
    "google-play-app",
    "g-client-id",
    "f-client-id",
    "apple-itunes-app-beta",
    "tk",
    "tkt",
    "stp",
    "react",
    "handheldfriendly",
    "pageimpressionid",
    "appname",
    "pagekey",
    "treeid",
    "globaltrackingurl",
    "globaltrackingappname",
    "globaltrackingappid",
    "msapplication-tileimage",
    "msapplication-tilecolor",
    "application-name",
    "remotenavjscontentbaseurl",
    "lnkd-track-json-lib",
    "apphost",
    "appversion",
    "appinstance",
    "detectadblock",
    "twitter:site",
    "twitter:card",
    "twitter:description",
    "twitter:title",
    "article:wordcount",
    "parsely-title",
    "parsely-link",
    "parsely-type",
    "parsely-image-url",
    "parsely-pub-date",
    "parsely-section",
    "parsely-author",
    "parsely-tags",
    "\u201cparsely-post-id\u201d",
    "df-verify"
})
public class Metatag {

    @JsonProperty("viewport")
    private String viewport;
    @JsonProperty("theme-color")
    private String themeColor;
    @JsonProperty("msapplication-navbutton-color")
    private String msapplicationNavbuttonColor;
    @JsonProperty("apple-mobile-web-app-capable")
    private String appleMobileWebAppCapable;
    @JsonProperty("apple-mobile-web-app-status-bar-style")
    private String appleMobileWebAppStatusBarStyle;
    @JsonProperty("referrer")
    private String referrer;
    @JsonProperty("al:ios:app_store_id")
    private String alIosAppStoreId;
    @JsonProperty("al:ios:app_name")
    private String alIosAppName;
    @JsonProperty("og:title")
    private String ogTitle;
    @JsonProperty("og:type")
    private String ogType;
    @JsonProperty("og:site_name")
    private String ogSiteName;
    @JsonProperty("fb:app_id")
    private String fbAppId;
    @JsonProperty("og:url")
    private String ogUrl;
    @JsonProperty("og:image")
    private String ogImage;
    @JsonProperty("og:description")
    private String ogDescription;
    @JsonProperty("apple-itunes-app")
    private String appleItunesApp;
    @JsonProperty("google-play-app")
    private String googlePlayApp;
    @JsonProperty("g-client-id")
    private String gClientId;
    @JsonProperty("f-client-id")
    private String fClientId;
    @JsonProperty("apple-itunes-app-beta")
    private String appleItunesAppBeta;
    @JsonProperty("tk")
    private String tk;
    @JsonProperty("tkt")
    private String tkt;
    @JsonProperty("stp")
    private String stp;
    @JsonProperty("react")
    private String react;
    @JsonProperty("handheldfriendly")
    private String handheldfriendly;
    @JsonProperty("pageimpressionid")
    private String pageimpressionid;
    @JsonProperty("appname")
    private String appname;
    @JsonProperty("pagekey")
    private String pagekey;
    @JsonProperty("treeid")
    private String treeid;
    @JsonProperty("globaltrackingurl")
    private String globaltrackingurl;
    @JsonProperty("globaltrackingappname")
    private String globaltrackingappname;
    @JsonProperty("globaltrackingappid")
    private String globaltrackingappid;
    @JsonProperty("msapplication-tileimage")
    private String msapplicationTileimage;
    @JsonProperty("msapplication-tilecolor")
    private String msapplicationTilecolor;
    @JsonProperty("application-name")
    private String applicationName;
    @JsonProperty("remotenavjscontentbaseurl")
    private String remotenavjscontentbaseurl;
    @JsonProperty("lnkd-track-json-lib")
    private String lnkdTrackJsonLib;
    @JsonProperty("apphost")
    private String apphost;
    @JsonProperty("appversion")
    private String appversion;
    @JsonProperty("appinstance")
    private String appinstance;
    @JsonProperty("detectadblock")
    private String detectadblock;
    @JsonProperty("twitter:site")
    private String twitterSite;
    @JsonProperty("twitter:card")
    private String twitterCard;
    @JsonProperty("twitter:description")
    private String twitterDescription;
    @JsonProperty("twitter:title")
    private String twitterTitle;
    @JsonProperty("article:wordcount")
    private String articleWordcount;
    @JsonProperty("parsely-title")
    private String parselyTitle;
    @JsonProperty("parsely-link")
    private String parselyLink;
    @JsonProperty("parsely-type")
    private String parselyType;
    @JsonProperty("parsely-image-url")
    private String parselyImageUrl;
    @JsonProperty("parsely-pub-date")
    private String parselyPubDate;
    @JsonProperty("parsely-section")
    private String parselySection;
    @JsonProperty("parsely-author")
    private String parselyAuthor;
    @JsonProperty("parsely-tags")
    private String parselyTags;
    @JsonProperty("\u201cparsely-post-id\u201d")
    private String parselyPostId;
    @JsonProperty("df-verify")
    private String dfVerify;

    @JsonProperty("viewport")
    public String getViewport() {
        return viewport;
    }

    @JsonProperty("viewport")
    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    @JsonProperty("theme-color")
    public String getThemeColor() {
        return themeColor;
    }

    @JsonProperty("theme-color")
    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    @JsonProperty("msapplication-navbutton-color")
    public String getMsapplicationNavbuttonColor() {
        return msapplicationNavbuttonColor;
    }

    @JsonProperty("msapplication-navbutton-color")
    public void setMsapplicationNavbuttonColor(String msapplicationNavbuttonColor) {
        this.msapplicationNavbuttonColor = msapplicationNavbuttonColor;
    }

    @JsonProperty("apple-mobile-web-app-capable")
    public String getAppleMobileWebAppCapable() {
        return appleMobileWebAppCapable;
    }

    @JsonProperty("apple-mobile-web-app-capable")
    public void setAppleMobileWebAppCapable(String appleMobileWebAppCapable) {
        this.appleMobileWebAppCapable = appleMobileWebAppCapable;
    }

    @JsonProperty("apple-mobile-web-app-status-bar-style")
    public String getAppleMobileWebAppStatusBarStyle() {
        return appleMobileWebAppStatusBarStyle;
    }

    @JsonProperty("apple-mobile-web-app-status-bar-style")
    public void setAppleMobileWebAppStatusBarStyle(String appleMobileWebAppStatusBarStyle) {
        this.appleMobileWebAppStatusBarStyle = appleMobileWebAppStatusBarStyle;
    }

    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    @JsonProperty("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    @JsonProperty("al:ios:app_store_id")
    public String getAlIosAppStoreId() {
        return alIosAppStoreId;
    }

    @JsonProperty("al:ios:app_store_id")
    public void setAlIosAppStoreId(String alIosAppStoreId) {
        this.alIosAppStoreId = alIosAppStoreId;
    }

    @JsonProperty("al:ios:app_name")
    public String getAlIosAppName() {
        return alIosAppName;
    }

    @JsonProperty("al:ios:app_name")
    public void setAlIosAppName(String alIosAppName) {
        this.alIosAppName = alIosAppName;
    }

    @JsonProperty("og:title")
    public String getOgTitle() {
        return ogTitle;
    }

    @JsonProperty("og:title")
    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    @JsonProperty("og:type")
    public String getOgType() {
        return ogType;
    }

    @JsonProperty("og:type")
    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    @JsonProperty("og:site_name")
    public String getOgSiteName() {
        return ogSiteName;
    }

    @JsonProperty("og:site_name")
    public void setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName;
    }

    @JsonProperty("fb:app_id")
    public String getFbAppId() {
        return fbAppId;
    }

    @JsonProperty("fb:app_id")
    public void setFbAppId(String fbAppId) {
        this.fbAppId = fbAppId;
    }

    @JsonProperty("og:url")
    public String getOgUrl() {
        return ogUrl;
    }

    @JsonProperty("og:url")
    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    @JsonProperty("og:image")
    public String getOgImage() {
        return ogImage;
    }

    @JsonProperty("og:image")
    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    @JsonProperty("og:description")
    public String getOgDescription() {
        return ogDescription;
    }

    @JsonProperty("og:description")
    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    @JsonProperty("apple-itunes-app")
    public String getAppleItunesApp() {
        return appleItunesApp;
    }

    @JsonProperty("apple-itunes-app")
    public void setAppleItunesApp(String appleItunesApp) {
        this.appleItunesApp = appleItunesApp;
    }

    @JsonProperty("google-play-app")
    public String getGooglePlayApp() {
        return googlePlayApp;
    }

    @JsonProperty("google-play-app")
    public void setGooglePlayApp(String googlePlayApp) {
        this.googlePlayApp = googlePlayApp;
    }

    @JsonProperty("g-client-id")
    public String getGClientId() {
        return gClientId;
    }

    @JsonProperty("g-client-id")
    public void setGClientId(String gClientId) {
        this.gClientId = gClientId;
    }

    @JsonProperty("f-client-id")
    public String getFClientId() {
        return fClientId;
    }

    @JsonProperty("f-client-id")
    public void setFClientId(String fClientId) {
        this.fClientId = fClientId;
    }

    @JsonProperty("apple-itunes-app-beta")
    public String getAppleItunesAppBeta() {
        return appleItunesAppBeta;
    }

    @JsonProperty("apple-itunes-app-beta")
    public void setAppleItunesAppBeta(String appleItunesAppBeta) {
        this.appleItunesAppBeta = appleItunesAppBeta;
    }

    @JsonProperty("tk")
    public String getTk() {
        return tk;
    }

    @JsonProperty("tk")
    public void setTk(String tk) {
        this.tk = tk;
    }

    @JsonProperty("tkt")
    public String getTkt() {
        return tkt;
    }

    @JsonProperty("tkt")
    public void setTkt(String tkt) {
        this.tkt = tkt;
    }

    @JsonProperty("stp")
    public String getStp() {
        return stp;
    }

    @JsonProperty("stp")
    public void setStp(String stp) {
        this.stp = stp;
    }

    @JsonProperty("react")
    public String getReact() {
        return react;
    }

    @JsonProperty("react")
    public void setReact(String react) {
        this.react = react;
    }

    @JsonProperty("handheldfriendly")
    public String getHandheldfriendly() {
        return handheldfriendly;
    }

    @JsonProperty("handheldfriendly")
    public void setHandheldfriendly(String handheldfriendly) {
        this.handheldfriendly = handheldfriendly;
    }

    @JsonProperty("pageimpressionid")
    public String getPageimpressionid() {
        return pageimpressionid;
    }

    @JsonProperty("pageimpressionid")
    public void setPageimpressionid(String pageimpressionid) {
        this.pageimpressionid = pageimpressionid;
    }

    @JsonProperty("appname")
    public String getAppname() {
        return appname;
    }

    @JsonProperty("appname")
    public void setAppname(String appname) {
        this.appname = appname;
    }

    @JsonProperty("pagekey")
    public String getPagekey() {
        return pagekey;
    }

    @JsonProperty("pagekey")
    public void setPagekey(String pagekey) {
        this.pagekey = pagekey;
    }

    @JsonProperty("treeid")
    public String getTreeid() {
        return treeid;
    }

    @JsonProperty("treeid")
    public void setTreeid(String treeid) {
        this.treeid = treeid;
    }

    @JsonProperty("globaltrackingurl")
    public String getGlobaltrackingurl() {
        return globaltrackingurl;
    }

    @JsonProperty("globaltrackingurl")
    public void setGlobaltrackingurl(String globaltrackingurl) {
        this.globaltrackingurl = globaltrackingurl;
    }

    @JsonProperty("globaltrackingappname")
    public String getGlobaltrackingappname() {
        return globaltrackingappname;
    }

    @JsonProperty("globaltrackingappname")
    public void setGlobaltrackingappname(String globaltrackingappname) {
        this.globaltrackingappname = globaltrackingappname;
    }

    @JsonProperty("globaltrackingappid")
    public String getGlobaltrackingappid() {
        return globaltrackingappid;
    }

    @JsonProperty("globaltrackingappid")
    public void setGlobaltrackingappid(String globaltrackingappid) {
        this.globaltrackingappid = globaltrackingappid;
    }

    @JsonProperty("msapplication-tileimage")
    public String getMsapplicationTileimage() {
        return msapplicationTileimage;
    }

    @JsonProperty("msapplication-tileimage")
    public void setMsapplicationTileimage(String msapplicationTileimage) {
        this.msapplicationTileimage = msapplicationTileimage;
    }

    @JsonProperty("msapplication-tilecolor")
    public String getMsapplicationTilecolor() {
        return msapplicationTilecolor;
    }

    @JsonProperty("msapplication-tilecolor")
    public void setMsapplicationTilecolor(String msapplicationTilecolor) {
        this.msapplicationTilecolor = msapplicationTilecolor;
    }

    @JsonProperty("application-name")
    public String getApplicationName() {
        return applicationName;
    }

    @JsonProperty("application-name")
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    @JsonProperty("remotenavjscontentbaseurl")
    public String getRemotenavjscontentbaseurl() {
        return remotenavjscontentbaseurl;
    }

    @JsonProperty("remotenavjscontentbaseurl")
    public void setRemotenavjscontentbaseurl(String remotenavjscontentbaseurl) {
        this.remotenavjscontentbaseurl = remotenavjscontentbaseurl;
    }

    @JsonProperty("lnkd-track-json-lib")
    public String getLnkdTrackJsonLib() {
        return lnkdTrackJsonLib;
    }

    @JsonProperty("lnkd-track-json-lib")
    public void setLnkdTrackJsonLib(String lnkdTrackJsonLib) {
        this.lnkdTrackJsonLib = lnkdTrackJsonLib;
    }

    @JsonProperty("apphost")
    public String getApphost() {
        return apphost;
    }

    @JsonProperty("apphost")
    public void setApphost(String apphost) {
        this.apphost = apphost;
    }

    @JsonProperty("appversion")
    public String getAppversion() {
        return appversion;
    }

    @JsonProperty("appversion")
    public void setAppversion(String appversion) {
        this.appversion = appversion;
    }

    @JsonProperty("appinstance")
    public String getAppinstance() {
        return appinstance;
    }

    @JsonProperty("appinstance")
    public void setAppinstance(String appinstance) {
        this.appinstance = appinstance;
    }

    @JsonProperty("detectadblock")
    public String getDetectadblock() {
        return detectadblock;
    }

    @JsonProperty("detectadblock")
    public void setDetectadblock(String detectadblock) {
        this.detectadblock = detectadblock;
    }

    @JsonProperty("twitter:site")
    public String getTwitterSite() {
        return twitterSite;
    }

    @JsonProperty("twitter:site")
    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    @JsonProperty("twitter:card")
    public String getTwitterCard() {
        return twitterCard;
    }

    @JsonProperty("twitter:card")
    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    @JsonProperty("twitter:description")
    public String getTwitterDescription() {
        return twitterDescription;
    }

    @JsonProperty("twitter:description")
    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    @JsonProperty("twitter:title")
    public String getTwitterTitle() {
        return twitterTitle;
    }

    @JsonProperty("twitter:title")
    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    @JsonProperty("article:wordcount")
    public String getArticleWordcount() {
        return articleWordcount;
    }

    @JsonProperty("article:wordcount")
    public void setArticleWordcount(String articleWordcount) {
        this.articleWordcount = articleWordcount;
    }

    @JsonProperty("parsely-title")
    public String getParselyTitle() {
        return parselyTitle;
    }

    @JsonProperty("parsely-title")
    public void setParselyTitle(String parselyTitle) {
        this.parselyTitle = parselyTitle;
    }

    @JsonProperty("parsely-link")
    public String getParselyLink() {
        return parselyLink;
    }

    @JsonProperty("parsely-link")
    public void setParselyLink(String parselyLink) {
        this.parselyLink = parselyLink;
    }

    @JsonProperty("parsely-type")
    public String getParselyType() {
        return parselyType;
    }

    @JsonProperty("parsely-type")
    public void setParselyType(String parselyType) {
        this.parselyType = parselyType;
    }

    @JsonProperty("parsely-image-url")
    public String getParselyImageUrl() {
        return parselyImageUrl;
    }

    @JsonProperty("parsely-image-url")
    public void setParselyImageUrl(String parselyImageUrl) {
        this.parselyImageUrl = parselyImageUrl;
    }

    @JsonProperty("parsely-pub-date")
    public String getParselyPubDate() {
        return parselyPubDate;
    }

    @JsonProperty("parsely-pub-date")
    public void setParselyPubDate(String parselyPubDate) {
        this.parselyPubDate = parselyPubDate;
    }

    @JsonProperty("parsely-section")
    public String getParselySection() {
        return parselySection;
    }

    @JsonProperty("parsely-section")
    public void setParselySection(String parselySection) {
        this.parselySection = parselySection;
    }

    @JsonProperty("parsely-author")
    public String getParselyAuthor() {
        return parselyAuthor;
    }

    @JsonProperty("parsely-author")
    public void setParselyAuthor(String parselyAuthor) {
        this.parselyAuthor = parselyAuthor;
    }

    @JsonProperty("parsely-tags")
    public String getParselyTags() {
        return parselyTags;
    }

    @JsonProperty("parsely-tags")
    public void setParselyTags(String parselyTags) {
        this.parselyTags = parselyTags;
    }

    @JsonProperty("\u201cparsely-post-id\u201d")
    public String getParselyPostId() {
        return parselyPostId;
    }

    @JsonProperty("\u201cparsely-post-id\u201d")
    public void setParselyPostId(String parselyPostId) {
        this.parselyPostId = parselyPostId;
    }

    @JsonProperty("df-verify")
    public String getDfVerify() {
        return dfVerify;
    }

    @JsonProperty("df-verify")
    public void setDfVerify(String dfVerify) {
        this.dfVerify = dfVerify;
    }

}

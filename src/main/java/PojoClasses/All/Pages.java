package PojoClasses.All;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Pages {

   @SerializedName("type")
   String type;

   @SerializedName("title")
   String title;

   @SerializedName("displaytitle")
   String displaytitle;

    public Pages() {
    }

    public Pages(String type, String title, String displaytitle, Namespace namespace, String wikibaseItem, Titles titles, int pageid, Thumbnail thumbnail, Originalimage originalimage, String lang, String dir, String revision, String tid, Date timestamp, String description, String descriptionSource, Coordinates coordinates, ContentUrls contentUrls, String extract, String extractHtml, String normalizedtitle) {
        this.type = type;
        this.title = title;
        this.displaytitle = displaytitle;
        this.namespace = namespace;
        this.wikibaseItem = wikibaseItem;
        this.titles = titles;
        this.pageid = pageid;
        this.thumbnail = thumbnail;
        this.originalimage = originalimage;
        this.lang = lang;
        this.dir = dir;
        this.revision = revision;
        this.tid = tid;
        this.timestamp = timestamp;
        this.description = description;
        this.descriptionSource = descriptionSource;
        this.coordinates = coordinates;
        this.contentUrls = contentUrls;
        this.extract = extract;
        this.extractHtml = extractHtml;
        this.normalizedtitle = normalizedtitle;
    }

    @SerializedName("namespace")
   Namespace namespace;

   @SerializedName("wikibase_item")
   String wikibaseItem;

   @SerializedName("titles")
   Titles titles;

   @SerializedName("pageid")
   int pageid;

   @SerializedName("thumbnail")
   Thumbnail thumbnail;

   @SerializedName("originalimage")
   Originalimage originalimage;

   @SerializedName("lang")
   String lang;

   @SerializedName("dir")
   String dir;

   @SerializedName("revision")
   String revision;

   @SerializedName("tid")
   String tid;

   @SerializedName("timestamp")
   Date timestamp;

   @SerializedName("description")
   String description;

   @SerializedName("description_source")
   String descriptionSource;

   @SerializedName("coordinates")
   Coordinates coordinates;

   @SerializedName("content_urls")
   ContentUrls contentUrls;

   @SerializedName("extract")
   String extract;

   @SerializedName("extract_html")
   String extractHtml;

   @SerializedName("normalizedtitle")
   String normalizedtitle;


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setDisplaytitle(String displaytitle) {
        this.displaytitle = displaytitle;
    }
    public String getDisplaytitle() {
        return displaytitle;
    }
    
    public void setNamespace(Namespace namespace) {
        this.namespace = namespace;
    }
    public Namespace getNamespace() {
        return namespace;
    }
    
    public void setWikibaseItem(String wikibaseItem) {
        this.wikibaseItem = wikibaseItem;
    }
    public String getWikibaseItem() {
        return wikibaseItem;
    }
    
    public void setTitles(Titles titles) {
        this.titles = titles;
    }
    public Titles getTitles() {
        return titles;
    }
    
    public void setPageid(int pageid) {
        this.pageid = pageid;
    }
    public int getPageid() {
        return pageid;
    }
    
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }
    public Thumbnail getThumbnail() {
        return thumbnail;
    }
    
    public void setOriginalimage(Originalimage originalimage) {
        this.originalimage = originalimage;
    }
    public Originalimage getOriginalimage() {
        return originalimage;
    }
    
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getLang() {
        return lang;
    }
    
    public void setDir(String dir) {
        this.dir = dir;
    }
    public String getDir() {
        return dir;
    }
    
    public void setRevision(String revision) {
        this.revision = revision;
    }
    public String getRevision() {
        return revision;
    }
    
    public void setTid(String tid) {
        this.tid = tid;
    }
    public String getTid() {
        return tid;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setDescriptionSource(String descriptionSource) {
        this.descriptionSource = descriptionSource;
    }
    public String getDescriptionSource() {
        return descriptionSource;
    }
    
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }
    
    public void setContentUrls(ContentUrls contentUrls) {
        this.contentUrls = contentUrls;
    }
    public ContentUrls getContentUrls() {
        return contentUrls;
    }
    
    public void setExtract(String extract) {
        this.extract = extract;
    }
    public String getExtract() {
        return extract;
    }
    
    public void setExtractHtml(String extractHtml) {
        this.extractHtml = extractHtml;
    }
    public String getExtractHtml() {
        return extractHtml;
    }
    
    public void setNormalizedtitle(String normalizedtitle) {
        this.normalizedtitle = normalizedtitle;
    }
    public String getNormalizedtitle() {
        return normalizedtitle;
    }
    
}
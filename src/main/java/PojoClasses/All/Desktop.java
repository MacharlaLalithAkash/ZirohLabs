package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class Desktop {

   @SerializedName("page")
   String page;

   @SerializedName("revisions")
   String revisions;

    public Desktop() {
    }

    public Desktop(String page, String revisions, String edit, String talk) {
        this.page = page;
        this.revisions = revisions;
        this.edit = edit;
        this.talk = talk;
    }

    @SerializedName("edit")
   String edit;

   @SerializedName("talk")
   String talk;


    public void setPage(String page) {
        this.page = page;
    }
    public String getPage() {
        return page;
    }
    
    public void setRevisions(String revisions) {
        this.revisions = revisions;
    }
    public String getRevisions() {
        return revisions;
    }
    
    public void setEdit(String edit) {
        this.edit = edit;
    }
    public String getEdit() {
        return edit;
    }
    
    public void setTalk(String talk) {
        this.talk = talk;
    }
    public String getTalk() {
        return talk;
    }
    
}
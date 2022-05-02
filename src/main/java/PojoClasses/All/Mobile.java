package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class Mobile {

   @SerializedName("page")
   String page;

   @SerializedName("revisions")
   String revisions;

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
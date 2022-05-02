package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class ContentUrls {

   @SerializedName("desktop")
   Desktop desktop;

    public ContentUrls(Desktop desktop, Mobile mobile) {
        this.desktop = desktop;
        this.mobile = mobile;
    }

    public ContentUrls() {
    }

    @SerializedName("mobile")
   Mobile mobile;


    public void setDesktop(Desktop desktop) {
        this.desktop = desktop;
    }
    public Desktop getDesktop() {
        return desktop;
    }
    
    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }
    public Mobile getMobile() {
        return mobile;
    }
    
}
package PojoClasses.Events;

import com.google.gson.annotations.SerializedName;

   
public class Titles {

   @SerializedName("canonical")
   String canonical;

   @SerializedName("normalized")
   String normalized;

   @SerializedName("display")
   String display;


    public void setCanonical(String canonical) {
        this.canonical = canonical;
    }
    public String getCanonical() {
        return canonical;
    }
    
    public void setNormalized(String normalized) {
        this.normalized = normalized;
    }
    public String getNormalized() {
        return normalized;
    }
    
    public void setDisplay(String display) {
        this.display = display;
    }
    public String getDisplay() {
        return display;
    }
    
}
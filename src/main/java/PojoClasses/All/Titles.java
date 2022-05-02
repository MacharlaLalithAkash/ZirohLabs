package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class Titles {

   @SerializedName("canonical")
   String canonical;

    public Titles(String canonical, String normalized, String display) {
        this.canonical = canonical;
        this.normalized = normalized;
        this.display = display;
    }

    public Titles() {
    }

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
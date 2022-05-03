package PojoClasses.Deaths;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Deaths {

   @SerializedName("text")
   String text;

   @SerializedName("pages")
   List<Pages> pages;

   @SerializedName("year")
   int year;


    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    
    public void setPages(List<Pages> pages) {
        this.pages = pages;
    }
    public List<Pages> getPages() {
        return pages;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    
}
package PojoClasses.All;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class Selected {

   @SerializedName("text")
   String text;

   @SerializedName("pages")
   List<Pages> pages;

    @SerializedName("year")
    int year;

    public Selected(String text, List<Pages> pages, int year) {
        this.text = text;
        this.pages = pages;
        this.year = year;
    }


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
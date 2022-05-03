package PojoClasses.Deaths;

import com.google.gson.annotations.SerializedName;

   
public class Namespace {

   @SerializedName("id")
   int id;

   @SerializedName("text")
   String text;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    
}
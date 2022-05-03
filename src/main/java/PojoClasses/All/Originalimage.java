package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class Originalimage {

   @SerializedName("source")
   String source;

   @SerializedName("width")
   int width;

    @SerializedName("height")
   int height;

    public void setSource(String source) {
        this.source = source;
    }
    public String getSource() {
        return source;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    public int getWidth() {
        return width;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    
}
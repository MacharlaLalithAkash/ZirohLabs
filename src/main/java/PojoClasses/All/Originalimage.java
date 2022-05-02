package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class Originalimage {

   @SerializedName("source")
   String source;

   @SerializedName("width")
   int width;

    public Originalimage() {
    }

    @SerializedName("height")
   int height;

    public Originalimage(String source, int width, int height) {
        this.source = source;
        this.width = width;
        this.height = height;
    }

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
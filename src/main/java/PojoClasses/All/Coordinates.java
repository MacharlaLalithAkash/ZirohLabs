package PojoClasses.All;

import com.google.gson.annotations.SerializedName;

   
public class Coordinates {

   @SerializedName("lat")
   double lat;

   @SerializedName("lon")
   double lon;


    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLat() {
        return lat;
    }
    
    public void setLon(double lon) {
        this.lon = lon;
    }
    public double getLon() {
        return lon;
    }
    
}
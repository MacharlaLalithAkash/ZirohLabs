package PojoClasses.Deaths;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class BoilerInput {

   @SerializedName("deaths")
   List<Deaths> deaths;


    public void setDeaths(List<Deaths> deaths) {
        this.deaths = deaths;
    }
    public List<Deaths> getDeaths() {
        return deaths;
    }
    
}
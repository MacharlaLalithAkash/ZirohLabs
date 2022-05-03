package PojoClasses.Births;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class BoilerInput {

   @SerializedName("births")
   List<Births> births;


    public void setBirths(List<Births> births) {
        this.births = births;
    }
    public List<Births> getBirths() {
        return births;
    }
    
}
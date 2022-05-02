package PojoClasses.All;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class ExampleJson2KtPOJO {

   @SerializedName("selected")
   List<Selected> selected;


    public void setSelected(List<Selected> selected) {
        this.selected = selected;
    }
    public List<Selected> getSelected() {
        return selected;
    }
    
}
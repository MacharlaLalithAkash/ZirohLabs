package PojoClasses.Events;
import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class BoilerInput {

   @SerializedName("events")
   List<Events> events;


    public void setEvents(List<Events> events) {
        this.events = events;
    }
    public List<Events> getEvents() {
        return events;
    }
    
}
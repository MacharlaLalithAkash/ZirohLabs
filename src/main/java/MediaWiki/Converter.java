package MediaWiki;

import com.google.gson.Gson;

/*
Purely responsible to convert JSON string into POJO object
 */

public class Converter {
   private final Gson gson = new Gson();

    public PojoClasses.All.BoilerInput allPojo(String json) {
        PojoClasses.All.BoilerInput result = new PojoClasses.All.BoilerInput();
        result.setSelected(gson.fromJson(json, PojoClasses.All.BoilerInput.class).getSelected());

        return result;
    }


    public PojoClasses.Births.BoilerInput birthsPojo(String json) {
        PojoClasses.Births.BoilerInput result = new PojoClasses.Births.BoilerInput();
        result.setBirths(gson.fromJson(json, PojoClasses.Births.BoilerInput.class).getBirths());

        return result;
    }


    public PojoClasses.Deaths.BoilerInput deathPojo(String json) {
        PojoClasses.Deaths.BoilerInput result = new PojoClasses.Deaths.BoilerInput();
        result.setDeaths(gson.fromJson(json, PojoClasses.Deaths.BoilerInput.class).getDeaths());

        return result;
    }


    public PojoClasses.Events.BoilerInput eventsPojo(String json) {
        PojoClasses.Events.BoilerInput result = new PojoClasses.Events.BoilerInput();
        result.setEvents(gson.fromJson(json, PojoClasses.Events.BoilerInput.class).getEvents());

        return result;
    }


    public  PojoClasses.Selected.BoilerInput selectedPojo(String json) {
        PojoClasses.Selected.BoilerInput result = new  PojoClasses.Selected.BoilerInput();
        result.setSelected(gson.fromJson(json, PojoClasses.Selected.BoilerInput.class).getSelected());

        return result;
    }

    
}
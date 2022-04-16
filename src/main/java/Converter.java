import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class Converter {

//    public Births jsonToObj(String json) {
//        Gson gson = new Gson();
//        return gson.fromJson(json, Births.class);
//    }

    public void parseObject(JSONObject json, String key) {
        System.out.println(json.get(key));
    }

    public void getKey(JSONObject json, String key) {

        boolean exists = json.has(key);
        Iterator<?> keys;
        String nextKeys;

        if (!exists) {
            keys = json.keys();
            while (keys.hasNext()) {
                nextKeys = (String) keys.next();
                try {
                    if (json.get(nextKeys) instanceof JSONObject) {
                        getKey(json.getJSONObject(nextKeys), key);
                    } else if (json.get(nextKeys) instanceof JSONArray) {
                        JSONArray jsonarray = json.getJSONArray(nextKeys);
                        for (int i = 0; i < jsonarray.length(); i++) {
                            String jsonarrayString = jsonarray.get(i).toString();
                            JSONObject innerJSOn = new JSONObject(jsonarrayString);

                            getKey(innerJSOn, key);

                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            parseObject(json, key);
        }
    }

//    public void objToJson(Object obj) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//        try (FileWriter writer = new FileWriter("D:\\Test\\staff.json")) {
//            gson.toJson(obj, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}

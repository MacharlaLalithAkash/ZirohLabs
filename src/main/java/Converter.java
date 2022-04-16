import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

public class Converter {


    //Prints the values of the provided key value from json.
    public void parseObject(JSONObject json, String key) {
        System.out.println(json.get(key));
    }

    // Getting Key from JSON file. Works recursively and prints all the values using parseObject function.
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
}

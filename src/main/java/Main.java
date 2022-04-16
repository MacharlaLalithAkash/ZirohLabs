import org.json.JSONObject;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Creating Objects of HttpCallActions and Converter to convert JSON to POJO
        var converter = new Converter();
        var message = new HttpCallActions();

        // /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
        String json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/births/02/05");

        // Converting json String into POJO
        JSONObject inputJSONObject = new JSONObject(json);
        converter.getKey(inputJSONObject, "originalimage");

        // Converting POJO to JSON
//        String myJson = inputJSONObject.toString();
//        System.out.println("\n \n"+myJson);
    }
}

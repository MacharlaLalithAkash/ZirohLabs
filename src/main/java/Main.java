import org.json.JSONObject;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Main {

    public static void main(String[] args) throws Exception {

        // Creating Objects of HttpCallActions and Converter to convert JSON to POJO
        var converter = new Converter();
        var message = new HttpCallActions();

        // AES256 CBC Essentials
        var aes = new AESUtil(256, "PBKDF2WithHmacSHA256");
        IvParameterSpec ivParameterSpec = aes.generateIv();
        SecretKey key = aes.generateKey();

        // /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
        // Types: all, selected, births, deaths, holidays, events
        String json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/all/04/17");

        // Converting json String into POJO
        JSONObject inputJSONObject = new JSONObject(json);
        converter.getKey(inputJSONObject, "originalimage");

        // Converting POJO to JSON
        String myJson = inputJSONObject.toString();
    }
}

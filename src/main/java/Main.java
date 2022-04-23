import MediaWiki.Converter;
import MediaWiki.HttpCallActions;
import Security.AESUtil;
import org.json.JSONObject;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.util.Objects;

public class Main {

    public static void main(String[] args) throws Exception {

        // Creating Objects of MediaWiki.HttpCallActions and MediaWiki.Converter to convert JSON to POJO
        var converter = new Converter();
        var message = new HttpCallActions();

        // AES256 CBC
        AESUtil aes = new AESUtil(256);
        SecretKey key = aes.generateKey();
        IvParameterSpec ivParameterSpec = aes.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";

        // /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
        // Types: all, selected, births, deaths, holidays, events
        String json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/all/04/17");
        var cipherText = aes.encrypt(algorithm, json, key, ivParameterSpec);
        var plainText = aes.decrypt(algorithm, cipherText, key, ivParameterSpec);
        System.out.println("\n\n\nResult = " + Objects.equals(plainText, json));

        // Converting json String into POJO
        JSONObject inputJSONObject = new JSONObject(json);
        converter.getKey(inputJSONObject, "originalimage");

        // Converting POJO to JSON
        String myJson = inputJSONObject.toString();
    }
}

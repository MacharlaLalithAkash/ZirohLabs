import DataBase.DbOperations;
import MediaWiki.Converter;
import MediaWiki.Dates;
import MediaWiki.HttpCallActions;
import Security.AESUtil;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws Exception {

        String path = "C:\\sqlite\\";
        String dbName =  "ONTHISDAY.db";

        // Creating Objects of MediaWiki.HttpCallActions and MediaWiki.Converter to convert JSON to POJO
//        var converter = new Converter();
        var message = new HttpCallActions();
        var dbOperations = new DbOperations(path);

        // AES256 CBC
        AESUtil aes = new AESUtil(256);
        SecretKey key = aes.generateKey();
        IvParameterSpec ivParameterSpec = aes.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";
        var epochConverter = new Dates();


        // Getting List of dates in a year
        var dateList = epochConverter.getDateList(LocalDate.of(2022, 11, 1),
                LocalDate.of(2022, 12, 31));

        // Converting dateList into an epochList
        var epochList = epochConverter.toEpochList(dateList);
        System.out.println(epochList);
        //1667241000000

//        for (int i=0; i<epochList.size(); i++) {
//            String temp = String.valueOf(dateList.get(i));
//            String date = temp.replace("-", "/").substring(5);
//            // /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
//            // Types: all, selected, births, deaths, holidays, events
//            String json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/births/" + date);
//            System.out.println(i);
//            var cipherText = aes.encrypt(algorithm, json, key, ivParameterSpec);
////            String insertQuery = "INSERT INTO today_history_info (date, encrypted_info) VALUES(" + epochList.get(i) + ",'"+cipherText+")";
//            String insertQuery = "INSERT INTO today_history_info (date, encrypted_info) VALUES(" + i + ",'" + cipherText + "')";
////            System.out.println(insertQuery);
//            dbOperations.executeStatement(dbName, insertQuery);
//        }


////         /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
////         Types: all, selected, births, deaths, holidays, events
//
//        String json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/all/04/17");
        //var cipherText = aes.encrypt(algorithm, json, key, ivParameterSpec);
        //var plainText = aes.decrypt(algorithm, cipherText, key, ivParameterSpec);


//        // Converting json String into POJO
//        JSONObject inputJSONObject = new JSONObject(json);
//        converter.getKey(inputJSONObject, "originalimage");
//
//        // Converting POJO to JSON
//        String myJson = inputJSONObject.toString();
//
//        //Inserting Data
//        var insert = new InsertRecords();
    }
}

import DataBase.DbOperations;
import MediaWiki.Dates;
import MediaWiki.HttpCallActions;
import Security.AESUtil;
import org.json.JSONObject;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.time.LocalDate;
import java.util.Base64;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String path = "C:\\sqlite\\";
        String dbName =  "ONTHISDAY.db";
        var db = new DbOperations(path);

//        var converter = new ConverterGeneric();
        var message = new HttpCallActions();
        var dbOperations = new DbOperations(path);

        // AES256 CBC
        AESUtil aes = new AESUtil(256);
        SecretKey key = aes.generateKey();
        IvParameterSpec ivParameterSpec = aes.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";
        var epochConverter = new Dates();


        var dateList = epochConverter.getDateList(LocalDate.of(2022, 11, 4),
                LocalDate.of(2022, 11, 7));
        System.out.println(dateList);

        var epochList = epochConverter.toEpochList(dateList);
        System.out.println(epochList);

        for (int i=0; i<epochList.size(); i++) {

            var temp = String.valueOf(dateList.get(i));
            var date = temp.replace("-", "/").substring(5);

            // /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
            // Types: all, selected, births, deaths, holidays, events
            var json = message.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/births/" + date);

            var cipherText = aes.encrypt(algorithm, json, key, ivParameterSpec);

            var insertQuery = "INSERT INTO today_history_info (date, encrypted_info) VALUES(" + epochList.get(i) + ",'" + cipherText + "')";

            dbOperations.createTable(dbName, insertQuery);
            System.out.println(i);
        }


        System.out.print("Enter Date(yyyy-MM-dd): ");
        var date = scanner.next();

        while (!date.equals("quit")) {
            var epochKey = epochConverter.toEpoch(date);
            var retrievedInfo = db.getValues(dbName, epochKey);
            var plainText = aes.decrypt(algorithm, retrievedInfo, key, ivParameterSpec);
            System.out.println(plainText);
            System.out.print("Enter Date(yyyy-MM-dd): ");
            date = scanner.next();
        }


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

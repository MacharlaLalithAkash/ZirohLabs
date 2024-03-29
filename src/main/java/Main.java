import DataBase.DbOperations;
import MediaWiki.Converter;
import MediaWiki.Dates;
import MediaWiki.HttpCallActions;
import Security.AESUtil;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class Main {

    public static void main(String[] args) throws Exception {

        String path = "src/main/java/DataBase/";
        String dbName =  "TEST.db";

        var dbOperations = new DbOperations(path);
        var client = new HttpCallActions();
        var epochConverter = new Dates();
        var pojoConverter = new Converter();

        AESUtil aes = new AESUtil(256);
        SecretKey key = aes.generateKey();
        IvParameterSpec ivParameterSpec = aes.generateIv();
        String algorithm = "AES/CBC/PKCS5Padding";

        dbOperations.createOnThisDayDb(dbName);

        // /feed/v1/wikipedia/{language}/onthisday/{type}/{MM}/{DD}
        // Types: all, selected, births, deaths, holidays, events
        var json = client.get("https://api.wikimedia.org/feed/v1/wikipedia/en/onthisday/births/11/05");
        var cipherJson = aes.encrypt(algorithm, json, key, ivParameterSpec);

        // Considered current year to just generate an epoch key
        // See converter class to use dateList, epochList

        var date = "2022-11-05";

        var epochDate = epochConverter.toEpoch(date);

        boolean status = false;

        String queryCheck = "SELECT date\n" +
                "FROM today_history_info\n" +
                "WHERE EXISTS (SELECT date FROM today_history_info WHERE today_history_info.date =  "+epochDate+");";

        dbOperations.executeQueries(dbName, queryCheck);

        dbOperations.insert(dbName, epochDate, cipherJson);

        var retrievedInfo = dbOperations.getValues(dbName, epochDate);

        var plainJson = aes.decrypt(algorithm, retrievedInfo, key, ivParameterSpec);

        // Below line is just to demonstrate that the modules are integrated and working properly
        System.out.println(pojoConverter.birthsPojo(plainJson).getBirths().get(0).getText());

    }
}

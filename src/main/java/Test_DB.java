import DataBase.Create;
import DataBase.CreateTable;
import DataBase.InsertRecords;
import DataBase.SelectRecords;

import java.lang.reflect.Array;
import java.util.List;
import java.util.*;

public class Test_DB {
    public static void main(String[] args) {
        var path = "C:/sqlite/";
        var fileName = "TEST.db";
        var url = path+fileName;
//        Hashtable<String, String> my_dict = new Hashtable<String, String>();
        String query = """
                CREATE TABLE IF NOT EXISTS today_history_info(
                   date integer,
                   encrypted_info text,
                   PRIMARY KEY(date)
                   );
                   """;
        var create = new Create();
//        create.createNewDatabase(path,fileName);
//      Created a Table of today_history_info
        var createTable = new CreateTable();
//        createTable.createNewTable(url, query);
//        Insert data
        var insert = new InsertRecords();
//        for (int i = 0; i < 5; i++) {
//            String sql = "INSERT INTO today_history_info(date, encrypted_info) VALUES("+i+",'kbdgfdgfkdgfkdlgdfgfdg@#')";
//            insert.insert(sql);
//        }
        String query1 = "SELECT * FROM today_history_info";
        var readData = new SelectRecords();
        readData.selectAll(query1);


    }
}

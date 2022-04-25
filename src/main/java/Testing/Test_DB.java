package Testing;

import DataBase.*;

public class Test_DB {
    public static void main(String[] args) {



        String path = "C:\sqlite";
        String dbName = "ONTHISDAY.db";
        var db = new DbOperations(path);

        String tableCreation = """
                CREATE TABLE IF NOT EXISTS today_history_info(
                   date integer,
                   encrypted_info text,
                   PRIMARY KEY(date)
                   );
                   """;

        db.createNewDatabase(dbName);
        db.createTable(dbName, tableCreation);
        for (int i = 0; i < 10; i++) {
            String insertQuery = "INSERT INTO today_history_info (date, encrypted_info) VALUES(" + i + ",'asifasif@#')";
            db.createTable(dbName, insertQuery);
        }
        //Accessing the particular date from table
//        db.selectAll(dbName,db.statement(10));
//        db.selectAll(dbName,"");
    }


}


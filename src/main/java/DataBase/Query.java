package DataBase;

import java.sql.SQLException;

public class Query {
    public static void main(String[] args) {
        String path = "C:\\sqlite\\";
        String dbName = "ONTHISDAY.db";
        var db = new DbOperations(path);

        String tableCreation = """
                CREATE TABLE IF NOT EXISTS today_history_info(
                   date INTEGER,
                   encrypted_info VARCHAR,
                   PRIMARY KEY(date)
                   );
                   """;
        db.createNewDatabase(dbName);
        db.createTable(dbName, tableCreation);
//        db.selectAll(dbName, db.statement(1667586600000L));
//        var x = db.getValues(dbName, 1667586600000L);
//        System.out.println(x);

    }
}

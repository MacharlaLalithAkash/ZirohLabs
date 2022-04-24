package DataBase;

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
        db.executeStatement(dbName, tableCreation);
    }
}

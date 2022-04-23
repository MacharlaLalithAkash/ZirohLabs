package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public void createNewTable(String url, String query) {
        // SQLite connection string  
         url = "jdbc:sqlite:" + url;

        // SQL statement for creating a new table  
//        String sql = """
//                CREATE TABLE IF NOT EXISTS today_history_info (
//                 date integer PRIMARY KEY,
//                 encrypted_info text NOT NULL,
//                );""";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }



} 
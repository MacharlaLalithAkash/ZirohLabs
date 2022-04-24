package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

    public void createNewTable(String path, String query) {

        // Connection URL
         String url = "jdbc:sqlite:" + path;

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

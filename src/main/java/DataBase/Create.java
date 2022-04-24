package DataBase;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Create {


    public void createNewDatabase(String path, String fileName) {
        String url = "jdbc:sqlite:" + path + fileName;
        System.out.println(url);

        try {
            Connection conn = DriverManager.getConnection(url);
            if (conn != null) {
                System.out.println("Connection established!");
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

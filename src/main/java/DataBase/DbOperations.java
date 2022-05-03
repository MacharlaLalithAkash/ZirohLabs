package DataBase;

import java.sql.*;
import java.io.File;

public class DbOperations {
    private final String url;
    private final String path;

    public DbOperations(String path) {
        this.url = "jdbc:sqlite:" + path;
        this.path = path;
    }

    // Creating OnThisDay database. This is specific to OnThisDay!
    public void createOnThisDayDb(String dbName) {
        createNewDatabase(dbName);
        createTable(dbName);
    }

    private void createNewDatabase(String fileName) {
        String url = this.url + fileName;

        File file = new File(path + fileName);
        if (file.exists()) {
            System.out.println("DataBase Already Exists!");
        }

        else {
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

    private void createTable(String dbName) {
        String tableCreationQuerie = """
                CREATE TABLE IF NOT EXISTS today_history_info(
                   date INTEGER,
                   encrypted_info VARCHAR,
                   PRIMARY KEY(date)
                   );
                   """;
        executeQueries(dbName, tableCreationQuerie);
    }


    // Create Table
    public void executeQueries(String dbName, String query) {
        String url = this.url + dbName;

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public String getValues(String dbName, long key) {
        String query = "SELECT * FROM today_history_info WHERE date = " + key;
        String url = this.url + dbName;

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt  = conn.createStatement();

            return stmt.executeQuery(query).getString("encrypted_info");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void selectAll(String dbName){
        String query = "SELECT * FROM today_history_info ";
        String url = this.url + dbName;

        try {
            Connection conn = DriverManager.getConnection(url);
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(query);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("date") +  "\t" +
                        rs.getString("encrypted_info") + "\t");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insert(String dbName, long epochDate, String data) {
        String query = "INSERT INTO today_history_info (date, encrypted_info) VALUES(" + epochDate + ",'" + data + "')";
        executeQueries(dbName, query);
    }

}

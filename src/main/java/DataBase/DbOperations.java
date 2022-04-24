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


    public void createNewDatabase(String fileName) {
        String url = this.url + fileName;

        File file = new File(path + fileName);
        if (file.exists()) {
            System.out.println("exists");
        }

        else {
            try {
                System.out.println(url);
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


    //All Insert, Update, Delete, Creation of NewTable (All Query executions)
    public void executeStatement(String dbName,String query) {
        String url = this.url + dbName;

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public String statement(int date){
        return "WHERE date="+date;
    }

    public void selectAll(String dbName, String select){
        String query = "SELECT * FROM today_history_info " + select;
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




}

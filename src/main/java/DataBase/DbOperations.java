package DataBase;

import java.sql.*;

public class DbOperations {
    private final String url;

    public DbOperations(String path) {
        this.url = "jdbc:sqlite:" + path;
    }


    public void createNewDatabase(String fileName) {
        String url = this.url + fileName;

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


    public void createNewTable(String query) {
        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(query);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void insert(String query) {
        try{
            Connection conn = DriverManager.getConnection(url);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}

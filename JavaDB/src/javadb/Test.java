package javadb;

import java.sql.*;

public class Test {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/javadatabase";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection con;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main (String[] args) {
        try {
            Class.forName(JDBC_DRIVER);
            
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            
            stmt = con.createStatement();
            
            String sql = "SELECT * FROM user";
            
            rs = stmt.executeQuery(sql);
            
            while(rs.next()) {
                System.out.println("Username: " + rs.getString("username"));
                System.out.println("Password: " + rs.getString("password"));
            }
            
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.jdbc;

import java.sql.*;

public class SQLScapesDemo {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/jdbc_demo_db";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            stmt = conn.createStatement();

            // Corrected SQL query
            String sqlQuery = "SELECT * FROM students WHERE blood_group LIKE 'O_%' ESCAPE '|'";

            ResultSet rs = stmt.executeQuery(sqlQuery);
            System.out.println("Students with blood group starting with 'AB':");
            while (rs.next()) {
                System.out.println("Student name: " + rs.getString("name") + ", Blood group: " + rs.getString("blood_group"));
            }

            // Close ResultSet
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

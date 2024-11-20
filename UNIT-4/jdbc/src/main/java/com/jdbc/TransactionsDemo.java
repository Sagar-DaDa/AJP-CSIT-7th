package com.jdbc;

import java.sql.*;

public class TransactionsDemo {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/jdbc_demo_db";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Disable auto-commit mode
            conn.setAutoCommit(false);

            // Create a statement object
            stmt = conn.createStatement();

            // Create two update queries
            String sql1 = "UPDATE students SET paid_fee = paid_fee + 50000 WHERE id = 1";
            String sql2 = "UPDATE students SET remaining_fee = remaining_fee - 50000 WHERE id = 1";

            // Execute both update queries
            stmt.executeUpdate(sql1);
            stmt.executeUpdate(sql2);

            // Commit the transaction
            conn.commit();

            // Display account balances after transaction
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            System.out.println("After Transaction Complete");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double paidFee = rs.getDouble("paid_fee");
                double remainingFee = rs.getDouble("remaining_fee");
                System.out.println("Student ID: " + id + ", Student Name: " + name +
                        ", Total paid: " + paidFee + ", Remaining fee: " + remainingFee);
            }

            // Close ResultSet
            rs.close();
        } catch (SQLException se) {
            // Rollback transaction in case of error
            if (conn != null) {
                conn.rollback();
                System.out.println("Transaction rolled back due to error: " + se.getMessage());
            }
        } finally {
            // Close resources
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }
}


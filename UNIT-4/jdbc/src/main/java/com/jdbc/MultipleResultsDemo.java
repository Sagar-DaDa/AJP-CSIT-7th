package com.jdbc;

import java.sql.*;

public class MultipleResultsDemo {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; // Updated driver name
    static final String DB_URL = "jdbc:mysql://localhost:3306/jdbc_demo_db?allowMultiQueries=true";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        int rsCount = 0;

        try {
            // Load the MySQL driver
            Class.forName(JDBC_DRIVER);

            // Establish a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a statement
            stmt = conn.createStatement();

            // Define the SQL query with multiple SELECT statements
            String sql = "SELECT * FROM students WHERE id < 4; SELECT * FROM students WHERE address = 'Biratnagar';";

            // Execute the SQL query
            boolean results = stmt.execute(sql);

            // Process multiple result sets
            do {
                if (results) {
                    ResultSet rs = stmt.getResultSet();
                    rsCount++;
                    System.out.println("RESULT SET #" + rsCount);

                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        String address = rs.getString("address");
                        String contact = rs.getString("contact");

                        // Print out the details of each record
                        System.out.print("ID: " + id);
                        System.out.print(", Name: " + name);
                        System.out.print(", Address: " + address);
                        System.out.println(", Contact: " + contact);
                    }

                    rs.close();
                }
                // Check for more result sets
                results = stmt.getMoreResults();
            } while (results);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        }
    }
}


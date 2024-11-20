package com.jdbc;

import javax.sql.rowset.*;

public class RowSetsDemo {
    public static void main(String[] args) throws Exception {
        RowSetFactory rowSetFactory = RowSetProvider.newFactory();

        JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

        // Set the database properties
        rowSet.setUrl("jdbc:mysql://localhost/jdbc_demo_db");
        rowSet.setUsername("root");
        rowSet.setPassword("root");

        // Set and execute the query command
        rowSet.setCommand("SELECT * FROM students");
        rowSet.execute();

        // Navigate to the last row and print data
        rowSet.last();
        System.out.println("-- Last row --");
        System.out.println(rowSet.getInt("id") + ", " + rowSet.getString("name") + ", " +
                rowSet.getString("address") + ", " + rowSet.getString("contact"));

        // Navigate to the first row and print data
        rowSet.first();
        System.out.println("-- First row --");
        System.out.println(rowSet.getInt("id") + ", " + rowSet.getString("name") + ", " +
                rowSet.getString("address") + ", " + rowSet.getString("contact"));
    }
}


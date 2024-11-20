package com.jdbc;

import java.sql.*;

public class Main {
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try{
            Class.forName(DRIVER);

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String sqlQuery = "SELECT * FROM students";

            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sqlQuery);

            while (resultSet.next()){
                System.out.println("\nID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Address: " + resultSet.getString("address"));
                System.out.println("Contact: " + resultSet.getString("contact"));
            }

            resultSet.close();

        }catch (ClassNotFoundException | SQLException exception){
            exception.printStackTrace();
        }finally {
            try{
                if (connection != null) connection.close();
                if (statement != null) statement.close();
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        }
    }
}
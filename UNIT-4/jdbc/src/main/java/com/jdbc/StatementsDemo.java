package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class StatementsDemo {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;
    private static Statement statement;

    static void startConnection(){
        try{
            System.out.println("Connecting to database...");
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null){
                System.out.println("Database connected successfully!");
            }
        }catch (SQLException | ClassNotFoundException exception){
            System.out.println("Something went wrong, database connection failed.");
        }
    }

    static void createStudents(String name, String address, String contact){
        startConnection();
        try{
            statement = connection.createStatement();
//            String query = "INSERT INTO students (name, address, contact) VALUES('Kuldip Shah','Biratnagar', '9801234567')";
            String query = String.format(
                    "INSERT INTO students (name, address, contact) VALUES('%s','%s', '%s')",
                    name, address, contact);
            int result = statement.executeUpdate(query);
            if (result > 0) System.out.println("Student created!");
            else System.out.println("Student creation failed.");
        }catch (SQLException sqlException){
            System.out.println("Something went wrong while creating student record.");
            sqlException.printStackTrace();
        }finally{
            try{
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        }
    }

    static void viewStudents(){
        startConnection();

        try{
            statement = connection.createStatement();
            String query = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next()){
                System.out.println("\nID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Address: " + resultSet.getString("address"));
                System.out.println("Contact: " + resultSet.getString("contact"));
            }

            resultSet.close();

        }catch (SQLException sqlException){
            System.out.println("Something went wrong while fetching student record.");
            sqlException.printStackTrace();
        }finally{
            try{
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Enter Student Details ***");

        System.out.println("Student name: ");
        String studentName = scanner.nextLine();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("Contact: ");
        String contact = scanner.nextLine();

        createStudents(studentName, address, contact);

        System.out.println("\nDo you want to view students list? (Y|N)");
        String answer = scanner.nextLine();

        if (answer.equals("Y") || answer.equals("y")){
            viewStudents();
        }

        System.out.println("\nThank you, goodbye!");
    }


}

package com.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CRUDOperationsDemo {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_demo_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection connection;

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter table name to create: ");
//        createTable(scanner.nextLine());
//        retrieveStudents();
        createStudent("Rohan Regmi", "Biratnagar", "9842345678");
//        updateStudent(8, "Rohan Regmi", "Biratnagar", "9876543210");
//        deleteStudent(8);
//        retrieveStudentByID(6);

    }

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

    static void createTable(String tableName) {
        Statement statement = null; // Use Statement instead of PreparedStatement for creating tables
        startConnection();

        try {
            // Construct the SQL query with the table name directly
//            String query = "CREATE TABLE " + tableName + " (student_name VARCHAR(50), age VARCHAR(10), mobile VARCHAR(10))";
            String query = "CREATE TABLE `" + tableName + "` (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), age VARCHAR(10), mobile VARCHAR(10))";

            // Use Statement instead of PreparedStatement for DDL commands
            statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("Table created!");

        } catch (SQLException sqlException) {
            System.out.println("Something went wrong while creating the table.");
            System.out.println("Reason: " + sqlException.getMessage());
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
    }

    static void createStudent(String name, String address, String contact){
        PreparedStatement preparedStatement = null;
        startConnection();

        try{
            String query = "INSERT INTO students (name, address, contact) VALUES (x, ?, ?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, contact);

            int result = preparedStatement.executeUpdate();

            if (result > 0) System.out.println("Student created!");
            else System.out.println("Student creation failed.");
        }catch (SQLException sqlException){
            System.out.println("Something went wrong while creating student record.");
            System.out.println("Reason: " + sqlException.getMessage());
        }finally{
            try{
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }
        }
    }

    static void retrieveStudents(){
        Statement statement = null;
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

    static void retrieveStudentByID(int studentID){
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        startConnection();

        try{
            String query = "SELECT * FROM students where id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentID);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                System.out.println("\nID: " + resultSet.getInt("id"));
                System.out.println("Name: " + resultSet.getString("name"));
                System.out.println("Address: " + resultSet.getString("address"));
                System.out.println("Contact: " + resultSet.getString("contact"));
            }else{
                System.out.println("No student found with ID: " + studentID);
            }
        }catch (SQLException sqlException){
            System.out.println("Something went wrong while fetching student record.");
            sqlException.printStackTrace();
        }finally{
            closeConnections(connection, resultSet, null, preparedStatement);
        }
    }

    static void updateStudent(int studentID, String studentName, String address, String  mobile){
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        startConnection();

        try{
            String query = "SELECT * FROM students where id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentID);

            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                String updateQuery = "UPDATE students SET name=?, address=?, contact=? WHERE id=?";
                preparedStatement = connection.prepareStatement(updateQuery);
                preparedStatement.setString(1, studentName);
                preparedStatement.setString(2, address);
                preparedStatement.setString(3, mobile);
                preparedStatement.setInt(4, studentID);

                int result = preparedStatement.executeUpdate();
                System.out.println((result > 0) ? "Student updated!" : "Student update failed!");
            }else{
                System.out.println("No student found with ID: " + studentID);
            }
        }catch (SQLException sqlException){
            System.out.println("Something went wrong while fetching student record.");
            sqlException.printStackTrace();
        }finally{
            closeConnections(connection, resultSet, null, preparedStatement);
        }
    }

    static void deleteStudent(int studentID){
        PreparedStatement preparedStatement = null;
        startConnection();

        try{
            String query = "DELETE FROM students where id=?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, studentID);
            int result = preparedStatement.executeUpdate();
            System.out.println((result > 0) ? "Student deleted!" : "Student delete failed!");
        }catch (SQLException sqlException){
            System.out.println("Something went wrong while fetching student record.");
            sqlException.printStackTrace();
        }finally{
            closeConnections(connection, null, null, preparedStatement);
        }
    }

    static void closeConnections(
            Connection connection,
            ResultSet resultSet,
            Statement statement,
            PreparedStatement preparedStatement){
        try{
            if (connection != null) connection.close();
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
            if (preparedStatement != null) preparedStatement.close();
            System.out.println("All connections are closed.");
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
    }
}

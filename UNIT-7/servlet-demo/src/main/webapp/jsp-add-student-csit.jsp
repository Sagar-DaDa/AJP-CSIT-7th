<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<%
    String studentName = request.getParameter("studentName");
    int age = Integer.parseInt(request.getParameter("age"));
    String mobile = request.getParameter("mobile");

    Connection con = null;
    PreparedStatement pstmt = null;
    String dbURL = "jdbc:mysql://localhost:3306/jdbc_demo_db"; // Update with your database name

    try {
        // Load JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Connect to database
        con = DriverManager.getConnection(dbURL, "root", "root"); // Update credentials

        // SQL Query to insert book data
        String sql = "INSERT INTO `student-table-csit` (name, age, mobile) VALUES (?, ?, ?)";
        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, studentName);
        pstmt.setInt(2, age);
        pstmt.setString(3, mobile);

        // Execute query
        int rows = pstmt.executeUpdate();

        if (rows > 0) {
%>
            <h3>Student added successfully!</h3>
<%
        } else {
%>
            <h3>Failed to add the Student.</h3>
<%
        }
    } catch (Exception e) {
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException se) {
            out.println("<h3>Error closing resources: " + se.getMessage() + "</h3>");
        }
    }
%>
</body>
</html>

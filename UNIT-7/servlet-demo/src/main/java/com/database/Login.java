package com.database;

import java.io.*;
import java.sql.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    Connection con = null;

    public void doPost(HttpServletRequest req, HttpServletResponse resp) 
    		throws IOException, ServletException {
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");

        String url = "jdbc:mysql://localhost:3306/jdbc_demo_db";  // JDBC URL for MySQL database
        try {
            String n = req.getParameter("txtid");  // User ID from form
            String p = req.getParameter("txtpass");  // Password from form

            Class.forName("com.mysql.cj.jdbc.Driver");  // Load MySQL JDBC driver
            con = DriverManager.getConnection(url, "root", "root");  // Connect to the database

            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM users WHERE username='" + n + "' AND password='" + p + "'";
            ResultSet rs = stmt.executeQuery(sql);

            if (!rs.next()) {
                out.println("<html><head><title>Login Error</title></head><body>");
                out.println("<br><br><b>Unknown User</b><br><br>");
                out.println("<h3>Access Denied</h3></body></html>");
            } else {
                out.println("<html><head><title>Login Success</title></head><body><center>");
                out.println("<b>Welcome, " + n + "</b><br>");
                out.println("<h3>You have successfully logged in.</h3>");
                out.println("</center></body></html>");
            }
            con.close();
        } catch (SQLException se) {
            out.println("Error: " + se);
        } catch (ClassNotFoundException cne) {
            out.println("Error: " + cne);
        }
    }
}


package com.backend;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormProcessingGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get the PrintWriter to write response
        PrintWriter out = response.getWriter();

        // Get parameters from the request
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");

        // Generate HTML response
        out.println("<html><head><title>Servlet Test</title></head>");
        out.println("<body>");
        out.println("<h1>First Name: " + firstName + "</h1>");
        out.println("<h1>Last Name: " + lastName + "</h1>");
        out.println("</body></html>");
    }
}

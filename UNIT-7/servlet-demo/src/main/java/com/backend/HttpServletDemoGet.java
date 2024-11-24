package com.backend;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HttpServletDemoGet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) 
    		throws ServletException, IOException {
        // Set the content type of the response
        res.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter pw = res.getWriter();

        // Write the HTML content
        pw.println("<html><body>");
        pw.println("<h2>Welcome to the Servlet</h2>");
        pw.println("<p>This is a response to a GET request.</p>");
        pw.println("</body></html>");

        // Close the PrintWriter stream
        pw.close();
    }
}


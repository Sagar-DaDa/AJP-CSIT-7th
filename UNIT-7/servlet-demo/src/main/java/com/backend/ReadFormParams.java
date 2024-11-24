package com.backend;

import java.io.*;
import java.util.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ReadFormParams extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        // Set the response content type to HTML
        response.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Get the Enumeration of all parameter names
        Enumeration<String> paramNames = request.getParameterNames();

        // Write the HTML response
        out.println("<html><head><title>Reading All Parameters</title></head><body bgcolor=\"#f0f0f0\">");
        out.println("<table width=\"50%\" border=\"1\" align=\"center\">");
        out.println("<tr><th>Param Name</th><th>Param Values</th></tr>");

        // Loop through the parameter names
        while (paramNames.hasMoreElements()) {
            // Get the parameter name
            String paramName = paramNames.nextElement();
            
            out.println("<tr><td>" + paramName + "</td><td>");
            
            // Get the values for the parameter
            String[] paramValues = request.getParameterValues(paramName);
            
            if (paramValues.length == 1) {
                String paramValue = paramValues[0];
                if (paramValue.length() == 0) {
                    out.println("<i>No Value</i>");
                } else {
                    out.println(paramValue);
                }
            } else {
                out.println("<ul>");
                for (String value : paramValues) {
                    out.println("<li>" + value + "</li>");
                }
                out.println("</ul>");
            }
            out.println("</td></tr>");
        }

        out.println("</table></body></html>");
    }
}

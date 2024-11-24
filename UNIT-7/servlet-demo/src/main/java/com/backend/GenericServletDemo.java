package com.backend;

import java.io.*;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServletDemo extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) 
    		throws IOException, ServletException {
        // Set content type for the response
        res.setContentType("text/html");
        
        // Get the output writer to send response data
        PrintWriter out = res.getWriter();
        
        // Write HTML response
        out.print("<html><body>");
        out.print("<b>Hello Generic Servlet</b>");
        out.print("</body></html>");
    }
}

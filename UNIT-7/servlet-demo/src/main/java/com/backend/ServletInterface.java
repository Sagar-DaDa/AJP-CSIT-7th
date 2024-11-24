package com.backend;

import java.io.*;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class ServletInterface implements Servlet {
    ServletConfig config = null;

    // Initialize the servlet
    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Servlet is initialized");
    }

    // Handle client requests
    public void service(ServletRequest req, ServletResponse res) 
            throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<html><body>");
        out.print("<b>Hello, simple servlet..</b>");
        out.print("</body></html>");
    }

    // Destroy the servlet
    public void destroy() {
        System.out.println("Servlet is destroyed.");
    }

    // Return servlet configuration
    public ServletConfig getServletConfig() {
        return config;
    }

    // Return servlet information
    public String getServletInfo() {
        return "Implementing Servlet Interface";
    }
}


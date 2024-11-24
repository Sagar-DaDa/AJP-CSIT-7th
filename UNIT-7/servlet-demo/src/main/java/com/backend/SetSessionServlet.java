package com.backend;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SetSessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");
        out.print("Welcome " + name);

        // Create or retrieve the session
        HttpSession session = request.getSession();
        session.setAttribute("uname", name); // Store user data in the session

        // Provide a link to visit another servlet
        out.print("<a href='getSession'>Visit Here</a>");
        out.close();
    }
}


package com.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ClearSessionServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve the existing session, if any
        HttpSession session = request.getSession(false); // false prevents creating a new session
        if (session != null) {
            session.invalidate();
            out.print("Session cleared.");
            out.print("<form action='getSession' method='GET'>");
            out.print("<a href='getSession'>Go back</a>");
            out.print("</form>");
        } else {
            out.print("No session found.");
        }
        out.close();
    }
}

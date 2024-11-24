package com.backend;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SetCookieServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");
        out.print("Welcome " + name);

        // Create cookie
        Cookie ck = new Cookie("name", name);
        ck.setMaxAge(60 * 60 * 24); // 1 day expiration
        response.addCookie(ck); // Add cookie to response

        // Provide link to read cookie
        out.print("<form action='getCookie' method='POST'>");
        out.print("<input type='submit' value='go'>");
        out.print("</form>");

        out.close();
    }
}


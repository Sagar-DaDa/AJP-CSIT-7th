package com.backend;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCookieServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies(); // Retrieve cookies
        if (cookies != null) {
            for (Cookie ck : cookies) {
                if (ck.getName().equals("name")) {
                    out.print("Hello " + ck.getValue()); // Display cookie value
                }
            }
        } else {
            out.print("No cookies found");
        }

        out.close();
    }
}


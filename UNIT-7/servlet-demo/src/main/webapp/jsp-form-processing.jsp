<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Form Processing</title>
</head>
<body>
    <%
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String sex = request.getParameter("sex");
        String country = request.getParameter("country");
    %>
    <center>
        <h2>Hello, <%= firstName %> <%= lastName %>!</h2>
        <p>I see that you are <%= sex %> and from <%= country %>.</p>
    </center>
</body>
</html>
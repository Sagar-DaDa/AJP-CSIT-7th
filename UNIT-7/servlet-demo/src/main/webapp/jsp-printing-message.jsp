<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Repetition</title>
</head>
<body>
   <center>
   		<%-- Expression Tag --%>	
       <h2><%= "Print 10 Times" %></h2> 
       <hr color="blue" size="3">
       
       <%-- Scriptlet Tag --%>
       <% 
           for (int i = 0; i < 10; i++) {
               out.println("Biratnagar, Nepal<br>");
           } 
       %>
   </center>
</body>
</html>
<%-- 
    Document   : user
    Created on : Aug 26, 2016, 11:47:11 PM
    Author     : ankitmishra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h1>you are ${message} user</h1>
       
        <c:forEach var="i" begin="1" end="5">
            Item <c:out value="${i}"/><p>
        </c:forEach>
    
    </body>
</html>

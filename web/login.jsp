<%-- 
    Document   : login
    Created on : Apr 26, 2025, 8:58:20 AM
    Author     : Computing Fundamental - HCM Campus
--%>
<%-- 
    Document   : login
    Created on : Apr 26, 2025, 8:58:20 AM
    Author     : Computing Fundamental - HCM Campus
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <hr/>
        <form action="MainController" method="post">
            User ID: <input type="text" name="userID"/> <br/>
            Password:  <input type="password" name="password"/><br/>
            <input type="submit" value="Login" name="action"/>
        </form>
        <h2 style="color: red">${requestScope.ERROR}</h2>
    </body>
</html>
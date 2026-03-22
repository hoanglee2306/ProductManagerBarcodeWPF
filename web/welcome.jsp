<%-- 
    Document   : welcome
    Created on : Apr 26, 2025, 8:58:34 AM
    Author     : Computing Fundamental - HCM Campus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
    </head>
    <body>
        
        
<body>
    <header>
        <h1>WELCOME TO PAGE</h1>
    </header>

    <nav>
        <a href="#">WELCOME ${sessionScope.LOGIN_USER.fullName}</a>
        <a href="MainController?action=Logout">Logout</a>
    </nav>
        <!--your code here-->
    </body>
</html>

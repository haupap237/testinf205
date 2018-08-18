<%-- 
    Document   : registration
    Created on : Jul 29, 2017, 12:58:12 AM
    Author     : Kai Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{background: #ccffcc}
            
        </style>
    </head>
    <body>
    <center>
        <h1>Register new Account</h1>
        <s:form action="insertAccount" method="post">
            <s:textfield name="username" label="Username" required="true"/>
            <s:password name="password" label="Password" required="true"/>
            <s:textfield name="lastname" label="Lastname" required="true"/>
            <s:checkbox name="isAdmin" label="IsAdmin"/>
            <s:submit value="Register"/>
        </s:form>
        <a href="index.jsp">Again Login</a>
    </center>
    </body>
</html>

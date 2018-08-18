<%-- 
    Document   : fail
    Created on : Jul 28, 2017, 11:33:09 PM
    Author     : Kai Nguyen
--%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <font color="red"> Invalid Username or Password</font><br/>
        <s:if test="not emty #request.NamingErrors">
            The Naming Service occurs errors:<s:property value="%{#request.NamingErrors}"/><br/>
            
        </s:if>
        <s:if test="not emty #request.SQLErrors">
            The SQL Service occurs errors:<s:property value="%{#request.SQLErrors}"/>
        </s:if>
        <a href="index.jsp">Again Login</a><br />
        <a href="show.jsp">Again Update</a>
        </center>
    </body>
</html>

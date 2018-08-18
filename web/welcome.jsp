<%-- 
    Document   : welcome
    Created on : Jul 28, 2017, 11:29:46 PM
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
            h1{color: red}
        </style>
    </head>
    <body>
    <center>
        <h1>Login Account</h1>
        <s:if test="#session.USER !=''">
            <font color="red">Welcome,<s:property value="%{#session.USER}"/></font>
        </s:if>
            <s:form action="searchLikeLastname">
                <s:textfield name="nameSearch" label="Name"/>
                <s:submit value="Search"/>
            </s:form>
            
            

            
            
            </center>
    </body>
</html>

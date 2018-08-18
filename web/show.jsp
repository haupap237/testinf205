<%-- 
    Document   : show
    Created on : Jul 29, 2017, 12:16:13 AM
    Author     : Kai Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!--<link href="css/style.css" rel="stylesheet" type="text/css"/>-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{background:#ccffcc}
            h1{color: #0000cc}
            td{width: 20px; height: 40px}
            
            
            
        </style>
    </head>
    <body>
    <center>
        <s:if test="#session.USER !=''">
            <font color="red">Welcome,<s:property value="%{#session.USER}"/></font>
        </s:if>
        <h1>Show Result !!</h1>
        <s:property value="nameSearch"/><br />
        <s:form action="searchLikeLastname">
                <s:textfield name="nameSearch" label="Name"/><br/>
                <s:submit value="Search"/>
                
            </s:form>
<!--        <div class="tbl-header">-->
<!--        <table cellpadding="0" cellspacing="0" border="1">-->
            <table border="3" > 
            <thead>
                <tr>
                    <td style="background: #cc00cc">No.</td>
                    <td style="background: #cc00cc">Username</td>
                    <td style="background: #cc00cc">Password</td>
                    <td style="background: #cc00cc">Lastname</td>
                    <td style="background: #cc00cc">Roles</td>
                    <td style="background: #cc00cc">Delete</td>
                    <td style="background: #cc00cc">Update</td>
                    
                </tr>
            </thead>
<!--        </table>
        </div>-->
            <tbody>
<!--            <div class="tbl-content">-->
<!--                <table cellpadding="0" cellspacing="0" border="0">-->
                <s:iterator value="list" status="listStatus">
                    <tr>
                        <s:form action="updateAccount" theme="simple" >
                           
                        <td><s:property value="#listStatus.count"/></td>
                        <td><s:property value="username"/></td>
                        <td><s:password value="%{password}" name="password" showPassword="true"/></td>
                        <td><s:textfield value="%{lastname}" name="lastname" /></td>
                        <td><s:checkbox value="%{isAdmin}" name="isAdmin"/></td>
                        
                        <s:url id="delete" action="deleteAccount">
                            <s:param name="username" value="username"/>
                            <s:param name="nameSearch" value="nameSearch"/>
                        </s:url>
                                                                       
                        <td><s:a href="%{delete}">Delete</s:a></td>
                        
                        <td>
                        <s:hidden name="username" value="%{username}"/>
                        <s:hidden name="nameSearch" value="%{nameSearch}"/>
                        <s:submit value="Update"/>
                        </td>
                        </s:form>
                        
                        
                    </tr>
                    
                </s:iterator>
<!--                </table>-->
<!--            </div> -->
            
            </tbody>
        </table>
        
            
        
        <a href="show.jsp">Again Search</a><br />
        <a href="index.jsp">Again login</a><br/>
        <a href="register.jsp">Add New Account</a>
        </center>
    </body>
</html>

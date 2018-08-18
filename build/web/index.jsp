<%-- 
    Document   : index
    Created on : Jul 28, 2017, 11:15:57 PM
    Author     : Kai Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://s.codepen.io/assets/libs/modernizr.js" type="text/javascript"></script>


  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

  
      <link rel="stylesheet" href="css/style.css">
      <style>
          body{background:#ccffcc}
          
      </style>
	
    </head>
    <body >
    <div class="login">
  <header class="header">
    <span class="text">LOGIN</span>
    <span class="loader"></span>
  </header>
      
            
        
        <s:form action="login" method="post" >
            <s:textfield  name="username" placeholder="Username"/>
                <s:password  name="password" placeholder="Password"/>
                    <s:submit value="Login"/>
                        
        </s:form>
          <a href="register.jsp">New Account</a>
      
       
        
    </div>
        

    
     
    </body>
</html>

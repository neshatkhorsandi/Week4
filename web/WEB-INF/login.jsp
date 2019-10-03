<%-- 
    Document   : login
    Created on : Sep 26, 2019, 4:28:55 PM
    Author     : 784789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
       <h1>Login</h1>
       <div>
        <form action="login" method="post">
            Username: <input type="text" name="username" size="15" value="${userName}"><br>
            Password: <input type="text" name="pass" size="15" value="${passWord}"><br>
        <input type="submit" value="Log in">
        </form>
       </div>
        
        ${display}
       </body>
</html>

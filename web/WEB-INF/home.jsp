<%-- 
    Document   : home
    Created on : Oct 2, 2019, 12:10:35 PM
    Author     : 784789
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>HomePage</h1>
        <div>
            <form action="home" method="post">
                <h2>Hello ${user.userN}</h2>
            </form>            
        </div>
    </body>
</html>

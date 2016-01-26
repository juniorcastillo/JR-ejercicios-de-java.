<%-- 
    Document   : resultado
    Created on : 20-ene-2016, 14:37:36
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <% request.setCharacterEncoding("UTF-8"); %>
         Hola , 
        <% out.print(request.getParameter("Nombre"));%>
    </body>
</html>

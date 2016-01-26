<%-- 
    Document   : Ejercicio7C
    Created on : 22-ene-2016, 11:16:22
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio7.2</title>
    </head>
    <body>
          <%
         
           double pesetas = Double.parseDouble(request.getParameter("euro"));

            int euros= (int) ( pesetas / 166.38);
            
           out.print( pesetas+ " pesetas son " + euros + " Euro.");
          %>
    </body>
</html>

<%-- 
    Document   : NumeroCubo
    Created on : 22-ene-2016, 21:15:16
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
           table, td, th {
           border: 1px solid black;
        } 
        </style>
    </head>
    <body>
      <form method="post" action="Cuadradoycubo.jsp">
            Por favor, introduzca un numero que quiere leer las cifras: <br>
            <input type="number" name="numero"><br>
            <input type="submit" value="Aceptar"><br>
            
       </form>
    </body>
</html>

<%-- 
    Document   : Ejercicio4
    Created on : 20-ene-2016, 14:43:57
    Author     : USER
 Realiza una aplicación que calcule la media de tres notas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio4</title>
    </head>
    <body>
        
      
   <form method="post" action="media.jsp">
       Introduzca tres notas:<br>
             nota1 <input type="number" name="primero"><br>
             nota2 <input type="number" name="segundo"><br>
             nota3 <input type="number" name="tercero"><br>
            <input type="submit" value="Aceptar">
       </form>
          
     
    </body>
</html>

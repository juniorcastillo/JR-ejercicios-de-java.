<%-- 
    Document   : Ejercicio7
    Created on : 21-ene-2016, 9:12:36
    Author     : USER
* Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
  se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
  foto o dibujo 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercio7</title>
    </head>
    <body>
         <h1>conversor de pesetas a euros y euros a pesetas</h1>
       <form method="post" action="Ejercicio7B.jsp">
            Por favor, introduce la cantidad de euro: <br>
            <input type="number" name="pesetas"><br>
            <input type="submit" value="Aceptar"><br>
            
       </form>
         <form method="post" action="Ejercicio7C.jsp">
       Por favor, introduce la cantidad de peseta:<br>
            <input type="number" name="euro"><br>
            <input type="submit" value="Aceptar">
       </form>
         
    </body>
</html>

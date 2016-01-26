<%-- 
Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
nombre introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3</title>
        
         
        
    </head>
    <body>
       <form method="post" action="resultado.jsp">
              Introduzca tu  nombre 
              <input type="text" name="Nombre">
              <input type="submit" value="OK">
       </form>
          
    </body>
</html>

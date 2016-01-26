<%-- 
    Document   : CantidadCifras
    Created on : 22-ene-2016, 12:15:03
    Author     : USER
*Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       int numeroDeDigitos = 1;
       int numeroIntroducido;
       double n;

       out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
       numeroIntroducido = Integer.parseInt(request.getParameter("cifra"));
          n = numeroIntroducido;
     do { 
             n=n/10; 

           numeroDeDigitos++;

         } while ( n > 10);
       out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
   %>
    </body>
</html>

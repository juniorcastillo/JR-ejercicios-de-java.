<%-- 
    Document   : Fibonaccio
    Created on : 25-ene-2016, 20:05:43
    Author     : USER
*Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144… El número n se debe introducir por teclado.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <link rel="stylesheet" type="text/css" href="piramidecss.css"> 
    <body>
      
        <%
         int PrimerNumero=0;
         int SegundoNumero;
         int Termino=0;
        
               out.print("Introduzca un número: ");
               
              SegundoNumero = Integer.parseInt(request.getParameter("numero"));
      
               out.println(" Este es el numero que comienza:<br> " + PrimerNumero);
               out.println(" Este es el numero introducido: " + SegundoNumero);
          do {
        
              out.print("<div><img src=\"blanco.jpg\"> </div>"  + Termino); 
             
             Termino = PrimerNumero + SegundoNumero ;
             PrimerNumero = SegundoNumero;
             SegundoNumero = Termino;
              
            }while ( Termino < 100);
      %>
    </body>
</html>

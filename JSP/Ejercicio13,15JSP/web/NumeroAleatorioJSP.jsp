<%-- 
    Document   : NumeroAleatorioJSP
    Created on : 25-ene-2016, 20:56:41
    Author     : USER
   * Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los primos deberán
     aparecer en un color diferente al resto.
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
        out.print("Números primos entre 1 y 200: ");
       
    boolean esPrimo = true;
    int n;
    int i;

    for (n = 1; n <= 100; n++) {
     int primo= (int)(Math.random()*201);
    
     
      esPrimo = true;
      for (i = 2; i < n; i++) {
        if (primo%i == 0) esPrimo = false;
      }
      
     
      if (esPrimo) {
        out.println("<div> " + primo + " </div> ");
      }else{
           out.println("<div> " + " </div> " );
         out.println( primo );  
      }
      
    }
       out.println();
    %>
    </body>
</html>

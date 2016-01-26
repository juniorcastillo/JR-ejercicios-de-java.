<%-- 
    Document   : Cuestionario
    Created on : 23-ene-2016, 14:20:48
    Author     : junior castillo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio10</title>
    </head>
    <body>
     <h1>Cuestionario</h1>
    <%
      
        int nota =0;
       
     
     
            for (Integer i = 1; i < 11; i++) {
             nota += Integer.valueOf(request.getParameter("punto" + i.toString()));  
                
            }
            out.print("Esta es tu nota" + nota);
            
    %>
    
    </body>
</html>

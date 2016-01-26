<%-- 
    Document   : TestInfidelidad
    Created on : 25-ene-2016, 18:51:37
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
             <link rel="stylesheet" type="text/css" href="TESTcss.css"> 
    <body>
        <%
      
           int  respuestas=0;
    
     
            for (Integer i = 1; i < 11; i++) {
                
              respuestas += Integer.valueOf(request.getParameter("resultado" + i.toString()));  
            
            }
             
            
        // Muestra el resultado del test
    
    if ( respuestas <= 10 ) {
       out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    }
    
    if ( (respuestas> 11 ) && (respuestas<= 22) ) {
      out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");    
          out.print("<div><img src=\"Cu.jpg\"> </div>");  
    }
    
    if ( respuestas >= 22 ) {
      out.print("<p>Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Y Usted estara como la imagen de mas abajo.</p>");
        out.print("<div><img src=\"cuerno.jpg\"> </div>");  
    }
    %>
    </body>
</html>

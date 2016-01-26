<%-- 
    Document   : Media
    Created on : 20-ene-2016, 14:58:32
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        La media de los tres numero es 
    
          
        
           <% 
               int nota1 = Integer.valueOf(request.getParameter("primero"));
               int nota2 = Integer.valueOf(request.getParameter("segundo"));
               int nota3 = Integer.valueOf(request.getParameter("tercero"));
               int media = (nota1 + nota2 + nota3 )/ 3;
               out.println("La media es " + media);
            %>  
                
        
         
    </body>
</html>

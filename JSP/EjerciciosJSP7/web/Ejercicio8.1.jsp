<%-- 
    Document   : Ejercicio8
    Created on : 22-ene-2016, 11:26:20
    Author     : USER
 * Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de ese número.
   El resultado se debe mostrar en una tabla (<table> en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          
       <table>
         <%
       
       int j=1;
       int producto;
       
      
        int numero = Integer.parseInt(request.getParameter("i"));
     
          do { 
               producto= numero * j ;
            
              out.println("<tr><td>" + numero + "x" + j + "</td> <td> = " + producto+ "</td></tr>");
                
                 j++;
      
         }while (j <= 12);
         
       %> </table>
        
    </body>
</html>

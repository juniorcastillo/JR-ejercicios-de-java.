<%-- 
    Document   : Ejercicio7B
    Created on : 21-ene-2016, 9:21:46
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EJercicio7.1</title>
    </head>
    <body>
      <%
          String conversor = request.getParameter("conversor");
          if(conversor.equals("EuroPeseta")){
           double euros = Double.parseDouble(request.getParameter("euro"));

            int pesetas = (int) (euros * 166.386);

           out.print(euros + " euros son " + pesetas + " pesetas.");
          }
          else{
               double pesetas = Double.parseDouble(request.getParameter("peseta"));

              int euros = (int) ( pesetas / 166.38);
            
             out.print( pesetas+ " pesetas son " + euros + " Euro.");
          }
          
        %>
        
    </body>
</html>

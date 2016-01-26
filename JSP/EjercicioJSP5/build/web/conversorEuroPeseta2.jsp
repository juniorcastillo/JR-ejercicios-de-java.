<%-- 
    Document   : conversorEuroPeseta2
    Created on : 21-ene-2016, 8:50:31
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
        
       <%
         
           double euros = Double.parseDouble(request.getParameter("peseta"));

            int pesetas = (int) (euros * 166.386);

           out.print(euros + " euros son " + pesetas + " pesetas.");
        %>
    </body>
</html>

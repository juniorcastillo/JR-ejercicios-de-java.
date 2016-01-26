<%-- 
    Document   : conversorPesetaEuro2
    Created on : 21-ene-2016, 9:01:30
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
         
           double pesetas = Double.parseDouble(request.getParameter("peseta"));

            int euros = (int) ( pesetas / 166.38);
            
           out.print( pesetas+ " pesetas son " + euros + " Euro.");
        %>
    </body>
</html>

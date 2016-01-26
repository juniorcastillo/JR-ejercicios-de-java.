<%-- 
    Document   : Cuadradoycubo
    Created on : 22-ene-2016, 21:04:29
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
        <table>
        <%
    
  int numeroIntroducido = Integer.parseInt(request.getParameter("numero"));
        out.println("<tr><td>  n </td><td>     n²</td><td>       n³</td></tr>     "); 
         out.println("------------------------------");
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      out.println("<tr><td>" + i + "</td> <td>" + i * i + "</td> <td>"+ i * i * i + "</td></tr>");
      
    }
    %>
        </table>
    </body>
</html>

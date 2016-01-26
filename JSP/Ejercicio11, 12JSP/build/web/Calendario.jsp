<%-- 
    Document   : Calendario
    Created on : 25-ene-2016, 16:33:52
    Author     : USER
*Escribe una aplicación que genere el calendario de un mes. Se pedirá el nombre del mes,
el año, el texto que queremos que aparezca sobre el calendario, el día de la semana en que
cae el día 1 y el número de días que tiene el mes.
--%>

<%@page import="java.util.stream.Stream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
      <link rel="stylesheet" type="text/css" href="calendariocss.css"> 
    <body>
        <h1> calendario</h1>
    <table>   
        <%
            
               String mesIntroducido = request.getParameter("mes");     
               String diaIntroducido = request.getParameter("DIA");
               int diaMes = Integer.parseInt(request.getParameter("numeroDiaMes"));
                
               out.print("<tr><td>" + mesIntroducido + "</td>");
               out.print("<td>" +diaIntroducido +  " </td> ");
               out.print( "<td>" + diaMes +  " </td></tr> ");    
             
        %>
    </table>
    </body>
</html>

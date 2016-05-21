<%--
    Document   : medico
    Created on : 20-may-2016, 21:22:48
    Author     : USER
--%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital Junioe castillo</title>
        <style>
            body{
                background-color: #b9c5dd;
            }
            table{
                 margin-left:39%;
            }
            th,td{
               
                border:1px solid #7d0707;
            }
            h1{
                text-transform: uppercase;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <h1>Informacion del medico </h1>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            Statement s = conexion.createStatement();

            ResultSet listadoMedico = s.executeQuery("SELECT * FROM medico  WHERE codMedico=" + request.getParameter("numero"));
        %>

        <table>
            <tr><th>CodMedico</th><th>NomMedico</th><th>TELEFONO</th></tr>
            
            <%
                 
                while (listadoMedico.next()) {
                    out.println("<tr><td>");
                    out.println(listadoMedico.getString("codmedico") + "</td> <td>");
                    out.println(listadoMedico.getString("nommedico") + "</td>");
                    out.println("<td>" + listadoMedico.getString("telefono") + "</td> </tr>");
                }
            %>
        </table>
        <br>

        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
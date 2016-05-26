<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


        <link href="css/style.css" rel="stylesheet">

        <title>Hospital - Junior castillo</title>
        <style>
            .izquierda{
                margin-left: 81%;
            }
            a.lista:link {
                color: green;
                background-color: transparent;
                text-decoration: none;
            }
            a.lista:visited {
                color: black;
                background-color: transparent;
                text-decoration: none;
            }
            a.lista:hover {
                color: red;
                background-color: transparent;
                text-decoration: underline;
            }
            a.lista:active {
                color: yellow;
                background-color: transparent;
                text-decoration: underline;
            }

        </style>
    </head>

    <body>
        <div >

            <%
                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
                Statement s = conexion.createStatement();

                ResultSet listado = s.executeQuery("SELECT * FROM Paciente");

            %>


            <%              Class.forName("com.mysql.jdbc.Driver");

                Statement n = conexion.createStatement();

                ResultSet listadoM = n.executeQuery("SELECT * FROM Paciente");

            %>



            <h1 class="letra" >Hospital</h1>
            <div class="contenedor" >
                <table>
                    <thead>
                        <tr>
                            <th>Nº d</th>
                            <th>Nombre</th>
                            <th>Direccion</th>
                            <th>Telefono</th>
                            <th>Diagnostico</th>
                            <th colspan="1">Tratamiento</th>
                            <th ><a class="lista" href="informacionMedico.jsp">Nº Medico</a></th>

                        </tr>
                    </thead>
                    <tbody>
                       <!--Anñade el paciente-->
                    <form method="get" action="altaPaciente.jsp">
                        <tr>
                            <td><input type="text" name="numero" size="5" required="required"></td>
                            <td><input type="text" name="nombre" size="22" required="required"></td>
                            <td><input type="text" name="direccion" size="15"></td>
                            <td><input type="text" name="telefono" size="20" required="required"></td>
                            <td><input type="text" name="diagnostico" size="22"></td>
                            <td><input type="text" name="tratamiento" size="20"></td>
                            <td>
                                <select name="medicos" required>
                                    <option value="">Elige el medico</option>
                                    <%  //Hago la consulta de los mediocs.
                                        String consultaproductos;
                                        consultaproductos = "select * from medico ;";
                                        //La ejecuto. 
                                        ResultSet rsproductos = n.executeQuery(consultaproductos);
                                        //Hago un while para ir rellenando el select.
                                        while (rsproductos.next()) {
                                    %>

                                    <option value="<%=rsproductos.getString("codMedico")%>">  <%=rsproductos.getString("nomMedico")%></option>                 
                                    <%
                                        }
                                    %>  
                                </select>
                            </td>
                            <td colspan="2"><button type="submit" value="Añadir" class="añade">Añadir</button></td>

                        </tr>
                    </form>
                    <tr>
                        <%
                            while (listado.next()) {
                                out.println("<tr><td>");
                                out.println(listado.getString("codPaciente") + "</td>");
                                out.println("<td>" + listado.getString("nomPaciente") + "</td>");
                                out.println("<td>" + listado.getString("direccion") + "</td>");
                                out.println("<td>" + listado.getString("telefono") + "</td>");
                                out.println("<td>" + listado.getString("diagnostico") + "</td>");
                                out.println("<td>" + listado.getString("tratamiento") + "</td>");
                                out.println("<td >" + listado.getString("medico") + "</td>");
                        %>


                        <td>
                            <form method="get" action="modificarPaciente.jsp">
                                <input type="hidden" name="numero" value="<%=listado.getString("codPaciente")%>">
                                <input type="hidden" name="nombre" value="<%=listado.getString("nomPaciente")%>">
                                <input type="hidden" name="direccion" value="<%=listado.getString("Direccion")%>">
                                <input type="hidden" name="telefono" value="<%=listado.getString("telefono")%>">
                                <input type="hidden" name="diagnostico" value="<%=listado.getString("diagnostico")%>">
                                <input type="hidden" name="tratamiento" value="<%=listado.getString("tratamiento")%>">
                                <input type="hidden" name="medico" value="<%=listado.getString("medico")%>">

                                <button type="submit" class="modificar" ><span ></span> Modificar</button>
                            </form>
                        </td>
                        <td>

                            <form method="get" action="borrarPaciente.jsp">
                                <input type="hidden" name="numero" value="<%=listado.getString("codPaciente")%>"/>
                                <button type="submit" class="borra"><span ></span> Eliminar</button>
                            </form>
                        </td>
                    </tr>
                    <%
                        } // while   

                        conexion.close();
                    %>


                    </tbody>
                </table>
                <form method="get" action="medico.jsp">

                    <input type="text" name="numero" size="5" required="required" class="izquierda">
                    <button type="submit" class="modificar"  ><span ></span>Consultar al   medico</button>
                </form>                   
            </div>



            <div >&copy; Junior castillo</div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
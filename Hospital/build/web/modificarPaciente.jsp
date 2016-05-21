<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap -->
        <link href="css/modifica.css" rel="stylesheet">
        <title>Junior castillo</title>
        <style>
            body{
                background-color: #11d989;
            }
            .contenedor{
                border:2px solid #11d989;
            }
            .titulo{
                font-size: 50px;
                text-align: center;
            }

            table{
                margin-left: 35%;
            }
            .centro{
                text-align: center;
            }

        </style>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8");%>
        <div class="contenedor">
            <br><br>
            <div >
                <div class="titulo">Modificación de Paciente</div><br><br>

                <form method="get" action="actualizaPaciente.jsp">
                    <table>
                        <tr> 
                            <th><label>Nº de Pacinete:</label></th><td><input type="text" size="20" name="numero" value="<%= request.getParameter("numero")%>" readonly></td></tr>

                        <tr>
                            <th> <label>Nombre:</label></th><td><input type="text" size="20" name="nombre" value="<%= request.getParameter("nombre")%>"></td></tr>


                        <tr><th> <label>Direccion:</label></th><td><input type="text" size="20" name="direccion" value="<%= request.getParameter("direccion")%>"></td>
                            <th><label>Telefono:</label></th><td><input type="text" size="5" name="telefono" value="<%= request.getParameter("telefono")%>"></td></tr>

                        <tr>
                            <th>  <label>Diagnostico</label></th><td><input type="text" name="diagnostico" size="20" value="<%= request.getParameter("diagnostico")%>"></td></tr>

                        <tr><th>
                                <label>Tratamiento:</label></th><td><input type="text" size="20" name="tratamiento" value="<%= request.getParameter("tratamiento")%>"></td><th>
                                <label>NumMedico:</label></th><td><input type="text" size="5" name="medico" value="<%= request.getParameter("medico")%>"></td></tr>


                    </table>
                    <hr>
                    &nbsp;&nbsp;<a href="lista.jsp" class="cancela"><span class="glyphicon glyphicon-remove"></span>Cancelar</a>
                    <button type="submit" class="acepta"><span class="glyphicon glyphicon-ok"></span>Aceptar</button><br><br>

                </form>

            </div>
            <div class="centro">&copy; Junior Castillo</div>
        </div>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
       
    </body>
</html>

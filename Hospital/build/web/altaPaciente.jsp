<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <title>Hospital - Junior castillo</title>
    </head>
    <body>
        <%
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");
            String mensaje="Paciente dado de alta correctamente";
            // Comprueba la existencia del número de paciente introducido
            String consultadeCodPaciente = "SELECT * FROM paciente WHERE codPaciente="
                    + Integer.valueOf(request.getParameter("numero"));

            ResultSet ConsultaPaciente = s.executeQuery(consultadeCodPaciente);
            ConsultaPaciente.last();

            if (ConsultaPaciente.getRow() > 0) {//Mira si el paciente existe  
                mensaje="El paciente existe";
            } else {
                String insercion = "INSERT INTO paciente VALUES (" + Integer.valueOf(request.getParameter("numero"))
                        + ", '" + request.getParameter("nombre")
                        + "', " + "'" + request.getParameter("direccion")
                        + "', " + "'" + request.getParameter("telefono")
                        + "', " + "'" + request.getParameter("diagnostico")
                        + "', " + "'" + request.getParameter("tratamiento")
                        + "', " + "'" + request.getParameter("medico") + "')";

                s.execute(insercion);//ejecuto la insercion (lo agrego)
             
               mensaje="El paciente esta agregado";
            }
            out.print("<script>alert(\"" + mensaje + "\")</script>"); //manda un mensaje  
            conexion.close();//cierro la conexion
%>
        <br>
     <script>document.location = "lista.jsp"</script> 
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
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
        <title>Junior Castillo</title>
    </head>
    <body>
        <%
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            Statement s = conexion.createStatement();
        String mensaje="paciente se ha modificado correctamente.";
            request.setCharacterEncoding("UTF-8");

            String actualizacion = "UPDATE paciente SET "
                    + "nomPaciente='" + request.getParameter("nombre")
                    + "', direccion='" + request.getParameter("direccion")
                    + "', telefono='" + request.getParameter("telefono")
                    + "', diagnostico='" + request.getParameter("diagnostico")
                    + "', tratamiento='" + request.getParameter("tratamiento")
                    + "', Medico='" + request.getParameter("medico")
                    + "' WHERE codPaciente=" + Integer.valueOf(request.getParameter("numero"));
            s.execute(actualizacion);
            out.print("<script>alert(\"" + mensaje + "\")</script>"); //manda un mensaje  
            conexion.close();
        %>
        <br>
        <script>document.location= "lista.jsp"</script>
                  
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
</body>
</html>
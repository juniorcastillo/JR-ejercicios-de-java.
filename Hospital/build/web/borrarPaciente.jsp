<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>

        <%
            String mensaje = "Paceinte borrado correctamente";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            Statement s = conexion.createStatement();

            s.execute("DELETE FROM paciente WHERE codPaciente=" + request.getParameter("numero"));
 
            out.print("<script>alert(\"" + mensaje + "\")</script>"); //manda un mensaje  
            s.close();
            
        %>	
        <script>document.location = "lista.jsp"</script> 
    </body>
</html>

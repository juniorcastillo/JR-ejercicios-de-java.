<%-- 
    Document   : Compruebo_Acceso
    Created on : 19-may-2016, 10:00:19
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

                    String enlace="index.jsp";
                    String mensaje="";
                    if (request.getParameter("usuario").equals("administrador@hotmail.com")) {

                        if (request.getParameter("clave").equals("1234")) {
                            enlace = "lista.jsp";
                            mensaje = "Bienvenido";
                        } else {
                            mensaje = "La clave es incorrecta";
                              enlace="index.jsp";
                        }

                    } else {
                        mensaje = "El usuario es incorrecto";
                        enlace ="index.jsp";

                    }
                    out.print("<script>alert(\"" + mensaje + "\")</script>"); //manda un mensaje  
                    
                %>
                <script>document.location= "<%=enlace%>"</script>
                  
    </body>
</html>

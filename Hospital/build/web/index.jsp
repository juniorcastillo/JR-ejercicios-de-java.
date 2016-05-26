<%-- 
    Document   : index
    Created on : 12-may-2016, 10:21:48
    Author     : USER
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
 <link href="css/principal.css" rel="stylesheet">
        </head>
        <body>
            <div class="container">
           

               
                <form id="signup" method="post" action="comprueboAcceso.jsp">
                    <div class="header">
                        <h3>Iniciar sesion</h3>
                    </div>
                    <div class="sep"></div>
                    <div class="inputs">

                        <input type="email" name="usuario" placeholder="Email" autofocus />

                        <input type="password" name="clave" placeholder="contraseña" />

                        <div class="checkboxy">
                            <input name="cecky" id="checky" value="1" type="checkbox" /><label class="terms">Guardar cuenta</label>
                        </div>
                        <button type="submit" class="btn">Destacado</button>
                    </div>

                </form>
            

         
            </div>

        </body>
    </html>
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class lista_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color:#0b2130;\n");
      out.write("            }\n");
      out.write("            .letra{\n");
      out.write("                font-size: 100px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border: 0px solid activecaption;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            th{background-color:#b9c5dd;}\n");
      out.write("            tbody{\n");
      out.write("                background-color:#e8e8e8;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .button\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                border: 1px solid #DBE1EB;\n");
      out.write("                font-size: 18px;\n");
      out.write("                font-family: Arial, Verdana;\n");
      out.write("                padding-left: 7px;\n");
      out.write("\n");
      out.write("                padding-right: 7px;\n");
      out.write("                padding-top: 5px;\n");
      out.write("                padding-bottom: 5px;\n");
      out.write("                border-radius: 4px;\n");
      out.write("\n");
      out.write("                -moz-border-radius: 4px;\n");
      out.write("\n");
      out.write("                -webkit-border-radius: 4px;\n");
      out.write("\n");
      out.write("                -o-border-radius: 4px;\n");
      out.write("\n");
      out.write("                background: #4972B5;\n");
      out.write("                background: linear-gradient(left, #4972B5, #618ACB);\n");
      out.write("\n");
      out.write("                background: -moz-linear-gradient(left, #4972B5, #618ACB);\n");
      out.write("\n");
      out.write("                background: -webkit-linear-gradient(left, #4972B5, #618ACB);\n");
      out.write("                background: -o-linear-gradient(left, #4972B5, #618ACB);\n");
      out.write("                color: #FFFFFF;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            .button:hover\n");
      out.write("\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                background: #365D9D;\n");
      out.write("\n");
      out.write("                background: linear-gradient(left, #365D9D, #436CAD);\n");
      out.write("\n");
      out.write("                background: -moz-linear-gradient(left, #365D9D, #436CAD);\n");
      out.write("\n");
      out.write("                background: -webkit-linear-gradient(left, #365D9D, #436CAD);\n");
      out.write("\n");
      out.write("                background: -o-linear-gradient(left, #365D9D, #436CAD);\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                border-color: #FBFFAD;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <title>Hospital - Junior castillo</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div >\n");
      out.write("\n");
      out.write("            ");

                Class.forName("com.mysql.jdbc.Driver");
                Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
                Statement s = conexion.createStatement();

                ResultSet listado = s.executeQuery("SELECT * FROM Paciente");


            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"contenedor\" >\n");
      out.write("\n");
      out.write("                <h1 class=\"letra\" >Hospital</h1>\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nº d</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Direccion</th>\n");
      out.write("                            <th>Telefono</th>\n");
      out.write("                            <th>Diagnostico</th>\n");
      out.write("                            <th colspan=\"1\">Tratamiento</th>\n");
      out.write("                            <th >Nº Medico</th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                    <form method=\"get\" action=\"altaPaciente.jsp\">\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\" name=\"numero\" size=\"5\" required=\"required\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"nombre\" size=\"30\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"direccion\" size=\"15\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"telefono\" size=\"15\" required=\"required\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"diagnostico\" size=\"22\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"tratamiento\" size=\"22\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"medico\" size=\"5\" required=\"required\"></td>\n");
      out.write("                            <td><button type=\"submit\" value=\"Añadir\">Añadir</button></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            ");
                                        while (listado.next()) {
                                    out.println("<tr><td>");
                                    out.println(listado.getString("codPaciente") + "</td>");
                                    out.println("<td>" + listado.getString("nomPaciente") + "</td>");
                                    out.println("<td>" + listado.getString("direccion") + "</td>");
                                    out.println("<td>" + listado.getString("telefono") + "</td>");
                                    out.println("<td>" + listado.getString("diagnostico") + "</td>");
                                    out.println("<td>" + listado.getString("tratamiento") + "</td>");
                                    out.println("<td >" + listado.getString("medico") + "</td>");
                            
      out.write("\n");
      out.write("                            <td>\n");
      out.write("                                <form method=\"get\" action=\"modificarPaciente.jsp\">\n");
      out.write("                                    <input type=\"hidden\" name=\"numero\" value=\"");
      out.print(listado.getString("codPaciente"));
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nomPaciente"));
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"direccion\" value=\"");
      out.print(listado.getString("Direccion"));
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"telefono\" value=\"");
      out.print(listado.getString("telefono"));
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"diagnostico\" value=\"");
      out.print(listado.getString("diagnostico"));
      out.write("\">\n");
      out.write("                                    <input type=\"hidden\" name=\"tratamiento\" value=\"");
      out.print(listado.getString("tratamiento"));
      out.write("\">\n");
      out.write("                                 ");
   
                                    ResultSet resultado = s.executeQuery("select * from medico" ); 
                                    out.println(" <select name='select'>"); 
                                        out.println("<option>codmedico</option>"); 

                                        // continuamos con el select 
                                        while (resultado.next()) 
                                        { 
                                        String login=listado.getString("codmedico");//guardamos un campo de resultado en una variable 
                                        String cedula=listado.getString("NomMedico");//guardamos un campo de resultado en una variable 



                                        out.println("<option value='"+login+"'>"+cedula+"</option>");//imprimimos el contenido del select  

                                        } 
      out.write("\n");
      out.write("                                      \n");
      out.write("                                        <input type=\"hidden\" name=\"medico\" value=\"");
      out.print(listado.getString("medico"));
      out.write("\">\n");
      out.write("\n");
      out.write("                                        <button type=\"submit\" class=\"\" ><span ></span> Modificar</button>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("\n");
      out.write("                                <form method=\"get\" action=\"borrarPaciente.jsp\">\n");
      out.write("                                    <input type=\"hidden\" name=\"numero\" value=\"");
      out.print(listado.getString("codPaciente"));
      out.write("\"/>\n");
      out.write("                                    <button type=\"submit\"><span ></span> Eliminar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            } // while   

                            conexion.close();
                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div >&copy; Junior castillo</div>\n");
      out.write("        </div>\n");
  
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
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <title>Hospital - Junior castillo</title>\n");
      out.write("        <style>\n");
      out.write("            .izquierda{\n");
      out.write("                margin-left: 81%;\n");
      out.write("            }\n");
      out.write("            a.lista:link {\n");
      out.write("                color: green;\n");
      out.write("                background-color: transparent;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            a.lista:visited {\n");
      out.write("                color: black;\n");
      out.write("                background-color: transparent;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            a.lista:hover {\n");
      out.write("                color: red;\n");
      out.write("                background-color: transparent;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("            a.lista:active {\n");
      out.write("                color: yellow;\n");
      out.write("                background-color: transparent;\n");
      out.write("                text-decoration: underline;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
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
      out.write("            ");
              Class.forName("com.mysql.jdbc.Driver");

                Statement n = conexion.createStatement();

                ResultSet listadoM = n.executeQuery("SELECT * FROM Paciente");

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h1 class=\"letra\" >Hospital</h1>\n");
      out.write("            <div class=\"contenedor\" >\n");
      out.write("                <table>\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Nº d</th>\n");
      out.write("                            <th>Nombre</th>\n");
      out.write("                            <th>Direccion</th>\n");
      out.write("                            <th>Telefono</th>\n");
      out.write("                            <th>Diagnostico</th>\n");
      out.write("                            <th colspan=\"1\">Tratamiento</th>\n");
      out.write("                            <th ><a class=\"lista\" href=\"InformacionMedico.jsp\">Nº Medico</a></th>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                       <!--Anñade el paciente-->\n");
      out.write("                    <form method=\"get\" action=\"altaPaciente.jsp\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"text\" name=\"numero\" size=\"5\" required=\"required\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"nombre\" size=\"22\" required=\"required\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"direccion\" size=\"15\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"telefono\" size=\"20\" required=\"required\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"diagnostico\" size=\"22\"></td>\n");
      out.write("                            <td><input type=\"text\" name=\"tratamiento\" size=\"20\"></td>\n");
      out.write("                            <td>\n");
      out.write("                                <select name=\"medicos\" required>\n");
      out.write("                                    <option value=\"\">Elige el medico</option>\n");
      out.write("                                    ");
  //Hago la consulta de los mediocs.
                                        String consultaproductos;
                                        consultaproductos = "select * from medico ;";
                                        //La ejecuto. 
                                        ResultSet rsproductos = n.executeQuery(consultaproductos);
                                        //Hago un while para ir rellenando el select.
                                        while (rsproductos.next()) {
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(rsproductos.getString("codMedico"));
      out.write("\">  ");
      out.print(rsproductos.getString("nomMedico"));
      out.write("</option>                 \n");
      out.write("                                    ");

                                        }
                                    
      out.write("  \n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                            <td colspan=\"2\"><button type=\"submit\" value=\"Añadir\" class=\"añade\">Añadir</button></td>\n");
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                    </form>\n");
      out.write("                    <tr>\n");
      out.write("                        ");

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
      out.write("\n");
      out.write("\n");
      out.write("                        <td>\n");
      out.write("                            <form method=\"get\" action=\"modificarPaciente.jsp\">\n");
      out.write("                                <input type=\"hidden\" name=\"numero\" value=\"");
      out.print(listado.getString("codPaciente"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"nombre\" value=\"");
      out.print(listado.getString("nomPaciente"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"direccion\" value=\"");
      out.print(listado.getString("Direccion"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"telefono\" value=\"");
      out.print(listado.getString("telefono"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"diagnostico\" value=\"");
      out.print(listado.getString("diagnostico"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"tratamiento\" value=\"");
      out.print(listado.getString("tratamiento"));
      out.write("\">\n");
      out.write("                                <input type=\"hidden\" name=\"medico\" value=\"");
      out.print(listado.getString("medico"));
      out.write("\">\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"modificar\" ><span ></span> Modificar</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <form method=\"get\" action=\"borrarPaciente.jsp\">\n");
      out.write("                                <input type=\"hidden\" name=\"numero\" value=\"");
      out.print(listado.getString("codPaciente"));
      out.write("\"/>\n");
      out.write("                                <button type=\"submit\" class=\"borra\"><span ></span> Eliminar</button>\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        } // while   

                        conexion.close();
                    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("                <form method=\"get\" action=\"medico.jsp\">\n");
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"numero\" size=\"5\" required=\"required\" class=\"izquierda\">\n");
      out.write("                    <button type=\"submit\" class=\"modificar\"  ><span ></span>Consultar al   medico</button>\n");
      out.write("                </form>                   \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div >&copy; Junior castillo</div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

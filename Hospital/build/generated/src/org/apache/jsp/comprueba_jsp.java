package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class comprueba_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/materialize.css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("  </head>\n");
      out.write("  \n");
      out.write("  <body>\n");
      out.write("  ");

    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root", " ");
    Statement s = conexion.createStatement();

    request.setCharacterEncoding("UTF-8");

    String consulta = "SELECT COUNT(*) FROM acceso WHERE usuario='"
                      + request.getParameter("usuario")
                      + "' AND clave='"
                      + request.getParameter("clave")
                      + "'";

    ResultSet coincidencias = s.executeQuery(consulta);
    coincidencias.next();
    
    String icono;
    String mensaje;
    String enlace;
    
    if (coincidencias.getInt(1) == 0) {
      icono = "<i class=\"mdi-action-lock red-text large\"></i>"; // candado cerrado
      mensaje = "<p>Lo siento, acceso denegado.</p>";
      enlace = "index.jsp";
    } else if (request.getParameter("usuario").equals("admin")) {
      icono = "<i class=\"mdi-action-supervisor-account teal-text large\"></i>";
      mensaje = "<p>Tiene acceso al área de gestión de usuarios.</p>"; // candado abierto
      enlace = "gestionUsuarios.jsp";
    } else {
      icono = "<i class=\"mdi-action-lock-open teal-text large\"></i>";
      mensaje = "<p>Acceso permitido a sus aplicaciones.</p>"; // candado abierto
      enlace = "indexAplicaciones.jsp?usuario=" + request.getParameter("usuario");
    };
    
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\"></div>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"row col m3\"></div>\n");
      out.write("        <div class=\"col m6 card-panel grey lighten-5 center\">\n");
      out.write("          <h5 class=\"center\">Control de acceso</h5>       \n");
      out.write("          ");
      out.print(icono );
      out.write("\n");
      out.write("          ");
      out.print(mensaje );
      out.write("\n");
      out.write("          <p class=\"center\">\n");
      out.write("            <a href=\"");
      out.print(enlace );
      out.write("\" class=\"btn waves-effect waves-light center\">\n");
      out.write("              Aceptar\n");
      out.write("              <i class=\"mdi-action-check-circle\"></i>\n");
      out.write("            </a>\n");
      out.write("          </p>\n");
      out.write("          <br>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!--Import jQuery before materialize.js-->\n");
      out.write("    <script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modificarPaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/modifica.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Junior castillo</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-color: #11d989;\n");
      out.write("            }\n");
      out.write("            .contenedor{\n");
      out.write("                border:2px solid #11d989;\n");
      out.write("            }\n");
      out.write("            .titulo{\n");
      out.write("                font-size: 50px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            table{\n");
      out.write("                margin-left: 35%;\n");
      out.write("            }\n");
      out.write("            .centro{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 request.setCharacterEncoding("UTF-8");
      out.write("\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("            <br><br>\n");
      out.write("            <div >\n");
      out.write("                <div class=\"titulo\">Modificación de Paciente</div><br><br>\n");
      out.write("\n");
      out.write("                <form method=\"get\" action=\"actualizaPaciente.jsp\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr> \n");
      out.write("                            <th><label>Nº de Pacinete:</label></th><td><input type=\"text\" size=\"20\" name=\"numero\" value=\"");
      out.print( request.getParameter("numero"));
      out.write("\" readonly></td></tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th> <label>Nombre:</label></th><td><input type=\"text\" size=\"20\" name=\"nombre\" value=\"");
      out.print( request.getParameter("nombre"));
      out.write("\"></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr><th> <label>Direccion:</label></th><td><input type=\"text\" size=\"20\" name=\"direccion\" value=\"");
      out.print( request.getParameter("direccion"));
      out.write("\"></td>\n");
      out.write("                            <th><label>Telefono:</label></th><td><input type=\"text\" size=\"5\" name=\"telefono\" value=\"");
      out.print( request.getParameter("telefono"));
      out.write("\"></td></tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <th>  <label>Diagnostico</label></th><td><input type=\"text\" name=\"diagnostico\" size=\"20\" value=\"");
      out.print( request.getParameter("diagnostico"));
      out.write("\"></td></tr>\n");
      out.write("\n");
      out.write("                        <tr><th>\n");
      out.write("                                <label>Tratamiento:</label></th><td><input type=\"text\" size=\"20\" name=\"tratamiento\" value=\"");
      out.print( request.getParameter("tratamiento"));
      out.write("\"></td><th>\n");
      out.write("                                <label>NumMedico:</label></th><td><input type=\"text\" size=\"5\" name=\"medico\" value=\"");
      out.print( request.getParameter("medico"));
      out.write("\"></td></tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                    <hr>\n");
      out.write("                    &nbsp;&nbsp;<a href=\"lista.jsp\" class=\"cancela\"><span class=\"glyphicon glyphicon-remove\"></span>Cancelar</a>\n");
      out.write("                    <button type=\"submit\" class=\"acepta\"><span class=\"glyphicon glyphicon-ok\"></span>Aceptar</button><br><br>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"centro\">&copy; Junior Castillo</div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("       \n");
      out.write("    </body>\n");
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

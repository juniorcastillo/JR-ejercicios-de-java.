package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CalendarioFormulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>CALENDARIO</h1>\n");
      out.write("        \n");
      out.write("        <form action=\"Calendario.jsp\"   method=\"get\" >\n");
      out.write("            <fieldset style=\"width: 30%\">\n");
      out.write("   \n");
      out.write("                <select name=\"mes\">\n");
      out.write("\t  \n");
      out.write("                    <option selected disabled>-Elegir mes-<option>\n");
      out.write("                    <option>Enero</option>\n");
      out.write("                    <option >FEBRERO</option>\n");
      out.write("                    <option>MARZO</option>\n");
      out.write("                    <option>APRIL</option>\n");
      out.write("                    <option >MAYO</option>\n");
      out.write("                    <option>JUNIO</option>\t\t\n");
      out.write("                    <option>JULIO</option>\n");
      out.write("                    <option >AGOSTO</option>\n");
      out.write("                    <option>SEPTIEMBRE</option>\t\n");
      out.write("                    <option>OCTUBRE</option>\n");
      out.write("                    <option > NOVIEMBRE</option>\n");
      out.write("                    <option>DICIEMBRE</option>\n");
      out.write("                </select>\n");
      out.write("                <br><br><br><br>\n");
      out.write("                <select name=\"DIA\">\n");
      out.write("\n");
      out.write("                    <option selected disabled>-Elegir dia-<option>\n");
      out.write("                    <option>LUNES</option>\n");
      out.write("                    <option >MARTES</option>\n");
      out.write("                    <option>MIERCOLES</option>\n");
      out.write("                    <option>JUEVES</option>\n");
      out.write("                    <option>VIERNES</option>\n");
      out.write("                    <option>SABADO</option>\t\t\n");
      out.write("                    <option>DOMINGO</option>\n");
      out.write("                  \n");
      out.write("                </select>\n");
      out.write("\t\t  <br><br>\n");
      out.write("                  Numero de dias del mes\n");
      out.write("                   <input type=\"number\"  name=\"numeroDiaMes\"  min=\"28\" max=\"31\"><br>\n");
      out.write("\t\t\n");
      out.write("            </fieldset>\n");
      out.write("        </form>\n");
      out.write("        \n");
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

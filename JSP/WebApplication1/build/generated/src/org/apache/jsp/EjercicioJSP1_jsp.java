package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EjercicioJSP1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Ejercicio 1</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div>");
 out.println("<h1> Ejercicio1 </h1> "); 
      out.write("<br>   \n");
      out.write("       ");
 out.println("Nombre: junior miguel "); 
      out.write("<br>\n");
      out.write("       ");
 out.println("Numero: 8095452196");
      out.write("<br> \n");
      out.write("       ");
 out.println("Dirreccion: manzana 14 número 50 "); 
      out.write("</div>\n");
      out.write("  \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- <form>\n");
      out.write("         <fieldset style=\"width: 40px\">\n");
      out.write("        <legend>Datos Personales:</legend>\n");
      out.write("         nombre: <input type=\"text\" name=\"nombre\" value=\"junior miguel castillo\" ><br>\n");
      out.write("         numero: <input type=\"number\" name=\"numero\" value=\"8095452164\" ><br>\n");
      out.write("         cumpleaños: <input type=\"data\" name=\"cumpleaños\" value=\"5/11\">\n");
      out.write("       </fieldset>\n");
      out.write("       <input type=\"submit\">\n");
      out.write("\n");
      out.write("     </form>-->\n");
      out.write("      \n");
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

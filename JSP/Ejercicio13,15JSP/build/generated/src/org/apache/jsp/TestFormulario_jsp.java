package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class TestFormulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1> TEST DE FIDELIDAD </h1>\n");
      out.write("        \n");
      out.write("          <form method=\"post\" action=\"TestInfidelidad.jsp\">\n");
      out.write("        1. ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.?</br>\n");
      out.write("      <input type=\"radio\" name=\"resultado1\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado1\" value=\"0\"> falso</input></br>\n");
      out.write("    \n");
      out.write("      2. ¿Ha aumentado sus gastos de vestuario.?</br>\n");
      out.write("   <input type=\"radio\" name=\"resultado2\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado2\" value=\"0\"> falso</input></br>\n");
      out.write("\n");
      out.write("      3.  Ha perdido el interés que mostraba anteriormente por ti..</br>\n");
      out.write("      <input type=\"radio\" name=\"resultado3\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado3\" value=\"0\"> falso</input></br>\n");
      out.write("\n");
      out.write("      4. ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).?</br>\n");
      out.write("     <input type=\"radio\" name=\"resultado4\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado4\" value=\"0\"> falso</input></br>\n");
      out.write("      5. ¿No te deja que mires la agenda de su teléfono móvil.?</br>\n");
      out.write("   <input type=\"radio\" name=\"resultado5\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado5\" value=\"0\"> falso</input></br>\n");
      out.write("\n");
      out.write("      6.A veces tiene llamadas que dice no querer contestar cuando estás tú delante.</br>\n");
      out.write("     <input type=\"radio\" name=\"resultado6\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado6\" value=\"0\"> falso</input></br>\n");
      out.write("      7. ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?</br>\n");
      out.write("       <input type=\"radio\" name=\"resultado7\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado7\" value=\"0\"> falso</input></br>\n");
      out.write("\n");
      out.write("      8.  Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?</br>\n");
      out.write("    <input type=\"radio\" name=\"resultado8\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado8\" value=\"0\"> falso</input></br>\n");
      out.write("      9. ¿Has notado que últimamente se perfuma más.?</br>\n");
      out.write("      <input type=\"radio\" name=\"resultado9\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado9\" value=\"0\"> falso</input></br>\n");
      out.write("      10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo.?</br>\n");
      out.write("     <input type=\"radio\" name=\"resultado10\" value=\"3\"> Verdadero</input></br>\n");
      out.write("      <input type=\"radio\" name=\"resultado10\" value=\"0\"> falso</input></br>\n");
      out.write("\n");
      out.write("      <input type=\"submit\" value=\"evaluar\">\n");
      out.write("    </form>\n");
      out.write("     \n");
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

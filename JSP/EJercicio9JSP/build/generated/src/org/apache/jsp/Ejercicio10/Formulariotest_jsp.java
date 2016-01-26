package org.apache.jsp.Ejercicio10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulariotest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <h1>Cuestionario</h1>\n");
      out.write("    <form method=\"post\" action=\"Cuestionario.jsp\">\n");
      out.write("      1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto1\" value=\"0\"> int</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto1\" value=\"1\"> double</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto1\" value=\"0\"> float</input></br></br>\n");
      out.write("\n");
      out.write("      2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto2\" value=\"0\"> XML</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto2\" value=\"0\"> SELECT</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto2\" value=\"1\"> SQL</input></br></br>\n");
      out.write("\n");
      out.write("      3. Para insertar un hiperenlace en una página se utiliza la etiqueta...</br>\n");
      out.write("      <input type=\"radio\" name=\"punto3\" value=\"0\"> href</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto3\" value=\"1\"> a</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto3\" value=\"0\"> link</input></br></br>\n");
      out.write("\n");
      out.write("      4. ¿En qué directorio se encuentran los archivos de configuración de Linux?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto4\" value=\"1\"> /etc</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto4\" value=\"0\"> /config</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto4\" value=\"0\"> /cfg</input></br></br>\n");
      out.write("\n");
      out.write("      5. ¿Cuál de las siguientes memorias es volátil?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto5\" value=\"1\"> RAM</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto5\" value=\"0\"> EPROM</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto5\" value=\"0\"> ROM</input></br></br>\n");
      out.write("\n");
      out.write("      6. En Java, para definir una clase como subclase de otra se utiliza...</br>\n");
      out.write("      <input type=\"radio\" name=\"punto6\" value=\"1\"> extends</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto6\" value=\"0\"> inherit</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto6\" value=\"0\"> subclass</input></br></br>\n");
      out.write("\n");
      out.write("      7. ¿Java soporta la herencia múltiple?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto7\" value=\"0\"> Sí</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto7\" value=\"1\"> No</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto7\" value=\"0\"> A veces</input></br></br>\n");
      out.write("\n");
      out.write("      8. ¿Qué significan las siglas CSS?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto8\" value=\"0\"> Computer Style Sheets</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto8\" value=\"0\"> Creative Style Sheets</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto8\" value=\"1\"> Cascading Style Sheets</input></br></br>\n");
      out.write("\n");
      out.write("      9. ¿Qué propiedad se utiliza en CSS para cambiar el color de fondo?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto9\" value=\"0\"> bgcolor:</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto9\" value=\"0\"> color:</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto9\" value=\"1\"> background-color:</input></br></br>\n");
      out.write("\n");
      out.write("      10. ¿Cómo se muestran los hiperenlaces sin subrayar?</br>\n");
      out.write("      <input type=\"radio\" name=\"punto10\" value=\"0\"> a {text-decoration:no underline}</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto10\" value=\"0\"> a {underline:none}</input></br>\n");
      out.write("      <input type=\"radio\" name=\"punto10\" value=\"1\"> a {text-decoration:none}</input></br></br>\n");
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

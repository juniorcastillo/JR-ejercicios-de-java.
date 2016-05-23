package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class altaPaciente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <title>Hospital - Junior castillo</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

           
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            Statement s = conexion.createStatement();

            request.setCharacterEncoding("UTF-8");
            String mensaje="Paciente dado de alta correctamente";
            // Comprueba la existencia del número de paciente introducido
            String consultadeCodPaciente = "SELECT * FROM paciente WHERE codPaciente="
                    + Integer.valueOf(request.getParameter("numero"));

            ResultSet ConsultaPaciente = s.executeQuery(consultadeCodPaciente);
            ConsultaPaciente.last();

            if (ConsultaPaciente.getRow() > 0) {//Mira si el paciente existe  
                mensaje="El paciente existe";
            } else {
                String insercion = "INSERT INTO paciente VALUES (" + Integer.valueOf(request.getParameter("numero"))
                        + ", '" + request.getParameter("nombre")
                        + "', " + "'" + request.getParameter("direccion")
                        + "', " + "'" + request.getParameter("telefono")
                        + "', " + "'" + request.getParameter("diagnostico")
                        + "', " + "'" + request.getParameter("tratamiento")
                        + "', " + "'" + request.getParameter("codMedico") + "')";

                s.execute(insercion);//ejecuto la insercion (lo agrego)
             
               mensaje="El paciente esta agregado";
            }
            out.print("<script>alert(\"" + mensaje + "\")</script>"); //manda un mensaje  
            conexion.close();//cierro la conexion

      out.write("\n");
      out.write("        <br>\n");
      out.write("     <script>document.location = \"lista.jsp\"</script> \n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
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

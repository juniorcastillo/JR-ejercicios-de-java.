<%-- 
    Document   : Piramide
    Created on : 23-ene-2016, 13:48:59
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
      
    </head>
          <link rel="stylesheet" type="text/css" href="piramidecss.css"> 
    <body>
        <%
          
	        int alturaIntroducida = Integer.parseInt(request.getParameter("numero"));
		int altura = 1;
		int i = 0;
		int espacios = alturaIntroducida - 1;
		while (altura <= alturaIntroducida) {
			
			// inserta espacios
                         
			for (i = 1; i <= espacios; i++) {
	
                         out.print("<img src=\"verde.png\">");  
         
                        }
						   

			// pinta la línea
			for (i = 1; i < altura * 2; i++) {
			    out.print("<img src=\"i.jpg\">");

			}
                        out.println( "<br>");
                       
			   
			
			altura++;
			espacios--;
		}
          %>

  </body>
</html>

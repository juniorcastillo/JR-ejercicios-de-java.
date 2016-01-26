<%-- 
    Document   : CalendarioFormulario
    Created on : 25-ene-2016, 16:41:05
    Author     : USER
*Escribe una aplicación que genere el calendario de un mes. Se pedirá el nombre del mes,
el año, el texto que queremos que aparezca sobre el calendario, el día de la semana en que
cae el día 1 y el número de días que tiene el mes.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>CALENDARIO</h1>
        
        <form action="Calendario.jsp"   method="get" >
            <fieldset style="width: 30%">
   
                <select name="mes">
	  
                    <option selected disabled>-Elegir mes-<option>
                    <option>Enero</option>
                    <option >FEBRERO</option>
                    <option>MARZO</option>
                    <option>APRIL</option>
                    <option >MAYO</option>
                    <option>JUNIO</option>		
                    <option>JULIO</option>
                    <option >AGOSTO</option>
                    <option>SEPTIEMBRE</option>	
                    <option>OCTUBRE</option>
                    <option > NOVIEMBRE</option>
                    <option>DICIEMBRE</option>
                </select>
                <br><br><br><br>
                <select name="DIA">

                    <option selected disabled>-Elegir dia-<option>
                    <option>LUNES</option>
                    <option >MARTES</option>
                    <option>MIERCOLES</option>
                    <option>JUEVES</option>
                    <option>VIERNES</option>
                    <option>SABADO</option>		
                    <option>DOMINGO</option>
                  
                </select>
		  <br><br>
                  Numero de dias del mes
                   <input type="number"  name="numeroDiaMes"  min="1" max="31"><br>
		
            </fieldset>
             <input type="submit" value="Aceptar">
        </form>
        
    </body>
</html>

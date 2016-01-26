<%-- 
    Document   : TestFormulario
    Created on : 25-ene-2016, 18:52:24
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1> TEST DE FIDELIDAD </h1>
        
          <form method="post" action="TestInfidelidad.jsp">
        1. ¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.?</br>
      <input type="radio" name="resultado1" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado1" value="0"> falso</input></br>
    
      2. ¿Ha aumentado sus gastos de vestuario.?</br>
   <input type="radio" name="resultado2" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado2" value="0"> falso</input></br>

      3.  Ha perdido el interés que mostraba anteriormente por ti..</br>
      <input type="radio" name="resultado3" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado3" value="0"> falso</input></br>

      4. ¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).?</br>
     <input type="radio" name="resultado4" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado4" value="0"> falso</input></br>
      5. ¿No te deja que mires la agenda de su teléfono móvil.?</br>
   <input type="radio" name="resultado5" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado5" value="0"> falso</input></br>

      6.A veces tiene llamadas que dice no querer contestar cuando estás tú delante.</br>
     <input type="radio" name="resultado6" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado6" value="0"> falso</input></br>
      7. ¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a?</br>
       <input type="radio" name="resultado7" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado7" value="0"> falso</input></br>

      8.  Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo?</br>
    <input type="radio" name="resultado8" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado8" value="0"> falso</input></br>
      9. ¿Has notado que últimamente se perfuma más.?</br>
      <input type="radio" name="resultado9" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado9" value="0"> falso</input></br>
      10. ¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo.?</br>
     <input type="radio" name="resultado10" value="3"> Verdadero</input></br>
      <input type="radio" name="resultado10" value="0"> falso</input></br>

      <input type="submit" value="evaluar">
    </form>
     
    </body>
</html>

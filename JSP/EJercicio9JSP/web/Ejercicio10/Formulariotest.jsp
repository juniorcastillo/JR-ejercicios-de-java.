<%-- 
    Document   : Formulariotest
    Created on : 23-ene-2016, 14:25:33
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
         <h1>Cuestionario</h1>
    <form method="post" action="Cuestionario.jsp">
      1. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?</br>
      <input type="radio" name="punto1" value="0"> int</input></br>
      <input type="radio" name="punto1" value="1"> double</input></br>
      <input type="radio" name="punto1" value="0"> float</input></br></br>

      2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?</br>
      <input type="radio" name="punto2" value="0"> XML</input></br>
      <input type="radio" name="punto2" value="0"> SELECT</input></br>
      <input type="radio" name="punto2" value="1"> SQL</input></br></br>

      3. Para insertar un hiperenlace en una página se utiliza la etiqueta...</br>
      <input type="radio" name="punto3" value="0"> href</input></br>
      <input type="radio" name="punto3" value="1"> a</input></br>
      <input type="radio" name="punto3" value="0"> link</input></br></br>

      4. ¿En qué directorio se encuentran los archivos de configuración de Linux?</br>
      <input type="radio" name="punto4" value="1"> /etc</input></br>
      <input type="radio" name="punto4" value="0"> /config</input></br>
      <input type="radio" name="punto4" value="0"> /cfg</input></br></br>

      5. ¿Cuál de las siguientes memorias es volátil?</br>
      <input type="radio" name="punto5" value="1"> RAM</input></br>
      <input type="radio" name="punto5" value="0"> EPROM</input></br>
      <input type="radio" name="punto5" value="0"> ROM</input></br></br>

      6. En Java, para definir una clase como subclase de otra se utiliza...</br>
      <input type="radio" name="punto6" value="1"> extends</input></br>
      <input type="radio" name="punto6" value="0"> inherit</input></br>
      <input type="radio" name="punto6" value="0"> subclass</input></br></br>

      7. ¿Java soporta la herencia múltiple?</br>
      <input type="radio" name="punto7" value="0"> Sí</input></br>
      <input type="radio" name="punto7" value="1"> No</input></br>
      <input type="radio" name="punto7" value="0"> A veces</input></br></br>

      8. ¿Qué significan las siglas CSS?</br>
      <input type="radio" name="punto8" value="0"> Computer Style Sheets</input></br>
      <input type="radio" name="punto8" value="0"> Creative Style Sheets</input></br>
      <input type="radio" name="punto8" value="1"> Cascading Style Sheets</input></br></br>

      9. ¿Qué propiedad se utiliza en CSS para cambiar el color de fondo?</br>
      <input type="radio" name="punto9" value="0"> bgcolor:</input></br>
      <input type="radio" name="punto9" value="0"> color:</input></br>
      <input type="radio" name="punto9" value="1"> background-color:</input></br></br>

      10. ¿Cómo se muestran los hiperenlaces sin subrayar?</br>
      <input type="radio" name="punto10" value="0"> a {text-decoration:no underline}</input></br>
      <input type="radio" name="punto10" value="0"> a {underline:none}</input></br>
      <input type="radio" name="punto10" value="1"> a {text-decoration:none}</input></br></br>

      <input type="submit" value="evaluar">
    </form>
     
    </body>
</html>

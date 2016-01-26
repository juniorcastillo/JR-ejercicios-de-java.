<%-- 

Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
independientes para CSS para no mezclarlo con HTML).

--%>

<html>
    <head>
        <title>Ejercicio 2</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="style.css"> 
    </head>
    <body>
       <div><% out.println("<h1> Ejercicio2 </h1> <br>");  
         out.println("Nombre: junior miguel <br> ");
         out.println("Numero: 8095452196 <br> ");
         out.println("Dirreccion: manzana 14 número 50 "); %></div>
  
        
        
        
        
        <!-- <form>
         <fieldset style="width: 40px">
        <legend>Datos Personales:</legend>
         nombre: <input type="text" name="nombre" value="junior miguel castillo" ><br>
         numero: <input type="number" name="numero" value="8095452164" ><br>
         cumpleaños: <input type="data" name="cumpleaños" value="5/11">
       </fieldset>
       <input type="submit">

     </form>-->
      
    </body>
</html>
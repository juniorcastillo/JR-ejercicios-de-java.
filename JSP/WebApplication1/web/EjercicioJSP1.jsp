<%-- 

Crea una aplicaci�n web en Java que muestre tu nombre y tus datos personales por pantalla.
La p�gina principal debe ser un archivo con la extensi�n jsp. Comprueba que se lanzan
bien el servidor y el navegador web. Observa los mensajes que da el servidor. F�jate en la
direcci�n que aparece en la barra de direcciones del navegador.
Ejercicio

--%>

<html>
    <head>
        <title>Ejercicio 1</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
       <div><% out.println("<h1> Ejercicio1 </h1> "); %><br>   
       <% out.println("Nombre: junior miguel "); %><br>
       <% out.println("Numero: 8095452196");%><br> 
       <% out.println("Dirreccion: manzana 14 n�mero 50 "); %></div>
  
        
        
        
        
        <!-- <form>
         <fieldset style="width: 40px">
        <legend>Datos Personales:</legend>
         nombre: <input type="text" name="nombre" value="junior miguel castillo" ><br>
         numero: <input type="number" name="numero" value="8095452164" ><br>
         cumplea�os: <input type="data" name="cumplea�os" value="5/11">
       </fieldset>
       <input type="submit">

     </form>-->
      
    </body>
</html>
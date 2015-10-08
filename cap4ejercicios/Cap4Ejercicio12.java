/**
 * 4. Sentencia Condicional
 
 *Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten
en el curso. Cada pregunta acertada sumará un punto. El programa mostrará al final la
calificación obtenida. Pásale el minicuestionario a tus compañeros y pídeles que lo hagan
para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.

 * @author junioir castillo
 */

public class Cap4Ejercicio12 {
  public static void main(String[] args) {

    
    int nota= 0;
    String respuestas;
    

    System.out.println(" este programa muetras un test de 10 pregntas: ");
    System.out.println("1.¿QUE ES HTML ?");
    System.out.println("A: ES UN LEGUIAJE DE MARCAS.");
    System.out.println("B: ES UNA ETIQUETA.");
    System.out.println("C: ES UN TIPO DE ATRIBUTO.");
    System.out.print("RESPUESTA:");
    
   respuestas = System.console().readLine(); 
    
    
    if (respuestas.equals("A" )) {
      nota++;}
    
       
    System.out.println("2.¿QUE ES GEANY ?");
    System.out.println("A: Editor de texto");
    System.out.println("B: ES UNA ETIQUETA");
    System.out.println("C: ES UN programa para cocinar");
    System.out.print("RESPUESTA:");
    respuestas = System.console().readLine();  
    
    
        if (respuestas.equals("A" )) {
      nota++;}
          
    
   
     System.out.println(" 3.¿QUE ES LA RAM?: ");
     System.out.println("A: SON DATOS");
     System.out.println("B: ES UN SOFTWARE ");
     System.out.println("C: ES UAN MEMORIA");
     System.out.print("RESPUESTA:");
      respuestas = System.console().readLine(); 
      
      if (respuestas.equals("C"  )) {
       nota++;}
     
       System.out.println("4.¿QUE ES UNA PAGINA WEB?: ");
       System.out.println("A: ES una nota");
       System.out.println("B: Es documento capaz de contener textos, sonidos, etc. ");
       System.out.println("C: ES UAN MEMORIA");
       System.out.print("RESPUESTA:");
        respuestas = System.console().readLine(); 
      
      if (respuestas.equals("B")) {
     nota++;}
     
       System.out.println("5.¿QUE ES EL HARDWARE?: ");
       System.out.println("A: Conjuto de elemetos fisicos y materiales");
       System.out.println("B: Es documento capaz de contener textos, sonidos, etc. ");
       System.out.println("C: es una aplicacion");
       System.out.print("RESPUESTA:");
      respuestas = System.console().readLine(); 
      
      if (respuestas.equals("A"  )) {
     nota++;}
     
      System.out.println("6.¿QUE ES EL software?: ");
      System.out.println("A: Conjuto de elemetos fisicos y materiales");
      System.out.println("B: Es documento capaz de contener textos, sonidos, etc. ");
      System.out.println("C: el conjuto de programas que tiene un ordenador ");
      System.out.print("RESPUESTA:");
      respuestas = System.console().readLine();
      
      if (respuestas.equals("C"  )) {
     nota++;}
     
     
      System.out.println("7.¿:que es una pag web? ");
      System.out.println("A: Conjuto de elemetos fisicos y materiales");
      System.out.println("B: Es documento capaz de contener textos, sonidos, etc. ");
      System.out.println("C: el conjuto de programas que tiene un ordenador ");
      System.out.print("RESPUESTA:");
      respuestas = System.console().readLine(); 
      
      if (respuestas.equals("C"  )) {
     nota++;}
     
    
      System.out.println("8. ¿Cuál de los siguientes tipos de datos de Java tiene más precisión?");
      System.out.println("A: int");
      System.out.println("B: double");
      System.out.println("C: float"); 
      System.out.print("RESPUESTA:");
      
    respuestas = System.console().readLine(); 
     
     
    if (respuestas.equals("B")) {
      nota++;
    }

    System.out.println("9. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("A: XML") ;
    System.out.println("B: SELECT");
    System.out.println("C: SQL"); 
    respuestas = System.console().readLine(); 
     
    if (respuestas.equals("C")) {
      nota++;
    }

    System.out.println("10. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("A: href");
    System.out.println("B: a");
    System.out.println("C: link");
     System.out.print("RESPUESTA:"); 
    respuestas = System.console().readLine();  
    
    if (respuestas.equals("C")) {
      nota++;
    }
    
    System.out.println("LOS puntos obtenidos son " + nota + " notas."); 
          
     
  }
}
  

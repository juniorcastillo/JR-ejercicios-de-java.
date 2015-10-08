/**
*Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
notable o sobresaliente).

*

* @author junior castillo
*/ 

public class Cap4Ejercicio8 {
  
   
   
 public static void main (String[] args) { 
 
   

     System.out.println("Este programa calcula la media de tres notas");
     System.out.println("Por favor, introduzcala primera nota  : ");
      Double primera = Double.parseDouble(System.console().readLine());
    
     System.out.println("Por favor, introduzcala segunda nota  : ");
      Double segunda = Double.parseDouble(System.console().readLine());
     
     System.out.println("Por favor, introduzcala tercera nota  : ");
      Double tercera = Double.parseDouble(System.console().readLine());
     
      double resultado = ((primera + segunda + tercera) /3 );
     
     System.out.printf(" La media de esta tres notas es: " + resultado);
     
     if (resultado < 5) {
      System.out.print("  Tu promedio es insuficiente ");
      }
     if ((resultado >= 5) && (resultado <= 6)) {
      System.out.print(" Tu promedio es suficiente ");
      } 
    if ((resultado >= 7) && (resultado <= 8)) {
      System.out.print("Tu promedio es bueno");
      }
    if (resultado == 9 ) {
      System.out.print("Tu promedio es un notable ");
      }
    if (resultado == 10){ 
      System.out.print("Tu promedio es una sobresaliente ");
      }
    
 }
  
}

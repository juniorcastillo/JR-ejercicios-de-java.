/**
*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
espacios.
*
*  junior castillo
**/

public class EjercicioAleatorio4 {
    
  public static void main(String[] args) {
  
    
    System.out.println("muestra 20 numeros enteros desde el 0 al 10:");
   
    for (int i = 1; i <= 20; i++) {
      
       int numEnteros = (int)(Math.random()*11);
         System.out.print(numEnteros + "  ");
       
      
    }

    
     
  }
}

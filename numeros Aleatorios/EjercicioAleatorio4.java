/**
*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados).
*
*  junior castillo
**/

public class EjercicioAleatorio4 {
    
  public static void main(String[] args) {
  
    
    System.out.println("tira tres dados y suma su resultado:");
   
    for (int i = 1; i <= 20; i++) {
      
     int numEnteros = (int)(Math.random()*11);
       System.out.print(numEnteros + "  ");
       
      
    }

    
     
  }
}

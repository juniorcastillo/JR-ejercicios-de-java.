/**
*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
total (los puntos que suman entre los tres dados).
*
*  junior castillo
**/

public class EjercicioAleatorio1 {
    
  public static void main(String[] args) {
    int suma=0;
    
    System.out.println("tira tres dados y suma su resultado:");
   
    for (int i = 1; i <= 3; i++) {
      
     int lazamientos = (int)(Math.random()*6 + 1);
       System.out.print(lazamientos + "  ");
       
      suma += lazamientos;
    }

    System.out.println("Este es el total : "+suma);
     
  }
}

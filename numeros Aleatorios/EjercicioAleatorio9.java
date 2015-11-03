/**
*Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final
cuántos números se han generado.
*
*  junior castillo
**/

public class EjercicioAleatorio9 {
    
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

/**
 * 5. Bucles
  
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *junior castillo
 */

public class Ejercicio22Bucle {

  public static void main(String[] args) {
    
   System.out.print("Números primos entre 2 y 100: ");
       
    boolean esPrimo = true;
    int n;
    int i;

    for (n = 2; n <= 100; n++) {

      
      esPrimo = true;
      for (i = 2; i < n; i++) {
        if (n%i == 0) esPrimo = false;
      }
      
     
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
  }
}

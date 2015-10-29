 /**
 * 5. Bucles
   Realiza un programa que pida un número por teclado y que luego
 *     muestre ese número al revés.
 *junior castillo
 * 
 */

public class Ejercicio25Bucle {

 
 public static void main(String[] args) {

    System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    int numero = numeroIntroducido;
    int reves = 0;
    
    while (numero > 0) {
      reves = (reves * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    System.out.println("Si le damos la vuelta al " + numeroIntroducido + " tenemos el " + reves);
  }
}

/**
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
de la clase Moneda y la secuencia se debe ir almacenando en una lista.
Ejemplo:
2 céntimos – cara
2 céntimos – cruz
50 céntimos – cruz
1 euro – cruz
1 euro – cara
10 céntimos – cara

 *
 * @author Junior castillo
 */
import java.util.ArrayList;
import java.util.Collections;

public class Eurocoin {
  public static void main(String[] args) {

  ArrayList<String> a = new ArrayList<String>();

  System.out.println("Introduzca 10 palabras: ");
  for (int i = 0; i < 10; i++) {
    a.add(System.console().readLine());
  }   

  System.out.println("\nLista original:\n" + a);

  Collections.sort(a);

  System.out.println("\nLista ordenada alfabéticamente:\n" + a);
  }
}

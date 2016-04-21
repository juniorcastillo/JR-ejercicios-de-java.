/**
 *
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
 * un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
 * anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
 * céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
 * cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
de la clase Moneda y la secuencia se debe ir almacenando en una lista.
 * 
 * Junior castillo
 */

import java.util.ArrayList;
import java.util.Collections;
public class Eurocoin {
  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<Integer>();
   
      a.add(Integer.parseInt(System.console().readLine()));
      

   

    Collections.sort(a);//esto rodena de menor a mayor

    System.out.println("Lista ordenada de menor a mayor: " + a);     
}
}

/**
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * Junior castillo
 */

import java.util.ArrayList;
import java.util.Collections;
public class Ej4List {
  public static void main(String[] args) {
    
    ArrayList<String> a = new ArrayList<String>();
    for (int i = 0; i < 10; i++) {
      a.add(System.console().readLine());
    }   

   

    Collections.sort(a);//esto rodena de menor a mayor

    System.out.println("Lista ordenada de menor a mayor: " + a);     

    for(int i=0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
  }
}

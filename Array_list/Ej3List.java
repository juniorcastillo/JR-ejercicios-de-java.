/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList .
 * 
 * Junior castillo
 */

import java.util.ArrayList;
import java.util.Collections;
public class Ej3List {
  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      a.add(Integer.parseInt(System.console().readLine()));
    }   

   

    Collections.sort(a);//esto rodena de menor a mayor

    System.out.println("Lista ordenada de menor a mayor: " + a);     

    for(int i=0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
  }
}

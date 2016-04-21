
/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Junior castillo
 */

import java.util.ArrayList;

public class Ej2List {
  public static void main(String[] args) {
    int suma=0;
    int media=0;
    int max=0;
    int min=99999999;
    ArrayList<Integer> a = new ArrayList<Integer>();
    int [] n = new int [3];
    int tamano=((int)(Math.random() * 2 ) + 2  );

     for(int i=0; i < tamano; i++) {
       a.add((int)(Math.random()* 10) +3);
     }
    System.out.println("Contenido de la lista: ");        

    for(int i=0; i < a.size(); i++) {
      System.out.println(a.get(i));
      
    }

      for(int i=0; i < a.size(); i++) {
       suma+=a.get(i);
      
        if(max < a.get(i)){
         max=a.get(i);
        }
       
        if(min > a.get(i)){
          min=a.get(i);
        }
     
      }
        media=suma/tamano;
      System.out.println("Esta es la suma " + suma + "\nEste es el maximo " + max + "\nEste es el " +
       "minimo " + min + "\nEsta es la media " + media);

  }
  
} 
  
  
  

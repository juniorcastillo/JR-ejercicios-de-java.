
/**
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * Ejemplo de uso de la clase ArrayList
 * 
 * @author Junior castillo
 */

import java.util.ArrayList;

public class Ej1List {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("Eduardo");
    a.add("Alex");
    a.add("Moises");
    a.add("Antonio");
    a.add("Ruben");
    a.add("David");

    System.out.println("Contenido de la lista: ");        

    for(int i=0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
  }
}

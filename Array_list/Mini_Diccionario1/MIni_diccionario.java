package Mini_Diccionario1;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 *
 * @author junior castillo
 */
import java.util.*;
import  java.util.Scanner;
public class MIni_diccionario {

    public static void main(String[] args) {
 Scanner s = new Scanner(System.in);
        HashMap<String, String> m = new HashMap<String, String>();

        m.put("Rojo", "Red");
        m.put("Azul", "Blue");
        m.put("Verde", "Green");
        m.put("Tu", "You");
        m.put("Ellos", "They");
        m.put("Eso", "it");
        m.put("Nosotros", "We");
        m.put("Hay", "there");
        m.put("Cerca", "near");
        m.put("Cantante", "singer");
        m.put("Actor", "Actor");
        m.put("Lapiz", "pencil");

        System.out.print("Por favor, introduzca la palabra que quiere instroducir: ");
        String clave = s.nextLine();

        if (m.containsKey(clave)) {
            System.out.print("La traduccion al ingles es: " + m.get(clave) +"  ");

        } else {
            System.out.print("El código introducido no existe.");
        }
    }
}

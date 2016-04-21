/**
 *Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados
 * en una estructura de la clase HashMap .
 * 
 * @author Junior castillo
 */

import java.util.*;

public class Control_Area_Restringida {
  public static void main(String[] args) {
    int intento=1;
    boolean restringido=true;
    HashMap<String,Integer > programa = new HashMap<String,Integer>();
    
    programa.put("A" ,924);
    programa.put("Cindy Nero", 921);
    programa.put("César Vázquez" , 700);
    programa.put("Víctor Tilla" , 219);
    programa.put("Alan Brito" , 537);
    programa.put("Esteban Quito " , 605);
    
   while(intento< 4){ 
       System.out.print("Por favor, introduzcas el nombre: ");
       String nombre = System.console().readLine();

        System.out.print("Por favor, introduzcas la contraseña: ");
        int clave = Integer.parseInt(System.console().readLine());

        if (programa.containsKey(nombre)) {
           if(programa.get(nombre)==clave){
            System.out.print("Ha accedido al área restringida");
            intento=4;
            restringido=false;
            }
        } else {
          System.out.print("El código introducido no existe.");
         }
     intento++; 
     }
    if(restringido){
      System.out.print("Lo siento, no tiene acceso al área restringida.");
    }
  }
}

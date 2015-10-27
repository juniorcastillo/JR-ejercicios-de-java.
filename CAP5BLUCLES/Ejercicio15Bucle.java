/**
 * 5. Bucles
 * 
 * 1 Escribe un programa que dados dos números, uno real (base) y un
    entero positivo (exponente), saque por pantalla todas las potencias
    con base el numero dado y exponentes entre uno y el exponente introducido.
    No se deben utilizar funciones de exponenciación. Por ejemplo, si
    introducimos el 2 y el 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 
 * @author junior
 */

public class Ejercicio15Bucle {

  public static void main(String[] args) {
    
      int Base = 0;
      int Exponente = 0;
      int repetir=1;

    System.out.print("Introduzca la base: ");
     Base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca exponente: ");
      Exponente = Integer.parseInt(System.console().readLine());
    
     while ( Exponente >= repetir ) {
         // el contador "repetir" es la potencia que se eleva¹
          System.out.println(  Base + " elevado a " + repetir + "^");  

       repetir++;
     }  




  } 
}  






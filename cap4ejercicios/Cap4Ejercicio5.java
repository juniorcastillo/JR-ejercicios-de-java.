/**
*Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).

* @author junior castillo
*/ 

public class Cap4Ejercicio5 {
 public static void main (String[] args){

    System.out.println("Este programa resuelve una ecuacion de primer grado de tipo ax + b = 0");
    System.out.println("Por favor, introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.println("Por favor, introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());
    System.out.println("la ecuacion es : " + a + " x + " + b + " =0 ");    
     if ( a == 0) {
     System.out.println ("Esta ecuacion no tiene solucion real");
     }
     else  { System.out.println("x = " +(-b/a) );
    }
  }
}
    

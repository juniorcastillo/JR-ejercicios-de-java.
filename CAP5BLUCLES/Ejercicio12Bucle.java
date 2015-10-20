/**
* Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
144... El número n se debe introducir por teclado.
*/
public class Ejercicio12Bucle {
  public static void main(String[] args) {
      
       int PrimerNumero=0;
       int SegundoNumero;
       int Termino=0;
        
      System.out.print("Introduzca un número: ");
      
      SegundoNumero = Integer.parseInt(System.console().readLine());
       System.out.println(" Este es el numero que comienza: " + PrimerNumero);
        System.out.println(" Este es el numero introducido: " + SegundoNumero);
      do {
        
         System.out.println(" " + Termino); 
       
       Termino = PrimerNumero + SegundoNumero ;
       PrimerNumero = SegundoNumero;
       SegundoNumero = Termino;
        
  
          
        
       }
          while ( Termino < 100);
      
  }
}
    

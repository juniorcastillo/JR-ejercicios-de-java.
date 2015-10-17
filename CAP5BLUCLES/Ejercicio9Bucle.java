/**
 * 5. Bucles
 * 
 * 9. Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author junior castillo
 */
     
public class Ejercicio9Bucle {

  public static void main(String[] args) {
    
    int numeroDeDigitos = 1;
     
    int numeroIntroducido;
    
    double n;
      
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
       n = numeroIntroducido;
  do { 
          n/=10; 
         
        numeroDeDigitos++;
  
      } 
  
  
    
    while ( n < 10);
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}

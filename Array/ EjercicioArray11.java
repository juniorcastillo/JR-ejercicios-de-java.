/**
 *Realiza un programa que pida 10 números por teclado y que los almacene en un array.
A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
desplazando el resto de números (los que no son primos) de tal forma que no se pierda
ninguno. Al final se debe mostrar el array resultante.
 
 * @author junior castillo 
 */

public class  EjercicioArray11{
  public static void main(String[] args) {
  
       
      
      int[] num = new int[10];
      int i;
      boolean esPrimo = true;
      int j=2;
     
      
  
    for ( i = 0; i < 10 ; i++) {
     
     n[i] = Integer.parseInt(System.console().readLine());
     
    }
    
    for ( i = 0; i < 10 ; i++) {
      if ((n[i] % j) == 0) {
        esPrimo = false;
      }
    if(esprimo){
      
     System.out.println(" primo " + esPrimo );   
      
    }
       
        
  
    
  
      
      
    
    
    
    
  }
}

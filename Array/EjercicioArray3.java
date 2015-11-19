/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 * 
 * @author junior castillo 
 */

public class EjercicioArray3 {
  public static void main(String[] args) {
        
    
    int[] nota = new int[10];
  System.out.println("introduce 10 numeros: ");
  for (int i=1; i<=9;i++){           
      
      nota[i] = Integer.parseInt(System.console().readLine());
     
 
     
   }
     System.out.println("----");
    for (int i=9; i>=1;i--){
      System.out.println(  nota[i] );
     
   } 
  }
}

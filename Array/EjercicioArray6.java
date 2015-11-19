/**
 *Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 
 * @author junior castillo 
 */

public class EjercicioArray6 {
  public static void main(String[] args) {
        
    
     int[] n = new int[15];
     int i;
     
      System.out.println( "introduce 15 numeros :" );
     for ( i=0; i < 15;i++){
       
      n[i] = Integer.parseInt(System.console().readLine());
      
      }
      
      
      int aux = n[14];
      for (i = 14; i > 0; i--) {
        n[i] = n[i-1];
      }
      n[0] = aux;
      
      System.out.println();
      
      for (i = 0 ; i <=14;i++ ){
      
      System.out.print( i );
       System.out.print("|");
      System.out.printf("%3d " , n[i] ); 
       System.out.println();
      }
    
    
  
      
    
    
    
  }
}

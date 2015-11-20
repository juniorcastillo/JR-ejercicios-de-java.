/**
 *Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
 
 * @author junior castillo 
 */

public class  EjercicioArray10{
  public static void main(String[] args) {
  
       
      
      int[] num = new int[20];
      int i;
       
   
  
    for ( i = 0; i < 20 ; i++) {
     
       num[i]= (int)(Math.random()* 100); 
     
    }
     System.out.println();
    for ( i=0; i < 20; i++) {
      
     if( num[i] %2 == 0){
        System.out.printf("%4d par" , num[i]);
        System.out.println( );
      }else {
        System.out.printf("%4d impar" , num[i]);
        System.out.println( );
       }
      

    }
      
      
    
    
    
    
  }
}

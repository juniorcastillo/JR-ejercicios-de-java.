/**
 *Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 
 * @author junior castillo 
 */

public class EjercicioArray7 {
  public static void main(String[] args) {
         
    
     int[] n = new int[100];  
      int i;
      int primero=0;
      int segundo=0;
    for ( i=0; i < 100;i++){
       n[i]= (int)(Math.random()* 21);
        System.out.printf( "%4d" , n[i] );
    }
    System.out.println( );
      System.out.println( "introduce un  numero que este : " );
      primero = Integer.parseInt(System.console().readLine());
      System.out.println( "introduce el numero sustituto: " );     
      segundo = Integer.parseInt(System.console().readLine());
    
    for ( i=0; i < 100;i++){
      if( n[i]==primero){
        n[i]=segundo;
            System.out.printf( "%4d" ,  n[i]);

      }else {
       System.out.printf( "%4d" , n[i] );
       }      
    }
      
  }
}

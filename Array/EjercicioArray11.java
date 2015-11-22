/**
 *Realiza un programa que pida 10 números por teclado y que los almacene en un array.
  A continuación se mostrará el contenido de ese array junto al índice (0 – 9).
  Seguidamente el programa pasará los primos a las primeras posiciones, desplazando
  el resto de números (los que no son primos) de tal forma que no se pierda ninguno.
  Al final se debe mostrar el array resultante.
 
 * @author junior castillo 
 */

public class  EjercicioArray11{
  public static void main(String[] args) {
  
       
      
      int[] num = new int[10];
      int i;
      int[] primos = new int[10];
      int[] noprimos =new int [10];
      int pri=0;
      int nopri=0;
       
   
     System.out.println("introduzca 10 numeros: "); 
      
    for ( i = 0; i < 10; i++) {
     
      num[i] = Integer.parseInt(System.console().readLine());; 
      
        
      
     if(( num[i] %2 != 0) || (num[i]==2)){
      primos[pri++] =num[i];
        
     }else {
        noprimos[nopri++]=num[i];
      }
      
       
    }
      System.out.println();  
    for (i=0; i < pri; i++){
        
        num[i]=primos[i];
    }
      
    for (i = pri; i < 10; i++) {
      num[i] = noprimos[i - pri];
    }
    
    for (i= 0; i < 10; i++ ){
        System.out.print(i+ " | ");
        System.out.print(num[i]+ " ");  
        System.out.println();  
    
    }
    
  }
}

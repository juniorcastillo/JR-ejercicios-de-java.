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
int[] org = new int[10];
int i;
int j=9;
int n;

      System.out.println("este programa muestra los numeros primos delante "); 
      System.out.println("introduzca 10 numeros: ");  
    
    for ( i = 0; i < 10 ; i++) {
     
     num[i] = Integer.parseInt(System.console().readLine());
     
    }
    
    for ( i = 0; i < 10 ; i++) {
      System.out.printf("%4d" , i); 
      
      System.out.printf( "%4d" ,num[i] ); 
       System.out.println();  
    }
      System.out.println(); 
    /* esto pone a los primos en primer lugar*/
    
    for ( i = 0; i < 10 ; i++) {
        System.out.printf("%4d" ,i); 
      if ((num[i] % 2) !=0) {
            org[j]=num[i];
            j--;
           System.out.printf("%4d primo",org[i]);   
      }else{
           System.out.printf("%4d" ,org[j]  ); 
           j--;
        }
        System.out.println(); 
    
      
      
    } 
 
        
  
    
  
      
      
    
    
    
    
  }
}

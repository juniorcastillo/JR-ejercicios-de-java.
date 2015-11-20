/**
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
con la palabra “par” o “impar” según proceda.
 
 * @author junior castillo 
 */

public class  EjercicioArray09{
  public static void main(String[] args) {
  
       
      
      int[] num = new int[8];
      int i;
       
    
    
    System.out.print("Introduzcas 8 numeros enteros:");
    System.out.println();
    for ( i = 0; i < 8 ; i++) {
     
      num[i] = Integer.parseInt(System.console().readLine());
    }
     System.out.println();
    for ( i=0; i < 8; i++) {
      
     if( num[i] %2 == 0){
        System.out.println(num[i]+" par");
        
      }else {
        System.out.println(num[i]+" impar");
       }
      

    }
      
      
    
    
    
    
  }
}

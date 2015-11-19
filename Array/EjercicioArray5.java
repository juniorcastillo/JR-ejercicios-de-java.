/**
 *Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.
 
 * @author junior castillo 
 */

public class EjercicioArray5 {
  public static void main(String[] args) {
        
     
     int[] numero = new int[10];
     int minimo=999999999; 
     int maximo=0;
   
     
    
     
      System.out.println ("entre 10 numeros por teclado: ");
     
  for (int i=0; i< 10;i++){            
       numero[i] = Integer.parseInt(System.console().readLine());
       
  
     if (maximo < numero[i]) {
       maximo = numero[i];
       
      }
     if (minimo >  numero[i]){
       minimo = numero[i];
    }
  }
      System.out.println ( maximo  + " maximo " );
    
      System.out.println ( minimo + " minimo " );
    
  }
}

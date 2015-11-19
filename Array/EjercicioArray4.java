/**
 *Define tres arrays de 20 números enteros cada una, con nombres numero , cuadrado y cubo .
 Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
 almacenar los cuadrados de los valores que hay en el array numero . En el array cubo se
 deben almacenar los cubos de los valores que hay en numero . A continuación, muestra el
 contenido de los tres arrays dispuesto en tres columnas.
 
 * @author junior castillo 
 */

public class EjercicioArray4 {
  public static void main(String[] args) {
        
     
     int[] numero = new int[20];
     int[] cuadrado = new int[20]; 
     int[] cubo = new int[20];
     
    
     
      System.out.println ("numero  "+ "4do  "+ "cubo");
       System.out.println ();
  for (int i=0; i<=19;i++){            
      numero[i] = (int)(Math.random()* 99); 
      cuadrado[i]=numero[i] *2;
      cubo[i]=numero[i] *3;
      
      System.out.printf (" %4d  %4d %4d " + "\n" , numero[i] ,  cuadrado[i] , cubo[i] );
  }
     
    
  }
}

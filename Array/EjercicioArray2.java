/**
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
   según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
   del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author junior castillo
 */

public class EjercicioArray2 {
  public static void main(String[] args) {
        
   
    char[] n = new char[10];
                
    n[0] = 'A';
    n[1] = 'X';
    n[4] = '@';
    n[6] = ' ';
    n[7] = '+';
    n[8] = 'Q';
   
    
     System.out.println("indice     valor");
 for (int i=0; i<=9;i++){
     System.out.println(i +"            " + n[i]);
    
     
   }
   
   
      
  }
}

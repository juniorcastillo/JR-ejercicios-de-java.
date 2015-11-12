/**
  Números aleatorios
  
 * 12. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
 *     código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
 *     entero en un carácter.
 *
 * @author junior castillo
 */
  public class EjercicioAleatorio12{

   public static void main(String[] args) 
    throws InterruptedException {
  
  System.out.print("\033[32m"); // pinta en verde
   
    for (int i=1;i>0;i++){
         char caracter  = (char)(Math.random() * 94+ 32);
      Thread.sleep(50);
         System.out.print(caracter);  
     
    }
  }
}


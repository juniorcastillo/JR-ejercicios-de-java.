/**
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter.
 
 * @author junior castillo 
 */

public class  EjercicioArray8{
  public static void main(String[] args) {
  
           String[] mes = {
      "enero", "febrero", "marzo", "abril", "mayo", "junio",
      "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
      
      
      int[] T = new int[12];
       int i;
    
    
    
    
         for ( i = 0; i < 12 ; i++) {
      System.out.print("Introduzca la temperatura media de " + mes[i] +" : " );
      T[i] = Integer.parseInt(System.console().readLine());
    }

   
    
  
      
    
    
    
  }
}

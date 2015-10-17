/**
7.Realiza el control de acceso a una caja fuerte. La combinación
  será un número de 4 cifras. El programa nos pedirá lombinación
  para abrirla. Si no acertamos, se nos mostrará el mensaje
 “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
  oportunidades para abrir la caja fuerte.
 
* @junior castillo
*/
public class Ejercicio7Bucle {
  public static void main(String[] args) {
      
      int intento=4;
      int cifras;
    
      
      do { 
      
      System.out.println("instrodusca la combinacion: ");
       cifras =Integer.parseInt(System.console().readLine()); 
       
       if (cifras == 1234 ) {
         System.out.println("esta clave es correcta");
         break;
      }else {
              System.out.println(" lo siento esta no es la combinacion");
               
              
           intento--;
         }
         }
           
           while (intento > 0);
            
           
      }     
 }     
  
  
          
        
        
      
  

    

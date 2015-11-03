/**

* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
   y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
   oportunidades quedan y si el número introducido es menor o mayor que el número secreto.

*  junior castillo
**/

public class EjercicioAleatorio6 {
    
  public static void main(String[] args) {
  
    
    int numSecreto=0;
    int numIntro;
  
    
    for (int oportunidades = 5; oportunidades > 0; oportunidades--) {
      
      numSecreto = (int)(Math.random()* 101); 
      System.out.println("adivina cual es el numero: " );
      numIntro = Integer.parseInt(System.console().readLine());
      
      
      if ( numIntro == numSecreto) {
            System.out.println("felicidades , adivinaste" ); 
         } else {
              System.out.println("oportunidades--> " + oportunidades); 
         }
      if ( numIntro > numSecreto){
             System.out.println ( "El numero introduccido es mayor  que el numero secreto "); 
         } else { 
               System.out.println("El numero es menor que el numero secreto");
   
         }
    }
    
    System.out.println(" El numero Secreto es :" +  numSecreto );
    System.out.println(" usted perdio :( " );
         
           
  }
}

/**

* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
estás pensando es mayor o menor que el que te acaba de decir.

*  junior castillo
**/

public class EjercicioAleatorio14 {
    
  public static void main(String[] args) {
  
    
    int numSecreto=0;
    int numIntro;
    int oportunidades;
        
    numSecreto = (int)(Math.random()* 101);
    
    for( oportunidades = 5; oportunidades > 0; oportunidades--) {
      
      
      switch(4)
      System.out.println(" el numero es mayor que el q: " );
      numIntro = Integer.parseInt(System.console().readLine());
   
      if ( numIntro == numSecreto) {
        
            System.out.println("felicidades , adivinaste" );
            oportunidades= 0;
      }     else {
              System.out.println("oportunidades--> " + oportunidades); 
            } 
            
            
      if ( numIntro > numSecreto)  {
             System.out.println ( "El numero introduccido es mayor  que el numero secreto "); 
      }   
      if ( numIntro < numSecreto){
               System.out.println("El numero es menor que el numero secreto");
   
            }
    }
    
    if ( oportunidades  < 1 ){ 
      System.out.println("El numero secreto es " + numSecreto);
    }
         
           
  }
}

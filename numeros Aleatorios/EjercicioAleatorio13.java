/**
*Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
valor.

*  junior castillo
**/

public class EjercicioAleatorio13 {
  public static void main(String[] args) {
     int  dado1=0;       
     int  dado2=0; 
      
     for (int tirada =1; tirada <=100;tirada++ ){
       
              dado1 = (int)(Math.random()*6) + 1;
              dado2 = (int)(Math.random()*6) + 1;
     
             System.out.println(dado1 + " " + dado2); 
        if ( dado1 == dado2){
          tirada=100;
        
      
           
        }
      }  
     System.out.println( "POR LAZAR ,GRACIAS");    
  }    
}


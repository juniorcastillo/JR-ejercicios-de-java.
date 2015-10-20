/**
/**Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
y cuántos son negativos.
*

* @author junior castillo
*/ 

public class Ejercicio13Bucle {
   public static void main (String[] args){
       
          int Repetir=0;
          int NumeroIntro=0;
              
                
       while (Repetir < 10){ 
          
          System.out.println("introdusca el numero:");
          NumeroIntro = Integer.parseInt(System.console().readLine());
          
            if (NumeroIntro > 0) {
              System.out.println("Positivo");        
            } else {
               System.out.println("Negativo:");
              }
                 Repetir ++;
        }  
        
  }
}

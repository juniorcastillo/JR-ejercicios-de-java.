/**
Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).
* @author junior castillo
*/ 

public class Ejercicio17Bucle {
  public static void main(String[] args) {
       
  int NumeroIntro=0;
  int Suma =0;
 
    
            
    System.out.print(" por favor, Introduzca un numero positivo: ");
     NumeroIntro = Integer.parseInt(System.console().readLine());
     
    
   do{
        
        System.out.print("  " + Suma );
       Suma = Suma + NumeroIntro ;
       
   }while ((NumeroIntro >= 0) && ( Suma <= 100));
    
  }
}

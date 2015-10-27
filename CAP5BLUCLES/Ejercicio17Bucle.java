/**
Realiza un programa que sume los 100 números siguientes a un número entero y positivo
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
número positivo).
* @author junior castillo
*/ 

public class Ejercicio17Bucle {
  public static void main(String[] args) {
       
  int numeroIntro=1;
  int contador;
  int suma =0;
  
    
            
    System.out.print(" por favor, Introduzca un numero positivo: ");
     numeroIntro = Integer.parseInt(System.console().readLine());
     contador = numeroIntro+1;
    
   do{
        suma+=contador;
        contador++;
      
       
   }while (contador <= 100);
      System.out.print("el total es: " + suma);
  }
}

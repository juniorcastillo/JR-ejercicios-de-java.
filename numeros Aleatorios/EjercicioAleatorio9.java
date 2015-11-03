/**
*Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
termine de generar números hasta que no saque el 24. El programa deberá decir al final
cuántos números se han generado.
*
*  junior castillo
**/

public class EjercicioAleatorio9 {
    
  public static void main(String[] args) {

   int contador =0;
   int cancelar= 1;
    System.out.println("Genera numeros aleatorios pares entre 0-100:");
   
    do {
        int  numero = (int)(Math.random()*101);
      if (numero%2 == 0){
        contador++;
         
        System.out.print(numero+" ");
        if  ( numero  == 24){
             cancelar=100;
             
        }
      }
        
        
    }while (cancelar < 100);
       System.out.println("\n Los numeros generados son: " + contador);
  } 
}

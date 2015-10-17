/**
*Realiza un programa que calcule la media de tres notas.

*

* @author junior castillo
*/ 

public class Cap4Ejercicio7 {
  
   
   
 public static void main (String[] args){
   
   

    System.out.println("Este programa calcula la media de tres notas");
    System.out.println("Por favor, introduzcala primera nota  : ");
     double primera = Double.parseDouble(System.console().readLine());
    
    System.out.println("Por favor, introduzcala segunda nota  : ");
     double segunda = Double.parseDouble(System.console().readLine());
    
    System.out.println("Por favor, introduzcala tercera nota  : ");
     double tercera = Double.parseDouble(System.console().readLine());
     
     double resultado = ((primera + segunda + tercera) /3 );
     System.out.printf("La media de esta tres notas es: " + resultado);
  }
}

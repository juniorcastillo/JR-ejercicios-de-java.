/**
Realiza un programa que √
calcule el tiempo que tardará en caer un objeto desde una altura h. 
 Aplica la fórmula t =√2h
                       g 

*siendo g = 9.81m/s 2

* @author junior castillo
*/ 

public class Cap4Ejercicio6 {
  
   final static double g = 9.81;
   
 public static void main (String[] args){
   
   

    System.out.println("Este programa calcula el tiempo en caer un objecto");
    System.out.println("Por favor, introduzca el valor h (metros) : ");
    Double h = Double.parseDouble(System.console().readLine());
      
     double resultado = Math.sqrt ((2*h) / g);
     System.out.printf("El objeto tarda %.2f segundos en caer. %n ", resultado);
  }
}

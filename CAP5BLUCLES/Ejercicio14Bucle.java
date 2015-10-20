/**
* Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
potencia.
* @junior castillo
*/
public class Ejercicio14Bucle {
   
  public static void main(String[] args) {
    
      int Base=0;
      int Exponente=0;
      double Resultado=0.0;
      
    System.out.print("Introduzca Base: ");
     Base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca Exponente: ");
     Exponente = Integer.parseInt(System.console().readLine());

    Resultado = Math.pow(Base,Exponente);
    System.out.print(Resultado); 
  
      
    
  }
}

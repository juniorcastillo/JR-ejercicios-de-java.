/**Escribe un programa que calcule el volumen de un cono según la fórmula V = 13 πr 2 h
*/

 public class Cap3ejercicio9  {
                                                                 
  public static void main(String[] args) {
   
    double pi = 3.14;
  
    System.out.println(" volumen de un cono ");
    System.out.print("Por favor, introduzca el radio (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    System.out.print("Por favor, introduzca la altura (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    double total = ( r * r * pi * h) /3;
    
    System.out.println("el volumen de un cono es  " + total +  "  cm3 ");
  }
}

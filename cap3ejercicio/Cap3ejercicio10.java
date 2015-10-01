/**hacer un conversor de mb a kb
 * ejecicio 10
 *junior castillo
*/

public class Cap3ejercicio10 {
  public static void main(String[] args) {

    System.out.println("conversor de mb a kb");
    System.out.print("Por favor , introduzca la capacidad de megabytes: ");
  
    double CantidadMegabytes= Double.parseDouble(System.console().readLine());
    
   double ResultadoEnBytes= (CantidadMegabytes * 1024);
    System.out.println(" El resutado es  " + ResultadoEnBytes + " KB");
  }
}


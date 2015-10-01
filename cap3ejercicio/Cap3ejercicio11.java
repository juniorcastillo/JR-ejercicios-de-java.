/**hacer un conversor de KB a MB
 * ejecicio 11
 *junior castillo
*/

public class Cap3ejercicio11 {
  public static void main(String[] args) {

    System.out.println("Conversor de KB a MB");
    System.out.print("Por favor , introduzca la capacidad de kilobytes: ");
       
         double CantidadDeKiloBytes = Double.parseDouble(System.console().readLine());
 
    System.out.println(CantidadDeKiloBytes + "Kb son " +  (CantidadDeKiloBytes / 1024) + "Mb.");
  }
}


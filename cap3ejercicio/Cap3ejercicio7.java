/**Escribe un programa que calcule el total de una factura a partir de la base imponible.
*junior castillo
*/

public class Cap3ejercicio7 {
  public static void main(String[] args) {

    System.out.println("base imponible");
    System.out.print("Por favor, introduzca la base imponible : ");
    double base = Double.parseDouble(System.console().readLine());
  
    double iva = 0.21;
    double total = (base * iva ) + base ;
    
    System.out.println("El precio total es " + total);
  }
}

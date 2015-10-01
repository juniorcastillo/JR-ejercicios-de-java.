/**
 *  Variables
 *
 * . Escribe un programa que calcule el total de una factura a partir
 *    de la base imponible (precio sin IVA). La base imponible estará
 *    almacenada en una variable.
 *
 * junior castillo
 */

public class cap2ejercicio06 {
  public static void main(String[] args) {

    double BaseImponible = 200;

    System.out.printf("Base imponible" + BaseImponible);
    System.out.printf("IVA" + (BaseImponible * 0.21));
    System.out.printf("Total          " + (BaseImponible * 0.21  + BaseImponible) );
  }
}

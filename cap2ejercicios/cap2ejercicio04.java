/**
 * Variables
 *
 *  Realiza un conversor de euros a pesetas. La cantidad en euros que
 *    se quiere convertir deberá estar almacenada en una variable.
 *
 * junior castillo
 */

public class cap2ejercicio04 {
  public static void main(String[] args) {
    
    double euros = 10.00;
    int pesetas = (int)(euros * 166.386);
    
    System.out.print(euros + " Esta cantida de euros son " + pesetas + " pesetas.");
  }
}

/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita, cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 * El siguiente código del programa principal debe dar la salida que se muestra:

*pizza margarita mediana, pedida
*pizza funghi familiar, servida
*pizza cuatro quesos mediana, pedida
*esa pizza ya se ha servido
*pedidas: 3
*servidas: 1
*
*/

public class PedidosPizza {
 public static void main(String[] args) {
 
  Pizza p1 = new Pizza("margarita ", "mediana");
  System.out.println();
  Pizza p2 = new Pizza("funghi ", "familiar");
  System.out.println();
  p2.sirve();
  System.out.println();
  Pizza p3 = new Pizza("cuatro quesos", "mediana");
  System.out.println();
  p1.sirve();
  p1.sirve();
  System.out.println();
  System.out.println("pedidas: " + Pizza.getTotalPedidas());
  System.out.println();
  System.out.println("servidas: " + Pizza.getTotalServidas());
 }
}

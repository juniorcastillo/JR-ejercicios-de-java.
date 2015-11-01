/**
* Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
  baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
  formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
  9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
  podemos usar String.valueOf(n).
*
*  junior castillo
**/


public class EjercicioAleatorio2 {
  public static void main(String[] args) {
      
    
      
    String formacarta = "";
    String carta = "";
    
    int numforma = (int)(Math.random()*4) + 1;
    
    switch(numforma) {
      case 1:
        formacarta = "pi";
        break;
      case 2:
        formacarta = "corazones";
        break;
      case 3:
       formacarta = "diamantes";
        break;
      case 4:
        formacarta = "tréboles";
      default:
    }

    int cantidadCarta = (int)(Math.random()*13) + 1;
    
    switch(cantidadCarta) {
      case 1:
        carta = "A";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(cantidadCarta);
    }
    
    System.out.println(carta + " de " + formacarta);
  }
}

/**
* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
*  junior castillo
**/


public class EjercicioAleatorio3 {
  public static void main(String[] args) {
      
    
      
    String formacarta = "";
    String carta = "";
    
    int numforma = (int)(Math.random()*4) + 1;
    
    switch(numforma) {
      case 1:
        formacarta = "copas";
        break;
      case 2:
        formacarta = "oros";
        break;
      case 3:
       formacarta = "espadas";
        break;
      case 4:
        formacarta = "baste";
      default:
    }

    int cantidadCarta = (int)(Math.random()*10) + 1;
    
    switch(cantidadCarta) {
      case 1:
        carta = "as";
        break;
      case 8 :
        carta = "rey";
        break;
      case 9:
        carta = "caballo";
        break;
      case 10:
        carta = "sota";
        break;
      default:
        carta = String.valueOf(cantidadCarta);
    }
    
    System.out.println(carta + " de " + formacarta);
  }
}

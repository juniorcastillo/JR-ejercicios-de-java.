  /**
 * 4. Sentencia Condicional
 
 *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
  del día de la semana.
 
 * @author junioir castillo
 */

public class Cap4Ejercicio3 {
  public static void main(String[] args) {

    String semana;

    System.out.print("Por favor, introduzca el numero que corresponga al dia: ");
    semana = (System.console().readLine()); 
    semana.toLowerCase(); // convierto a minúsculas todas las letras
    
    switch(semana) {
      case "1":
        System.out.println("lunes");
        break;
      case "2":
       System.out.println("martes");
        break;
      
      case "3":
        System.out.println("miercoles");
        break;
      case "4":
        System.out.println("jueves");
        break;
      case "5":
        System.out.println("viernes");
        break;
      case "6":
       System.out.println("sabado");
        break;
      case "7":
        System.out.println("domingo");
        break;
      default:
        System.out.println("El numero introducido no es correcto.");
    }
  }
}

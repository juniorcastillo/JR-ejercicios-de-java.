/**
 * 4. Sentencia Condicional
 
 * Realiza un programa que pida una hora por teclado y que muestre 
 * luego buenos días, buenastardes o buenas noches según la hora. 
 * Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente.
 * Sólo se tienen en cuenta las horas, los minutos no se deben introducir
 * por teclado.
 
 * @author junioir castillo
 */

public class Cap4Ejercicio2 {
  public static void main(String[] args) {



    System.out.print("Por favor, introduzca la hora : ");
    int hora = Integer.parseInt(System.console().readLine()); 
    
    if ((hora >=  6) && (hora <= 12)) { 
       System.out.println("Buenos dias");
       }
     
    if ((hora >= 13) && (hora <= 20)) {
       System.out.println("Buenas tardes");
       }
      
     
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >=0))){
       System.out.println("Buenas noches");
       }
       
    if ((hora > 24) || (hora < 0)) {
       System.out.println("La hora introducida no es correcta.");
       }
     
     
  }
}

    
    
    
    

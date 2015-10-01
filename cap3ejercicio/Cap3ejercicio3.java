/**Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
debe ser introducida por teclado.


*junsior castillo

*/

public class Cap3ejercicio3 {
 public static void main (String[] args) {
 
  System.out.print("Por favor, introduce la cantidad de pesetas que quieres convertir: ");
    double pesetas = Double.parseDouble(System.console().readLine());

    int euros = (int) ( pesetas / 166.38);
    
    System.out.print(pesetas + " pesetas son " + euros + " euros.");
  }
}
















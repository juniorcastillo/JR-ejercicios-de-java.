/**Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
*/

public class Cap3ejercicio8 {
  public static void main(String[] args) {

    System.out.println("salario semanal ");
    System.out.print("Por favor, introduzca el numero de hora : ");
    double hora = Double.parseDouble(System.console().readLine());
  

    double total = ( hora * 12) ;
    
    System.out.println("El precio total es " + total);
  }
}

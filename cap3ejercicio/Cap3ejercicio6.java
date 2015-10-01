/** Escribe un programa que calcule el área de un triángulo.
*/

public class Cap3ejercicio6 {
  public static void main(String[] args) {

    System.out.println("Área de un triangulo");
    System.out.print("Por favor, introduzca la longitud de la base (cm): ");
    double base = Double.parseDouble(System.console().readLine());
    System.out.print("Introduzca la altura (cm): ");
    double altura = Double.parseDouble(System.console().readLine());
    double total = (base * altura) /2;
    System.out.println("El área del rectángulo es " + total + "cm2");
  }
}

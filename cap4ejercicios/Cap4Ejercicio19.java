/**
 * 4. Sentencia Condicional
 
*realize un programa que diga cuantos digitos tiene un numero , 
* entero que puede ser positivo o negativo . se peromiten numero hasta *de 5 digitos.
 
 * @author junior castillo
 */
public class Cap4Ejercicio19 {

  public static void main(String[] args) {
    
    int n; 
    int digitos = 0;
    
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = Integer.parseInt(System.console().readLine());
    
    if ( n < 10 ) {
      digitos = 1;
    }
    
    if (( n >= 10 ) && ( n < 100 )) {
      digitos = 2;
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
       digitos =3 ;
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
       digitos = 4;
    }
    
    if ( n >= 10000 ) {
       digitos = 5;
    }
    
    System.out.println("el numero introducido tiene:  "  + digitos + " digitos");
  }
}

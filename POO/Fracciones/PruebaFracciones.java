/**
 Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de
 los métodos pueden ser invierte , simplifica , multiplica , divide , etc.
 
 * Definición de la clase fraccion
 * @author Junior castillo
 */

/**
 * 
 * PruebaFracciones.java
 * 
 * @author Junior castillo
 */

public class PruebaFracciones {
  public static void main(String[] args) {
  // crea  objeto
    Fraccion fra1= new Fraccion(2,3);
    
  //se multiplica la fraccion introducida con la que esta por defecto
  
     fra1.setmultiplicar(10,3);
     System.out.println("multiplicacion de fracciones " + fra1.getnumerador() + "/" + fra1.getdenominador());
     ///////////////////////// 
     fra1.setactualizar(2,3);
     ////////////////////////
  //se divide la fraccion introducida con la que esta por defecto
     fra1.setdividir(4,9);
     System.out.println("Division de fracciones " + fra1.getnumerador() + "/" + fra1.getdenominador()); 
  //Invierte el denominador y el numerador  
      System.out.println("fraccion invertida " + fra1.getdenominador() + "/" + fra1.getnumerador());   
      
   //simplificar 
      System.out.println("MAximo como un denominador " + fra1.maxComunDenominador(100,658));  
      System.out.println("MAximo como un numerador " + fra1.simplificar());  
      
 }
}

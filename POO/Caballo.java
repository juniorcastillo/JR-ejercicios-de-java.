/**
 * Caballo.java
 * Definición de la clase Caballo
 * @author Junior castillo
 */

public class Caballo {

  // atributos /////////////////////////////
  
  String nombre;
  String raza;
  String sexo;
  String rumir;
  boolean herrado;
  boolean pasos;
  double peso;
  int edad;
  
  
  // métodos ///////////////////////////////
  
  // constructor
  Caballo (String s) {
    this.sexo = s;
  }
  
  // getter
  String getSexo() {
    return this.sexo;
  }
  
  /**
   * Hace que el caballo cuando rume
   */
  void rumir() {
    System.out.println("jiiiijiii");
  }

  /**
   * Hace que el caballo cuando se enoja
   */  
  void molesto() {
    System.out.println("ppprrrruueee");
  }
  
  /**
   * Hace que el caballo coma.
   * Al caballo le gusta la yerba 
   * @param comida la comida que se le ofrece al caballo
   */
  void come(String comida) {
  
    if (comida.equals("yerba")) {
      System.out.println("Hmmmm, gracias, dame mas ");
    } else {
      System.out.println("Aleja eso de mi ");
    }
  }

  /**
   * Pone a jugar añ caballos.
   * juga con el macho con la hembra le da verguenza.
   * 
   * @param 
   */
  void jugar(Caballo jugador) {
    if (this.sexo.equals("Hombre")) {
      System.out.println("Juguemos");
    } else {
      if (jugador.getSexo().equals("hembra")) {
        System.out.println("Lo siento, soy timido");
      } else {
        System.out.println("Juguemos a correr");
      }
    }
  }
}

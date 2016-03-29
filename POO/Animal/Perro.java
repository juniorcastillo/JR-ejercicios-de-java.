/**
 * Perro.java
 * Definición de la clase Caballo
 * @author Junior castillo
 */

public class Perro extends Mamifero{

  ////atributos /////////////////////////////
  
  String nombre;
  String rumir;
  boolean herrado;
  boolean pasos;
  double peso;
  int edad;
  int contador;
  
  
  // métodos ///////////////////////////////
  
  // constructor
  Perro (String raza , String sexo , int edad ) {
    super(raza ,sexo, edad);
    this.sexo = sexo ;
  }
  
  // getter el sexo del perro
  protected  String getSexo() {
    return this.sexo;
  }
  
  /**
   * Hace que el perro cuando rume
   */
  protected  void ladrar() {
    System.out.println("jau jau jau");
  }

  /**
   * Hace que el perro cuando se enoja
   */  
 protected  void molesto() {
    System.out.println("uahuuuuuuuuu te mordere ");
  }
  
  /**
   * Hace que el perro coma.
   * Al caballo le gusta la yerba 
   * @param comida la comida que se le ofrece al caballo
   */
  protected  void come(String comida) {

    if (comida.equals("hueso")) {
      System.out.println("Hmmmm, gracias, dame mas ");
     }else {
      System.out.println("Aleja eso de mi , dame  hueso");
    }
   
  }

  /**
   * Pone a jugar al perro.
   * juga con el macho con la hembra le da verguenza.
   * 
   * @param 
   */
 protected  void jugar(Perro jugador) {
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

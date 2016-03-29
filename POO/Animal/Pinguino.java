/**
 * Pinguino.java
 * Definición de la clase Caballo
 * @author Junior castillo
 */

public class Pinguino extends Ave {

  // atributos /////////////////////////////
    private String nombre;


  
  // métodos ///////////////////////////////
  
  // constructor
 Pinguino (String raza ,String sexo , int edad ,String colorPluma , int altura , String nombre ) {
   super(raza ,sexo , edad ,  colorPluma);
    
    this.nombre=nombre;
  }
  
  // getter
  String getSexo() {
    return this.sexo;
  }
  
  /**
   * Hace  que el Pinguino  cante
   */
 public void cantaPinguino() {
    System.out.println("gruagruagrua");
 } 
// el pinguino te dara un abrazo
 public void abrazar(Pinguino jugador) {
   if(this.sexo.equals("macho")){
    System.out.println("lo siento , no tengo frio ");
   }else{ System.out.println("lo siento , no tengo frio ");
    }
  }
}

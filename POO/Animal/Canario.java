/**
 * Canario.java
 * Definición de la clase Caballo
 * @author Junior castillo
 */

public class Canario extends Ave {

  // atributos /////////////////////////////
  
   private int altura;
 


  
  
  // métodos ///////////////////////////////
  
  // constructor
 Canario (String raza ,String sexo , int edad ,String colorPluma , int altura  ) {
   super(raza ,sexo , edad ,  colorPluma);
    this.altura= altura;
  }
  
  // getter
  String getSexo() {
    return this.sexo;
  }
  
  /**
   * Hace  que el canario cante
   */
 public void cantaCanario() {
    System.out.println("pipipipipipi");
  }

  /**
   * creo que he visto a un lindo gatito 
   */  
 public void verGato() {
    System.out.println("Creo que he visto a un lindo gatito");
  }
  
  /**
   * Hace que el cannario vuele.
   * vuela la altura que le pongas 
   * @param 
   */
 public  int  getaltura(int altura) {
      this.altura=altura;  
      return altura; 
  }
  // hace volar a canario
 public void volar(){
   
   System.out.print("Estoy volando mirame a la altura de ");
 }
  
}

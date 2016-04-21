/**
 * La máquina Eurocoin genera una moneda de curso legal cada vez que se pulsa
un botón siguiendo la siguiente pauta: o bien coincide el valor con la moneda
anteriormente generada - 1 céntimo, 2 céntimos, 5 céntimos, 10 céntimos, 25
céntimos, 50 céntimos, 1 euro o 2 euros - o bien coincide la posición – cara o
cruz. Simula, mediante un programa, la generación de 6 monedas aleatorias
siguiendo la pauta correcta. Cada moneda generada debe ser una instancia
de la clase Moneda y la secuencia se debe ir almacenando en una lista.
Ejemplo:
2 céntimos – cara
2 céntimos – cruz
50 céntimos – cruz
1 euro – cruz
1 euro – cara
10 céntimos – cara

 *
 * @author Junior castillo
 */


public class Moneda{

  // atributos /////////////////////////////
 
 

   protected String lado []= {"cara" ,"cruz"};
   protected String valor []= {"1 céntimo", "2 céntimos", "5 céntimos", "10 céntimos", "25céntimos",
     " 50 céntimos", "1 euro o 2 euros"};
   private String posicion;
   private String  cantidad;


  // métodos ///////////////////////////////
   
  
  //constructor
    protected Moneda () {
    this.posicion = lado[(int)(Math.random()*2)];
    this.cantidad = valor[(int)(Math.random()*8)];
  }
  
  // getter //consultar
  public String getposicion() {
    return this.posicion;
  }
  public String getcantidad() {
    return this.cantidad;
  }


 public String toString(){
   
   return "cantidad: " + this.cantidad + "\n"  + "posicion: " + this.posicion;
   
 } 

}

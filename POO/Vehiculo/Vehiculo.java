
public class Vehiculo {

  // atributos /////////////////////////////
 
 
  private int vehiculosCreados;
   private static int kilometrosTotales=0;
  protected int kilometrosRecorridos;
  


  
  // métodos ///////////////////////////////
   
  
  // constructor
   public Vehiculo () {
    this.kilometrosRecorridos=0;
    this.kilometrosTotales=0;
  }
  
  // consultar
  public int consultarkilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  public static  int consultarkilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
// no envia nada solo presenta muestra los Kilometros //////

  public void andar(int kilometrosRecorridos) {
    this.kilometrosRecorridos += kilometrosRecorridos;
    Vehiculo.kilometrosTotales += kilometrosRecorridos;
 
  }
}

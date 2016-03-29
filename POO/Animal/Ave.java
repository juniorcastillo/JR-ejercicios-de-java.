

public class Ave extends Animal {

  // atributos /////////////////////////////
 
 
   protected String colorPluma;
   protected int tamano;
  
  


  
  // métodos ///////////////////////////////
   
  
/////////////////// constructor////////////////////////////////////////
  protected Ave(String raza ,String sexo , int edad ,String colorPluma ) {
    super( raza ,sexo, edad);
    this.colorPluma=colorPluma;
   
  }
  
 ///////setter///////////////////////////////////////
  
  // cambia el color de la pluma
  protected void setcolorPluma(String color) {
    this.colorPluma=color;
  }
  
  // modifica el tamaño de tu ave 
  public void settamano(int tamano) {
     this.tamano=tamano;
  }
  
//////////////getter ////////////////////////////////
  
  // consulta el tamaño del ave 
  public int gettamano() {
    return this.tamano;
  }
  //consuulta el color de pluma que tiene el ave
   
 protected  String getcolorPluma() {
    return this.colorPluma;
  }  
  
  public String toString(){
    String caracteristicas= "Este  es el tamaño del ave -> " + tamano + " Y este es su color de pluma " + colorPluma;
    
    return caracteristicas;
  }
}



public class Mamifero extends Animal {

  // atributos /////////////////////////////
 
 
   protected  String tipo;
   protected  int cantidadOjos;
   protected  int cantidadPies;
  

////////////////// métodos //////////////////////////////////////////////
   
  
//////////////////// constructor ///////////////////////////
  protected Mamifero(String raza ,String sexo , int edad  ) {
    super( raza ,sexo, edad);
    this.tipo="";
    this.cantidadOjos=0;
    this.cantidadPies=0;
  }
  
///////setter///////////////////////////////////////
  
  //pudes decir si es acuatico y terrestre 
  public void settipo(String  tipo) {
    this.tipo=tipo;
  }
  
  // dice cuantos pies tiene el mamiferos 
  public void setcantidadPies(int numPie) {
    
     this.cantidadPies=numPie;
  }
  
//////////////getter ////////////////////////////////
  
  //consulta cuantos pies tiene el mamifero
  public int getcantidadPies() {
    if(tipo.equals("terrestre")){
      return this.cantidadPies;
    }
    return 0;
  }
  
   // consulta si es acuatico o terrestre 
  public String gettipo(){
     return this.tipo;
    
  }

}

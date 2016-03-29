
public class Animal {

  // atributos /////////////////////////////
 
 
   protected String raza;
   protected String sexo;
   protected int edad;
  


  
  // métodos ///////////////////////////////
   
  
  // constructor
   protected Animal (String raza ,String sexo , int edad) {
    this.raza =raza;
    this.sexo=sexo;
    this.edad=edad;
  }
  
  // getter //consultar
  public String getsexo() {
    return this.sexo;
  }
  public String getraza() {
    return this.raza;
  }
  public int getedad() {
    return this.edad;
  }

  

}

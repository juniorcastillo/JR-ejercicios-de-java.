/**
 * 
 * Crea la clase Fracción . Los atributos serán numerador y denominador . Y algunos de
 * los métodos pueden ser invierte , simplifica , multiplica , divide , etc.
 *
 * Fracción.java
 * Define la clase fraccion
 * @author Junior castillo
 */

public class Fraccion {

  // atributos /////////////////////////////
   private  int numerador;
   private  int denominador;
   private  int producto;
   private  double resto;

  
/////////////////// métodos //////////////////////////////////////////////
  
  // constructor

  Fraccion (int numerador , int denominador) {
    this.numerador=numerador;
    this.denominador=denominador;
  }
  
/////////////////// setter o  modifica//////////////////////////////////////
  
 
   // regresa a su valor de origen
   public void setactualizar(int nu , int de){
    this.numerador =nu;
    this.denominador =de; 
  }
  
   // Multiplicacion de  fracciones 
 public void setmultiplicar(int nu ,  int de){
    this.numerador *=nu;
    this.denominador*=de; 
  }
  
  
   // Divicion de  fracciones 
 public void setdividir(int nu ,  int de){
    this.numerador *=de;
    this.denominador*=nu; 
    
  } 
////////////////////getter o  consultar//////////////////////////////////////
  
  
  // consulta el valor de numerador
  public int getnumerador(){
    return this.numerador;
    
  }
   // consulta el valor de denominador
  public int getdenominador(){
     return this.denominador;
  }
  // saca el maximo como un denominador
  public int maxComunDenominador(int num , int den){
     this.numerador=Math.abs(num);
     this.denominador=Math.abs(den);
     if(this.denominador==0){
          return this.numerador;
     }
     int r;
     while(this.denominador!=0){
          r=this.numerador% this.denominador;
         this.numerador= this.denominador;
          this.denominador=r;
     }
     return this.numerador;
  
  }
// hace el metodo de simplificar 
  int simplificar(){
     int dividir=this.numerador;
     this.numerador/=dividir;
    this.denominador/=dividir;
     return this.denominador;
  }


  // devuelve un division
 public  double dividir(){
    return this.numerador / this.denominador;
  }
  
  
  
  
   
 
}

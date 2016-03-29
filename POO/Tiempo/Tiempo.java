/**
 * Crea la clase Tiempo con los métodos suma y resta . Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los parámetros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el método toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s . Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado debería ser 1h 6m 0s . Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 * 
 * @junior castillo
 */ 



public class Tiempo{
 //atributos
 
 public  int hora;
 public  int minuto;
 public  int segundo;
 
 ///// metodos ////////////////////////
 //constuctor 
 Tiempo (int hora , int minuto , int segundo){
    
    this.hora=hora;
    this.minuto=minuto;
    this.segundo=segundo;
   
 }
// muestra los valores de la forma pedida en el ejercicio
 public String toString(){
  
   return this.hora +"h " + this.minuto +"m " + this.segundo + "s " ;
 }

///////////// Metodo de sumar  ////////


 public void suma(int h, int m , int s){
   int guarda0=this.hora+h;  
   int guarda=this.minuto + m;  
   int guardar2= this.segundo + s;
   int sobra=60;// utilizo para restar y sacar los minutos que sobran o segundos
   int sobraH=24;
   // calculas los segundos
   if(guardar2 >= 60){
      this.minuto=1 ;
      this.segundo=guardar2 - sobra;
    }else{
      this.segundo+=s;
     }
    // calcula los minutos
   if( guarda >= 60){
     this.hora+=1 ;
     this.minuto+=guarda - sobra ;
   }else{
     this.minuto+=m;
    }
    // calcula la hora
    if( guarda0 >= 24){
     this.hora+=0;
     this.hora+=guarda - sobraH ;
   }else{
     this.hora+=h;
    }
 }
public void resta(int h,int m , int s){
  
   int guarda=this.minuto - m;  
   int guardar2= this.segundo - s;
   int sobra=60;// utilizo para restar y sacar los minutos que sobran o segundos
   // calcula los segundos
   if(guardar2 <= 0){
      this.minuto -= 1;
      this.segundo=1-sobra - Math.abs(guardar2);
      if(this.segundo < 0){
         this.segundo=0;
      } 
    }else{
      this.segundo-=s;
      }
    //cacula las minutos 
   if( guarda <= 0){
     this.hora -= 1;
     this.minuto =1 - sobra - Math.abs(guarda);
     if(this.minuto < 0){
       this.minuto=0;
     }
   }else{
     this.minuto -= m;
    }
    //cacula las hora 
     this.hora -= h;
     if(this.hora <0){
       this.hora=0;
     }
  
  }


}

/**
*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
de suspensos, el número de suficientes, el número de bienes, etc.

*  junior castillo
**/

public class EjercicioAleatorio11 {
  public static void main(String[] args) {
       int notas;
       int cantidad=0;

     for ( notas =1; notas <=20;notas++ ){

             int  resultado = (int)(Math.random()*10) + 1;
      
             if(resultado < 5 ){
                
               System.out.println(resultado + " = suspenso " );
              
              }
             if(resultado ==5 ){
               
               System.out.println(resultado + " =  suficiente " );
              
              }
             if((resultado >5  ) && ( resultado < 8)){
               
               System.out.println(resultado + " =  bien " );
           
              }
             if ( resultado >= 8){
               
               System.out.println(resultado + " =  bien " );
           
              }
      }
          

  }    
}


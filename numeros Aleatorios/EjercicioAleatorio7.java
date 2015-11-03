/**
*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14
partidos y el pleno al quince (15 filas).

*  junior castillo
**/

public class EjercicioAleatorio7 {
  public static void main(String[] args) {
       

     for (int equipo =1; equipo <=14;equipo++ ){
       
        System.out.print("\n" + equipo +". |" );
      
        for (int apuesta=1;apuesta <=3;apuesta++){
             int  resultado = (int)(Math.random()*3) + 1;
      
          switch (resultado) {
      
             case 1:
               System.out.print( " 1 " + "|" );
               break;
             case 2:
               System.out.print(" 2 " + "|");
               break;
             case 3:
               System.out.print ( " x " + "|" );
               break;
           
          }
        }   
      }

  }    
}



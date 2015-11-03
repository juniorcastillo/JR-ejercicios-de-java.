/**
*Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
= 3/6 y 1/3 = 2/6.

*  junior castillo
**/

public class EjercicioAleatorio8 {
  public static void main(String[] args) {
       

     for (int equipo =1; equipo <=14;equipo++ ){
       
        System.out.print("\n" + equipo +". |" );
      
        for (int apuesta=1;apuesta <=3;apuesta++){
             int  resultado = (int)(Math.random()*6) + 1;
      
          switch (resultado) {
      
             case 1:
               System.out.print( " 1 " + "|" );
               break;
             case 4:
               System.out.print( " 1 " + "|" );
               break;
             case 5:
               System.out.print( " 1 " + "|" );
               break;
             case 2:
               System.out.print(" 2 " + "|");
               break;
             case 3:
               System.out.print ( " x " + "|" );
               break;
             case 6:
               System.out.print ( " x " + "|" );
               break;
           
          }
        }   
      }

  }    
}


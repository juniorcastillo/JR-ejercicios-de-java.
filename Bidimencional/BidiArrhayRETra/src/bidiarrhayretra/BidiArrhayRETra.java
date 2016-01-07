/*
 *Modifica el programa anterior de tal forma que las sumas parciales y la suma total
 *aparezcan en la pantalla con un pequeño retardo, dando la impresión de que el ordenador
 *se queda “pensando” antes de mostrar los números.
 */
package bidiarrhayretra;

/**
 *
 * @author junior
 */
public class BidiArrhayRETra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
        throws InterruptedException {
     int[][] num = new int[4][5];
       
       
        int filas;
        int columnas;
        int total=0;
        //introduce el valor del array
       for(filas=0;filas<4;filas++){
      
          for(columnas=0;columnas < 5 ;columnas++){
            System.out.print("fila " +filas + "columna " + columnas + " ");
           num[filas][columnas] = ((int)(Math.random()* 900)+100);
          
            System.out.println();
          }
        }
       System.out.print("columna" );
         
      for(columnas=0;columnas<5;columnas++){ 
           System.out.printf("%10d" , columnas);
        }
        System.out.println();
        System.out.print("--------------------------------------------------------------------------" );
        System.out.println();
        
       int sumaF;
        //suma las filas y el total y presenta el array
       for(filas=0;filas<4;filas++){
            System.out.print("fila " + filas + "|");
            sumaF=0;
            
            for(columnas=0;columnas < 5 ;columnas++){
                System.out.printf("%9d|", num[filas][columnas]);  
                sumaF= sumaF + num[filas][columnas];
                total+= num[filas][columnas];
            }
            System.out.print("|");
             Thread.sleep(2000); 
            System.out.printf(" %10d| ", sumaF); 
          
            System.out.println(); 
             
        } 
       //suma las columnas
       System.out.print("--------------------------------------------------------------------------" );
       System.out.println();
       System.out.print("columna");
       for(columnas=0;columnas<5;columnas++){
        
           sumaF=0;
           for(filas=0;filas < 4 ;filas++){
         
             sumaF= sumaF + num[filas][columnas];
              
           }
           Thread.sleep(2000); 
        System.out.printf("%9d|", sumaF);
        } 
       Thread.sleep(4000); 
       System.out.printf("total: %9d|", total);
      System.out.println();
  }
}   
  
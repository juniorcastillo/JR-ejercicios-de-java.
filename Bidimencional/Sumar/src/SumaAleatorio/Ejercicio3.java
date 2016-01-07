/*
 * Modifica el programa anterior de tal forma que los números que se introducen en el array
 * se generen de forma aleatoria (valores entre 100 y 999).  
 */
package SumaAleatorio;



/**
 *  
 * @author junior
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        System.out.printf("%9d|", sumaF);
        } 
       System.out.printf("total: %9d|", total);
      System.out.println();
  }
}   
  
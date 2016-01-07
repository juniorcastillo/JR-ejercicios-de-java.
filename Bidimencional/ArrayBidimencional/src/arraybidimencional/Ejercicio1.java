/*
 *  Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
 *los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 *dispuestos en forma de tabla como se muestra en la figura.
 */
package arraybidimencional;

/**
 *
 * @author junior
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] num = new int[3][6];

        num[0][0]=0;  
        num[1][0]=75;
        num[0][1]=30;
        num[0][2]=2; 
        num[2][2]=-2;
        num[2][3]=9; 
        num[2][4]=0; 
        num[0][5]=5; 
        num[2][5]=11; 
      
        int filas;
        int columnas;
         System.out.print("columna" );
         
         for(columnas=0;columnas<=5;columnas++){ 
       System.out.printf("%10d" , columnas);
         }
          System.out.println();
          System.out.print("--------------------------------------------------------------------------" );
           System.out.println();
       for(filas=0;filas<=2;filas++){
           
         System.out.print("fila " + filas + "|"); 
       
       for(columnas=0;columnas <= 5 ;columnas++){
         System.out.printf("%9d|", num[filas][columnas]);  
            
       
        }
         System.out.println(); 
        }
        
    }
    
}

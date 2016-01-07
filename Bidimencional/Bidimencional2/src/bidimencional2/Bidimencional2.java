/*
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
esquina inferior derecha.
 */
package bidimencional2;

/**
 *
 * @author junior
 */
import java.util.Scanner;
public class Bidimencional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] num = new int[4][5];
        Scanner s = new Scanner(System.in);
       
       
        int filas;
        int columnas;
        int total=0;
        //introduce el valor del array
       for(filas=0;filas<4;filas++){
      
          for(columnas=0;columnas < 5 ;columnas++){
            System.out.print("fila " +filas + "columna " + columnas + " ");
            num[filas][columnas]= Integer.parseInt(s.nextLine());
          
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
            System.out.printf(" %9d| ", sumaF); 
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
       System.out.printf("%9d|", total);
      System.out.println();
  }
}   


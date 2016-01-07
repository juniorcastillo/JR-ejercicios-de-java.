/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 */
package bidiarraymaxymin;

/**
 *
 * @author junior
 */
public class BidiArrayMaxYMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] num = new int[6][10];
       
       
        int filas;
        int columnas;
        int max=0;
        int minimo=1002;
        int columnaMinimo=0;
        int columnaMaximo=0;
        int filaMinimo=0;
        int filaMaximo=0;
        //introduce el valor del array
        
    for(filas=0; filas< 6 ;filas++){
         columnas=0;
          //busca el numero positivo y par
        while(columnas < 10 ){
            
          int numero= (int)(Math.random()*1001);
          if(numero %2==0){
                
                System.out.print("fila: " + filas + ", columna: " + columnas);
                num[filas][columnas]=numero;

                System.out.println();
                
                //mira el max y su posocion
              if(max < num[filas][columnas]){

                  max= numero; 
                  filaMaximo=filas;
                  columnaMaximo=columnas;

              } 
              //minimo y su posicion
              if(minimo > num[filas][columnas]){

                  minimo= numero;  
                  filaMinimo=filas;
                  columnaMinimo=columnas;
              }
              columnas++;
          }
        }
    }
       for(filas=0;filas < 6; filas++){
            System.out.print("fila " + filas + "|");
            
            
            for(columnas=0;columnas < 10 ;columnas++){
                System.out.printf("%9d|", num[filas][columnas]);  
               
         
            }
            System.out.println();
            
            
        } 
         System.out.println("maximo " + max + "esta en la pocision "+ filaMaximo + "," + columnaMaximo);
         System.out.println("minimo" + minimo + "esta en la pocision "+ filaMinimo + "," + columnaMinimo);
    } 
   }
    
  
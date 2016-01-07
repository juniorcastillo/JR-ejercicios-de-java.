/*
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 */
package bidiarraynorepitenumero6;

/**
 *
 * @author junior
 */
public class BidiArrayNoRepiteNumero6 {

   
   public static void main(String[] args)
  throws InterruptedException {
 
    int[][] num = new int[6][10];

    int fila;
    int columna;

    // Genera el contenido del array sin que se repita ningún valor
    boolean repetido;
    int i;
    int j;
      
    for(fila = 0; fila < 6; fila++) {
      for(columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);
           System.out.println("arrhay normalprimero= " + num[fila][columna] );
          // Comprueba si el número generado ya está en el array.
          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++) {
                        System.out.println(" fila  = " + fila + " columna = "+  columna );
            System.out.println("10 * fila + columna = " + 10 * fila + columna );
            System.out.println("i= " + i);
            System.out.println("i/10= " +  i/10);
            System.out.println("i%10= " + i%10);
            System.out.println("arrhay normal= " + num[fila][columna] );
            System.out.println("arrhay recorer= " + num[i / 10][i % 10]);
            System.out.println();
             Thread.sleep(30000);
            if (num[fila][columna] == num[i / 10][i % 10]) {
                 System.out.println("arrhay repetido= " + num[i / 10][i % 10]);
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

    int minimo = Integer.MAX_VALUE;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = Integer.MIN_VALUE;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    System.out.print("\n      ");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("   " + columna + "  ");
    }
    System.out.println();
    
    System.out.print("    ┌");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }
    System.out.println("┐");
    
    for(fila = 0; fila < 6; fila++) {
      System.out.print("  " + fila + " │");
      for(columna = 0; columna < 10; columna++) {
        System.out.printf("%5d ", num[fila][columna]);
        Thread.sleep(100);
        
        // Calcula el mínimo y guarda sus coordenadas
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        
        // Calcula el máximo y guarda sus coordenadas
        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println("│");
    }
    System.out.print("    └");
    for(columna = 0; columna < 10; columna++) {
      System.out.print("──────");
    }

    System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
    System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
  }
}

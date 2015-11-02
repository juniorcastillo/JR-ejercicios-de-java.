/**

* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
  muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
  espacios. Muestra también el máximo, el mínimo y la media de esos números.

*  junior castillo
**/

public class EjercicioAleatorio5 {
    
  public static void main(String[] args) {
  
    
    System.out.println("tira tres dados y suma su resultado:");
    int maxnum=0;
    int minNum=199;
    int suma=0;
    int media;
    
    for (int i = 1; i <= 50; i++) {
      
       int numEnteros = ((int)(Math.random()*100) + 100);
       
       if ( maxnum < numEnteros) {
           maxnum = numEnteros;
         }
       
       if ( minNum > numEnteros){
            minNum = numEnteros;
         }
          
         suma= suma + numEnteros;
       
         System.out.println(numEnteros + "  ");
       
      
    }

    System.out.println( "Esta es la media " + suma / 50 );
    System.out.println( "Este es el mayor  de los numero " + maxnum );
    System.out.println( "Este es el  menor de los numro " + minNum );
     
  }
}

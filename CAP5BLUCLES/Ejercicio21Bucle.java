/**
* Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
datos pero no se incluye en el cómputo.
*/
public class Ejercicio21Bucle {
  public static void main(String[] args) {
       
       int numIntro=0;
       int contador=0;
       int numImpares=0;
       int numContadorImpar=0;
       int maxPositivos=-1;
       
        
           
            System.out.println("si quieres salir solo debes de introducir un numero negativo");
          System.out.println("por favor, introduzca numeros--> ");
          
      do {
         
          numIntro= Integer.parseInt(System.console().readLine());
          
          
            if(numIntro>=0){
                contador++;
            }
              
            if((numIntro % 2) == 1) { 
                numImpares= numImpares + numIntro;
                numContadorImpar++;
            }
            
           if(numIntro > maxPositivos){
             maxPositivos=numIntro;
                
            }
           } while ( numIntro >=0);
      
      System.out.println("este es la cantidad de numeros introducidos--> " + contador);
      System.out.println("Esta es la media de los numero impares--> " +  numImpares /numContadorImpar);
       System.out.println("esta la cantidad mayor--> " + maxPositivos);
    
   
  }
}

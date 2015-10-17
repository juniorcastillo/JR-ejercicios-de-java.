/**
/**Escribe un programa que calcule la media de un conjunto de números positivos introduci-
dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
indicará que ha terminado de introducir los datos cuando meta un número negativo.

*

* @author junior castillo
*/ 

public class Ejercicio10Bucle {
  
   
   
 public static void main (String[] args){
   int Repetir = 0 ;
   int NumeroIntro;
   int Media = 0 ;
   int SumaTotal=0 ;
        
       System.out.println("este programa calcula la media de tu nota");
        
  do { System.out.println("introdusca un numero positivo");
    NumeroIntro = Integer.parseInt(System.console().readLine());
    
      if (NumeroIntro > 0) {
        SumaTotal= SumaTotal + NumeroIntro;
        System.out.println("sumatotal es=" + SumaTotal);
        System.out.println("numero es =" + NumeroIntro);
        
         Repetir ++;
      }
        
        
        
     
   }
   while (NumeroIntro > 0);
   Media= SumaTotal / Repetir;
   
    System.out.println("La media de los numeros introducidos =" + Media);
  
  
  }
}

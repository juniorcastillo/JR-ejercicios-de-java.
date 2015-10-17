/**
* Muestra la tabla de multiplicar de un número introducido por teclado.

* @junior castillo
*/
public class Ejercicio8Bucle {
  public static void main(String[] args) {
      

       int j=1;
       int numero;
       int producto;
       
        System.out.println("instrodusca el numero para multiplicar: ");
        numero =Integer.parseInt(System.console().readLine()); 
       
       //+++++++++++++++++++++++++
       do { 
               producto= numero * j ;
            
            System.out.println(numero +"x"+ j+ "= " + producto);
                
                 j++;
      
         }

      while (j <= 12);
      //**************************
      
     
        
  }
}

    
 
        
          

    

      
      

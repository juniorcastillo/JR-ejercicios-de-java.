/**
*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.

*  junior castillo
**/
	
public class EjercicioAleatorio10{
  public static void main(String[] args) {
     String caracter =" ";
     int cantidad;
     for  (int linea=1;linea <=10;linea++){
                
            cantidad = (int)(Math.random()*40) + 1; 
           
           int  forma = (int)(Math.random()*6) + 1;
           
          switch ( forma ) {
      
             case 1:
               caracter= "-";
               break;
             case 4:
             caracter= "*";
               break;
             case 5:
               caracter= "=";
               break;
             case 2:
              caracter=".";
               break;
             case 3:
               caracter=  "|"  ;
               break;
             case 6:
             caracter= "@" ;
               break;
            
          }
           for(int L=1; L <=cantidad;L++) {
     
         System.out.print(  caracter); 
         } 
         System.out.println(); 
        }  
         
  }    
}

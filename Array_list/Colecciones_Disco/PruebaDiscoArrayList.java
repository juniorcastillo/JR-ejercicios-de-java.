
/**
 *
 * @autor junior castillo
 * 
 */
 import java.util.Scanner;
 import java.util.ArrayList;
public class PruebaDiscoArrayList {

  public static void main(String[] args) {
    ArrayList<Disco> a = new ArrayList<Disco>();
  
    int opcion = 0;
    int opcionListado;
    
    a.add(new Disco("jdf5","pedro", "julio", "regge", 5));
    a.add(new Disco("j","pata", "sdf", "vad", 5));
      
    do{
      System.out.println("Elige una de las opciones: ");
      System.out.println("  1. Listado de discos");
      System.out.println("  2. Crear nuevo disco");
      System.out.println("  3. Modificar Disco");
      System.out.println("  4. Borrar disco");
      System.out.println("  5. Salir");
      System.out.println("-----------------------------");

      Scanner s = new Scanner(System.in);
      opcion = Integer.parseInt(s.nextLine());
      
      switch(opcion){
                 
        case 1:
          
          do {
          System.out.println("LISTADO");
          System.out.println();
          System.out.println("1. Completo");
          System.out.println("2. Por autor");
          System.out.println("3. Por género");
          System.out.println("4. En un rango de duración");
          System.out.println("5. Menú principal");
          System.out.print("Introduzca una opción: ");
          opcionListado = Integer.parseInt(s.nextLine());        
          
          switch (opcionListado) {

            case 1: 

              for(Disco i : a) {
           
                  System.out.print(i);
              }
              break;
              
            case 2: 
  
              System.out.print("Introduzca el autor: ");
              String autorIntroducido = s.nextLine();
              
              for(Disco i : a){
                if ( i.getAutor().equals(autorIntroducido)) {
                 System.out.print(i);
              }
               }
              break;
              
            case 3: 
  
              System.out.print("Introduzca el género: ");
              String generoIntroducido = s.nextLine();
              
              for(Disco i : a) {
                if (i.getGenero().equals(generoIntroducido) ){
                  System.out.println(i);
                  
                }
              }
              break;

            case 4:  
  
              System.out.println("Establezca el intervalo para la duración");
              System.out.print("Introduzca el límite inferior de duración en minutos: ");
              int limiteInferior = Integer.parseInt(s.nextLine());
              System.out.print("Introduzca el límite superior de duración en minutos: ");
              int limiteSuperior = Integer.parseInt(s.nextLine());
              
              for(Disco i : a) {
                if ((i.getDuracion() <= limiteSuperior) && (i.getDuracion() >= limiteInferior)) {
                  System.out.println(i);
                 
                }
              }
              
          } 
        } while (opcionListado != 5);

          break;
          
        case 2:
          String codigoIntroducido = "";
          boolean existeCodigo = true; 
          
           
              
           
            while (existeCodigo) {// aqui mira si el codigo no existe si no existe agregara otro
              existeCodigo = false;
              System.out.print("Introduce el codigo del disco: ");
              codigoIntroducido = s.nextLine();

               for(Disco i : a){
                if (i.getCodigo().equals(codigoIntroducido)) {
                  existeCodigo = true;
                }

              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
              }
             }     
           if(!existeCodigo){
           
            System.out.println("Introduce el autor del disco: ");
            String A =s.nextLine();
            
            System.out.println("Introduce el titulo del disco: ");
            String T= s.nextLine();
            
            System.out.println("Introduce el genero del disco: ");
            String G = s.nextLine();
            System.out.println("Introduce la duración del disco: ");
            int D=Integer.parseInt(s.nextLine());
             a.add(new Disco(codigoIntroducido,A, T, G, D));
          } 
        } 
          break;
        
        case 3:
          System.out.println("Escribe el código del disco a modificar: ");
          codigoIntroducido = s.nextLine();
      
           existeCodigo=false;
          for(Disco i : a){
             
            if((i.getCodigo().equals(codigoIntroducido))){
              existeCodigo=true;
              
               }
             } 
           if(existeCodigo){ 
            System.out.println("Introduce el autor del disco: ");
            String A =s.nextLine();
            
            System.out.println("Introduce el titulo del disco: ");
            String T= s.nextLine();
            
            System.out.println("Introduce el genero del disco: ");
            String G = s.nextLine();
            System.out.println("Introduce la duración del disco: ");
            int D=Integer.parseInt(s.nextLine());
             a.add(new Disco(codigoIntroducido,A, T, G, D));
           }
         
          break;
          
        case 4:
          
          System.out.println("Escribe el código del disco  que quieres eliminar: ");
          codigoIntroducido = s.nextLine();
      
           existeCodigo=false;
          for(int p=0; p < a.size();p++){

            if((a.get(p).getCodigo().equals(codigoIntroducido))){
               a.remove(p);
             }
          }  
        }
      
    }while(opcion < 5 || opcion == 0);
  
 }
}

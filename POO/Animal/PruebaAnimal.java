/**
 Crea las clases Animal , Mamifero , Ave , Gato , Perro , Canario , Pinguino y Lagarto . Crea,
 al menos, tres métodos específicos de cada clase y redefne el/los método/s
 cuando sea necesario. Prueba las clases creadas en un programa en el que se
 instancien objetos y se les apliquen métodos.
 
 * Definición de la clase Animal y sus subclases 
 * @author Junior castillo
 */

/**
 * 
 * PruebaAnimal.java
 * Programa que prueba la clase Vehiculo
 * @author Junior castillo
 */

public class PruebaAnimal {
  public static void main(String[] args) {
    // crea  objeto
     Ave piolin = new Ave("siguita", " macho " , 5," Amarillo ");
     Mamifero lolo = new Mamifero("Delfin " ," macho " , 10);
     Perro guffi = new Perro("Delfin " ,"macho" , 10);
     Perro perra = new Perro("pitbull " ,"hembra" , 10);
     Canario flyer = new Canario("Canario", "macho" , 2 ," Azul" , 500 );
     Pinguino cabo = new Pinguino("Canario", "macho" , 2 ," Azul" , 500 ," cabo");
     Pinguino  quico = new Pinguino("Canario", "macho" , 2 ," Azul" , 500 ," cabo");
     
     
  // prueba a piolin que es una ave .
     System.out.println("Prueba la clase ave -->\n ");
     piolin.settamano(5);
     System.out.println(piolin.toString());
     System.out.println("piolin es" + piolin.getsexo() + "\n");
     
  //Prueba a delfin que es un mamifero
     System.out.println("Prueba la clase Mamifero--> \n ");
     System.out.println("Elige si es  acuatico o Terrestre ");
     String tipo =System.console().readLine(); 
     lolo.settipo(tipo);
     lolo.setcantidadPies(2);
     if(tipo.equals("terrestre")){
        
     System.out.println("tiene " + lolo.getcantidadPies() + "pata o mas \n");
     } else{
        System.out.println("Si es acuatico lo que tiene es aleta \n");
       
       }
  // prueba a guffi que es un perro y mamifero
      System.out.println("Prueba la clase Perro--> \n ");
      System.out.println("el sexo del perro es " + guffi.getSexo());
      guffi.molesto();
      guffi.jugar(perra); 
      guffi.settipo("terrestre");  
      guffi.setcantidadPies(2);  
      System.out.println("las patas que tiene son " + guffi.getcantidadPies());
        
  // prueba a flyer que es un canario  que es de la clase ave    
     System.out.println("Prueba la clase Canario--> \n ");  
     flyer.volar();
     System.out.println(flyer.getaltura(200) + " Metros \n");
  // prueba a cabo que es un pinguino que es de la clase  ave       
     System.out.println("Prueba la clase Pinguino--> \n ");  
     cabo.cantaPinguino();
     System.out.println("tengo frio , quieres abrazarme ");  
     cabo.abrazar(quico);
 }
}

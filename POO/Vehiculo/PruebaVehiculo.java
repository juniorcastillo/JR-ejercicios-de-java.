/**
 * Crea la clase Vehiculo , así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo , crea los atributos de clase vehiculosCreados y
 * kilometrosTotales , así como el atributo de instancia kilometrosRecorridos . Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a continuación:
VEHÍCULOS
=========
1. Anda con la bicicleta
2. Haz el caballito con la bicicleta
3. Anda con el coche
4. Quema rueda con el coche
5. Ver kilometraje de la bicicleta
6. Ver kilometraje del coche
7. Ver kilometraje total
8. Salir
Elige una opción (1-8):
 * 
 * 
 * 
 * 
 * 
 * 
 * *******************
 * Vehiculo.java
 * Definición de la clase Vehiculo
 * @author Junior castillo
 */

/**
 * 
 * PruebaVehiculo.java
 * Programa que prueba la clase Vehiculo
 * @author Junior castillo
 */

public class PruebaVehiculo {
  public static void main(String[] args) {
    
    Bicicleta carolina  = new  Bicicleta();
    Coche ferrari = new  Coche();
    int elegir =0;
    int pasea =0;
    
     
  while(elegir !=8){
   
      System.out.println("Elige una de estas opciones \n");
      System.out.println("1. Anda con la bicicleta \n" + "2. Haz el caballito con la bicicleta \n" + "3. Anda con el coche \n" + "4. Quema rueda con el coche\n" + "5. Ver kilometraje de la bicicleta \n" + "6. Ver kilometraje del coche \n" +"7. Ver kilometraje total \n" +"8. Salir \n"   );
      
      
      elegir = Integer.parseInt(System.console().readLine()); 
      
      switch(elegir){
        case 1:
            System.out.println("Cuanto quieres andar ");
             System.out.print("kM ");
            pasea = Integer.parseInt(System.console().readLine()); 
           
            carolina.andar(pasea);
         break;
        case 2:
            carolina.calibrar();  
         break;
        case 3:
            System.out.println("Cuanto quieres andar ");
            System.out.print("kM ");
            pasea = Integer.parseInt(System.console().readLine()); 
          
            carolina.andar(pasea);  
         break;
        case 4:
            ferrari.quemaGoma();  
         break; 
      
        case 5:
           System.out.println("Estos son los Kilometros que ha recorrido   " + carolina.consultarkilometrosRecorridos());
         break;
        case 6:
             System.out.println("Estos son los Kilometros que ha recorrido " + ferrari.consultarkilometrosRecorridos());
         break; 
        case 7:
             System.out.println(Vehiculo.consultarkilometrosTotales());
        default:   
    
    }
  }

  }
}

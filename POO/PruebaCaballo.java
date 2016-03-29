/**
 * PruebaCaballo.java
 * Programa que prueba la clase GatoSimple
 * @author Junior castillo
 */

public class PruebaCaballo {
  public static void main(String[] args) {
    
    Caballo veloz = new  Caballo("macho");
    
    System.out.println("hola Caballito");
    veloz.rumir();
    System.out.println("toma yerba");
    veloz.come("yerba");
    System.out.println("toma mas ");
    veloz.come("yerba");
    System.out.println("No , estas muy gordo");
    
    Caballo tito = new  Caballo("hembra");
    
    System.out.println("Tom, toma papita");
    tito.come("papita");
    System.out.println();
    Caballo tita = new  Caballo("hembra");
    
    System.out.println("Caballo, rume");
    veloz.rumir();
    tita.rumir();
    tita.molesto();
    tito.rumir();
    System.out.println("vamos a jugar veloz");
    veloz.jugar(tita);
    System.out.println("vamos a jugar veloz");
    tito.jugar(veloz);
    
    
 
    
    
  }
}

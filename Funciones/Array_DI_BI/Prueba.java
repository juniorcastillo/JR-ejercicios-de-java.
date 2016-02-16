/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_DI_BI;

/**
 *
 * @author USER
 */

import static Array_DI_BI.Arrhay.generaArrayInt;
import  java.util.Scanner;
public class Prueba {
    
    
    
    
     public static void main(String[] args) {
 Scanner s =new Scanner(System.in);  
    System.out.println("intreoduce la altura "); 
    int tamano= Integer.parseInt(s.nextLine());

    System.out.println("intreoduce el minimo "); 
    int minimo = Integer.parseInt(s.nextLine());
     System.out.println("introduce el maximo "); 
    int maximo = Integer.parseInt(s.nextLine());

    int[] pinta =generaArrayInt(tamano,minimo,maximo);

    Arrhay.muestraArray(pinta);
   System.out.println(); 

   
  
    
    
    
    
}
}

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
public class Arrhay {
      // Funciones ///////////////////////////////////////////////
  
  /**
   * generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
   * intervalo (mínimo y máximo) se indica como parámetro.
   * 
   * @param x un número entero positivo
   * @return  <code>true</code> si el número es primo
   */
    /**
     * @param tamano
     * @param minimo
     * @param maximo
     * @return 
     */
  public static int[] generaArrayInt(int tamano,int minimo , int maximo) {
  
    int[] a =new int[tamano];
    int n;
     
      for( n=0 ; n < tamano  ; n++ ){
          
          
        a [n]= (int)(Math.random()*(maximo - minimo + 1) + minimo );
        
          
          
         
      }
    
    return a;
      
  }
  
  /**
   * para pintar un array
   * intervalo (mínimo y máximo) se indica como parámetro.
   * 
     * @param a
   */
  
    public static void muestraArray(int[] a) {
      
      for (int x : a) {
          
        System.out.print(x + " ");    
          
      }
        
    }

   }
   
    
    


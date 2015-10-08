/**
*Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
*extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
*cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
*A partir de la hora 41, se pagan a 16 euros la hora.

* @author junior castillo
*/ 

public class Cap4Ejercicio4 {
 public static void main (String[] args){
    
    int salariosemanal;
    
  System.out.print("Por favor, introduce la cantidad de horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());

    if (horas <= 40) {
     salariosemanal = 12 * horas;
   }
     
     else  {
      salariosemanal = (12 * 40) + ((horas - 40) *16);
     }

     
     System.out.println("El sueldo ganado en la semana es " + salariosemanal +    "euros");
    
    
 
 


 }

}


public class mainTiempo {
 public static void main(String[] args) {
 
  Tiempo t1 = new Tiempo(5,36,5);
  Tiempo t2 = new Tiempo(5,10,15);
  System.out.println("Este es el t1--> ");
  System.out.println(t1);
  t1.suma(3,30,55);
  System.out.println(t1);
  System.out.println("Este es el t2--> ");
  System.out.println(t2);
  t2.resta(3,9,14);
  System.out.println(t2);
 }
}

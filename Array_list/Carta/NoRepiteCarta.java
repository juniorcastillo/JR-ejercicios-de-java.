

/**
 *
 *
 *
 * @author junior castillo
 */
import java.util.*;
import java.util.ArrayList;

public class NoRepiteCarta {

    public static void main(String[] args) {
        ArrayList<Carta> a = new ArrayList<Carta>();
        boolean Esta = true;
      

        Carta carta = new Carta();
        a.add(carta);

        String posicion = carta.getPalo();
        String cantidad = carta.getNumero();
    
        
       for (int i = 0; i < 9; i++) {
        a.add( carta = new Carta());    
           
       }
        while (Esta) {
            for (int i = 0; i < a.size(); i++) {// recorro el arraylist
                Carta p = (Carta) a.get(i);// guardo el valor en el object p
                for (int q = i + 1; q < a.size(); q++) {// recorro los object creados  para ver si se repite
                    Carta p1 = (Carta) a.get(q);//guardo el valor en object p1 para compararlo con p
                    if (p.getNumero().equals(p1.getNumero()) && p.getPalo().equals(p1.getPalo())) {//condiccion que se cumple
                        a.remove(q);//elimino el que se repite
                        a.add(q, carta = new Carta());// creo otronuevo donde se elimino el otro object
                    } else {// cuando no se repita mas object  se sale de while
                        Esta = false;
                    }
                }
            }
        }
       
        for (Carta n : a) {
            System.out.println(n);
        }
    }
}

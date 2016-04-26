

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
        System.out.println("paso");

        Carta carta = new Carta();
        a.add(carta);

        String posicion = carta.getPalo();
        String cantidad = carta.getNumero();
    
        
       for (int i = 0; i < 9; i++) {
        a.add( carta = new Carta());    
           
       }
        while (Esta) {// combruebo si esta 
            for (int i = 0; i < a.size(); i++) {// recorro el arraylist
                Carta p = (Carta) a.get(i);// guardo el valor en el object p
                for (int q = i + 1; q < a.size(); q++) {// recorro los object creados  para ver si se repite
                    Carta p1 = (Carta) a.get(q);//guardo el valor en obeject p1 para compararlo con p
                    if (p.getNumero().equals(p1.getNumero()) && p.getPalo().equals(p1.getPalo())) {//condicion que se cumple
                        a.remove(q);//elimino el que se repite
                        a.add(q, carta = new Carta());// creo otronuevo donde se elimino el otro obeject
                    } else {// cuando no se repita mas objetos  se sale de while
                        Esta = false;
                    }
                }
            }
        }
        System.out.println("paso3");
        for (Carta n : a) {
            System.out.println(n);
        }
    }
}

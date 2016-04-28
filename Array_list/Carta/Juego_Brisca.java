/*
Escribe un programa que genere una secuencia de 5 cartas de la baraja española y que
sume los puntos según el juego de la brisca. El valor de las cartas se debe guardar en una
estructura HashMap que debe contener parejas (figura, valor), por ejemplo (“caballo”, 3). La
secuencia de cartas debe ser una estructura de la clase ArrayList que contiene objetos de
la clase Carta. El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
→ 3, rey → 4; el resto de cartas no vale nada.
Ejemplo:
as de oros
cinco de bastos
caballo de espadas
sota de copas
tres de oros
Tienes 26 puntos.
 */
package Carta;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Juego_Brisca {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String clave = "";
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        ArrayList<Carta> carta = new ArrayList<Carta>();
        
        int i = 0;
        int n;
        int plus = 0;
        
        Carta ca = new Carta();
        
        m.put("as", 11);
        m.put("tres", 10);
        m.put("sota", 2);
        m.put("caballo", 3);
        m.put("rey", 4);
        
        for (i = 0; i < 5; i++) {
            ca = new Carta();
            carta.add(ca);            
            
        }
        for (Carta j : carta) {
            System.out.println(j);
        }
        for (i = 0; i < carta.size(); i++) {
            if (m.containsKey(carta.get(i).getNumero())) {
               plus+= m.get(carta.get(i).getNumero());
            } else {
                plus+=0;
            }            
        }
          System.out.println(plus);
    }    
}

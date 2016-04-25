package Carta;

import java.util.Objects;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta ). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 *
 * @author junior castillo
 */
public class Carta implements Comparable<Carta> {

    // atributos /////////////////////////////
    protected String palos[] = {"bastos", "copas", "espadas", "oros"};
    protected String numeros[] = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
    private String palo;
    private String numero;

    // métodos ///////////////////////////////
    //constructor
    protected Carta() {
        this.palo = palos[(int) (Math.random() * 4)];
        this.numero = numeros[(int) (Math.random() * 10)];
    }

    // getter //consultar
    public String getPalo() {
        return this.palo;
    }

    public String getNumero() {
        return this.numero;
    }

    @Override
    public boolean equals(Object o) {
        boolean n = true;
        if (o instanceof Carta) {
            Carta q = (Carta) o;
            if (this.palo.equals(q.palo)) {
                n = false;
            }
        }

        return n;
    }

    @Override
    public int compareTo(Carta g) {// este funciona junto con el colletions sort para ver que las cartas se ordenen 
        if (this.palo.equals(g.palo)) {// si cumple la condicion de que los palos son iguales entonces que se oldenen por numeros
            return (this.numero).compareTo(g.numero); // retorna el numero por el cual se van  ordenar
        } else {

            return (this.palo).compareTo(g.palo);// si los palos no son iguales entonces se ordenara por palos   
        }
    }

    @Override
    public String toString() {

        return this.palo + "\t" + this.numero + "\n";

    }

}

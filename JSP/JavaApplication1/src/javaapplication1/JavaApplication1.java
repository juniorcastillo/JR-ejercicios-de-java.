/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author USER
 */

     public class JavaApplication1  {

    static final int horizontal[] = {2, 1, -1, -2, -2, -1, 1, 2};
    static final int vertical[] = {-1, -2, -2, -1, 1, 2, 2, 1};

    static final int filas = 8, columnas = 8;
    static final int casillas = filas * columnas;
    static boolean tablero[][] = new boolean[filas][columnas];
    static int posiciones[][] = new int[filas][columnas];
    
    static int filaActual = 3, columnaActual = 4;
    static int numeroMovimiento = 0;

    public static void main(String[] Smiith) {

        int filaAnterior;
        int columnaAnterior ;
        int movimiento = 0;

        tablero[filaActual][columnaActual] = true;
        posiciones[filaActual][columnaActual] = ++movimiento;

        for (int ciclo = 1; ciclo <= casillas; ciclo++) {

            if (tablero[filaActual][columnaActual] == true) {

                int controlDoWhile = 0;

                do {

                    if (controlDoWhile++ >= 8) {

                        break; // detiene el ciclo while

                    } // fin de if

                    filaAnterior = filaActual;
                    columnaAnterior = columnaActual;

                    filaActual = fila(filaActual += vertical[numeroMovimiento]);
                    columnaActual = columna(columnaActual += horizontal[numeroMovimiento]);

                    if (filaActual == filaAnterior || columnaActual == columnaAnterior) {

                        filaActual = filaAnterior;
                        columnaActual = columnaAnterior;

                        if (numeroMovimiento++ == 7) {

                            numeroMovimiento = 0;

                        } // fin de if interno

                    } // fin de if externo
                    else {

                        if (tablero[filaActual][columnaActual] == true) {

                            filaActual = filaAnterior;
                            columnaActual = columnaAnterior;

                            if (numeroMovimiento++ == 7) {

                                numeroMovimiento = 0;

                            } // fin de if interno

                        } // fin de if externo

                    } // fin de else

                } while (filaActual == filaAnterior || columnaActual == columnaAnterior);

                // si no hubo movimientos posibles asigna false a la casilla actual
                if (controlDoWhile > 8) {
                    tablero[filaActual][columnaActual] = false;
                    posiciones[filaActual][columnaActual] = 0;
                } // fin de if
                // si hubo movimientos posibles, asigna true a la casilla actual
                else {
                    tablero[filaActual][columnaActual] = true;
                    posiciones[filaActual][columnaActual] = ++movimiento;
                } // fin de else

            } // fin de if
            else {

                tablero[filaActual][columnaActual] = true;
                posiciones[filaActual][columnaActual] = movimiento;

                break;

            } // fin de else

        } // fin de for

        imprimirRecorrido();

    } // fin del metodo main

    private static void imprimirMovimientos(int movimientos) {

        System.out.println("--------------------------------------------------");
        System.out.println("La cantidad de movimientos realizados fue de: " + movimientos);
        System.out.println("--------------------------------------------------");

    } // fin del metodo ImprimirMovimientos

    private static void imprimirRecorrido() {

        int movimientos = 0; // almacena la cantidad de movimientos realizados

        for (int fila = 0; fila < filas; fila++) {

            for (int columna = 0; columna < columnas; columna++) {

                System.out.printf("%2s ", posiciones[fila][columna] != 0 ? posiciones[fila][columna] : 0);

                // cuenta la cantidad de movimientos en el recorrido
                if (posiciones[fila][columna] != 0) {
                    movimientos++;
                } // fin de if interno

            } // fin de for interno

            System.out.println(); // salto de linea

        } // fin del ciclo for externo

        imprimirMovimientos(movimientos);

    } // fin del metodo imprimirRecorrdio

    private static int columna(int columnaActual) {

        if (columnaActual < 0 || columnaActual >= columnas) {

            columnaActual -= horizontal[numeroMovimiento];

        } // fin de if externo

        return columnaActual; // devuelve el valor de la columna actual

    } // fin del metodo columna

    private static int fila(int filaActual) {

        if (filaActual < 0 || filaActual >= filas) {

            filaActual -= vertical[numeroMovimiento];

        } // fin de if

        return filaActual; // devuelve el valor de la fila actual

    } // fin del metodo fila

} // fin de la clase PaseoDelCaballo
        // TODO code application logic here
    
    


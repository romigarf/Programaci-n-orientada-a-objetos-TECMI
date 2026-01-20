package edu.mia.garcia.actividad2.calculadora.process;


public class Multiplicacion {
    /**
     * Este metodo recibe dos enteros y devuelve su multiplicacion
     *
     * @return la multiplicacion de n1 y n2
     *
     */

    public static int calcularMultiplicacion(int n1, int n2) {
        int multiplicacipn = 0;
        for (int i = 0; i < n2; i++) {
            multiplicacipn = multiplicacipn + n1;
        }
        return multiplicacipn;
    }
}



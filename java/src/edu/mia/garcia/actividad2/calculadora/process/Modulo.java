package edu.mia.garcia.actividad2.calculadora.process;

public class Modulo {
    /**
     * Este metodo recibe dos enteros y devuelve su modulo
     *
     * @return el modulo de n1 y n2
     *
     */

    public static int calcularModulo (int n1, int n2){
        int totalmodulo = n1;
        while (totalmodulo >= n2) {
            totalmodulo = totalmodulo - n2;
        }
        return totalmodulo;

    }
}

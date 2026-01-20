package edu.mia.garcia.actividad2.calculadora.process;

public class Modulo {
    /**
     * Este metodo recibe dos enteros y devuelve su modulo
     *
     * @return el modulo de n1 y n2
     *
     */

    public static int calcularModulo (int n1, int n2){
        while (n1 >= n2) {
            n1 = Resta.calcularResta(n1, n2);
        }
        return n1;

    }
}

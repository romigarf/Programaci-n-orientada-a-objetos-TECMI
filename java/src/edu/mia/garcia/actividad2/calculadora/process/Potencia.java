package edu.mia.garcia.actividad2.calculadora.process;

public class Potencia {
    /**
     * Este metodo recibe dos enteros y devuelve su potencia
     *
     * @return la suma de n1 y n2
     *
     */

    public static int calcularPotencia(int n1, int n2) {
        int potencia = 1;
        for (int i = 0; i < n2; i++) {
            int total = 0;
            for (int o = 0; o < n1; o++) {
                total = total + potencia;
            }
            potencia = total;
        }
        return potencia;

    }
}

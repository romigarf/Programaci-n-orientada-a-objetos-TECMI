package edu.mia.garcia.actividad2.calculadora.process;

public class Logaritmo {
    /**
     * Este metodo recibe dos enteros y devuelve su logaritmo
     *
     * @return la suma de n1 y n2
     *
     */

    public static int calcularLogaritmo(int n1, int n2) {
        int resultado = 0;
        int valor = 1;

        while (valor < n2) {
            int total = 0;
            int i = 0;

            while (i < n1) {
                total = total + valor;
                i++;
            }

            valor = total;
            resultado++;
        }

        return resultado;
    }
}

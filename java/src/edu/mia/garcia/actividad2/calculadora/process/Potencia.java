package edu.mia.garcia.actividad2.calculadora.process;

public class Potencia {
    /**
     * Este metodo recibe dos enteros y devuelve su potencia
     *
     * @return el valor con su potencia
     *
     */

    public static int calcularPotencia(int n1, int n2) {
        int resultado = 1;
        for (int i = 0; i < n2; i++) {
            resultado = Multiplicacion.calcularMultiplicacion(resultado, n1);
        }
        return resultado;
    }
}
package edu.mia.garcia.actividad2.calculadora.process;

public class RaizCuadrada {
    /**
     * Este metodo recibe dos enteros y devuelve su raiz cuadrda
     *
     * @return la suma de n1 y n2
     *
     */

    public static int calcularRaizCuadrada(int n1, int n2) {
        int numero = 1;
        while (true) {
            int cuadrado = 0;
            int i = 0;
            while (i < numero) {
                cuadrado = cuadrado + numero;
                i++;
            }
            if (cuadrado == n2) {
                return numero;
            }
            numero++;
        }
    }
}

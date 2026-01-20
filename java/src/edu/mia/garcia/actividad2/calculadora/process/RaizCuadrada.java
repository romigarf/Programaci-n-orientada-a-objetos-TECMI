package edu.mia.garcia.actividad2.calculadora.process;

public class RaizCuadrada {
    /**
     * Este metodo recibe base y operador y devuelve su raiz cuadrda
     *
     * @return la raiz cuadrada del operador
     *
     */

    public static int calcularRaizCuadrada(int n1, int n2) {
        int numero = 1;
        while (true) {
            numero= Suma.calcularSuma(numero,1);
            int potencia = Potencia.calcularPotencia(numero,n1);
            if (potencia==n2){
                return numero;
            }
        }
    }
}

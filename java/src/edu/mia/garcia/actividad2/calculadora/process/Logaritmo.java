package edu.mia.garcia.actividad2.calculadora.process;

public class Logaritmo {
    /**
     * Este metodo recibe una base y el operando y devuelve su logaritmo
     *
     * @return el logaritmo de base n1 y logaritmo n2
     *
     */

    public static int calcularLogaritmo(int n1, int n2) {
        int contador = 0;
        int resultado = 1;

        while (resultado < n2) {
         resultado =Multiplicacion.calcularMultiplicacion(resultado,n1);
         contador = Suma.calcularSuma(contador,1);
        }
        if (resultado==n2) {
            return contador;
        } else{
            return -1;
        }
    }
}

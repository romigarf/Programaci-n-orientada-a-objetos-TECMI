package edu.mia.garcia.actividad2.v2calculadora.process;
/**
 * Este metodo recibe dos enteros y devuelve su potencia
 *
 * @return el valor con su potencia
 *
 */

public class Potencia extends Multiplicacion {
    private int resultado;
    @Override
    public int apply (int n1, int n2) {
        this.resultado = 1;
        for (int i = 0; i < n2; i++) {
            this.resultado = super.apply(resultado, n1);
        }
        return this.resultado;
    }
}
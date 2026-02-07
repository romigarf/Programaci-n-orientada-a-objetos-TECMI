package edu.mia.garcia.actividad2.v2calculadora.process;
/**
 * Este metodo recibe dos enteros y devuelve su divison
 *
 * @return la division de n1 y n2
 *
 */
public class Division extends Resta {
    private int division;
    @Override
    public int apply(int n1, int n2) {
        this.division = 0;
        for (int i = n1; i >= n2; i = i - n2) {
            this.division++;
        }
        return this.division;
    }
}



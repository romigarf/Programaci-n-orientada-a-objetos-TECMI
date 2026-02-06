package edu.mia.garcia.actividad2.v2calculadora.process;
/**
 * Este metodo recibe dos enteros y devuelve su modulo
 *
 * @return el modulo de n1 y n2
 *
 */

public class Modulo extends Resta {
    @Override
    public int apply(int n1, int n2){
        while (n1 >= n2) {
            n1 = super.apply (n1, n2);
        }
        return n1;

    }
}

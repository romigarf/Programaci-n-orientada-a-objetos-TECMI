package edu.mia.garcia.actividad2.v2calculadora.process;

public class Suma extends Operacion{
    /**
     * Este metodo recibe dos enteros y devuelve su multipliacion
     *
     * @return la suma de n1 y n2
     *
     */
    @Override
    public int apply(int n1, int n2) {
        return n1+n2;
    }
}

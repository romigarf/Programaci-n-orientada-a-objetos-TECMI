package edu.mia.garcia.actividad2.v2calculadora.process;
/**
 * Este metodo recibe dos enteros y devuelve su multiplicacion
 *
 * @return la multiplicacion de n1 y n2
 *
 */
public class Multiplicacion extends Suma{
    private int resultado;
    @Override
    public int apply (int n1, int n2) {
        this.resultado = 0;
        for (int i = 0; i < n2; i++) {
            this.resultado = super.apply(resultado,n1);
        }
        return resultado;
    }
}



package edu.mia.garcia.actividad2.v2calculadora.process;
/**
 * Este metodo recibe una base y el operando y devuelve su logaritmo
 *
 * @return el logaritmo de base n1 y logaritmo n2
 *
 */
public class Logaritmo extends Multiplicacion {
    private int contador;
    private int resultado;
    @Override
    public int apply(int n1, int n2) {
        this.contador = 0;
        this.resultado = 1;
        Suma suma = new Suma ();
        while (this.resultado < n2) {
         this.resultado = super.apply(resultado,n1);
         this.contador = suma.apply(contador, 1);
        }
        if (this.resultado==n2) {
            return this.contador;
        } else{
            return -1;
        }
    }
}

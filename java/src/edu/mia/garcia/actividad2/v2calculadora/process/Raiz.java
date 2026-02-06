package edu.mia.garcia.actividad2.v2calculadora.process;
/**
 * Este metodo recibe base y operador y devuelve su raiz cuadrda
 *
 * @return la raiz cuadrada del operador
 *
 */
public class Raiz extends Potencia {
    private int resultado;
    @Override
    public int apply(int indice, int radicando) {
        this.resultado = 0;
        Suma suma = new Suma();
        while (true) {
            int potencia = super.apply(this.resultado, indice);
            if (potencia == radicando) {
                return this.resultado;
            }
            if (potencia > radicando) {
                return this.resultado - 1;
            }
            this.resultado = suma.apply(this.resultado, 1);
        }
    }
}

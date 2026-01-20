package edu.mia.garcia.actividad2.calculadora.process;

public class Division {
    /**
     * Este metodo recibe dos enteros y devuelve su divison
     *
     * @return la division de n1 y n2
     *
     */
    public static int calcularDivision(int n1, int n2) {
        int division = 0;
        for (int i = n1; i >= n2; i = i - n2) {
            division++;
        }
        return division;
    }
}

package edu.mia.garcia.actividad3.process;
import java.util.LinkedList;

public class ListaNumeros {
    /**
     * Mueve todos los ceros de la lista al final.
     */
    public static LinkedList<Integer> cerosFinal(LinkedList<Integer> lista) {
        LinkedList<Integer> resultado = new LinkedList<>();
        int contarCeros = 0;
        for (int num : lista) {
            if (num == 0) {
                contarCeros++;
            } else {
                resultado.add(num);
            }
        }
        for (int i = 0; i < contarCeros; i++) {
            resultado.add(0);
        }
        return resultado;
    }

    /**
     * Cuenta la cantidad de números pares en la lista.
     */
    public static int pares(LinkedList<Integer> lista) {
        int contarPares = 0;
        for (int num : lista) {
            if (num % 2 == 0) {
                contarPares++;
            }
        }
        return contarPares;
    }
}

package edu.mia.garcia.actividad3.test;

import edu.mia.garcia.actividad3.process.ListaNumeros;
import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.assertEquals;

public class ListaNumeroTest {

    //
    // Tests para cerosFinal
    // =========================

    @Test
    public void cerosFinal_casoNormal() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(0);
        lista.add(2);
        lista.add(1);
        lista.add(4);
        lista.add(0);
        lista.add(2);

        LinkedList<Integer> resultado = ListaNumeros.cerosFinal(lista);

        LinkedList<Integer> esperado = new LinkedList<>();
        esperado.add(2);
        esperado.add(1);
        esperado.add(4);
        esperado.add(2);
        esperado.add(0);
        esperado.add(0);

        assertEquals(esperado, resultado);
    }

    @Test
    public void cerosFinal_sinCeros() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);

        LinkedList<Integer> resultado = ListaNumeros.cerosFinal(lista);

        LinkedList<Integer> esperado = new LinkedList<>();
        esperado.add(1);
        esperado.add(2);
        esperado.add(3);

        assertEquals(esperado, resultado);
    }

    @Test
    public void cerosFinal_todosCeros() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(0);
        lista.add(0);
        lista.add(0);

        LinkedList<Integer> resultado = ListaNumeros.cerosFinal(lista);

        LinkedList<Integer> esperado = new LinkedList<>();
        esperado.add(0);
        esperado.add(0);
        esperado.add(0);

        assertEquals(esperado, resultado);
    }

    // =========================
    // Tests para contar pares
    // =========================

    @Test
    public void contarPares_casoNormal() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(7);
        lista.add(6);

        int resultado = ListaNumeros.pares(lista);

        assertEquals(2, resultado);
    }

    @Test
    public void contarPares_todosPares() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);

        int resultado = ListaNumeros.pares(lista);

        assertEquals(4, resultado);
    }

    @Test
    public void contarPares_sinPares() {
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(1);
        lista.add(3);
        lista.add(5);

        int resultado = ListaNumeros.pares(lista);

        assertEquals(0, resultado);
    }
}

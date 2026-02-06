package edu.mia.garcia.actividad3.test;

import edu.mia.garcia.actividad3.process.Cadena;
import org.junit.Test;

import static org.junit.Assert.*;


public class CadenaTest {

    // -------- Tests para palindromo --------
    @Test
    public void testPalindromoVerdadero() {
        assertTrue(Cadena.palindromo("oso"));
    }

    @Test
    public void testPalindromoFalso() {
        assertFalse(Cadena.palindromo("hola"));
    }

    // -------- Tests para vocales --------
    @Test
    public void testVocalesNormal() {
        assertEquals(5, Cadena.vocales("murcielago"));
    }

    @Test
    public void testVocalesSinVocales() {
        assertEquals(0, Cadena.vocales("rhythm"));
    }

    // -------- Tests para invertir --------
    @Test
    public void testInvertirPalabra() {
        assertEquals("aloh", Cadena.invertir("hola"));
    }

    @Test
    public void testInvertirUnaLetra() {
        assertEquals("a", Cadena.invertir("a"));
    }

    // -------- Tests para primeraUbicacion --------
    @Test
    public void testPrimeraUbicacionExiste() {
        assertEquals(1, Cadena.primeraUbicacion("casa", 'a'));
    }

    @Test
    public void testPrimeraUbicacionNoExiste() {
        assertEquals(-1, Cadena.primeraUbicacion("perro", 'z'));
    }
}

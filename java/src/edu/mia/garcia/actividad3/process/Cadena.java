package edu.mia.garcia.actividad3.process;

public class Cadena {
    /**
     * Verifica si un texto es un palíndromo.
     */
    public static boolean palindromo(String texto) {
        String invertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(invertido);
    }

    /**
     * Cuenta las vocales que contiene un texto.
     */
    public static int vocales(String texto) {
        int contadorVocale = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i'
                    || letra == 'o' || letra == 'u') {
                contadorVocale++;
            }
        }
        return contadorVocale;
    }

    /**
     * Invierte el texto recibido.
     */
    public static String invertir(String texto) {
        String invertida = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida = invertida + texto.charAt(i);
        }

        return invertida;
    }

    /**
     * Obtiene la primera posición de una letra en el texto.
     */
    public static int primeraUbicacion(String texto, char letra) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                return i;
            }
        }
        return -1;
    }
}

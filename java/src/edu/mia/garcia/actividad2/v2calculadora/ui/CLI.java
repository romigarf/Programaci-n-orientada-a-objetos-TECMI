package edu.mia.garcia.actividad2.v2calculadora.ui;

import edu.mia.garcia.actividad2.v2calculadora.process.Calculadora;

import java.util.Scanner;

/**
 * Clase encargada de la interacción con el usuario por consola.
 */
public class CLI {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Calculadora calculadora = new Calculadora();
    public static void showMenu() {
        System.out.println("Calculadora");
        System.out.println("Elige una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Potencia");
        System.out.println("7. Logaritmo");
        System.out.println("8. Raiz cuadrada");
        System.out.println("9. Salir");
    }

    public static void aplicarOperacion(Calculadora calculadora) {
        System.out.print("Introduce el primer valor: ");
        int n1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Introduce el segundo valor: ");
        int n2 = scanner.nextInt();
        scanner.nextLine();

        try {
            int total = calculadora.operacion.apply(n1, n2);
            System.out.println("Resultado: " + total);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public static void start() {
        int option;
        while (true) {
            showMenu();
            try {
                option = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Por favor ingresa un número válido");
                scanner.nextLine();
                continue;
            }
            if (option == 9) {
                break;
            }

            try {
                calculadora.setOperacion(option);
                aplicarOperacion(calculadora);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Adios...");
    }
}
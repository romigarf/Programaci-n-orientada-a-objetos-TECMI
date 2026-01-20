package edu.mia.garcia.actividad2.calculadora.ui;

import edu.mia.garcia.actividad2.calculadora.process.*;

import java.util.Scanner;
/**
 * Clase encargada de la interacción con el usuario por consola.
 */
public class CLI {
    public static void showMenu() {
        int n1 = 0;
        int n2 = 0;
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
        System.out.println("\nElige una acción");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multipliación");
        System.out.println("4.-Division");
        System.out.println("5.-Modulo");
        System.out.println("6.-Potencia");
        System.out.println("7.-Logaritmo");
        System.out.println("8.-Raiz cuadrada");
        System.out.println("9.-Salir");
        opcion = scanner.nextInt();


            switch (opcion){
            case 1:
                System.out.println("Introduce el valor 1:");
                n1 = scanner.nextInt();
                System.out.println("Introduce el valor 2:");
                n2 = scanner.nextInt();
                System.out.printf("El resultado de : %d %s %d es : %d",n1,"+", n2, Suma.calcularSuma(n1,n2));
                //suma
                break;
            case 2:
                System.out.println("Introduce el valor 1:");
                n1= scanner.nextInt();
                System.out.println("Introduce el valor 2:");
                n2= scanner.nextInt();
                System.out.printf("El resultado de : %d %s %d es : %d",n1,"-",n2, Resta.calcularResta(n1,n2));
                //resta
                break;
            case 3:
                System.out.println("Introduce el valor 1:");
                n1= scanner.nextInt();
                System.out.println("Introduce el valor 2:");
                n2= scanner.nextInt();
                System.out.printf("El resultado de : %d %s %d es : %d",n1,"*",n2, Multiplicacion.calcularMultiplicacion(n1,n2));
                //multiplicacion
                break;
            case 4:
                System.out.println("Introduce el valor 1:");
                n1= scanner.nextInt();
                System.out.println("Introduce el valor 2:");
                n2= scanner.nextInt();
                System.out.printf("El resultado de : %d %s %d es : %d",n1,"/",n2, Division.calcularDivision(n1,n2));
                //division
                break;
            case 5:
                System.out.println("Introduce el valor 1:");
                n1= scanner.nextInt();
                System.out.println("Introduce el valor 2:");
                n2= scanner.nextInt();
                System.out.printf("El modulo de : %d %s %d es : %d",n1,"%",n2,Modulo.calcularModulo(n1,n2));
                //modulo
                break;
            case 6:
                System.out.println("Introduce el valor:");
                n1= scanner.nextInt();
                System.out.println("Introduce el exponente:");
                n2= scanner.nextInt();
                System.out.printf("El resultado de : %d %s %d es : %d",n1,"^",n2,Potencia.calcularPotencia(n1,n2));
                //potencia
                break;
            case 7:
                System.out.println("Introduce el valor de la base");
                n1= scanner.nextInt();
                System.out.println("Introduce el valor del operando");
                n2= scanner.nextInt();
                System.out.printf(
                        "El resultado del log con base %d y operando %d es: %d%n", n1, n2, Logaritmo.calcularLogaritmo(n1, n2)
                );
                //logaritmo
                break;
            case 8:
                System.out.println("Introduce la base:");
                n1= scanner.nextInt();
                System.out.println("Introduce el operando");
                n2= scanner.nextInt();
                System.out.printf("El resultado de : %d %s %d es : %d",n1,"√",n2,RaizCuadrada.calcularRaizCuadrada(n1,n2));
                //raiz cuadrada
                break;
            case 9:
                System.out.println("Adios...");
                break;
            default:
                System.out.println("Opción invalida (Ingrese un número del 1-9");

        }
    } while (opcion!=9);

    }
    }

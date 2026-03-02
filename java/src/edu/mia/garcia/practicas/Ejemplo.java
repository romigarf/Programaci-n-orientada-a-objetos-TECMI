package edu.mia.garcia.practicas;

public class Ejemplo{

    //  FACTORIAL

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    //  FIBONACCI

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        // Factorial
        int num1 = 5;
        System.out.println("Factorial de " + num1 + " = " + factorial(num1));

        // Fibonacci
        int num2 = 6;
        System.out.println("Fibonacci en posición " + num2 + " = " + fibonacci(num2));

        System.out.println("---------------");

        // 3️ SHADOWING
        ShadowingExample obj = new ShadowingExample();
        obj.mostrar();

        System.out.println("---------------");

        // HIDING
        Child child = new Child();
        child.showMessage();

        System.out.println("---------------");


        // OBSCURING
        ObscuringExample obscuring = new ObscuringExample();
        obscuring.show();
    }
}


// SHADOWING
class ShadowingExample {

    int x = 10; // variable de instancia

    public void mostrar() {
        int x = 20; // variable local (shadowing)
        System.out.println("Shadowing - Variable local x: " + x);
        System.out.println("Shadowing - Variable de instancia x: " + this.x);
    }
}

// HIDING
class Parent {
    static void showMessage() {
        System.out.println("Mensaje del Padre");
    }
}

class Child extends Parent {
    static void showMessage() { // Hiding
        System.out.println("Mensaje del Hijo");
    }
}

// OBSCURING
class ObscuringExample {

    int Math = 50; // nombre de variable igual que clase Math

    public void show() {
        System.out.println("Obscuring - Variable Math: " + Math);

        // Para usar la clase Math real:
        System.out.println("Obscuring - Usando clase Math real: " + java.lang.Math.max(5, 9));
    }
}
package edu.mia.garcia.actividad1.ui;

import edu.mia.garcia.actividad1.process.ShopManager;
import edu.mia.garcia.actividad1.data.Auto;
import edu.mia.garcia.actividad1.data.Ticket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CLI {
    private ShopManager shopManager;
    private List<Auto> carrito;

    public CLI(ShopManager shopManager) {
        this.shopManager = shopManager;
        carrito = new ArrayList<>();
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenid@ a la agencia RomichupsCars");

        while (continuar) {

            System.out.println("----- CATÁLOGO -----");
            for (Auto auto : shopManager.getCarList()) {
                System.out.println(auto.getNum() + ".- " + auto.getModelo() + " - $" + auto.getPrecio());
            }

            System.out.print("Seleccione un auto (1,2,3): ");
            String opcion = scanner.nextLine();

            Auto seleccionado = null;

            for (Auto auto : shopManager.getCarList()) {
                if (auto.getNum().equals(opcion)) {
                    seleccionado = auto;
                    break;
                }
            }
            if (seleccionado != null) {
                System.out.println("--- CARACTERÍSTICAS ---");
                System.out.println(seleccionado.getModelo());
                System.out.println("Puertas: " + seleccionado.getPuertas());
                System.out.println("Transmisión: " + seleccionado.getTransmision());
                System.out.println("Potencia: " + seleccionado.getPotencia());
                System.out.println("Precio: $" + seleccionado.getPrecio());

                System.out.print("¿Agregar al carrito? (s/n): ");
                String resp = scanner.nextLine();

                if (resp.equalsIgnoreCase("s")) {
                    Auto autoCarrito = seleccionado;
                    carrito.add(autoCarrito);
                    System.out.println("Auto agregado al carrito");
                }


            } else {
                System.out.println("Opción no válida");
            }

            System.out.println("¿Qué desea hacer?");
            System.out.println("a) Seguir comprando");
            System.out.println("b) Proceder a pago");

            String accion = scanner.nextLine();

            if (accion.equalsIgnoreCase("b")) {
                continuar = false;
            }
        }

        if (!carrito.isEmpty()) {
            System.out.print("Nombre del cliente: ");
            String nombre = scanner.nextLine();

            String fecha = LocalDate.now().toString();

            Ticket ticket = new Ticket(nombre, fecha, carrito);
            ticket.mostrarTicket();
        } else {
            System.out.println("No se compraron autos.");
        }
    }
}

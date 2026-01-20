package edu.mia.garcia.actividad1.data;

import edu.mia.garcia.actividad1.models.Auto;

import java.util.List;
/**
 * Clase que genera el ticket de compra del cliente.
 */
public class Ticket {

    private String nombreCliente;
    private String fecha;
    private List<Auto> autos;
    private int total;

    public Ticket(String nombreCliente, String fecha, List<Auto> autos) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.autos = autos;
        calcularTotal();
    }

    private void calcularTotal() {
        total = 0;
        for (Auto auto : autos) {
            total += auto.getPrecio();
        }
    }

    public void mostrarTicket() {
        System.out.println("-----TICKET-----");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Autos comprados:");

        for (Auto auto : autos) {
            System.out.println("- " + auto.getModelo() + " $" + auto.getPrecio());
        }

        System.out.println("TOTAL A PAGAR: $" + total);
    }
}


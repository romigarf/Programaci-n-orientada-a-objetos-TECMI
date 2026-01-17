package edu.mia.garcia.actividad1.data;

public class Auto {
    private String num;
    private String modelo;
    private String puertas;
    private String transmision;
    private String potencia;
    private int precio;

    public Auto(String num, String modelo, String puertas,String transmision, String potencia, int precio) {
        this.num = num;
        this.modelo = modelo;
        this.puertas = puertas;
        this.transmision = transmision;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getNum() { return num; }
    public String getModelo() { return modelo; }
    public String getPuertas() { return puertas; }
    public String getTransmision() { return transmision; }
    public String getPotencia() { return potencia; }
    public int getPrecio() { return precio; }
}

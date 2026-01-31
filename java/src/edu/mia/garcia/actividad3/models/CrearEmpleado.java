package edu.mia.garcia.actividad3.models;
/**
 * Clase para crear empleado con su nombre,edad,salario y departamento
 */
public class CrearEmpleado {

    public String nombre;
    public int edad;
    public double salario;
    public String departamento;

    public CrearEmpleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }
}


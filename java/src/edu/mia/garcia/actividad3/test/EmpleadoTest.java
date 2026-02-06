package edu.mia.garcia.actividad3.test;

import edu.mia.garcia.actividad3.models.CrearEmpleado;
import edu.mia.garcia.actividad3.process.Empleado;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class EmpleadoTest {

    // Lista base
    private LinkedList<CrearEmpleado> crearListaBase() {
        LinkedList<CrearEmpleado> lista = new LinkedList<>();
        lista.add(new CrearEmpleado("Ana", 22, 20000, "Sistemas"));
        lista.add(new CrearEmpleado("Luis", 30, 30000, "Ventas"));
        lista.add(new CrearEmpleado("Juan", 30, 40000, "Sistemas"));
        lista.add(new CrearEmpleado("Maria", 40, 15000, "RH"));
        return lista;
    }

    // 1. Mayor salario
    @Test
    public void testMayorSalario() {
        CrearEmpleado resultado =
                Empleado.mayorSalario(crearListaBase());

        assertEquals("Juan", resultado.nombre);
    }

    // 2. Edad más común
    @Test
    public void testEdadMasComun() {
        int edad =
                Empleado.edadComun(crearListaBase());

        assertEquals(30, edad);
    }

    // 3. Promedio edad
    @Test
    public void testPromedioEdad() {
        double promedio =
                Empleado.promedioEdad(crearListaBase());

        assertEquals(30.5, promedio, 0.1);
    }

    // 4. Promedio salario
    @Test
    public void testPromedioSalario() {
        double promedio =
                Empleado.promedioSalario(crearListaBase());

        assertEquals(26250, promedio, 0.1);
    }

    // 5. Promedio edad > 25K
    @Test
    public void testPromedioEdadMayores25K() {
        double promedio =
                Empleado.promedioEdadMayores25K(crearListaBase());

        assertEquals(30, promedio, 0.1);
    }

    // 6. Menores de 25
    @Test
    public void testMenores25() {
        assertEquals(1,
                Empleado.menores25(crearListaBase()).size());
    }

    // 7. Contar sistemas
    @Test
    public void testContarSistemas() {
        assertEquals(2,
                Empleado.empleadosSistemas(crearListaBase()));
    }

    // 8. Mayor salario > 30
    @Test
    public void testMayorSalarioMayor30() {
        CrearEmpleado emp =
                Empleado.mayorSalarioMayor30(crearListaBase());

        assertEquals("Maria", emp.nombre);
    }

    // 9. Menor salario edad menos común
    @Test
    public void testMenorSalarioEdadMenosComun() {
        CrearEmpleado emp =
                Empleado.menorSalarioEdadMenosComun(crearListaBase());

        assertEquals("Ana", emp.nombre);
    }
}

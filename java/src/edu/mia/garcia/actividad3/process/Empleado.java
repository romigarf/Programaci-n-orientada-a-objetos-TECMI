package edu.mia.garcia.actividad3.process;

import edu.mia.garcia.actividad3.models.CrearEmpleado;

import java.util.LinkedList;
public class Empleado {
    /**
     * Obtiene el empleado con el mayor salario.
     */
    public static CrearEmpleado mayorSalario(LinkedList<CrearEmpleado> listaEmpleados) {
        CrearEmpleado empleadoMayor = listaEmpleados.get(0);
        for (CrearEmpleado empleado : listaEmpleados) {
            if (empleado.salario > empleadoMayor.salario) {
                empleadoMayor = empleado;
            }
        }
        return empleadoMayor;
    }

    /**
     * Obtiene la edad que más se repite en la lista.
     */
    public static int edadComun(LinkedList<CrearEmpleado> listaEmpleados) {
        int moda = listaEmpleados.get(0).edad;
        int mayorCantidad = 0;
        for (CrearEmpleado empleadoActual : listaEmpleados) {
            int contador = 0;
            for (CrearEmpleado empleadoComparar : listaEmpleados) {
                if (empleadoActual.edad == empleadoComparar.edad) {
                    contador++;
                }
            }
            if (contador > mayorCantidad) {
                mayorCantidad = contador;
                moda = empleadoActual.edad;
            }
        }
        return moda;
    }

    /**
     * Calcula el promedio de edad de los empleados.
     */
    public static double promedioEdad(LinkedList<CrearEmpleado> listaEmpleados) {
        int sumaEdades = 0;
        for (CrearEmpleado empleado : listaEmpleados) {
            sumaEdades+=empleado.edad;
        }
        return (double) sumaEdades / listaEmpleados.size();
    }

    /**
     * Calcula el promedio de salario de los empleados.
     */
    public static double promedioSalario(LinkedList<CrearEmpleado> listaEmpleados) {
        double sumaSalarios = 0;
        for (CrearEmpleado empleado : listaEmpleados) {
            sumaSalarios+=empleado.salario;
        }
        return sumaSalarios / listaEmpleados.size();
    }

    /**
     * Calcula el promedio de edad de los empleados que ganan más de 25,000.
     */
    public static double promedioEdadMayores25K(LinkedList<CrearEmpleado> listaEmpleados) {
        int sumaEdades = 0;
        int contador = 0;
        for (CrearEmpleado empleado : listaEmpleados) {
            if (empleado.salario > 25000) {
                sumaEdades+=empleado.edad;
                contador++;
            }
        }
        return sumaEdades / (double) contador;
    }

    /**
     * Filtra los empleados menores de 25 años.
     */
    public static LinkedList<CrearEmpleado> menores25(LinkedList<CrearEmpleado> listaEmpleados) {
        LinkedList<CrearEmpleado> empleadosMenores = new LinkedList<>();
        for (CrearEmpleado empleado : listaEmpleados) {
            if (empleado.edad < 25) {
                empleadosMenores.add(empleado);
            }
        }
        return empleadosMenores;
    }

    /**
     * Cuenta cuántos empleados pertenecen al departamento de Sistemas.
     */
    public static int empleadosSistemas(LinkedList<CrearEmpleado> listaEmpleados) {
        int contador = 0;
        for (CrearEmpleado empleado : listaEmpleados) {
            if (empleado.departamento.equals("Sistemas")) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Obtiene el empleado con mayor salario
     * que tenga más de 30 años.
     */
    public static CrearEmpleado mayorSalarioMayor30(LinkedList<CrearEmpleado> listaEmpleados) {
        CrearEmpleado empleadoMayor = null;
        for (CrearEmpleado empleado : listaEmpleados) {
            if (empleado.edad > 30) {
                if (empleadoMayor == null || empleado.salario > empleadoMayor.salario) {
                    empleadoMayor = empleado;
                }
            }
        }
        return empleadoMayor;
    }

    /**
     * Obtiene el empleado con menor salario cuya edad sea la menos común.
     */
    public static CrearEmpleado menorSalarioEdadMenosComun(LinkedList<CrearEmpleado> listaEmpleados) {
        int edadMenosComun = listaEmpleados.get(0).edad;
        int menorCantidad = listaEmpleados.size();
        for (CrearEmpleado empleadoActual : listaEmpleados) {
            int contador = 0;
            for (CrearEmpleado empleadoComparar : listaEmpleados) {
                if (empleadoActual.edad == empleadoComparar.edad) {
                    contador++;
                }
            }
            if (contador < menorCantidad) {
                menorCantidad = contador;
                edadMenosComun = empleadoActual.edad;
            }
        }
        CrearEmpleado empleadoMenorSalario = null;
        for (CrearEmpleado empleado : listaEmpleados) {
            if (empleado.edad == edadMenosComun) {
                if (empleadoMenorSalario == null ||
                        empleado.salario < empleadoMenorSalario.salario) {
                    empleadoMenorSalario = empleado;
                }
            }
        }
        return empleadoMenorSalario;
    }
}

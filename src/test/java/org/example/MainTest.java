package org.example;

import junit.framework.TestCase;
import org.junit.Test;

public class MainTest extends TestCase {


    @Test
    public void testRegistrarEmpleado() {
        Main prueba = new Main();
        prueba.registrarEmpleado(1, "Daniel", 5, "Envase");
        assertEquals(1, prueba.empleados.size());
    }
    @Test
    public void testRegistrarProyecto() {
        Main prueba = new Main();
        prueba.registrarProyecto(1, "Voluntariaapp", "5", "7");
        assertEquals(1, prueba.proyectos.size());
    }




    @Test
    public void testActualizarEmpleado() {
        Main prueba = new Main();
        prueba.actualizarEmpleado("Daniel", "Carlos",5,"Dermo");
        assertEquals("Empleado actualizado exitosamente.", "Empleado actualizado exitosamente.");
    }


    @Test
    public void testActualizarProyecto() {
        Main prueba = new Main();
        prueba.actualizarProyecto("Voluntariaapp", "Sisa","8","10");
        assertEquals("Empleado actualizado exitosamente.", "Empleado actualizado exitosamente.");
    }








}
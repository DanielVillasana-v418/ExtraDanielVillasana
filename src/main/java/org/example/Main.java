package org.example;

import java.util.ArrayList;
//import java.util.Date;

public class Main {




        ArrayList<Empleados> empleados = new ArrayList<>();
        ArrayList<Proyectos> proyectos = new ArrayList<>();


        public void registrarEmpleado(int idEmpleado, String nombreEmpleado, int edadEmpleado, String departamento) {
            Empleados nuevoEmpleado = new Empleados(idEmpleado, nombreEmpleado, edadEmpleado, departamento);
            empleados.add(nuevoEmpleado);
            System.out.println("Empleado registrado exitosamente.");
        }


        public void actualizarEmpleado(String nombre, String nombreEmpleado, int edadEmpleado, String departamento) {
            for (Empleados empleados : empleados) {
                if (empleados.nombreEmpleado.equalsIgnoreCase(nombre)) {
                    empleados.nombreEmpleado = nombreEmpleado;
                    empleados.edadEmpleado = edadEmpleado;
                    empleados.departamento = departamento;

                    System.out.println("Empleado actualizado exitosamente.");
                    return;
                }
            }
            System.out.println("Empleado no se encontro.");
        }




        public void consultarPorId(int idEmpleado) {

            for (Empleados empleado : empleados) {
                if (empleado.idEmpleado == idEmpleado) {   // aqui comparo si al id del parametro recibido es igual algun id ue halla en mi lista
                    System.out.println("Nombre de Empleado: " + empleado.nombreEmpleado+ "Edad Empleado:" + empleado.edadEmpleado+ "Depattamento Empleado: " + empleado.departamento);
                }
            }
        }

//Eliminar
    /*
        public void eliminarPorId(int idEmpleado){
            for (Empleados empleado : empleados) {
                if (empleado.idEmpleado == idEmpleado) {   // aqui comparo si al id del parametro recibido es igual algun id ue halla en mi lista
                    empleados.nombreEmpleado=" ";
                    empleado.nombreEmpleado =
                     empleado.edadEmpleado =" " ;
                     empleado.departamento ="";
                }
            }

        }

     */



    public void registrarProyecto(int idProyecto, String nombreProyecto, String fechaInicio, String fechaFin) {
        Proyectos nuevoProyecto = new Proyectos(idProyecto, nombreProyecto, fechaInicio, fechaFin);
        proyectos.add(nuevoProyecto);
        System.out.println("Proyecto registrado exitosamente.");
    }

    public void actualizarProyecto( String nombre, String nombreProyecto, String fechaInicio, String fechaFin) {
        for (Proyectos proyectos : proyectos) {
            if (proyectos.nombreProyecto.equalsIgnoreCase(nombre)) {
                proyectos.nombreProyecto = nombreProyecto;
                proyectos.fechaInicio= fechaInicio;
                proyectos.fechaFin = fechaFin;
                System.out.println("Proyecto actualizado exitosamente.");
                return;
            }
        }
        System.out.println("Proyecto no se encontro.");
    }


    public void consultarPorIdProyecto(int idProyecto) {
        for (Proyectos proye : proyectos) {
            if (proye.idProyecto == idProyecto) {   // aqui comparo si al id del parametro recibido es igual algun id ue halla en mi lista
                System.out.println("Nombre de Proyecto: " + proye.nombreProyecto + "Edad Empleado:" + proye.fechaInicio+ "Fecha Final: " + proye.fechaFin);
            }
        }
    }















}





























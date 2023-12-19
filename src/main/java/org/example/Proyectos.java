package org.example;

import java.util.Date;

public class Proyectos {

    int idProyecto;
    String nombreProyecto;
    String fechaInicio;
    String fechaFin;

    public Proyectos(int idProyecto, String nombreProyecto, String fechaInicio, String fechaFin) {
        this.idProyecto = idProyecto;
        this.nombreProyecto = nombreProyecto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }
}

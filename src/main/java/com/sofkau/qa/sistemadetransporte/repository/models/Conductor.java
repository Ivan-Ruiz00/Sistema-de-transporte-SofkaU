package com.sofkau.qa.sistemadetransporte.repository.models;

public class Conductor extends Persona{
    private String vehiculo;
    public Conductor() {
    }
    @Override
    public void ingresarAlBus() {
        System.out.println("Ingresando al bus y preparando todo para arrancar.");
    }
    public Conductor(String nombre, String id, int edad, String vehiculo) {
        super(nombre, id, edad);
        this.vehiculo=vehiculo;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }
}

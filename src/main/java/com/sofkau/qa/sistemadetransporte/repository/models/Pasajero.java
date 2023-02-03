package com.sofkau.qa.sistemadetransporte.repository.models;

public class Pasajero extends Persona{
    private String destino;
    private String asiento;
    public Pasajero() {
    }
    @Override
    public void ingresarAlBus() {
        System.out.println("Ingresando al bus y buscando el asiento respectivo");
    }
    public Pasajero(String nombre, String id, int edad, String destino,String asiento) {
        super(nombre,id,edad);
        this.destino = destino;
        this.asiento=asiento;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getAsiento() {
        return asiento;
    }
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
}

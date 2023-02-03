package com.sofkau.qa.sistemadetransporte.repository.models;

import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;

public class Van extends Vehiculo{
    private boolean tieneTele;
    public Van() {
    }
    public Van(Viaje viaje, Conductor conductor, PasajerosRepository pasajerosRepository, int anno, int capacidad, boolean tieneTele) {
        super(viaje, conductor, pasajerosRepository, anno, capacidad);
        this.tieneTele = tieneTele;
    }
    @Override
    public void ingresoPasajeros() {
        System.out.println("Abriendo puerta corrediza para el ingreso de los pasajeros");
    }
}

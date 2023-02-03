package com.sofkau.qa.sistemadetransporte.repository.models;

import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;

import java.util.List;

public class Bus extends Vehiculo{
    private boolean tieneWifi;
    public Bus() {
    }
    public Bus(Viaje viaje, Conductor conductor, PasajerosRepository pasajerosRepository, int anno, int capacidad, boolean tieneWifi) {
        super(viaje, conductor, pasajerosRepository, anno, capacidad);
        this.tieneWifi = tieneWifi;
    }
    public boolean isTieneWifi() {
        return tieneWifi;
    }
    public void setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
    }
    @Override
    public void ingresoPasajeros() {
        System.out.println("Abirendo puertas para el ingreso");
    }
}

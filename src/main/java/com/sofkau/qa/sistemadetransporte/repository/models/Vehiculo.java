package com.sofkau.qa.sistemadetransporte.repository.models;
import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
public abstract class Vehiculo {
    private Viaje viaje;
    private Conductor conductor;
    @Autowired
    PasajerosRepository pasajerosRepository;
    private int anno;
    private int capacidad;
    public Vehiculo() {
    }
    public abstract void ingresoPasajeros();
    public Vehiculo(Viaje viaje, Conductor conductor, PasajerosRepository pasajerosRepository, int anno, int capacidad) {
        this.viaje = viaje;
        this.conductor = conductor;
        this.pasajerosRepository = pasajerosRepository;
        this.anno = anno;
        this.capacidad = capacidad;
    }

    public Viaje getViaje() {
        return viaje;
    }
    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    public Conductor getConductor() {
        return conductor;
    }
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    public PasajerosRepository getPasajerosRepository() {
        return pasajerosRepository;
    }
    public void setPasajerosRepository(PasajerosRepository pasajerosRepository) {
        this.pasajerosRepository = pasajerosRepository;
    }
    public int getAnno() {
        return anno;
    }
    public void setAnno(int anno) {
        this.anno = anno;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

package com.sofkau.qa.sistemadetransporte.repository.models;
import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;
public abstract class Vehiculo {
    /**
     * Atributos de la clase vehículo
     */
    private Viaje viaje;
    private String id;
    private Conductor conductor;
    private PasajerosRepository pasajerosRepository;
    private int capacidad;

    /**
     * Constructor vacío
     */
    public Vehiculo() {
    }

    /**
     * Método abstracto que nos imprime los primeros pasos al ingresar al vehículo
     */
    public abstract void ingresoPasajeros();

    /**
     * Constructor con todos los parámetros
     * @param viaje nos indica el viaje del vehículo
     * @param conductor nos indica el conductor asignado al vehículo
     * @param pasajerosRepository nos indica los pasajeros del vehículo
     * @param capacidad nos indica la capacidad del vehículo
     */
    public Vehiculo(Viaje viaje,String id,Conductor conductor, PasajerosRepository pasajerosRepository, int capacidad) {
        this.viaje = viaje;
        this.id=id;
        this.conductor = conductor;
        this.pasajerosRepository = pasajerosRepository;
        this.capacidad = capacidad;
    }

    /**
     * Nos permite saber el viaje del vehículo
     * @return nos devuelve el viaje asignado al vehículo
     */
    public Viaje getViaje() {
        return viaje;
    }

    /**
     * Nos permite asignarle un viaje al vehículo
     * @param viaje nos indica el viaje del vehículo
     */
    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }

    /**
     * Nos indica el conductor asignado al vehículo
     * @return nos devuelve el conductor asignado al conductor
     */
    public Conductor getConductor() {
        return conductor;
    }

    /**
     * nos permite asignarle un conductor al vehículo
     * @param conductor nos indica el conductor que se asignará al vehículo
     */
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    /**
     * Nos indica los pasajeros que pasajeros tiene el vehículo
     * @return nos devuelve los pasajeros que tiene el vehículo
     */
    public PasajerosRepository getPasajerosRepository() {
        return pasajerosRepository;
    }

    /**
     * Nos permite asignarle pasajeros al vehículo.
     * @param pasajerosRepository nos indica los pasajeros del vehículo.
     */
    public void setPasajerosRepository(PasajerosRepository pasajerosRepository) {
        this.pasajerosRepository = pasajerosRepository;
    }

    /**
     * Nos devuelve la capacidad del vehículo
     * @return nos devuelve un entero con la capacidad del vehículo
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Nos permite asignarle una capacidad al vehículo
     * @param capacidad nos indica la capacidad del vehículo
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}

package com.sofkau.qa.sistemadetransporte.repository.models;

import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;

public class Van extends Vehiculo{
    /**
     * Atributos de la van
     */
    private boolean tieneTele;

    /**
     * Constructor vacío
     */
    public Van() {
    }

    /**
     * Constructor con los parámetros hacia el padre y su variable propia.
     * @param viaje nos indica el viaje que hará el vehículo
     * @param id nos indica el id del vehículo
     * @param conductor nos indica el conductor del vehículo
     * @param pasajerosRepository indica los pasajeros que tendrá el vehículo
     * @param capacidad nos indica la capacidad del vehículo
     * @param tieneTele nos indica si la van tiene televisión
     */
    public Van(Viaje viaje,String id,Conductor conductor, PasajerosRepository pasajerosRepository, int capacidad, boolean tieneTele) {
        super(viaje,id,conductor, pasajerosRepository, capacidad);
        this.tieneTele = tieneTele;
    }

    /**
     * Nos permite saber si la van tiene televisión
     * @return nos devuelve un valor de verdad que nos permite saber si la van tiene televisión
     */
    public boolean isTieneTele() {
        return tieneTele;
    }

    /**
     * Nos permite decir si la van tiene televisión
     * @param tieneTele nos indica un valor de verdad que indica si la van tiene un televisor
     */
    public void setTieneTele(boolean tieneTele) {
        this.tieneTele = tieneTele;
    }

    /**
     * Método abstracto que nos imprime los primeros pasos al ingresar al vehículo
     */
    @Override
    public void ingresoPasajeros() {
        System.out.println("Abriendo puerta corrediza para el ingreso de los pasajeros");
    }
}

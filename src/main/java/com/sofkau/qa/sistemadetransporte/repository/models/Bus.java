package com.sofkau.qa.sistemadetransporte.repository.models;
import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;
public class Bus extends Vehiculo{
    /**
     * Atributos
     */
    private boolean tieneWifi;

    /**
     * Constructor vacío
     */
    public Bus() {
    }

    /**
     * Constructor con los parámetros del padre y propios
     * @param viaje nos indica el viaje que hará el vehículo
     * @param id nos indica el id del vehículo
     * @param conductor nos indica la persona que manejará el bus
     * @param pasajerosRepository nos indica los pasajeros que tendremos en el vehículo
     * @param capacidad nos indica la capacidad del vehículo
     * @param tieneWifi nos indica si el bus posee wi-fi
     */
    public Bus(Viaje viaje,String id,Conductor conductor, PasajerosRepository pasajerosRepository, int capacidad, boolean tieneWifi) {
        super(viaje,id,conductor, pasajerosRepository, capacidad);
        this.tieneWifi = tieneWifi;
    }

    /**
     * Método que nos permite saber si el bus posee Wi-Fi
     * @return nos devuelve un booleano diciendo si tiene wifi el vehiculo
     */
    public boolean isTieneWifi() {
        return tieneWifi;
    }

    /**
     * Método que nos permite establecer si el bus tiene Wi-Fi
     * @param tieneWifi booleano que pasamos para decir si el bus cuenta con red wi-fi
     */
    public void setTieneWifi(boolean tieneWifi) {
        this.tieneWifi = tieneWifi;
    }

    /**
     * Método abstracto que nos imprime los primeros pasos al ingresar al vehículo
     */
    @Override
    public void ingresoPasajeros() {
        System.out.println("Abirendo puertas para el ingreso");
    }
}

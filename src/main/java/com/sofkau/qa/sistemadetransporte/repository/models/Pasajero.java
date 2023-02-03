package com.sofkau.qa.sistemadetransporte.repository.models;
public class Pasajero extends Persona{
    /**
     * Atributos de los pasajeros
     */
    private String destino;
    private String asiento;

    /**
     * Constructor vacío
     */
    public Pasajero() {
    }

    /**
     * Método abstracto que nos indica la persona como ingresa al vehículo
     */
    @Override
    public void ingresarAlBus() {
        System.out.println("Ingresando al bus y buscando el asiento respectivo");
    }

    /**
     * Constructor con los parámetros hacia el padre y su variable propia.
     * @param nombre nos indica el nombre de la persona
     * @param id nos indica la cédula de la persona
     * @param edad nos indica la edad de la persona
     * @param destino nos indica el destino del pasajero
     * @param asiento nos indica el asiento asignado del pasajero
     */
    public Pasajero(String nombre, String id, int edad, String destino,String asiento) {
        super(nombre,id,edad);
        this.destino = destino;
        this.asiento=asiento;
    }

    /**
     * Nos indica el destino al que se dirige la persona
     * @return nos devuelve el destino al que se dirige el pasajero
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Nos permite asignarle un destino al pasajero
     * @param destino nos indica el destino que se le asignará al pasajero
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * nos indica el asiento que la persona tiene asignado
     * @return nos devuelve el asiento de la persona
     */
    public String getAsiento() {
        return asiento;
    }

    /**
     * nos permite asignarle un asiento a la persona
     * @param asiento nos indica el asiento de la persona
     */
    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
}

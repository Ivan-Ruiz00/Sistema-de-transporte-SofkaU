package com.sofkau.qa.sistemadetransporte.repository.models;
public class Conductor extends Persona{
    /**
     * Atributos del conductor
     */
    private Vehiculo vehiculo;

    /**
     * Constructor vacío de la clase
     */
    public Conductor() {
    }

    /**
     * Método abstracto que nos indica la persona como ingresa al vehículo
     */
    @Override
    public void ingresarAlBus() {
        System.out.println("Ingresando al bus y preparando todo para arrancar.");
    }

    /**
     * Constructor con los parámetros hacia el padre y su variable propia.
     * @param nombre nos indica el nombre del conductor.
     * @param id nos indica la cédula del conductor.
     * @param edad nos indica la edad del conductor.
     * @param vehiculo nos indica el vehículo que conducirá el conductor.
     */
    public Conductor(String nombre, String id, int edad, Vehiculo vehiculo) {
        super(nombre, id, edad);
        this.vehiculo=vehiculo;
    }
    /**
     * Nos indica el vehículo asignado al conductor
     * @return nos devuelve el vehiculo que manejará el conductor
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    /**
     * Nos permite asignarle un vehiculo al conductor
     * @param vehiculo nos indica el vehiculo que se le asignará al conductor
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

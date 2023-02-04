package com.sofkau.qa.sistemadetransporte.repository.models;
public abstract class Persona {
    /**
     * atributos de persona
     */
    private String nombre, id;
    private int edad;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor con todos los parámetros
     *
     * @param nombre nos indica el nombre de la persona
     * @param id     nos indica la cédula de la persona
     * @param edad   nos indica la edad de la persona
     */
    public Persona(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    /**
     * Nos indica la forma que tiene la persona de ingresar al vehiculo
     */
    public abstract void ingresarAlBus();

    /**
     * Nos indica el nombre de la persona
     *
     * @return nos devuelve una cadena de texto con el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Nos permite asignarle un nombre a una persona
     *
     * @param nombre nos indica el nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Nos indica la edad de la persona
     *
     * @return nos devuelve la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Nos permite asignarle una edad a la persona
     *
     * @param edad nos indica la edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

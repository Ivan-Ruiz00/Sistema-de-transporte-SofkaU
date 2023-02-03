package com.sofkau.qa.sistemadetransporte.repository.models;
public abstract class Persona {
    private String nombre,id;
    private int edad;
    public Persona() {
    }
    public Persona(String nombre, String id, int edad) {
        this.nombre = nombre;
        this.id=id;
        this.edad = edad;
    }
    public abstract void ingresarAlBus();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

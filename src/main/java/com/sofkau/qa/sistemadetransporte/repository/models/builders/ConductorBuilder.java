package com.sofkau.qa.sistemadetransporte.repository.models.builders;

import com.sofkau.qa.sistemadetransporte.repository.models.Conductor;
import com.sofkau.qa.sistemadetransporte.repository.models.Vehiculo;

public class ConductorBuilder {
    Conductor conductor;
    public ConductorBuilder(){
        conductor=new Conductor();
    }
    public ConductorBuilder nombre(String nombre){
        conductor.setNombre(nombre);
        return this;
    }
    public ConductorBuilder id(String id){
        conductor.setId(id);
        return this;
    }
    public ConductorBuilder edad(int edad){
        conductor.setEdad(edad);
        return this;
    }
    public ConductorBuilder vehiculo(Vehiculo vehiculo){
        conductor.setVehiculo(vehiculo);
        return this;
    }
    public Conductor build(){
        return conductor;
    }
}

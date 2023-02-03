package com.sofkau.qa.sistemadetransporte.repository;
import com.sofkau.qa.sistemadetransporte.repository.models.Vehiculo;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BusesRepository{
    /**
     * Atributos del repositorio
     */
    List<Vehiculo> vehiculosDisponibles=new ArrayList<>();
    List<Vehiculo> vehiculosConViajeAsignado=new ArrayList<>();

    /**
     *
     * @param vehiculo
     */
    public void añadirVehiculoDisponible(Vehiculo vehiculo){
        vehiculosDisponibles.add(vehiculo);
    }
    public void añadirVehiculoAsignado(Vehiculo vehiculo){
        vehiculosConViajeAsignado.add(vehiculo);
    }
}

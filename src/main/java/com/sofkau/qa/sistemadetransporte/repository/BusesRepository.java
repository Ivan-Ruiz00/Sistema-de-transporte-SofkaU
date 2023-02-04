package com.sofkau.qa.sistemadetransporte.repository;
import com.sofkau.qa.sistemadetransporte.repository.models.Conductor;
import com.sofkau.qa.sistemadetransporte.repository.models.Vehiculo;
import com.sofkau.qa.sistemadetransporte.repository.models.builders.BusBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
@Repository
public class BusesRepository{
    /**
     * Atributos del repositorio
     */
    @Autowired
    ViajesRepository viajesRepository;
    List<Vehiculo> vehiculosDisponibles=new ArrayList<>();
    List<Vehiculo> vehiculosConViajeAsignado=new ArrayList<>(List.of(new BusBuilder()
            .viaje(viajesRepository.getViajes().get(0))
            .conductor(new Conductor())
            .pasajeros().build()));

    /**
     * Este método nos permite añadir un vehículo disponible a la lista que lo contiene
     * @param vehiculo nos indica el vehículo disponible
     */
    public void añadirVehiculoDisponible(Vehiculo vehiculo){
        vehiculosDisponibles.add(vehiculo);
    }

    /**
     * Este método nos permite añadir un vehiculo con viaje asignado
     * @param vehiculo nos indica el vehículo con viaje asignado
     */
    public void añadirVehiculoAsignado(Vehiculo vehiculo){
        vehiculosConViajeAsignado.add(vehiculo);
    }

    /**
     * Nos permite obtener la lista de los vehículos disponibles
     * @return devuelve una lista de vehículos disponibles
     */
    public List<Vehiculo> getVehiculosDisponibles() {
        return vehiculosDisponibles;
    }

    /**
     * Nos permite obtener la lista de los vehículos asignados
     * @return devuelve una lista de vehículos con viaje asignado
     */
    public List<Vehiculo> getVehiculosConViajeAsignado() {
        return vehiculosConViajeAsignado;
    }
}

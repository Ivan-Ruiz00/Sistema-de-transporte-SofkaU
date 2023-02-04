package com.sofkau.qa.sistemadetransporte.repository;
import com.sofkau.qa.sistemadetransporte.repository.models.Pasajero;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PasajerosRepository {
    /**
     * Atributos de la clase PasajerosRepository
     */
    List<Pasajero> pasajeros=new ArrayList<>();

    /**
     * Nos devuelve una lista con los pasajeros
     * @return devuelve una lista de pasajeros
     */
    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    /**
     * Nos permite asignar una lista de pasajeros
     * @param pasajeros nos indica la lista de pasajeros a asignar
     */
    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}

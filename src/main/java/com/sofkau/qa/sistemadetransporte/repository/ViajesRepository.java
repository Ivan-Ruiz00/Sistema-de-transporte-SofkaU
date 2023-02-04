package com.sofkau.qa.sistemadetransporte.repository;
import com.sofkau.qa.sistemadetransporte.repository.models.Viaje;
import com.sofkau.qa.sistemadetransporte.repository.models.builders.ViajeBuilder;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Repository
public class ViajesRepository {
    /**
     * Atributos de la clase ViajesRepository
     */
    ArrayList<Viaje> viajes=new ArrayList<>(List.of(new ViajeBuilder().origen("Bogotá")
                    .Destino("Medellín")
                    .Distancia(484)
                    .FechaHoraDeSalida(LocalDateTime.of(2023,02,04,12,00))
                    .FechaHoraDeLlegada(LocalDateTime.of(2023,02,04,20,00))
                    .build(),
            new ViajeBuilder().origen("Medellín")
                    .Destino("Bogotá")
                    .Distancia(484)
                    .FechaHoraDeSalida(LocalDateTime.of(2023,02,04,12,00))
                    .FechaHoraDeLlegada(LocalDateTime.of(2023,02,04,20,00))
                    .build()
            ,new ViajeBuilder().origen("Bogotá")
                    .Destino("Cali")
                    .Distancia(461)
                    .FechaHoraDeSalida(LocalDateTime.of(2023,02,04,10,00))
                    .FechaHoraDeLlegada(LocalDateTime.of(2023,02,04,17,00))
                    .build()));

    /**
     * Nos permite agregar viajes a la lista del repositorio
     * @param viaje nos indica el viaje a agregar al repositorio
     */
    public void añadirViaje(Viaje viaje){
        viajes.add(viaje);
    }

    /**
     * Nos devuelve la lista de viajes
     * @return nos devuelve una lista con los viajes que tiene el sistema
     */
    public ArrayList<Viaje> getViajes(){
        return viajes;
    }
}
package com.sofkau.qa.sistemadetransporte.repository.models;
import java.time.LocalDateTime;
public class ViajeBuilder {
    Viaje viaje;

    public ViajeBuilder() {
        viaje = new Viaje();
    }

    public ViajeBuilder origen(String origen) {
        viaje.setOrigen(origen);
        return this;
    }

    public ViajeBuilder Destino(String destino) {
        viaje.setDestino(destino);
        return this;
    }

    public ViajeBuilder FechaHoraDeSalida(LocalDateTime fechaHoraDeSalida) {
        viaje.setFechaHoraDeSalida(fechaHoraDeSalida);
        return this;
    }

    public ViajeBuilder FechaHoraDeLlegada(LocalDateTime fechaHoraDeLlegada) {
        viaje.setFechaHoraDeLlegada(fechaHoraDeLlegada);
        return this;
    }

    public ViajeBuilder Distancia(int distancia) {
        viaje.setDistancia(distancia);
        return this;
    }

    public Viaje build() {
        return viaje;
    }
}

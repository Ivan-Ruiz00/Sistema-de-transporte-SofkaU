package com.sofkau.qa.sistemadetransporte.repository.models;
import java.time.LocalDateTime;
import java.util.List;
public class Viaje {
    /**
     * atributos de la clase Viaje
     */
    private String origen,destino;
    private LocalDateTime fechaHoraDeSalida,fechaHoraDeLlegada;
    private int distancia;

    /**
     * Constructor vacío
     */
    public Viaje() {
    }

    /**
     * Constructor con todos los parámetros
     * @param origen nos indica el origen del viaje
     * @param destino nos indica el destino del viaje
     * @param fechaHoraDeSalida nos indica la fecha y hora en la que sale el vehículo del origen
     * @param fechaHoraDeLlegada nos indica la fecha y hora en la que llegará el vehículo al destino
     * @param distancia nos indica los kilómetros que hay entre el origen y el destino
     */
    public Viaje(String origen, String destino, LocalDateTime fechaHoraDeSalida, LocalDateTime fechaHoraDeLlegada, int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.fechaHoraDeSalida = fechaHoraDeSalida;
        this.fechaHoraDeLlegada = fechaHoraDeLlegada;
        this.distancia = distancia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getFechaHoraDeSalida() {
        return fechaHoraDeSalida;
    }

    public void setFechaHoraDeSalida(LocalDateTime fechaHoraDeSalida) {
        this.fechaHoraDeSalida = fechaHoraDeSalida;
    }

    public LocalDateTime getFechaHoraDeLlegada() {
        return fechaHoraDeLlegada;
    }

    public void setFechaHoraDeLlegada(LocalDateTime fechaHoraDeLlegada) {
        this.fechaHoraDeLlegada = fechaHoraDeLlegada;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}

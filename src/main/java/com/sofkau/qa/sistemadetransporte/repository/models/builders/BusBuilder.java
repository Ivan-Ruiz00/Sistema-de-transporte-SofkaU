package com.sofkau.qa.sistemadetransporte.repository.models.builders;
import com.sofkau.qa.sistemadetransporte.repository.PasajerosRepository;
import com.sofkau.qa.sistemadetransporte.repository.models.Bus;
import com.sofkau.qa.sistemadetransporte.repository.models.Conductor;
import com.sofkau.qa.sistemadetransporte.repository.models.Pasajero;
import com.sofkau.qa.sistemadetransporte.repository.models.Viaje;

import java.util.List;

public class BusBuilder {
    Bus bus;
    public BusBuilder(){
        bus=new Bus();
    }
    public BusBuilder viaje(Viaje viaje){
        bus.setViaje(viaje);
        return this;
    }
    public BusBuilder conductor(Conductor conductor){
        bus.setConductor(conductor);
        return this;
    }
    public BusBuilder pasajeros(List<Pasajero> pasajeros){
        bus.setPasajeros(pasajeros);
        return this;
    }
    public BusBuilder capacidad(int capacidad){
        bus.setCapacidad(capacidad);
        return this;
    }
    public BusBuilder wifi(boolean tieneWifi){
        bus.setTieneWifi(tieneWifi);
        return this;
    }
    public Bus build(){
        return bus;
    }
}

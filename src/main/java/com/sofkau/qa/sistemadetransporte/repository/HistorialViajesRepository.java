package com.sofkau.qa.sistemadetransporte.repository;

import com.sofkau.qa.sistemadetransporte.repository.models.Pasajero;

import java.util.ArrayList;
import java.util.List;

public class HistorialViajesRepository {
    ArrayList<List<Pasajero>> historicoPasajeros;
    public HistorialViajesRepository(){
        historicoPasajeros=new ArrayList<>();
    }
}

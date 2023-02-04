package com.sofkau.qa.sistemadetransporte.controller;
import com.sofkau.qa.sistemadetransporte.repository.ViajesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Clase encargada de recibir peticiones JSON y dirigirlas a su correcto proceso para los viajes
 */
@RestController
@RequestMapping("api/v1/viajes")
public class ViajesController {
    @Autowired
    ViajesRepository viajesRepository;
    @GetMapping("/todos")
    public ResponseEntity getViajes(){
        return new ResponseEntity(viajesRepository.getViajes(),HttpStatus.FOUND);
    }
}

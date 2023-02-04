package com.sofkau.qa.sistemadetransporte.controller;

import com.sofkau.qa.sistemadetransporte.service.IBusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Clase encargada de recibir peticiones JSON y dirigirlas a su correcto proceso para los buses
 */
@RestController
@RequestMapping("api/v1/buses")
public class BusesController {
    @Autowired
    private IBusesService service;
}

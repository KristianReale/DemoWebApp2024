package com.dipartimento.demowebapplications.controller;

import com.dipartimento.demowebapplications.model.Ristorante;
import com.dipartimento.demowebapplications.services.RistorantiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GestioneRistorante {
    @Autowired
    RistorantiService ristoranteService;


    @GetMapping("/addRistorante")
    public String aggiungiRistorante(@RequestBody Ristorante ristorante) {
        System.out.println("ristorante: " + ristorante.getNome());
        //RistorantiService ristoranteService = RistorantiService.getInstance();

        ristoranteService.addRistorante(ristorante);

        return "OK";

    }


}

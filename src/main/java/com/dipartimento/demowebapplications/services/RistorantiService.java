package com.dipartimento.demowebapplications.services;

import com.dipartimento.demowebapplications.model.Ristorante;
import com.dipartimento.demowebapplications.persistence.DBManager;
import org.springframework.stereotype.Service;

@Service
public class RistorantiService {
    public void addRistorante(Ristorante ristorante){
        DBManager.getInstance().getRistoranteDao().save(ristorante);
    }
}

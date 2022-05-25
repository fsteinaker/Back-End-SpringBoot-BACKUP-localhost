package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Domicilio;
import com.baseDatos.FSteinaker.repository.DomicilioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService implements IDomicilioService {

    @Autowired
    private DomicilioRepository domiRepositoty;
    
    @Override
    public List<Domicilio> getDomicilio() {
        List<Domicilio> listaDomicilio = domiRepositoty.findAll();
        return listaDomicilio;
    }

    @Override
    public void saveDomicilio(Domicilio domi) {
        domiRepositoty.save(domi);
    }

    @Override
    public void updateDomicilio(Domicilio domi) {
        domiRepositoty.save(domi);
    }

    @Override
    public void deleteDomicilio(Long id) {
        domiRepositoty.deleteById(id);
    }

    @Override
    public Domicilio findDomicilio(Long id) {
        Domicilio domi = domiRepositoty.findById(id).orElse(null);
        return domi;
    }
    
}

package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Tecnologias;
import com.baseDatos.FSteinaker.repository.TecnologiasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiasService implements ITecnologiasService {

    @Autowired
    private TecnologiasRepository tecRepositoty;
    
    @Override
    public List<Tecnologias> getTecnologias() {
        List<Tecnologias> listaTecnologias = tecRepositoty.findAll();
        return listaTecnologias;
    }

    @Override
    public void saveTecnologias(Tecnologias tec) {
        tecRepositoty.save(tec);
    }

    @Override
    public void updateTecnologias(Tecnologias tec) {
        tecRepositoty.save(tec);
    }

    @Override
    public void deleteTecnologias(Long id) {
        tecRepositoty.deleteById(id);
    }

    @Override
    public Tecnologias findTecnologias(Long id) {
        Tecnologias tec = tecRepositoty.findById(id).orElse(null);
        return tec;
    }
    
}
package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Habilidad;
import com.baseDatos.FSteinaker.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {

    @Autowired
    private HabilidadRepository habilidadRepositoty;
    
    @Override
    public List<Habilidad> getHabilidad() {
        List<Habilidad> listaHabilidad = habilidadRepositoty.findAll();
        return listaHabilidad;
    }

    @Override
    public void saveHabilidad(Habilidad habilidad) {
        habilidadRepositoty.save(habilidad);
    }

    @Override
    public void updateHabilidad(Habilidad habilidad) {
        habilidadRepositoty.save(habilidad);
    }

    @Override
    public void deleteHabilidad(Long id) {
        habilidadRepositoty.deleteById(id);
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        Habilidad habilidad = habilidadRepositoty.findById(id).orElse(null);
        return habilidad;
    }
    
}

package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Localidad;
import com.baseDatos.FSteinaker.repository.LocalidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadService implements ILocalidadService {

    @Autowired
    private LocalidadRepository localidadRepositoty;
    
    @Override
    public List<Localidad> getLocalidad() {
        List<Localidad> listaLocalidad = localidadRepositoty.findAll();
        return listaLocalidad;
    }

    @Override
    public void saveLocalidad(Localidad localidad) {
            localidadRepositoty.save(localidad);
        }

    @Override
    public void updateLocalidad(Localidad localidad) {
        localidadRepositoty.save(localidad);
    }

    @Override
    public void deleteLocalidad(Long id) {
       localidadRepositoty.deleteById(id);
    }

    @Override
    public Localidad findLocalidad(Long id) {
        Localidad localidad = localidadRepositoty.findById(id).orElse(null);
        return localidad;
    }
    
}
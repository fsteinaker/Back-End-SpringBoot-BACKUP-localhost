package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Educacion;
import com.baseDatos.FSteinaker.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {

    @Autowired
    private EducacionRepository eduRepositoty;
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> listaEducacion = eduRepositoty.findAll();
        return listaEducacion;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        eduRepositoty.save(edu);
    }

    @Override
    public void updateEducacion(Educacion edu) {
        eduRepositoty.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        eduRepositoty.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion domi = eduRepositoty.findById(id).orElse(null);
        return domi;
    }
    
}

package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Proyectos;
import com.baseDatos.FSteinaker.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    private ProyectosRepository proRepositoty;
    
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> listaProyectos = proRepositoty.findAll();
        return listaProyectos;
    }

    @Override
    public void saveProyectos(Proyectos pro) {
        proRepositoty.save(pro);
    }

    @Override
    public void updateProyectos(Proyectos pro) {
        proRepositoty.save(pro);
    }

    @Override
    public void deleteProyectos(Long id) {
        proRepositoty.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos pro = proRepositoty.findById(id).orElse(null);
        return pro;
    }
    
}

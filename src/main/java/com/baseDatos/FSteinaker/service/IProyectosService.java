package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Proyectos;
import java.util.List;

public interface IProyectosService {

    public List<Proyectos> getProyectos ();
    
    public void saveProyectos (Proyectos pro);
    
    public void updateProyectos (Proyectos pro);
    
    public void deleteProyectos (Long id);
    
    public Proyectos findProyectos (Long id);
    
}
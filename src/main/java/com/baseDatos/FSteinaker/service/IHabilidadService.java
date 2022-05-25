package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    
    public List<Habilidad> getHabilidad ();
    
    public void saveHabilidad (Habilidad habilidad);
    
    public void updateHabilidad (Habilidad habilidad);
    
    public void deleteHabilidad(Long id);
    
    public Habilidad findHabilidad (Long id);
    
}

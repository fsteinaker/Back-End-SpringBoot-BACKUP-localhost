package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Localidad;
import java.util.List;

public interface ILocalidadService {
    
    public List<Localidad> getLocalidad ();
    
    public void saveLocalidad (Localidad localidad);
    
    public void updateLocalidad (Localidad localidad);
    
    public void deleteLocalidad (Long id);
    
    public Localidad findLocalidad (Long id);
    
}

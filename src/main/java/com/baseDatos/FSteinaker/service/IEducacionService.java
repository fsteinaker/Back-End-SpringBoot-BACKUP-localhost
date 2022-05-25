package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Educacion;
import java.util.List;

public interface IEducacionService {    
    
    public List<Educacion> getEducacion ();
    
    public void saveEducacion (Educacion edu);
    
    public void updateEducacion (Educacion edu);
    
    public void deleteEducacion (Long id);
    
    public Educacion findEducacion (Long id);
    
}

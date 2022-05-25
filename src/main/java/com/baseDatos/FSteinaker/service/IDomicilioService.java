package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Domicilio;
import java.util.List;

public interface IDomicilioService {
    
    public List<Domicilio> getDomicilio ();
    
    public void saveDomicilio (Domicilio domi);
    
    public void updateDomicilio (Domicilio domi);
    
    public void deleteDomicilio (Long id);
    
    public Domicilio findDomicilio (Long id);
    
}

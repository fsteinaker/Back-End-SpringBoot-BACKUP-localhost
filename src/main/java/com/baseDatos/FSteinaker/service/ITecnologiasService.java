package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Tecnologias;
import java.util.List;

public interface ITecnologiasService {    
    
    public List<Tecnologias> getTecnologias ();
    
    public void saveTecnologias (Tecnologias tec);
    
    public void updateTecnologias (Tecnologias tec);
    
    public void deleteTecnologias (Long id);
    
    public Tecnologias findTecnologias (Long id);
    
}

package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.ExpLaboral;
import java.util.List;

public interface IExpLaboralService {
    
    public List<ExpLaboral> getExpLaboral ();
    
    public void saveExpLaboral (ExpLaboral explab);
    
    public void updateExpLaboral (ExpLaboral explab);
    
    public void deleteExpLaboral(Long id);
    
    public ExpLaboral findExpLaboral (Long id);
    
}

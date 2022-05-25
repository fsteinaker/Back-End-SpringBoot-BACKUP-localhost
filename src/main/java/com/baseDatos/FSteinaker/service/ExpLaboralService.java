package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.ExpLaboral;
import com.baseDatos.FSteinaker.repository.ExpLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpLaboralService implements IExpLaboralService {

    @Autowired
    private ExpLaboralRepository explabRepositoty;
    
    @Override
    public List<ExpLaboral> getExpLaboral() {
        List<ExpLaboral> listaExpLaboral = explabRepositoty.findAll();
        return listaExpLaboral;
    }

    @Override
    public void saveExpLaboral(ExpLaboral explab) {
        explabRepositoty.save(explab);
    }

    @Override
    public void updateExpLaboral(ExpLaboral explab) {
         explabRepositoty.save(explab);
    }

    @Override
    public void deleteExpLaboral(Long id) {
        explabRepositoty.deleteById(id);
    }

    @Override
    public ExpLaboral findExpLaboral(Long id) {
        ExpLaboral explab = explabRepositoty.findById(id).orElse(null);
        return explab;
    }
    
}

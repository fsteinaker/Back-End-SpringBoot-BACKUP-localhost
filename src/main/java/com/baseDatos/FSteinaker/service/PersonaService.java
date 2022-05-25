package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Persona;
import com.baseDatos.FSteinaker.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository perRepositoty;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersona = perRepositoty.findAll();
        return listaPersona;
    }

    @Override
    public void savePersona(Persona per) {
        perRepositoty.save(per);
    }

    @Override
    public void updatePersona(Persona per) {
        perRepositoty.save(per);
    }

    @Override
    public void deletePersona(Long id) {
        perRepositoty.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona pro = perRepositoty.findById(id).orElse(null);
        return pro;
    }
    
}

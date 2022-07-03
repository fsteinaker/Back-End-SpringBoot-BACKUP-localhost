package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.dto.MensajePersona;
import com.baseDatos.FSteinaker.model.Persona;
import com.baseDatos.FSteinaker.service.IPersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/fsteinaker")

public class PersonaController {    
    @Autowired IPersonaService interPersona;
    
    @GetMapping ("/persona")
    public Persona getPersona(){
        return interPersona.getPersona().get(0);
    }
    
    @GetMapping("/persona/detalle/{id}")
    public ResponseEntity<Persona> getOnePersona(@PathVariable("id") Long id){
        if(!interPersona.existPersonaById(id))
            return new ResponseEntity(new MensajePersona("La persona que buscas no existe."), HttpStatus.NOT_FOUND);
        Persona per = interPersona.findPersona(id);
        return new ResponseEntity(per, HttpStatus.OK);
    }
    
    @PostMapping ("/persona/crear")
    public String createPersona(@RequestBody Persona per) {        
        interPersona.savePersona(per);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/persona/borrar/{id}")
    public String deletePersona (@PathVariable Long id) {        
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/persona/editar/{id}")
    public ResponseEntity<?> updatePersona (@RequestBody Persona per){
        interPersona.updatePersona(per);
        return new ResponseEntity(new MensajePersona("persona editada con exito"), HttpStatus.OK);
    }
    
}
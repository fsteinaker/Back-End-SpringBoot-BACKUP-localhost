package com.baseDatos.FSteinaker.controller;

import java.util.List;
import com.baseDatos.FSteinaker.model.Domicilio;
import com.baseDatos.FSteinaker.service.IDomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/fsteinaker")

public class DomicilioController {
        
    @Autowired
    private IDomicilioService interDomicilio;
    
    @GetMapping ("/domicilio")
    public List<Domicilio> getDomicilio() {
        
        return interDomicilio.getDomicilio();
    }
    
    @PostMapping ("/domicilio/crear")
    public String createDomicilio(@RequestBody Domicilio domi) {
        
        interDomicilio.saveDomicilio(domi);
        return "El domicilio fue creado correctamente";
    }
    
    @DeleteMapping ("/domicilio/borrar/{id}")
    public String deleteDomicilio (@PathVariable Long id) {
        
        interDomicilio.deleteDomicilio(id);
        return "El domicilio fue eliminado correctamente";
    }    
 
    @PutMapping("/domicilio/editar/{id}")
    public Domicilio updatePersona(@PathVariable Long id,
                                 @RequestParam String domicilio){
        
        Domicilio domi = interDomicilio.findDomicilio(id);
        
        domi.setDomicilio(domicilio);
        
        interDomicilio.updateDomicilio(domi);
        
        return domi;
        
    }
    
}
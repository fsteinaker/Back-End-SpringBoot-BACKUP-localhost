package com.baseDatos.FSteinaker.controller;

import com.baseDatos.FSteinaker.dto.MensajeSkillsHabilidades;
import com.baseDatos.FSteinaker.model.Habilidad;
import com.baseDatos.FSteinaker.service.IHabilidadService;
import java.util.List;
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
public class HabilidadController {    
        
    @Autowired
    private IHabilidadService interHabilidad;
    
    @GetMapping ("/habilidad")
    public List<Habilidad> getHabilidad() {
        
        return interHabilidad.getHabilidad();
    }
    
    @GetMapping("/habilidad/detalle/{id}")
    public ResponseEntity<Habilidad> getExpLaboral(@PathVariable("id") Long id){
        if(!interHabilidad.existHabilidadById(id))
            return new ResponseEntity(new MensajeSkillsHabilidades("La habilidad que buscas no existe."), HttpStatus.NOT_FOUND);
        Habilidad explab = interHabilidad.findHabilidad(id);
        return new ResponseEntity(explab, HttpStatus.OK);
    }
    
    @PostMapping ("/habilidad/crear")
    public String createHabilidad(@RequestBody Habilidad habilidad) {
        
        interHabilidad.saveHabilidad(habilidad);
        return "La habilidad fue creada correctamente";
    }
    
    @DeleteMapping ("/habilidad/borrar/{id}")
    public String deleteHabilidad (@PathVariable Long id) {
        
        interHabilidad.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }    
    
    @PutMapping("/habilidad/editar/{id}")
    public ResponseEntity<?> updateHabilidad (@RequestBody Habilidad habilidad){
        interHabilidad.updateHabilidad(habilidad);
        return new ResponseEntity(new MensajeSkillsHabilidades("habilidad editada con exito"), HttpStatus.OK);
    }
    
}

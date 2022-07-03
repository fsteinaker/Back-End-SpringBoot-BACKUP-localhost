package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.dto.MensajeLocalidad;
import com.baseDatos.FSteinaker.model.Localidad;
import com.baseDatos.FSteinaker.service.ILocalidadService;
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
public class LocalidadController {
    
    @Autowired
    private ILocalidadService interLocalidad;
    
    @GetMapping ("/localidad")
    public Localidad getLocalidad() {        
        return interLocalidad.getLocalidad().get(0);
    }
    
    @GetMapping("/localidad/detalle/{id}")
    public ResponseEntity<Localidad> getExpLaboral(@PathVariable("id") Long id){
        if(!interLocalidad.existLocalidadById(id))
            return new ResponseEntity(new MensajeLocalidad("La localidad que buscas no existe."), HttpStatus.NOT_FOUND);
        Localidad localidad = interLocalidad.findLocalidad(id);
        return new ResponseEntity(localidad, HttpStatus.OK);
    }
    
    @PostMapping ("/localidad/crear")
    public String createLocalidad(@RequestBody Localidad localidad) {
        
        interLocalidad.saveLocalidad(localidad);
        return "La localidad fue creada correctamente";
    }
    
    @DeleteMapping ("/localidad/borrar/{id}")
    public String deleteLocalidad (@PathVariable Long id) {
        
        interLocalidad.deleteLocalidad(id);
        return "La localidad fue eliminada correctamente";
    }
    
    @PutMapping("/localidad/editar/{id}")
    public ResponseEntity<?> updateLocalidad (@RequestBody Localidad localidad){
        interLocalidad.updateLocalidad(localidad);
        return new ResponseEntity(new MensajeLocalidad("localidad editada con exito"), HttpStatus.OK);
    }
    
}
package com.baseDatos.FSteinaker.controller;

import com.baseDatos.FSteinaker.model.Habilidad;
import com.baseDatos.FSteinaker.service.IHabilidadService;
import java.util.List;
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
public class HabilidadController {    
        
    @Autowired
    private IHabilidadService interHabilidad;
    
    @GetMapping ("/habilidad")
    public List<Habilidad> getHabilidad() {
        
        return interHabilidad.getHabilidad();
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
    public Habilidad  updateHabilidad (@PathVariable Long id,
                                 @RequestParam String tipo,
                                 @RequestParam String nivel,
                                 @RequestParam String detalle,
                                 @RequestParam String imagen){
        
        Habilidad habilidad = interHabilidad.findHabilidad(id);
        
        habilidad.setTipo(tipo);
        habilidad.setNivel(nivel);
        habilidad.setDetalle(detalle);
        habilidad.setImagen(imagen);
        
        interHabilidad.updateHabilidad(habilidad);
        
        return habilidad;
        
    }
    
}

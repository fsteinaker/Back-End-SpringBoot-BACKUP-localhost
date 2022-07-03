package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.dto.MensajeEducacion;
import com.baseDatos.FSteinaker.model.Educacion;
import com.baseDatos.FSteinaker.service.IEducacionService;
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
public class EducacionController {
   
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping ("/educacion")
    public List<Educacion> getEducacion() {
        
        return interEducacion.getEducacion();
    }
    
    @GetMapping("/educacion/detalle/{id}")
    public ResponseEntity<Educacion> getOneEducacion(@PathVariable("id") Long id){
        if(!interEducacion.existEducacionById(id))
            return new ResponseEntity(new MensajeEducacion("El título educativo que buscas no existe."), HttpStatus.NOT_FOUND);
        Educacion edu = interEducacion.findEducacion(id);
        return new ResponseEntity(edu, HttpStatus.OK);
    }
    
    @PostMapping ("/educacion/crear")
    public String createEducacion(@RequestBody Educacion edu) {
        
        interEducacion.saveEducacion(edu);
        return "La institucion educativa fue creada correctamente";
    }
    
    @DeleteMapping ("/educacion/borrar/{id}")
    public String deleteEducacion (@PathVariable Long id) {
        
        interEducacion.deleteEducacion(id);
        return "La institucion educativa fue eliminada correctamente";
    }
    
    @PutMapping("/educacion/editar/{id}")
    public ResponseEntity<?> updateEducacion (@RequestBody Educacion edu){
        interEducacion.updateEducacion(edu);
        return new ResponseEntity(new MensajeEducacion("educacion editada con exito"), HttpStatus.OK);
    }
}

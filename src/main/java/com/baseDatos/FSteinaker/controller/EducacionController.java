package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.Educacion;
import com.baseDatos.FSteinaker.service.IEducacionService;
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
public class EducacionController {
   
    @Autowired
    private IEducacionService interEducacion;
    
    @GetMapping ("/educacion")
    public List<Educacion> getEducacion() {
        
        return interEducacion.getEducacion();
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
    public Educacion updateEducacion(@PathVariable Long id,
                                 @RequestParam String institucion,
                                 @RequestParam String fecha_inicio,
                                 @RequestParam String fecha_final,
                                 @RequestParam String titulo,
                                 @RequestParam String detalle,
                                 @RequestParam String imagen){
        
        Educacion edu = interEducacion.findEducacion(id);
        
        edu.setInstitucion(institucion);
        edu.setFecha_inicio(fecha_inicio);
        edu.setFecha_final(fecha_final);
        edu.setTitulo(titulo);
        edu.setDetalle(detalle);
        edu.setImagen(imagen);
        
        interEducacion.updateEducacion(edu);
        
        return edu;
        
    }
}

package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.Localidad;
import com.baseDatos.FSteinaker.service.ILocalidadService;
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
public class LocalidadController {
    
    @Autowired
    private ILocalidadService interLocalidad;
    
    @GetMapping ("/localidad")
    public List<Localidad> getLocalidad() {
        
        return interLocalidad.getLocalidad();
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
    public Localidad updateLocalidad(@PathVariable Long id,
                                 @RequestParam String ciudad,
                                 @RequestParam String provincia,
                                 @RequestParam String pais,
                                 @RequestParam String codigo_postal)
        {
        
        Localidad localidad = interLocalidad.findLocalidad(id);
        
        localidad.setCiudad(ciudad);
        localidad.setProvincia(provincia);
        localidad.setPais(pais);
        localidad.setCodigo_postal(codigo_postal);
        
        interLocalidad.updateLocalidad(localidad);
        
        return localidad;
    }
}
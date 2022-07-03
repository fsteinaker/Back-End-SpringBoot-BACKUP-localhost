package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.dto.MensajeProyectos;
import com.baseDatos.FSteinaker.model.Proyectos;
import com.baseDatos.FSteinaker.service.IProyectosService;
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
public class ProyectosController {

    @Autowired
    private IProyectosService interProyectos;
    
    @GetMapping ("/proyectos")
    public List<Proyectos> getProyectos() {
        
        return interProyectos.getProyectos();
    }
    
    @PostMapping ("/proyectos/crear")
    public String createProyectos(@RequestBody Proyectos pro) {
        
        interProyectos.saveProyectos(pro);
        return "El proyecto fue creado correctamente";
    }
    
    @GetMapping("/proyectos/detalle/{id}")
    public ResponseEntity<Proyectos> getOnePersona(@PathVariable("id") Long id){
        if(!interProyectos.existProyectosById(id))
            return new ResponseEntity(new MensajeProyectos("El proyecto que buscas no existe."), HttpStatus.NOT_FOUND);
        Proyectos per = interProyectos.findProyectos(id);
        return new ResponseEntity(per, HttpStatus.OK);
    }
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public String deleteProyectos (@PathVariable Long id) {
        
        interProyectos.deleteProyectos(id);
        return "El proyecto fue eliminado correctamente";
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public ResponseEntity<?> updateProyectos (@RequestBody Proyectos pro){
        interProyectos.updateProyectos(pro);
        return new ResponseEntity(new MensajeProyectos("proyecto editado con exito"), HttpStatus.OK);
    }
    
}

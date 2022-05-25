package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.Proyectos;
import com.baseDatos.FSteinaker.service.IProyectosService;
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
    
    @DeleteMapping ("/proyectos/borrar/{id}")
    public String deleteProyectos (@PathVariable Long id) {
        
        interProyectos.deleteProyectos(id);
        return "El proyecto fue eliminado correctamente";
    }    
 
    @PutMapping("/proyectos/editar/{id}")
    public Proyectos updateUsuario(@PathVariable Long id,
                                 @RequestParam String proyectos,
                                 @RequestParam String detalle){
        
        Proyectos pro = interProyectos.findProyectos(id);
        
        pro.setProyectos(proyectos);
        pro.setDetalle(detalle);
        
        interProyectos.updateProyectos(pro);
        
        return pro;        
    }    
}

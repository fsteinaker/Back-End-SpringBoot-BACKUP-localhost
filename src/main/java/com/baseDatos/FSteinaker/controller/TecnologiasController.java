package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.Tecnologias;
import com.baseDatos.FSteinaker.service.ITecnologiasService;
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
public class TecnologiasController {
   
    @Autowired
    private ITecnologiasService interTecnologias;
    
    @GetMapping ("/tecnologias")
    public List<Tecnologias> getTecnologias() {
        
        return interTecnologias.getTecnologias();
    }
    
    @PostMapping ("/tecnologias/crear")
    public String createTecnologias(@RequestBody Tecnologias tec) {
        
        interTecnologias.saveTecnologias(tec);
        return "La tecnologia fue creada correctamente";
    }
    
    @DeleteMapping ("/tecnologias/borrar/{id}")
    public String deleteTecnologias (@PathVariable Long id) {
        
        interTecnologias.deleteTecnologias(id);
        return "La tecnologia fue eliminada correctamente";
    }    
 
    @PutMapping("/tecnologias/editar/{id}")
    public Tecnologias updateTecnologias(@PathVariable Long id,
                                 @RequestParam String tecnologias){
        
        Tecnologias tec = interTecnologias.findTecnologias(id);
        
        tec.setTecnologias(tecnologias);
        
        interTecnologias.updateTecnologias(tec);
        
        return tec;
        
    }
    
}
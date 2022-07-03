package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.dto.MensajeExperiencia;
import com.baseDatos.FSteinaker.model.ExpLaboral;
import com.baseDatos.FSteinaker.service.IExpLaboralService;
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
public class ExpLaboralController {
    
    @Autowired
    private IExpLaboralService interExpLaboral;
    
    @GetMapping ("/explaboral")
    public List<ExpLaboral> getExpLaboral() {        
        return interExpLaboral.getExpLaboral();        
    }
    
    @GetMapping("/explaboral/detalle/{id}")
    public ResponseEntity<ExpLaboral> getExpLaboral(@PathVariable("id") Long id){
        if(!interExpLaboral.existExpLaboralById(id))
            return new ResponseEntity(new MensajeExperiencia("El antecedente laboral que buscas no existe."), HttpStatus.NOT_FOUND);
        ExpLaboral explab = interExpLaboral.findExpLaboral(id);
        return new ResponseEntity(explab, HttpStatus.OK);
    }
    
    @PostMapping ("/explaboral/crear")
    public String createExpLaboral(@RequestBody ExpLaboral explaboral) {
        
        interExpLaboral.saveExpLaboral(explaboral);
        return "La experiencia laboral fue creada correctamente";
    }
    
    @DeleteMapping ("/explaboral/borrar/{id}")
    public String deleteExpLaboral (@PathVariable Long id) {
        
        interExpLaboral.deleteExpLaboral(id);
        return "La experiencia laboral fue eliminada correctamente";
    }    
 
    @PutMapping("/explaboral/editar/{id}")
    public ResponseEntity<?> updateExpLaboral (@RequestBody ExpLaboral explab){
        interExpLaboral.updateExpLaboral(explab);
        return new ResponseEntity(new MensajeExperiencia("experiencia editada con exito"), HttpStatus.OK);
    }
    
}

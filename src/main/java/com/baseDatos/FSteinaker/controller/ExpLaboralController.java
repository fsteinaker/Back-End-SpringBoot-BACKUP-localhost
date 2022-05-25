package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.ExpLaboral;
import com.baseDatos.FSteinaker.service.IExpLaboralService;
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
public class ExpLaboralController {
    
    @Autowired
    private IExpLaboralService interExpLaboral;
    
    @GetMapping ("/explaboral")
    public List<ExpLaboral> getExpLaboral() {
        
        return interExpLaboral.getExpLaboral();
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
    public ExpLaboral updateExpLaboral(@PathVariable Long id,
                                 @RequestParam String empleo_cargo,
                                 @RequestParam String empresa,
                                 @RequestParam String fecha_inicio,
                                 @RequestParam String fecha_final,
                                 @RequestParam String detalle,
                                 @RequestParam String imagen){
        
        ExpLaboral explab = interExpLaboral.findExpLaboral(id);
        
        explab.setEmpleo_cargo(empleo_cargo);
        explab.setEmpresa(empresa);
        explab.setDetalle(detalle);
        explab.setFecha_inicio(fecha_inicio);
        explab.setFecha_final(fecha_final);
        explab.setImagen(imagen);
        
        interExpLaboral.updateExpLaboral(explab);
        
        return explab;
        
    }
    
}

package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.Persona;
import com.baseDatos.FSteinaker.service.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    private IPersonaService interPersona;
    
    @GetMapping ("/persona")
    public List<Persona> getPersona() {
        
        return interPersona.getPersona();
    }
    
    @PostMapping ("/persona/crear")
    public String createPersona(@RequestBody Persona per) {
        
        interPersona.savePersona(per);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/persona/borrar/{id}")
    public String deletePersona (@PathVariable Long id) {
        
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }    
 
    @PutMapping("/persona/editar/{id}")
    public Persona updatePersona(@PathVariable Long id,
                                 @RequestParam String apellido,
                                 @RequestParam String nombre,
                                 @RequestParam int edad,
                                 @RequestParam String profesion,
                                 @RequestParam String perfil,
                                 @RequestParam String fecha_nacimiento,
                                 @RequestParam String telefono,
                                 @RequestParam String correo,
                                 @RequestParam String imagen){
               
        Persona per = interPersona.findPersona(id);
        
        per.setApellido(apellido);
        per.setNombre(nombre);
        per.setEdad(edad);
        per.setProfesion(profesion);
        per.setPerfil(perfil);
        per.setFecha_nacimiento(fecha_nacimiento);
        per.setTelefono(telefono);
        per.setCorreo(correo);
        per.setImagen(imagen);
                
        interPersona.updatePersona(per);
        
        return per;        
    }    
    
}
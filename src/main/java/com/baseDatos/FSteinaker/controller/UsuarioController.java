package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.model.Usuario;
import com.baseDatos.FSteinaker.service.IUsuarioService;
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

public class UsuarioController {
    
    @Autowired
    private IUsuarioService interUsuario;
    
    @GetMapping ("/usuario")
    public List<Usuario> getUsuario() {
        
        return interUsuario.getUsuario();
    }
    
    @PostMapping ("/usuario/crear")
    public String createUsuario(@RequestBody Usuario usu) {
        
        interUsuario.saveUsuario(usu);
        return "El usuario fue creado correctamente";
    }
    
    @DeleteMapping ("/usuario/borrar/{id}")
    public String deleteUsuario (@PathVariable Long id) {
        
        interUsuario.deleteUsuario(id);
        return "El usuario fue eliminado correctamente";
    }    
 
    @PutMapping("/usuario/editar/{id}")
    public Usuario updateUsuario(@PathVariable Long id,
                                 @RequestParam String email,
                                 @RequestParam String password){
        
        Usuario usu = interUsuario.findUsuario(id);
        
        usu.setUsuario(email, password);
        
        interUsuario.updateUsuario(usu);
        
        return usu;
        
    }
}

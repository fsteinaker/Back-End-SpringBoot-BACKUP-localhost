package com.baseDatos.FSteinaker.controller;
import com.baseDatos.FSteinaker.dto.MensajeUsuario;
import com.baseDatos.FSteinaker.model.Usuario;
import com.baseDatos.FSteinaker.service.IUsuarioService;
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

public class UsuarioController {
    
    @Autowired
    private IUsuarioService interUsuario;
    
    @GetMapping ("/usuario")
    public List<Usuario> getUsuario() {
        
        return interUsuario.getUsuario();
    }
    
    @GetMapping("/usuario/detalle/{id}")
    public ResponseEntity<Usuario> getOneUsuario(@PathVariable("id") Long id){
        if(!interUsuario.existUsuarioById(id))
            return new ResponseEntity(new MensajeUsuario("El usuario que buscas no existe."), HttpStatus.NOT_FOUND);
        Usuario per = interUsuario.findUsuario(id);
        return new ResponseEntity(per, HttpStatus.OK);
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
    public ResponseEntity<?> updateUsuario (@RequestBody Usuario usu){
        interUsuario.updateUsuario(usu);
        return new ResponseEntity(new MensajeUsuario("usuario editado con exito"), HttpStatus.OK);
    }
    
}

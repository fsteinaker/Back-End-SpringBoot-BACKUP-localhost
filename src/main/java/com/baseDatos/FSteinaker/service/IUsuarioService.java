package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Usuario;
import java.util.List;

public interface IUsuarioService {
    
public List<Usuario> getUsuario ();
    
    public void saveUsuario (Usuario usu);
    
    public void updateUsuario (Usuario usu);
    
    public void deleteUsuario (Long id);
    
    public Usuario findUsuario (Long id);
    
}

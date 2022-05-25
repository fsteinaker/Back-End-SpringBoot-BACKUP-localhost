package com.baseDatos.FSteinaker.service;

import com.baseDatos.FSteinaker.model.Usuario;
import com.baseDatos.FSteinaker.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    private UsuarioRepository usuRepositoty;

    @Override
    public List<Usuario> getUsuario() {
        List<Usuario> listaUsuario = usuRepositoty.findAll();
        return listaUsuario;
    }

    @Override
    public void saveUsuario(Usuario usu) {
        usuRepositoty.save(usu);
    }

    @Override
    public void updateUsuario(Usuario usu) {
        usuRepositoty.save(usu);
    }

    @Override
    public void deleteUsuario(Long id) {
        usuRepositoty.deleteById(id);
    }

    @Override
    public Usuario findUsuario(Long id) {
        Usuario usu = usuRepositoty.findById(id).orElse(null);
        return usu;
        }

    }

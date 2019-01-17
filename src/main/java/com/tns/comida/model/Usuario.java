package com.tns.comida.model;

import com.tns.comida.entity.UsuarioEntity;
import com.tns.comida.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("com.tns.comida.model.Usuario")
public class Usuario {
    @Autowired
    @Qualifier("com.tns.comida.repository.UsuarioRepository")
    UsuarioRepository usuarioRepository;

    public void registrar(UsuarioEntity usuario){
        if(usuario.getUsuario() != null){
            usuarioRepository.save(usuario);
        }
    }
}

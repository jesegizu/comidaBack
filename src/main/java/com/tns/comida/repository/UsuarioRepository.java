package com.tns.comida.repository;

import com.tns.comida.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("com.tns.comida.repository.UsuarioRepository")
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Serializable> {

}

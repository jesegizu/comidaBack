package com.tns.comida.repository;

import com.tns.comida.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("com.tns.comida.repository.PedidoRepository")
public interface PedidoRepository extends JpaRepository<PedidoEntity, Serializable> {
}

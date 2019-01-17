package com.tns.comida.repository;

import com.tns.comida.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("com.tns.comida.repository.ProductoRepository")
public interface ProductoRepository extends JpaRepository<ProductoEntity, Serializable> {
}

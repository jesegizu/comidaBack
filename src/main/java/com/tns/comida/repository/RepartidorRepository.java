package com.tns.comida.repository;

import com.tns.comida.entity.RepartidorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("com.tns.comida.repository.RepartidorRepository")
public interface RepartidorRepository extends JpaRepository<RepartidorEntity, Serializable> {
}

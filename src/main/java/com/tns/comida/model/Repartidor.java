package com.tns.comida.model;

import com.tns.comida.entity.RepartidorEntity;
import com.tns.comida.repository.RepartidorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.tns.comida.model.Repartidor")
public class Repartidor {

    @Autowired
    @Qualifier("com.tns.comida.repository.RepartidorRepository")
    RepartidorRepository repartidorRepository;

    public List<RepartidorEntity>mostrarRepartidor(){
        return repartidorRepository.findAll();
    }
}

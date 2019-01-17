package com.tns.comida.model;

import com.tns.comida.entity.ProductoEntity;
import com.tns.comida.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.tns.comida.model.Producto")
public class Producto {
    @Autowired
    @Qualifier("com.tns.comida.repository.ProductoRepository")
    ProductoRepository productoRepository;

    public List<ProductoEntity>mostrarProductos(){
        return productoRepository.findAll();
    }
}

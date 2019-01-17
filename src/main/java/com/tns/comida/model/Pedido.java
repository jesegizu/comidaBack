package com.tns.comida.model;

import com.tns.comida.entity.PedidoEntity;
import com.tns.comida.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("com.tns.comida.model.Pedido")
public class Pedido {

    @Autowired
    @Qualifier("com.tns.comida.repository.PedidoRepository")
    PedidoRepository pedidoRepository;

    public List<PedidoEntity>consultarTodos(){
        return pedidoRepository.findAll();
    }

    public int hacerPedido(PedidoEntity pedidoEntity){
        if(pedidoEntity!= null) {
            pedidoRepository.save(pedidoEntity);
            return pedidoEntity.getIdPedido();
        }
        return 0;
    }
}

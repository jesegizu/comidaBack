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
        double precioVenta = 0;
        if(pedidoEntity!= null) {
            if(pedidoEntity.isHamburguesa()){
                precioVenta+=10200;
            }
            if(pedidoEntity.isHelado()){
                precioVenta+=3000;
            }
            if(pedidoEntity.isPapas()){
                precioVenta+=1300;
            }
            if(pedidoEntity.isRefresco()){
                precioVenta+=2500;
            }
            pedidoEntity.setPrecioVenta(precioVenta);
            pedidoRepository.save(pedidoEntity);
            return pedidoEntity.getIdPedido();
        }
        return 0;
    }
}

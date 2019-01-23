package com.tns.comida.controller;

import com.tns.comida.dto.PedidoDTO;
import com.tns.comida.entity.PedidoEntity;
import com.tns.comida.entity.ProductoEntity;
import com.tns.comida.entity.RepartidorEntity;
import com.tns.comida.entity.UsuarioEntity;
import com.tns.comida.model.Pedido;
import com.tns.comida.model.Producto;
import com.tns.comida.model.Repartidor;
import com.tns.comida.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Controller {

    @Autowired
    @Qualifier("com.tns.comida.model.Usuario")
    Usuario usuario;

    @Autowired
    @Qualifier("com.tns.comida.model.Pedido")
    Pedido pedido;

    @Autowired
    @Qualifier("com.tns.comida.model.Repartidor")
    Repartidor repartidor;

    @Autowired
    @Qualifier("com.tns.comida.model.Producto")
    Producto producto;

    @GetMapping("/pedidos")
    public List<PedidoEntity>mostrarPedido(){
        return pedido.consultarTodos();
    }

    @GetMapping("/repartidor")
    public List<RepartidorEntity>mostrarRepartidor(){
        return repartidor.mostrarRepartidor();
    }

    @GetMapping("/productos")
    public List<ProductoEntity>mostrarProducto(){
        return producto.mostrarProductos();
    }

    @PostMapping("/registrar")
    public void registrarUsuario(@RequestBody UsuarioEntity user){
        usuario.registrar(user);
    }

    @PostMapping("/comprar")
    public int hacerPedido(@RequestBody PedidoEntity pedidoEntity){
        return pedido.hacerPedido(pedidoEntity);
    }

    /*@PostMapping("/repartidor")
    public void asignarPedidosARepartidor(@RequestBody List<PedidoEntity> listPedidoEntity){
        pedido.asignarPedidosARepartidor(listPedidoEntity);
    }*/

    @PostMapping("/asignar/repartidor")
    public void asignarPedidosRepartidor(@RequestBody List<PedidoDTO> listPedidoDTO){
        pedido.asignarPedidosARepartidor(listPedidoDTO);
    }
}

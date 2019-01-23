package com.tns.comida.dto;

public class PedidoDTO {

    private int idRepartidor;
    private int idPedido;

    public PedidoDTO() {
        super();
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}

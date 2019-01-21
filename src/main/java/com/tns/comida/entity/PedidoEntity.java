package com.tns.comida.entity;

import javax.persistence.*;

@Entity
@Table(name="PEDIDO")
public class PedidoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPedido;
    @Column
    private String nombreCliente;
    @Column
    private Double precioVenta;
    @Column
    private String direccion;
    @Column
    private boolean papas;
    @Column
    private boolean refresco;
    @Column
    private boolean helado;
    @Column
    private boolean hamburguesa;
    @Column
    private int idRepartidor;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setIdCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isPapas() {
        return papas;
    }

    public void setPapas(boolean papas) {
        this.papas = papas;
    }

    public boolean isRefresco() {
        return refresco;
    }

    public void setRefresco(boolean refresco) {
        this.refresco = refresco;
    }

    public boolean isHelado() {
        return helado;
    }

    public void setHelado(boolean helado) {
        this.helado = helado;
    }

    public boolean isHamburguesa() {
        return hamburguesa;
    }

    public void setHamburguesa(boolean hamburguesa) {
        this.hamburguesa = hamburguesa;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }
}

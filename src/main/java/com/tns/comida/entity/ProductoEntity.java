package com.tns.comida.entity;

import javax.persistence.*;

@Entity
@Table(name="PRODUCTO")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProducto;

    @Column
    private String nombreProducto;

    @Column
    private Double valorProducto;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombreProducto;
    }

    public void setNombre(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Double getValorProducto() {
        return valorProducto;
    }

    public void setValorProducto(Double valorProducto) {
        this.valorProducto = valorProducto;
    }
}

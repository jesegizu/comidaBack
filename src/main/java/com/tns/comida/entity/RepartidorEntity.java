package com.tns.comida.entity;

import javax.persistence.*;

@Entity
@Table(name="REPARTIDOR")
public class RepartidorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idRepartidor;
    @Column
    private String nombreRepartidor;
    @Column
    private String apellidoRepartidor;
    @Column
    private boolean disponibilidad;

    public int getIdRepartidor() {
        return idRepartidor;
    }

    public void setIdRepartidor(int idRepartidor) {
        this.idRepartidor = idRepartidor;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public String getApellidoRepartidor() {
        return apellidoRepartidor;
    }

    public void setApellidoRepartidor(String apellidoRepartidor) {
        this.apellidoRepartidor = apellidoRepartidor;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}

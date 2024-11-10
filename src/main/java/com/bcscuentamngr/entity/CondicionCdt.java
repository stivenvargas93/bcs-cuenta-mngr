package com.bcscuentamngr.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "condiciones_cdt")
public class CondicionCdt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto_min")
    private Double montoMin;

    @Column(name = "monto_max")
    private Double montoMax;

    @Column(name = "plazo_min")
    private Integer plazoMin;

    @Column(name = "plazo_max")
    private Integer plazoMax;

    @Column(name = "tasa")
    private Double tasa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getMontoMin() {
        return montoMin;
    }

    public void setMontoMin(Double montoMin) {
        this.montoMin = montoMin;
    }

    public Double getMontoMax() {
        return montoMax;
    }

    public void setMontoMax(Double montoMax) {
        this.montoMax = montoMax;
    }

    public Integer getPlazoMin() {
        return plazoMin;
    }

    public void setPlazoMin(Integer plazoMin) {
        this.plazoMin = plazoMin;
    }

    public Integer getPlazoMax() {
        return plazoMax;
    }

    public void setPlazoMax(Integer plazoMax) {
        this.plazoMax = plazoMax;
    }

    public Double getTasa() {
        return tasa;
    }

    public void setTasa(Double tasa) {
        this.tasa = tasa;
    }
}

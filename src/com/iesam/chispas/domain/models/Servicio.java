package com.iesam.chispas.domain.models;

public class Servicio implements Item{
    private Integer codServicio;
    private String nombre;
    public Double precio;
    public Double tipoIva;

    @Override
    public Integer getCodigo() {
        return this.codServicio;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Double getPrecio() {
        return precio;
    }

    @Override
    public Double getTipoIva() {
        return tipoIva;
    }

    @Override
    public Double getTotal() {
        return precio * tipoIva;
    }

    public Integer getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(Integer codServicio) {
        this.codServicio = codServicio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTipoIva(Double tipoIva) {
        this.tipoIva = tipoIva;
    }
}

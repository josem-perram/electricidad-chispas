package com.iesam.chispas.domain.models;

public class Producto implements Item{
    private Integer codProducto;
    private String nombre;
    public String marca;
    public String modelo;
    public Double precio;
    public Double tipoIva;

    @Override
    public Integer getCodigo() {
        return this.codProducto;
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

    public Integer getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(Integer codProducto) {
        this.codProducto = codProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setTipoIva(Double tipoIva) {
        this.tipoIva = tipoIva;
    }
}

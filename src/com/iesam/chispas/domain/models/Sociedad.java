package com.iesam.chispas.domain.models;

public class Sociedad implements Cliente {
    private Integer codCliente;
    private String razonSocial;
    private String nif;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String email;
    private String telefono;

    @Override
    public Integer getCodCliente() {
        return this.codCliente;
    }

    @Override
    public String getNombre() {
        return razonSocial;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String getPoblacion() {
        return poblacion;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }


    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

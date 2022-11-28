package com.iesam.chispas;

public class Autonomo implements Cliente {
    private Integer codCliente;
    private String nombre;
    private String apellidos;
    private String dni;
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
        return this.nombre + " " + this.apellidos;
    }

    @Override
    public String getDireccion() {
        return this.direccion;
    }

    @Override
    public String getPoblacion() {
        return this.poblacion;
    }

    @Override
    public String getProvincia() {
        return this.provincia;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }


    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

package com.iesam.chispas.domain.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private Integer codFactura;
    private Date fechaFactura;
    private Cliente cliente;
    private List<Item> items = new ArrayList<>(); //Esto siempre es así
    private Double baseImponible;
    private Double total;

    public Integer getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(Integer codFactura) {
        this.codFactura = codFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }
}

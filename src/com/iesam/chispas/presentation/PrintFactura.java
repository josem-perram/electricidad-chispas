package com.iesam.chispas.presentation;

import com.iesam.chispas.domain.models.Factura;

public class PrintFactura {

    public void print(Factura factura) {
        System.out.println("Código de Factura:" + factura.getCodFactura());

        //Clientes
        System.out.println("Cif/Nif Cliente:" + factura.getCliente().getNumId());
        System.out.println("============================================");
        System.out.println("Nombre Cliente:" + factura.getCliente().getNombre());
        System.out.println("Dirección Cliente:" + factura.getCliente().getDireccion());
        System.out.println("Población Cliente:" + factura.getCliente().getPoblacion());
        System.out.println("Provincia Cliente:" + factura.getCliente().getProvincia());
        System.out.println("============================================");

        //Items
        for (int i = 0; i < factura.getItems().size(); i++) {
            System.out.println("Código:" + factura.getItems().get(i).getCodigo());
            System.out.println("Nombre:" + factura.getItems().get(i).getNombre());
            System.out.println("Precio:" + factura.getItems().get(i).getPrecio());
            System.out.println("Tipo IVA:" + factura.getItems().get(i).getTipoIva());
            System.out.println("Total:" + factura.getItems().get(i).getTotal());
        }
        System.out.println("============================================");

        System.out.println("Base Imponible:" + factura.getBaseImponible());
        System.out.println("Total:" + factura.getTotal());
    }
}

package com.iesam.chispas.presentation;

import com.iesam.chispas.domain.models.*;
import com.iesam.chispas.domain.usecase.*;

import java.util.Date;

public class Main {

    public static void main(String args[]) {
        Main main = new Main();
        main.crearClientes();
        main.crearItems();
        main.crearFactura();
        main.mostrarFactura();
    }

    private void crearClientes() {
        //Creación cliente Autónomo
        Autonomo autonomo = new Autonomo();
        autonomo.setCodCliente(1);
        autonomo.setNombre("Chema");
        autonomo.setApellidos("Apellido1 Apellido2");
        autonomo.setPoblacion("Avila");
        autonomo.setProvincia("Avila");
        autonomo.setDireccion("Dir Avila");
        autonomo.setDni("00000000A");
        autonomo.setEmail("email@email.es");
        autonomo.setTelefono("600000000");

        //Creación cliente Sociedad
        Sociedad sociedad = new Sociedad();
        sociedad.setCodCliente(2);
        sociedad.setRazonSocial("Empresa S.L");
        sociedad.setPoblacion("Madrid");
        sociedad.setProvincia("Madrid");
        sociedad.setDireccion("Av. Madrid");
        sociedad.setCif("11111111X");
        sociedad.setEmail("email@email.com");
        sociedad.setTelefono("70000000");

        //Creo un caso de uso para crear clientes. Primero ejecuto el autónomo y después la sociedad
        CrearClienteUseCase crearClienteUseCase = new CrearClienteUseCase();
        crearClienteUseCase.execute(autonomo);
        crearClienteUseCase.execute(sociedad);
    }

    private void crearItems() {
        Producto bombilla = new Producto();
        bombilla.setCodProducto(1);
        bombilla.setNombre("Bombilla");
        bombilla.setMarca("JBL");
        bombilla.setModelo("XSDF-1022");
        bombilla.setPrecio(1.5);
        bombilla.setTipoIva(0.21);

        Producto enchufe = new Producto();
        enchufe.setCodProducto(2);
        enchufe.setNombre("Enchufe");
        enchufe.setMarca("Schuco 123");
        enchufe.setModelo("White");
        enchufe.setPrecio(2.5);
        enchufe.setTipoIva(0.21);

        Servicio manoDeObra = new Servicio();
        manoDeObra.setCodServicio(3);
        manoDeObra.setNombre("Mano de Obra");
        manoDeObra.setPrecio(30.0);
        manoDeObra.setTipoIva(0.21);

        Servicio desplazamiento = new Servicio();
        desplazamiento.setCodServicio(4);
        desplazamiento.setNombre("Desplazamiento");
        desplazamiento.setPrecio(0.19);
        desplazamiento.setTipoIva(0.21);

        CrearItemUseCase crearItemUseCase = new CrearItemUseCase();
        crearItemUseCase.execute(bombilla);
        crearItemUseCase.execute(enchufe);
        crearItemUseCase.execute(manoDeObra);
        crearItemUseCase.execute(desplazamiento);
    }

    private void crearFactura() {
        Factura factura = new Factura(); //<- Creo la factura
        factura.setCodFactura(1);
        factura.setFechaFactura(new Date());
        factura.setBaseImponible(30.0);
        factura.setTotal(120.00);

        //Recupero un cliente al azar y le añado a la factura
        ObtenerClienteUseCase obtenerClienteUseCase = new ObtenerClienteUseCase();
        Cliente cliente = obtenerClienteUseCase.execute("00000000A");

        factura.setCliente(cliente);

        //Recupero productos y los añado a la factura
        ObtenerItemUseCase obtenerItemUseCase = new ObtenerItemUseCase();
        Item enchufe = obtenerItemUseCase.execute(2);
        Item manoDeObra = obtenerItemUseCase.execute(3);

        factura.addItem(enchufe);
        factura.addItem(manoDeObra);

        //Crear la factura
        CrearFacturaUseCase crearFacturaUseCase = new CrearFacturaUseCase();
        crearFacturaUseCase.execute(factura);
    }

    private void mostrarFactura() {
        //Recupero la factura
        ObtenerFacturaUseCase obtenerFacturaUseCase = new ObtenerFacturaUseCase();
        Factura factura = obtenerFacturaUseCase.execute(1);

        //Imprimo la factura
        PrintFactura printFactura = new PrintFactura();
        printFactura.print(factura);
    }
}

package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.FacturaDataStore;
import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Factura;
import com.iesam.chispas.domain.models.Item;

/**
 * Caso de uso que me permite guardar un cliente.
 */
public class CrearFacturaUseCase {

    private FacturaDataStore dataStore = FacturaDataStore.getInstance();

    public void execute(Factura factura) {
        dataStore.guardar(factura);
    }
}

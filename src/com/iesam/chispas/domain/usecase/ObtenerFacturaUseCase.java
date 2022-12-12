package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.data.FacturaDataStore;
import com.iesam.chispas.domain.models.Cliente;
import com.iesam.chispas.domain.models.Factura;

public class ObtenerFacturaUseCase {

    private FacturaDataStore dataStore = FacturaDataStore.getInstance();

    public Factura execute(Integer codFactura) {
        return dataStore.findById(codFactura);
    }

}

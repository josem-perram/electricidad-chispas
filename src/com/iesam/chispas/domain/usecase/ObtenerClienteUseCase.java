package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.domain.models.Cliente;

public class ObtenerClienteUseCase {

    private ClienteDataStore dataStore = ClienteDataStore.getInstance();

    public Cliente execute(String codigo) {
        return dataStore.findById(codigo);
    }

}

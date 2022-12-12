package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.domain.models.Cliente;

import java.util.List;

public class ObtenerClientesUseCase {

    private ClienteDataStore dataStore = ClienteDataStore.getInstance();

    public List<Cliente> execute() {
        return dataStore.getAll();
    }

}

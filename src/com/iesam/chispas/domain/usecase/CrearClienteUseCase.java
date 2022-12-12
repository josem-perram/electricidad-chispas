package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.domain.models.Cliente;

/**
 * Caso de uso que me permite guardar un cliente.
 */
public class CrearClienteUseCase {

    private ClienteDataStore dataStore = ClienteDataStore.getInstance();

    public void execute(Cliente cliente) {
        dataStore.guardar(cliente);
    }
}

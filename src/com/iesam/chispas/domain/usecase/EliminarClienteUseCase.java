package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.domain.models.Autonomo;
import com.iesam.chispas.domain.models.Cliente;

/**
 * Eliminar un cliente
 */
public class EliminarClienteUseCase {

    private ClienteDataStore dataStore = ClienteDataStore.getInstance();

    /**
     * Método
     */
    public void execute(Cliente cliente) {
        dataStore.eliminar(cliente);
    }

}

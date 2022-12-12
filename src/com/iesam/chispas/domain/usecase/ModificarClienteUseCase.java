package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.domain.models.Autonomo;
import com.iesam.chispas.domain.models.Cliente;

/**
 * Caso de uso que me permite recuperar un listado de clientes.
 */
public class ModificarClienteUseCase {

    private ClienteDataStore dataStore = ClienteDataStore.getInstance();

    public void execute(Cliente cliente) {
        dataStore.guardar(cliente);
    }

}

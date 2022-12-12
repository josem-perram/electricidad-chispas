package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Item;
import com.iesam.chispas.domain.models.Producto;

/**
 * Caso de uso que me permite recuperar un listado de clientes.
 */
public class ModificarItemUseCase {

    private ItemDataStore dataStore = ItemDataStore.getInstance();

    public void execute(Item item) {
        dataStore.guardar(item);
    }

}

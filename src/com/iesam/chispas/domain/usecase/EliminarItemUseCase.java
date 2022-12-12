package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Item;
import com.iesam.chispas.domain.models.Producto;

/**
 * Eliminar un cliente
 */
public class EliminarItemUseCase {

    private ItemDataStore dataStore = ItemDataStore.getInstance();

    /**
     * Método
     */
    public void execute(Item item) {
        dataStore.eliminar(item);
    }

}

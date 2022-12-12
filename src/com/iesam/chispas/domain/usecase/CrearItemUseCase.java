package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Item;

/**
 * Caso de uso que me permite guardar un cliente.
 */
public class CrearItemUseCase {

    private ItemDataStore dataStore = ItemDataStore.getInstance();

    public void execute(Item item) {
        dataStore.guardar(item);
    }
}

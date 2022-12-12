package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ClienteDataStore;
import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Cliente;
import com.iesam.chispas.domain.models.Item;

public class ObtenerItemUseCase {

    private ItemDataStore dataStore = ItemDataStore.getInstance();

    public Item execute(Integer codItem) {
        return dataStore.findById(codItem);
    }

}

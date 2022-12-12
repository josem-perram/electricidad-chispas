package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.ItemDataStore;
import com.iesam.chispas.domain.models.Item;

import java.util.List;

public class ObtenerItemsUseCase {

    private ItemDataStore dataStore = ItemDataStore.getInstance();

    public List<Item> execute() {
        return dataStore.getAll();
    }

}

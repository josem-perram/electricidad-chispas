package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Cliente;
import com.iesam.chispas.domain.models.Item;

import java.util.List;
import java.util.TreeMap;

public class ItemDataStore {

    private static ItemDataStore instance = null;

    private TreeMap<Integer, Item> dataStore = new TreeMap<>();

    public void guardar(Item item) {
        dataStore.put(item.getCodigo(), item);
    }

    public void eliminar(Item item) {
        dataStore.remove(item.getCodigo());
    }

    public List<Item> getAll() {
        return dataStore.values().stream().toList();
    }

    public Item findById(Integer codigo) {
        return dataStore.get(codigo);
    }

    public static ItemDataStore getInstance() {
        if (instance == null) {
            instance = new ItemDataStore();
        }
        return instance;
    }
}

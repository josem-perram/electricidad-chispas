package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Cliente;

import java.util.List;
import java.util.TreeMap;

public class ClienteDataStore {

    private static ClienteDataStore instance = null;

    private TreeMap<String, Cliente> dataStore = new TreeMap<>();

    public void guardar(Cliente cliente) {
        dataStore.put(cliente.getNumId(), cliente);
    }

    public void eliminar(Cliente cliente) {
        dataStore.remove(cliente.getNumId());
    }

    public List<Cliente> getAll() {
        return dataStore.values().stream().toList();
    }

    public Cliente findById(String codigo) {
        return dataStore.get(codigo);
    }

    public static ClienteDataStore getInstance() {
        if (instance == null) {
            instance = new ClienteDataStore();
        }
        return instance;
    }
}

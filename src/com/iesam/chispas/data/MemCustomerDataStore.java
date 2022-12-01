package com.iesam.chispas.data;

import com.iesam.chispas.domain.models.Cliente;

import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<Integer, Cliente> dataStore = new TreeMap<>();

    @Override
    public void saveCustomer(Cliente cliente) {
        dataStore.put(cliente.getCodCliente(), cliente);
    }

    @Override
    public void deleteCustomer(Cliente cliente) {
        dataStore.remove(cliente.getCodCliente());
    }

    @Override
    public void updateCustomer(Cliente cliente) {
        dataStore.replace(cliente.getCodCliente(), cliente);
    }

    @Override
    public List<Cliente> getAllCustomers() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Cliente findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}

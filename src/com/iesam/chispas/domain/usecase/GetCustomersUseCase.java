package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Cliente;

import java.util.List;

/**
 * Caso de uso que me permite recuperar un listado de clientes.
 */
public class GetCustomersUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomersUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public List<Cliente> execute() {
        return customerDataStore.getAllCustomers();
    }

}

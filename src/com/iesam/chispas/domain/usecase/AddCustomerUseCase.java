package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Cliente;

/**
 * Caso de uso que me permite guardar un cliente.
 */
public class AddCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public void execute(Cliente customer) {
        customerDataStore.saveCustomer(customer);
    }
}

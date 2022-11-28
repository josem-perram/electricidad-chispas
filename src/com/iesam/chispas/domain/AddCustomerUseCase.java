package com.iesam.chispas.domain;

import com.iesam.chispas.Cliente;
import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;


public class AddCustomerUseCase {

    public void execute(Cliente customer) {
        CustomerDataStore customerDataStore = new MemCustomerDataStore();
        customerDataStore.saveCustomer(customer);
    }
}

package com.iesam.chispas.domain.usecase;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.domain.models.Cliente;

/**
 * Eliminar un cliente
 */
public class DeleteCustomerUseCase {

    //Propiedad/atributo
    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    /**
     * Método
     */
    public void execute(Cliente cliente){
        customerDataStore.deleteCustomer(cliente);
    }

}

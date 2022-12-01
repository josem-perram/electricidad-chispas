package com.iesam.chispas.presentation;

import com.iesam.chispas.data.CustomerDataStore;
import com.iesam.chispas.data.MemCustomerDataStore;
import com.iesam.chispas.domain.models.Autonomo;
import com.iesam.chispas.domain.models.Cliente;
import com.iesam.chispas.domain.models.Sociedad;
import com.iesam.chispas.domain.usecase.AddCustomerUseCase;
import com.iesam.chispas.domain.usecase.DeleteCustomerUseCase;
import com.iesam.chispas.domain.usecase.GetCustomersUseCase;
import com.iesam.chispas.domain.usecase.UpdateCustomerUseCase;

import java.util.List;

public class Main {

    public static void main(String args[]) {
        Autonomo autonomo = new Autonomo();
        autonomo.setCodCliente(1);
        autonomo.setNombre("Chema");
        autonomo.setApellidos("Apellido1 Apellido2");
        autonomo.setPoblacion("Avila");
        autonomo.setProvincia("Avila");
        autonomo.setDireccion("Dir Avila");
        autonomo.setDni("00000000A");
        autonomo.setEmail("email@email.es");
        autonomo.setTelefono("600000000");

        Sociedad sociedad = new Sociedad();
        sociedad.setCodCliente(2);
        sociedad.setRazonSocial("Empresa S.L");
        sociedad.setPoblacion("Madrid");
        sociedad.setProvincia("Madrid");
        sociedad.setDireccion("Av. Madrid");
        sociedad.setNif("11111111X");
        sociedad.setEmail("email@email.com");
        sociedad.setTelefono("70000000");

        //No optimo -> printAutonomos(autonomo);
        //No optimo -> printSociedades(sociedad);

        CustomerDataStore customerDataStore = new MemCustomerDataStore();

        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        addCustomerUseCase.execute(sociedad);

        GetCustomersUseCase getCustomersUseCase = new GetCustomersUseCase(customerDataStore);
        List<Cliente> customers = getCustomersUseCase.execute();
        for (int i = 0; i < customers.size(); i++) {
            printCliente(customers.get(i));
        }

        System.out.println("----- Eliminando ------");

        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        deleteCustomerUseCase.execute(autonomo);
        List<Cliente> customers2 = getCustomersUseCase.execute();
        for (int i = 0; i < customers2.size(); i++) {
            printCliente(customers2.get(i));
        }

        System.out.println("----- Modificando la Sociedad ------");
        sociedad.setEmail("0000000000");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        updateCustomerUseCase.execute(sociedad);
        List<Cliente> customers3 = getCustomersUseCase.execute();
        for (int i = 0; i < customers3.size(); i++) {
            printCliente(customers3.get(i));
        }
    }

    /**
     * No optimo
     *
     * @param autonomo
     */
    public static void printAutonomos(Autonomo autonomo) {
        System.out.println("Cod: " + autonomo.getCodCliente() + " Nombre: " + autonomo.getNombre());
    }

    /**
     * No optimo
     *
     * @param sociedad
     */
    public static void printSociedades(Sociedad sociedad) {
        System.out.println("Cod: " + sociedad.getCodCliente() + " Nombre: " + sociedad.getNombre());
    }

    public static void printCliente(Cliente cliente) {
        System.out.println("Cod: " + cliente.getCodCliente() + " Nombre: " + cliente.getNombre() + " Email: " + cliente.getEmail());
    }
}

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

        printCliente(autonomo);
        printCliente(sociedad);
    }

    /**
     * No optimo
     * @param autonomo
     */
    public static void printAutonomos(Autonomo autonomo){
        System.out.println("Cod: " + autonomo.getCodCliente() + " Nombre: " + autonomo.getNombre());
    }

    /**
     * No optimo
     * @param sociedad
     */
    public static void printSociedades(Sociedad sociedad){
        System.out.println("Cod: " + sociedad.getCodCliente() + " Nombre: " + sociedad.getNombre());
    }

    public static void printCliente(Cliente cliente){
        System.out.println("Cod: " + cliente.getCodCliente() + " Nombre: " + cliente.getNombre());
    }
}

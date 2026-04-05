
class Clientes {

    private String nombreClientes;
    private String correoClientes;
    private String lugarClientes;

    public Clientes(String nombreClientes, String correoClientes, String lugarClientes) {
        this.nombreClientes = nombreClientes;
        this.correoClientes = correoClientes;
        this.lugarClientes = lugarClientes;
    }

    public String nombrarClientes() {
        return this.nombreClientes;
    }

    public String direccionarClientes() {

    }

    public String localizarClientes() {
        return this.lugarClientes;
    }

    private String obtenerLugar() {
        return this.lugarClientes;
    }

    public void lugarClientes(String nombreClientes) {

    }
}

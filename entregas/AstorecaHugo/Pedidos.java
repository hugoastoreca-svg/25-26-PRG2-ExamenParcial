
class Pedidos {

    private String nombreComprador;
    private String productosComprados;
    private String fechaCompra;
    private String estadoCompra;

    public Pedidos(String nombreComprador, String productosComprados, String fechaCompra, String estadoCompra) {
        this.nombreComprador = nombreComprador;
        this.productosComprados = productosComprados;
        this.fechaCompra = fechaCompra;
        this.estadoCompra = estadoCompra;
    }

    public String nombrarComprador() {
        return this.nombreComprador;
    }

    public String seleccionarProductos() {
        return this.productosComprados;
    }

    public String calendarizarFecha() {
        return this.fechaCompra;
    }

    public String consultarEstado() {
        return this.estadoCompra;
    }

    public void preguntarEstado(String estadoCompra) {
        this.estadoCompra = estadoCompra;
        System.out.println("El estado de su compra es: " + estadoCompra);
    }

    public void realizarPedido(String productosComprados) {

    }
}

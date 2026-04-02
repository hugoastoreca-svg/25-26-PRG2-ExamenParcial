
class Productos {

    private String nombreProducto;
    private String codigoProducto;
    private int precioProducto;
    private int stockProducto;

    public Productos(String nombreProducto, String codigoProducto, int precioProducto, int stockProducto) {
        this.nombreProducto = nombreProducto;
        this.codigoProducto = codigoProducto;
        this.precioProducto = precioProducto;
        this.stockProducto = stockProducto;

    }

    public String nombrarProducto() {
        return this.nombreProducto;
    }

    public String nombrarCodigo() {
        return this.codigoProducto;
    }

    public int ponerPrecio() {

    }

    public int ponerStock() {

    }

    public int preguntarPrecio(String nombreProducto) {

    }

    public int preguntarStock(String nombreProducto, int stockProducto) {
        return this.stockProducto = stockProducto;
    }

}

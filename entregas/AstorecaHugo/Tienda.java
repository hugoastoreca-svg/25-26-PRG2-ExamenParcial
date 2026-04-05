
class Tienda {

    private String nombreTienda;

    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }
    private String obtenerNombre(){
        return this.nombreTienda;
    }
    public String nombrarTienda() {
        return this.nombreTienda;
    }

    public void mostrar() {
        imprimriDatos();
    }
    private void imprimriDatos(){
        System.out.println("Nombre de la tienda: " + this.nombreTienda);
    }
}

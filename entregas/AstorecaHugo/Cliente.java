class Cliente {
    public static void main(String[] args) {
        Tienda tienda = new tienda ("TechStore Online");
        Producto producto = new producto (" Laptop HP");
        Codigo codigo = new codigo ("L001");
        Precio precio = new precio ("800");
        Stock stock  = new stock ("10");
        Pedidos pedido = new pedido ("Laptop HP","01/03/2025","Enviado");
        Precio = precio.preguntarprecio();
        Estado = estado.preguntarEstado();
        Stock = stock.actualizarStock();

    }
}

package tp5.e5;

public class ItemPedido {
    Producto producto; // agregación
    int cantidad;

    public ItemPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double subtotal() {
        return producto.precio * cantidad;
    }

    @Override
    public String toString() {
        return cantidad + " x " + producto.nombre + " = $" + subtotal();
    }
}
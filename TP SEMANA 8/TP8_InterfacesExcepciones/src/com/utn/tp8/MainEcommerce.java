// MainEcommerce.java
package com.utn.tp8;

public class MainEcommerce {
    public static void main(String[] args) {
        Cliente cli = new Cliente("Santiago", "santi@example.com");
        Pedido pedido = new Pedido(cli);

        pedido.agregarProducto(new Producto("Teclado", 25_000));
        pedido.agregarProducto(new Producto("Mouse", 12_000));
        pedido.agregarProducto(new Producto("Auriculares", 30_000));

        double total = pedido.calcularTotal();
        System.out.println("Total del pedido: $" + String.format("%.2f", total));

        PagoConDescuento medio = new TarjetaCredito("Santiago",
                "4111-1111-1111-1111", 0.10); // 10% off
        double totalConDescuento = medio.aplicarDescuento(total);
        System.out.println("Total con descuento: $" + String.format("%.2f", totalConDescuento));

        if (medio.procesarPago(totalConDescuento)) {
            pedido.setEstado(Pedido.Estado.PAGADO);
            pedido.setEstado(Pedido.Estado.ENVIADO);
            pedido.setEstado(Pedido.Estado.ENTREGADO);
        }
    }
}
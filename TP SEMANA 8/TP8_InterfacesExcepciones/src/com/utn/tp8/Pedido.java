// Pedido.java
package com.utn.tp8;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    public enum Estado { CREADO, PAGADO, ENVIADO, ENTREGADO }

    private final List<Producto> productos = new ArrayList<>();
    private Estado estado = Estado.CREADO;
    private final Notificable cliente;

    public Pedido(Notificable cliente) {
        this.cliente = cliente;
        notificarEstado();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado nuevo) {
        this.estado = nuevo;
        notificarEstado();
    }

    private void notificarEstado() {
        if (cliente != null) {
            cliente.notificar("Estado del pedido: " + estado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }
}
package tp5.e5;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    String numero;
    Cliente cliente;              // asociación 1–1
    List<ItemPedido> items;       // composición

    public Pedido(String numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.items = new ArrayList<>();   // los ítems “viven” dentro del pedido
    }

    public void agregarItem(Producto p, int cantidad){
        items.add(new ItemPedido(p, cantidad));
    }

    public double total(){
        double t = 0;
        for (ItemPedido it : items) t += it.subtotal();
        return t;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido " + numero + " - " + cliente + "\n");
        for (ItemPedido it : items) sb.append("  ").append(it).append("\n");
        sb.append("TOTAL: $").append(total());
        return sb.toString();
    }
}
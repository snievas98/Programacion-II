package tp5.e4;

public class TarjetaDeCredito {
    String numero;
    String fechaVencimiento;
    Banco banco;      // agregación: existe independientemente
    Cliente cliente;  // asociación bidireccional

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco, Cliente cliente) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.cliente = cliente;
        if (cliente != null) cliente.setTarjeta(this);
    }

    @Override
    public String toString() {
        return "Tarjeta{" +
                "numero='" + numero + '\'' +
                ", vence=" + fechaVencimiento +
                ", banco=" + banco +
                ", cliente=" + cliente +
                '}';
    }
}
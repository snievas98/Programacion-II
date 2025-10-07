package tp7.kata5;

public class TarjetaCredito implements Pagable {
    private String titular;
    private String numero; // solo para demo

    public TarjetaCredito(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + String.format("%,.2f", monto) +
                " con Tarjeta de " + titular + " (" + enmascarar(numero) + ")");
    }

    private String enmascarar(String num) {
        if (num == null || num.length() < 4) return "****";
        return "**** **** **** " + num.substring(num.length() - 4);
    }
}
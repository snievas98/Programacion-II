package tp7.kata5;

public class Transferencia implements Pagable {
    private String cbuOrigen;
    private String cbuDestino;

    public Transferencia(String cbuOrigen, String cbuDestino) {
        this.cbuOrigen = cbuOrigen;
        this.cbuDestino = cbuDestino;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Transferencia de $" + String.format("%,.2f", monto) +
                " desde " + cbuOrigen + " hacia " + cbuDestino);
    }
}
package tp7.kata5;

public class Efectivo implements Pagable {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago en efectivo por $" + String.format("%,.2f", monto));
    }
}
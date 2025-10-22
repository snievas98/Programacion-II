// TarjetaCredito.java
package com.utn.tp8;

public class TarjetaCredito implements PagoConDescuento {
    private final String titular;
    private final String numero;
    private final double porcentajeDescuento; // 0.10 = 10%

    public TarjetaCredito(String titular, String numero, double porcentajeDescuento) {
        this.titular = titular;
        this.numero = numero;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1.0 - porcentajeDescuento);
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con Tarjeta de " + titular +
                " por $" + String.format("%.2f", monto) + " autorizado.");
        return true;
    }
}
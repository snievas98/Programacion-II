// PayPal.java
package com.utn.tp8;

public class PayPal implements PagoConDescuento {
    private final String email;
    private final double porcentajeDescuento; // 0.05 = 5%

    public PayPal(String email, double porcentajeDescuento) {
        this.email = email;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1.0 - porcentajeDescuento);
    }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con PayPal (" + email + ") por $" +
                String.format("%.2f", monto) + " completado.");
        return true;
    }
}
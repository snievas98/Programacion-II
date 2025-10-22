// PagoConDescuento.java
package com.utn.tp8;

public interface PagoConDescuento extends Pago {
    double aplicarDescuento(double monto);
}
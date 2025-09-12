package tp5.e10;

public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;   // composición
    private Titular titular;        // asociación bidireccional

    // La clave se compone (se crea adentro) y el titular se enlaza bidireccionalmente
    public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaMod, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigoClave, ultimaMod); // COMPOSICIÓN
        this.titular = titular;
        if (titular != null) titular.setCuenta(this);            // ↔
    }

    public void depositar(double monto) {
        if (monto <= 0) throw new IllegalArgumentException("Monto inválido");
        saldo += monto;
    }

    public boolean extraer(double monto) {
        if (monto <= 0) return false;
        if (monto > saldo) return false;
        saldo -= monto;
        return true;
    }

    @Override
    public String toString() {
        String cbuMasked = cbu.length() > 4 ? "****" + cbu.substring(cbu.length() - 4) : cbu;
        return "Cuenta{CBU=" + cbuMasked + ", saldo=$" + saldo + ", " + titular + ", " + clave + "}";
    }
}
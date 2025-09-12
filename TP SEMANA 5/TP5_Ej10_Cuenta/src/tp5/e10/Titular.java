package tp5.e10;

public class Titular {
    private String nombre;
    private String dni;
    CuentaBancaria cuenta;          // vínculo bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}
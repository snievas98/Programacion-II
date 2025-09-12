package tp5.e10;

public class Main {
    public static void main(String[] args) {
        Titular t = new Titular("Santiago Nievas", "40545665");

        // La clave se crea dentro de la cuenta (composición)
        CuentaBancaria cuenta = new CuentaBancaria(
                "0000003100001234567890",
                100_000,
                "ABCD-1234",
                "2025-09-12",
                t
        );

        System.out.println(cuenta);

        cuenta.depositar(5000);
        boolean ok = cuenta.extraer(12000);
        System.out.println("Extracción 12000: " + ok);
        System.out.println(cuenta);

        // Demostración del enlace bidireccional
        System.out.println("Cuenta vista desde Titular: " + t.cuenta);
    }
}
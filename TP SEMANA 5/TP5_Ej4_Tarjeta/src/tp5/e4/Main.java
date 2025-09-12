package tp5.e4;

public class Main {
    public static void main(String[] args) {
        Banco b = new Banco("Banco Río", "30-12345678-9");

        Cliente c = new Cliente();
        c.nombre = "Santiago Nievas";
        c.dni = "40.545.665";

        TarjetaDeCredito t = new TarjetaDeCredito("1234 5678 9012 3456", "12/27", b, c);

        // Pruebas
        System.out.println(t);           // tarjeta con banco + cliente
        System.out.println(c.tarjeta);   // el cliente quedó enlazado (bidireccional)
        System.out.println("Nro de la tarjeta del cliente: " + c.tarjeta.numero);
    }
}
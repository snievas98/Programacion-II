package tp7.kata5;

public class ProcesadorPagos {
    // método genérico que sirve para cualquier implementación de Pagable
    public static void procesarPago(Pagable medio, double monto) {
        medio.pagar(monto);
    }
}
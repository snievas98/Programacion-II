package tp7.kata5;

public class MainKata5 {
    public static void main(String[] args) {
        Pagable tc = new TarjetaCredito("Santiago Nievas", "4509123412341234");
        Pagable trx = new Transferencia("0000000000000000000001", "0000000000000000000002");
        Pagable cash = new Efectivo();

        ProcesadorPagos.procesarPago(tc, 59999.90);
        ProcesadorPagos.procesarPago(trx, 150000);
        ProcesadorPagos.procesarPago(cash, 1200);
    }
}
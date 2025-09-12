package tp5.e12;

public class Impuesto {
    private String tipo;               // p.ej. "IVA", "Ganancias"
    private double monto;              // base imponible o monto determinado
    private Contribuyente contribuyente; // agregación

    public Impuesto(String tipo, double monto, Contribuyente contribuyente) {
        this.tipo = tipo;
        this.monto = monto;
        this.contribuyente = contribuyente;
    }

    public String getTipo() { return tipo; }
    public double getMonto() { return monto; }
    public Contribuyente getContribuyente() { return contribuyente; }

    @Override
    public String toString() {
        return "Impuesto{" + tipo + ", monto=" + monto + ", de=" + contribuyente + "}";
    }
}
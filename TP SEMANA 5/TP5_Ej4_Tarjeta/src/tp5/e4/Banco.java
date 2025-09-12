package tp5.e4;

public class Banco {
    String nombre;
    String cuit;

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    @Override
    public String toString() {
        return nombre + " (CUIT " + cuit + ")";
    }
}
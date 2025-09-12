package tp5.e3;

public class Editorial {
    String nombre;
    String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return nombre + " - " + direccion;
    }
}
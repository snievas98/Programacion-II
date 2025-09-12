package tp5.e5;

public class Cliente {
    String nombre;
    String dni;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}
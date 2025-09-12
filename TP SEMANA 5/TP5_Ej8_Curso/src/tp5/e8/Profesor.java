package tp5.e8;

public class Profesor {
    private String nombre;
    private String dni;

    public Profesor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}
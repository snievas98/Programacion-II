package tp5.e9;

public class Socio {
    private String nombre;
    private String dni;

    public Socio(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    @Override
    public String toString() {
        return nombre + " (DNI " + dni + ")";
    }
}
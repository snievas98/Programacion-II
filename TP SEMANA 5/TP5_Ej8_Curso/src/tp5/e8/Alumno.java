package tp5.e8;

public class Alumno {
    private String nombre;
    private String legajo;

    public Alumno(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() { return nombre; }
    public String getLegajo() { return legajo; }

    @Override
    public String toString() {
        return nombre + " (Legajo " + legajo + ")";
    }
}
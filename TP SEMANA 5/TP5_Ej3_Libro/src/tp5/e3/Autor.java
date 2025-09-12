package tp5.e3;

public class Autor {
    String nombre;
    String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return nombre + " (" + nacionalidad + ")";
    }
}
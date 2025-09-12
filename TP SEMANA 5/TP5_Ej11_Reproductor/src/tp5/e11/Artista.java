package tp5.e11;

public class Artista {
    private String nombre;
    private String genero;

    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return nombre + " (" + genero + ")";
    }
}
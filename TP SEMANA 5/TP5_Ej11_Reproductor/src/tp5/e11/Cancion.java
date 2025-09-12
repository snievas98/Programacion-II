package tp5.e11;

public class Cancion {
    private String titulo;
    private int duracionSeg;   // opcional, para mostrar algo más
    private Artista artista;   // agregación

    public Cancion(String titulo, int duracionSeg, Artista artista) {
        this.titulo = titulo;
        this.duracionSeg = duracionSeg;
        this.artista = artista;
    }

    public String getTitulo() { return titulo; }
    public Artista getArtista() { return artista; }

    @Override
    public String toString() {
        return "'" + titulo + "' - " + artista + " [" + duracionSeg + "s]";
    }
}
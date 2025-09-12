package tp5.e9;

public class Libro {
    private String titulo;
    private String isbn;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }

    @Override
    public String toString() {
        return "'" + titulo + "' [ISBN " + isbn + "]";
    }
}
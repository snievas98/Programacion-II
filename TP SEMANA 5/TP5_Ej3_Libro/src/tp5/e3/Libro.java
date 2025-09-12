package tp5.e3;

public class Libro {
    String titulo;
    String isbn;
    Autor autor;         // asociación 1–1 (agregación)
    Editorial editorial; // asociación 1–1 (agregación)

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + "', autor=" + autor + ", editorial=" + editorial + "}";
    }
}
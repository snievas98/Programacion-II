package app;

import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    // Constructor
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // validar aquí
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    // Setter validado SOLO para año
    public void setAnioPublicacion(int anio) {
        int actual = Year.now().getValue();
        if (anio < 1450 || anio > actual) { // ~invención de la imprenta
            System.out.println("Año inválido: " + anio + " (válido: 1450.." + actual + ")");
            return;
        }
        this.anioPublicacion = anio;
    }

    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
    }
}
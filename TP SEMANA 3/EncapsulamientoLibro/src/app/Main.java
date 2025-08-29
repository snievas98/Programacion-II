package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Ejercicio 3: Libro (encapsulamiento) -----");

        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        libro.mostrarInfo();

        // Prueba: intento de año inválido (no debe cambiar)
        libro.setAnioPublicacion(3000);
        libro.mostrarInfo();

        // Año válido
        libro.setAnioPublicacion(1950);
        libro.mostrarInfo();

        // Lectura por getters
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor : " + libro.getAutor());
        System.out.println("Año   : " + libro.getAnioPublicacion());
    }
}
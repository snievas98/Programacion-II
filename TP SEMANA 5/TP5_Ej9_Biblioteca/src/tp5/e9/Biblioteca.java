package tp5.e9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nombre;
    private List<Prestamo> prestamos; // composición

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.prestamos = new ArrayList<>();
    }

    // Composición: la Biblioteca crea el Prestamo y lo administra
    public Prestamo prestar(Libro libro, Socio socio) {
        Prestamo p = new Prestamo(libro, socio, LocalDate.now());
        prestamos.add(p);
        return p;
    }

    public void devolver(Prestamo p) {
        if (prestamos.contains(p)) p.devolver(LocalDate.now());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Biblioteca '" + nombre + "'\n");
        for (Prestamo p : prestamos) sb.append("  - ").append(p).append("\n");
        return sb.toString();
    }
}
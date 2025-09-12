package tp5.e9;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;     // agregación
    private Socio socio;     // agregación
    private LocalDate fecha;
    private LocalDate fechaDevolucion; // puede ser null si no devolvió

    public Prestamo(Libro libro, Socio socio, LocalDate fecha) {
        this.libro = libro;
        this.socio = socio;
        this.fecha = fecha;
    }

    public void devolver(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean estaDevuelto() {
        return fechaDevolucion != null;
    }

    @Override
    public String toString() {
        return "Prestamo{ " + libro + " a " + socio +
               ", fecha=" + fecha +
               (estaDevuelto() ? ", devuelto=" + fechaDevolucion : ", pendiente") +
               " }";
    }
}